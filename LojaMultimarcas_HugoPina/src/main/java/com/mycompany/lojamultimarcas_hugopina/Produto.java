//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II


//Para fins de simplificacao, fornecedores e fabricantes serao considerados a mesma coisa.

package com.mycompany.lojamultimarcas_hugopina;
import java.util.ArrayList;
import java.util.Iterator;

public class Produto {
    
    /* --------------------------------Campos--------------------------------*/
    
    private String tipo;
    private String nome;
    private String marca;
    private String modelo;
    private String numSerie; //coloquei como string pois normalmente sao numeros grandes, que muitas vezes envolvem digitos
    private String dataFabricacao; 
    private String nomeTransportadora;
    
    private int numLote;
    
    private ArrayList<Fornecedor> fornecedores;
    
    /* --------------------------------Construtor--------------------------------*/
    
    public Produto(String tipo, String nome, String marca, String modelo, String numSerie, String dataFabricacao, String nomeTransportadora, int numLote) {
        this.tipo = tipo;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.dataFabricacao = dataFabricacao;
        this.nomeTransportadora = nomeTransportadora;
        this.numLote = numLote;
        
        this.fornecedores = new ArrayList<Fornecedor>();
    }
    
    /* ----------------------------Getters e Setters-------------------------------
    //A principio acredito que todos os getters e setters sao validos para a aplicacao
    ja que faria sentido modificar qualquer informacao cadastrada (devido a erros de 
    digitacao no cadastro, por exemplo)
    -----------------------------------------------------------------------------*/

    public String getTipo() {
        return tipo;
    }

    // e necessario verificar se o tipo definido trata-se de um celular ou notebook
    // a funcao retorna a resposta da verificacao
    public boolean setTipo(String tipo) { 
        if(tipo.equalsIgnoreCase("celular") || tipo.equalsIgnoreCase("notebook")){
            this.tipo = tipo;
            return true;
        }
        else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getNomeTransportadora() {
        return nomeTransportadora;
    }

    public void setNomeTransportadora(String nomeTransportadora) {
        this.nomeTransportadora = nomeTransportadora;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    
    /* --------------------------------Metodos--------------------------------*/
    
    //cadastrando fornecedor a partir de objeto ja existente
    public void cadastrarFornecedor(Fornecedor fornecedor){
        fornecedores.add(fornecedor);
    }
    
    //cadastrando um novo fornecedor
    public void cadastrarFornecedor(String nome, String telefone){
        Fornecedor fornecedor = new Fornecedor(nome, telefone);
        fornecedores.add(fornecedor);
    }
    
    //checa se o produto possui o fornecedor desejado
    public boolean checkFornecedor(String nome){
        Iterator<Fornecedor> it = fornecedores.iterator();
        while(it.hasNext()){
            Fornecedor tmpFornecedor = it.next();
            if(tmpFornecedor.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }
    
    public void exibirInformacoes(){
        System.out.println("Tipo:" + this.tipo);
        System.out.println("Nome:"+ this.nome);
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Numero de Serie: "+ this.numSerie);
        System.out.println("Data de Fabricacao:"+ this.dataFabricacao);
        System.out.println("Nome da Transportadora: "+ this.nomeTransportadora);
        System.out.println("Numero do Lote:"+ this.numLote);
        System.out.print("Fornecedores: ");

        for(Fornecedor tmpFornecedor : this.fornecedores){
            System.out.print(tmpFornecedor.getNome() + ", ");
        }
        System.out.println("");
    }
}
