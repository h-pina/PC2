//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;

public class Solicitacao {
    
    //Campos
    
    private String nome;
    private String endereco;
    private String numTelefone;
    
    private Emergencia emergencia;
    private UnidadeServico unidadeResponsavel;
    
    private String nomeAtendente;
    private String dataSolicitacao;
    
    //Construtor

    public Solicitacao(String nome, String endereco, String numTelefone, Emergencia emergencia, 
            UnidadeServico unidadeResponsavel, String nomeAtendente, String dataSolicitacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
        this.emergencia = emergencia;
        this.unidadeResponsavel = unidadeResponsavel;
        this.nomeAtendente = nomeAtendente;
        this.dataSolicitacao = dataSolicitacao;
    }
    
    //Getters e Setters

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

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public Emergencia getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(Emergencia emergencia) {
        this.emergencia = emergencia;
    }

    public UnidadeServico getUnidadeResponsavel() {
        return unidadeResponsavel;
    }

    public void setUnidadeResponsavel(UnidadeServico unidadeResponsavel) {
        this.unidadeResponsavel = unidadeResponsavel;
    }

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public void setNomeAtendente(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
    
}
