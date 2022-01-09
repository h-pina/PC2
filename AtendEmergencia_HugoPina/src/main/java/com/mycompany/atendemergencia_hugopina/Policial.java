//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;

public class Policial extends Emergencia {
    
    //Campos: Informacoes pedidas durante o atendimento policial
    
    private boolean pessoasArmadas;
    private boolean pessoasFeridas;
    private boolean areaEmRisco;
    
    //Cosstrutor

    public Policial(boolean pessoasArmadas, boolean pessoasFeridas, boolean areaEmRisco) {
        super("Policial");
        this.pessoasArmadas = pessoasArmadas;
        this.pessoasFeridas = pessoasFeridas;
        this.areaEmRisco = areaEmRisco;
    }
    
    //Getters e Setters

    public boolean isPessoasArmadas() {
        return pessoasArmadas;
    }

    public void setPessoasArmadas(boolean pessoasArmadas) {
        this.pessoasArmadas = pessoasArmadas;
    }

    public boolean isPessoasFeridas() {
        return pessoasFeridas;
    }

    public void setPessoasFeridas(boolean pessoasFeridas) {
        this.pessoasFeridas = pessoasFeridas;
    }

    public boolean isAreaEmRisco() {
        return areaEmRisco;
    }

    public void setAreaEmRisco(boolean areaEmRisco) {
        this.areaEmRisco = areaEmRisco;
    }
}
