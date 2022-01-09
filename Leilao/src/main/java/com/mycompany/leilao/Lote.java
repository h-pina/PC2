//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.leilao;

public class Lote {
    private Produto[] produtos;
    
    //Construtores
    
    public Lote(int quantidade){
        this.produtos = new Produto[quantidade];
    }
    
    //Getters e Setters
    
    //Retorna a lista completa de produtos do lote
    public Produto[] getProdutos(){
        return produtos;
    }
    
    public void setProdutos(Produto[] produtos){
        this.produtos = produtos;
    }
    
    
    //Metodos
    
    public void inserirProduto(Produto produto){
        for(int i = 0; i < this.produtos.length; i++){
            if(this.produtos[i] == null){
                this.produtos[i] = produto;
                return;
            }    
        }
        System.out.println("Me desculpe, o lote esta cheio.");
    }
    
    
    //Retorna um produto individual com base na descricao fornecida
    public Produto getProduto(String descricao){
        for(int i = 0; i<produtos.length;i++){
            if(produtos[i].getDescricao().equals(descricao)){
                return produtos[i];
            }
        }
        return null;
    }
    
    
    //Retorna um produto individual com base na sua posicao na lista de produtos do lote
    public Produto getProduto(int num){
        if(num <= this.produtos.length){
            return this.produtos[num];
        }else{
            return null;
        }
    }
}
