//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.seminarioboasvindas_hugopina;

public class AlunoGraduacao extends Aluno {
    
    //Campo
    
    private String temaTCC;
    
    //Construtor
    
    public AlunoGraduacao(String nome, String cpf, String temaTCC){
        super(nome,cpf);
        this.temaTCC = temaTCC;
    }

    //Getters e Setters
    
    public String getTemaTCC() {
        return temaTCC;
    }

    public void setTemaTCC(String temaTCC) {
        this.temaTCC = temaTCC;
    }
    
    //Metodo
    
    //Lista o nome, o cpf, e as infomacoes especificas dos Alunos da Graduacao
    public void listarInformacoes(){
        super.listarInformacoes();
        System.out.println("Categoria: Graduacao");
        System.out.println("Tema de TCC: " + this.temaTCC);
    }
}
