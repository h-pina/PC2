//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.seminarioboasvindas_hugopina;

/*---
Classe abstrata: minha intencao e que ela so seja usada pelas subclasses
Nela, todos os campos e metodos estao definidos como protected com o intuito de restringir
seu acesso da maior forma possivel
---*/

public abstract class PessoaUniversidade {
    
    //Campos
    
    protected String nome;
    protected String cpf;
    
    //Construtor
    
    protected PessoaUniversidade(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //Getters e Setters

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //Metodo
    
    protected void listarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
    
}