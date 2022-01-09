//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.seminarioboasvindas_hugopina;

public class AlunoTecnico extends Aluno {

    //Campos
    
    private String curso;
    private Professor professorOrientador;
    private String nomeDaEmpresa;
    private String areaDeAtuação;
    private String dataInicioEstagio;
    private String dataFimEstagio;

    //Construtor
    
    public AlunoTecnico(String nome, String cpf,String curso, Professor professorOrientador, String nomeDaEmpresa, String areaDeAtuação, String dataInicioEstagio, String dataFimEstagio) {
        super(nome, cpf);
        this.curso = curso;
        this.professorOrientador = professorOrientador;
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.areaDeAtuação = areaDeAtuação;
        this.dataInicioEstagio = dataInicioEstagio;
        this.dataFimEstagio = dataFimEstagio;
    }
    
    //Getters e Setters

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Professor getProfessorOrientador() {
        return professorOrientador;
    }

    public void setProfessorOrientador(Professor professorOrientador) {
        this.professorOrientador = professorOrientador;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getAreaDeAtuação() {
        return areaDeAtuação;
    }

    public void setAreaDeAtuação(String areaDeAtuação) {
        this.areaDeAtuação = areaDeAtuação;
    }

    public String getDataInicioEstagio() {
        return dataInicioEstagio;
    }

    public void setDataInicioEstagio(String dataInicioEstagio) {
        this.dataInicioEstagio = dataInicioEstagio;
    }

    public String getDataFimEstagio() {
        return dataFimEstagio;
    }

    public void setDataFimEstagio(String dataFimEstagio) {
        this.dataFimEstagio = dataFimEstagio;
    }
    
    //Metodo
    
    public void listarInformacoes(){
        super.listarInformacoes();
        System.out.println("Categoria: Tecnico");
        System.out.println("Curso: " + this.curso);
        System.out.println("Nome da Empresa (Estagio): " + this.nomeDaEmpresa);
        System.out.println("Area de Atuacao (Estagio): " + this.areaDeAtuação);
        System.out.println("Data de Inicio do Estagio: " + this.dataInicioEstagio);
        System.out.println("Data de Termino do Estagio: " + this.dataFimEstagio);
        System.out.println("---Professor Orientador---");
        this.professorOrientador.listarInformacoes();
        System.out.println("--------------------------");
        
    }
}
