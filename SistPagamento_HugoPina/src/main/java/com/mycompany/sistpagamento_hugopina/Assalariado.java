//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;

public class Assalariado extends Empregado {
    private int horasExtrasMes;
    

    public Assalariado(String nome, String sobrenome, int numIdent, int horasExtrasMes) {
        super(nome, sobrenome, numIdent);
        this.horasExtrasMes = horasExtrasMes;
    }
    
    
    public Assalariado(String nome, String sobrenome, int numIdent,double salarioBase) {
        super(nome, sobrenome, numIdent);
        this.horasExtrasMes = 0; //caso nenhuma hora extra seja especificada, assumir que nao houveram horas extras
    }
    


    public int getHorasExtrasMes() {
        return horasExtrasMes;
    }

    public void setHorasExtrasMes(int horasExtrasMes) {
        this.horasExtrasMes = horasExtrasMes;
    }
    
    
    
    @Override
    public double getValorAPagar(){
        double valorAPagar = ControlePagamento.SALARIO + this.horasExtrasMes*ControlePagamento.HORA;
        return valorAPagar;
    }
}
