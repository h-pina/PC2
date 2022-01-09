//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.lojamultimarcas_hugopina;

public class Fornecedor {
    private String nome;
    private String telefone;
    
    public Fornecedor(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
