//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;

public class Titulo extends Conta {

    private boolean isVencido;
    
    public Titulo(int dia, int mes, double valor, String descricao, boolean isVencido) {
        super(dia, mes, valor, descricao);
        this.isVencido = isVencido;
    }

    public boolean isIsVencido() {
        return isVencido;
    }

    public void setIsVencido(boolean isVencido) {
        this.isVencido = isVencido;
    }
   
    @Override
    public double getValorAPagar(){
        //experimentando nova forma de validacao
        double valorAPagar = (this.isVencido ? (this.valor + this.valor*0.1) : this.valor );
        return valorAPagar;
    }
}
