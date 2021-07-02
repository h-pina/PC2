//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.lojamultimarcas_hugopina;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class Loja {
    
    /* --------------------------------Campos--------------------------------*/
    private String nome;
    private String endereco;
    
    //Escolhi utilizar um HashMap pois acessar os produtos torna-se mais facil, e sua ordem nao e importante
    private HashMap<String,Produto> portfolio; 
    
    /* -------------------------------Construtor--------------------------------*/
    
    public Loja(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        portfolio = new HashMap<String,Produto>();
    }

    /* ---------------------------Getters e Setters--------------------------------*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public HashMap<String, Produto> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(HashMap<String, Produto> portfolio) {
        this.portfolio = portfolio;
    }
    
    /* ------------------------------Metodos--------------------------------*/
    
    public void cadastrarProduto(Produto produto){
        portfolio.put(produto.getNome(), produto);
    }
    
    public Produto buscarProdutoPorNome(String nome){
        Produto produtoDesejado = portfolio.get(nome);
        return produtoDesejado;
    }
    
    //Como existe a possibilidade de existir um mesmo fornecedor para mais de um produto
    //essa funcao retornara uma ArrayList com todos os produtos com o mesmo fornecedor
    public ArrayList<Produto> buscarProdutoPorFornecedor(String nomeFornecedor){
        ArrayList<Produto> produtosDesejados = new ArrayList<Produto>();
        Iterator<Produto> it = portfolio.values().iterator();
        Produto tmpProduto;
        while(it.hasNext()){
            tmpProduto = it.next();
            if(tmpProduto.checkFornecedor(nomeFornecedor)){
                produtosDesejados.add(tmpProduto);
            }
        }
        return produtosDesejados;
    }
    
    public void listarProdutos(){
        Iterator<Produto> it = portfolio.values().iterator();
        Produto tmpProduto;
        System.out.println("Aqui estao os produtos disponiveis:");
        while(it.hasNext()){
            System.out.println("");
            tmpProduto = it.next();
            tmpProduto.exibirInformacoes();
            
        }
    }
    
    
    
    
}
