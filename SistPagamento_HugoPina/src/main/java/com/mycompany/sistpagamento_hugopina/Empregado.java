//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;

public abstract class Empregado implements Pagavel {
    protected String nome;
    protected String sobrenome;
    protected int numIdent;
    
    public Empregado(String nome, String sobrenome, int numIdent){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdent = numIdent;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getSobrenome() {
        return sobrenome;
    }

    protected void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    protected int getNumIdent() {
        return numIdent;
    }

    protected void setNumIdent(int numIdent) {
        this.numIdent = numIdent;
    }
    
    //metodo acrescimo incluido, visto que teoricamente todos os funcionarios
    //podem receber um acrescimo baseado em algum valor especifico.
    protected double acrescimo(double valor, double porcentagem){
        return valor*(porcentagem/100);
    }
    
}
