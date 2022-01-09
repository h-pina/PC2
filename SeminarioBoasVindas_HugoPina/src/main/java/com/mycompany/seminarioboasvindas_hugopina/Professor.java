//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.seminarioboasvindas_hugopina;

public class Professor extends PessoaUniversidade{
    
    //Campo
    
    private String areaPesquisaAtuacao;
    
    //Construtor
    
    public Professor(String nome, String cpf, String areaPesquisaAtuacao){
        super(nome,cpf);
        this.areaPesquisaAtuacao = areaPesquisaAtuacao;
    }
    
    //Getter e Setter

    public String getAreaPesquisaAtuacao() {
        return areaPesquisaAtuacao;
    }

    public void setAreaPesquisaAtuacao(String areaPesquisaAtuacao) {
        this.areaPesquisaAtuacao = areaPesquisaAtuacao;
    }
    
    //Metodo
    
    public void listarInformacoes(){
        super.listarInformacoes();
        System.out.println("Area de Pesquisa e Atuacao: " + this.areaPesquisaAtuacao);
    }
}
