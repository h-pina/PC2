//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;

public class Terceirizado extends Empregado {
    private int horasTrabalhadas;
    
    //Construtor
    public Terceirizado(String nome, String sobrenome, int numIdent, int horasTrabalhadas){
        super(nome,sobrenome,numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    //Getters e Setters
    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    //Metodos
    
    @Override
    public double getValorAPagar(){
        double valorAPagar = this.horasTrabalhadas * ControlePagamento.HORA;
        return valorAPagar;
    }
}
