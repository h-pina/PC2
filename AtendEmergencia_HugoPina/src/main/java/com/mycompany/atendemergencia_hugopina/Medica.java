//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;

public class Medica extends Emergencia {
    
    //Campos: Informacoes pedidas durante o atendimento medico
    
    private boolean consciente;
    private int idade;
    private String sexo;
    
    //Construtor

    public Medica(String sexo,int idade, boolean consciente) {
        super("Medica");
        this.consciente = consciente;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //Getters e setters

    public boolean isConsciente() {
        return consciente;
    }

    public void setConsciente(boolean consciente) {
        this.consciente = consciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
