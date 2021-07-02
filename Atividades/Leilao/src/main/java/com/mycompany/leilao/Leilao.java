//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.leilao;

public class Leilao {
    private Lote[] lotes;
    boolean leilaoEncerrado = false;
    
    //Construtores
    
    public Leilao(int quantidade){
        //Devo colocar alguma coisa a mais aqui??
        lotes = new Lote[quantidade];
    }
    
    //Getters e Setters
    
    public Lote[] getLotes(){
        return lotes;
    }
    
    public void setLotes(Lote[] lotes){
        this.lotes = lotes;
    }

   
    //Metodos
    
    public void inserirLote(Lote lote){
        for(int i = 0; i < this.lotes.length; i++){
            if(this.lotes[i] == null){
                this.lotes[i] = lote;
                return;
            }
        }
        System.out.println("Numero maximo de lotes preenchidos!!");
    }
    
    public void receberLance(int numLote, String descricaoProduto, Lance lance){
        if(!leilaoEncerrado){
            Produto produtoDesejado = this.lotes[numLote-1].getProduto(descricaoProduto);
            produtoDesejado.verificarMaiorLance(lance);
        }else{
            System.out.println("Desculpe, mas o leilão ja foi encerrado.");
        }   
    }
    
    public void declararVenda(int numLote, String descricao){
        lotes[numLote-1].getProduto(descricao).setStatus(true);
    }
    
    public void encerrarLeilao(){
        int contLotes = 1;
        this.leilaoEncerrado = true;
        for (Lote lote:lotes){
            System.out.println(String.format("--------Lote %d--------", contLotes));
            for(int i=0;i<lote.getProdutos().length; i++){
                
                Produto prod = lote.getProduto(i);
                Lance lan = prod.getLance();
                Pessoa pe = lan.getPessoa();

                System.out.println("");
                System.out.println("Produto:" + prod.getDescricao());
                System.out.println("Vendido para: " + pe.getNome());
                System.out.println("Pelo valor de: " + String.format("R$ %.2f",lan.getValor()));
            }
            contLotes+=1;
        }
    }
    
    public void listarProdutos(){
        if(!leilaoEncerrado){
            int contLotes = 1;
            for (Lote lote:lotes){
                System.out.println(String.format("--------Lote %d--------", contLotes));
                for(int i=0;i<lote.getProdutos().length; i++){

                    Produto prod = lote.getProduto(i);
                    Lance lan = prod.getLance();

                    System.out.println("");
                    System.out.println("Produto:" + prod.getDescricao());
                    System.out.println("Maior Lance Oferecido: " + String.format("R$ %.2f",lan.getValor()));
                }
                contLotes+=1;
            }
            
        }else{
            System.out.println("Desculpe, mas o leilão ja foi encerrado.");
        }
    }
    
}
