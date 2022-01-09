//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.seminarioboasvindas_hugopina;

public class AlunoPosGraduacao extends Aluno {
    
    //Campos
    
    private String linhaPesquisa;
    private String dataEntrada;
    private String dataConclusaoCurso;

    //Construtor
    
    public AlunoPosGraduacao(String nome, String cpf, String linhaPesquisa, String dataEntrada, String dataConclusaoCurso) {
        super(nome, cpf);
        this.linhaPesquisa = linhaPesquisa;
        this.dataEntrada = dataEntrada;
        this.dataConclusaoCurso = dataConclusaoCurso;
    }
    
    //Getters e Setters

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    public void setLinhaPesquisa(String linhaPesquisa) {
        this.linhaPesquisa = linhaPesquisa;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataConclusaoCurso() {
        return dataConclusaoCurso;
    }

    public void setDataConclusaoCurso(String dataConclusaoCurso) {
        this.dataConclusaoCurso = dataConclusaoCurso;
    }
    
    //Metodo
    
    public void listarInformacoes(){
        super.listarInformacoes();
        System.out.println("Categoria: Pos Graduacao");
        System.out.println("Linha de Pesquisa: " + this.linhaPesquisa);
        System.out.println("Data de Entrada: " + this.dataEntrada);
        System.out.println("Data de Conclusao do Curso: " + this.dataConclusaoCurso);
    }
    
}
