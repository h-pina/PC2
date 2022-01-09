//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.leilao;

public class Pessoa {
    private String nome;
    private String contato;
    
    public Pessoa (String nome, String contato){
        this.nome = nome;
        this.contato = contato;
    }
    
    //Getters e Setters
    
    public String getNome(){
        return this.nome;
    }
    
    public String getContato(){
        return this.contato;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setContato(String contato){
        this.contato = contato;
    }
}
