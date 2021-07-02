//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.leilao;

public class Lance {
    private Pessoa pessoa;
    private float valor;
    
    public Lance(Pessoa pessoa, float valor){
        this.pessoa = pessoa;
        this.valor = valor;
    }
    
    //getters e setters
    
    public Pessoa getPessoa(){
        return this.pessoa;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
}
