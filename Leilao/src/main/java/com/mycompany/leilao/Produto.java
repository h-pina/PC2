//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.leilao;

public class Produto {
    private String descricao;
    private Lance maiorLance;
    private boolean status = false;
    
    public Produto(String descricao, Lance lance){
        this.descricao = descricao;
        this.maiorLance = lance;
    }
    
    //caso nao seja inserido nenhum lance de inicio
    public Produto(String descricao){
        this.descricao = descricao;
        this.maiorLance = new Lance(new Pessoa("",""), 0); //Criando um lance inicial nulo
    }
    
    //Getters e Setters
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public Lance getLance(){
        return this.maiorLance;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean novoStatus){
        this.status = novoStatus;
    }
    
    
    //Metodos
    
    public void verificarMaiorLance(Lance lance){
        if(!this.status){
            if(lance.getValor() > this.maiorLance.getValor()){
                this.maiorLance = lance;
            } else{
                System.out.println("Desculpe, mas esse produto ja recebeu um lance maior!");
            }
        }else{
            System.out.println("O produto ja foi vendido");
        }
    }
}
