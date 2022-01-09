//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;

public class Concessionaria extends Conta {

    public Concessionaria(int dia, int mes, double valor, String descricao) {
        super(dia, mes, valor, descricao);
    }
    
    @Override
    public double getValorAPagar(){
        return this.valor;
    }
}
