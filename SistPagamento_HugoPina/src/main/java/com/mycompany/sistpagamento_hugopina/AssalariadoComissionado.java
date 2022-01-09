//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;

public class AssalariadoComissionado extends Comissionado {

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent,  double valorTotalVendas) {
        super( nome, sobrenome, numIdent,valorTotalVendas);
    }

    
    
    @Override
    public double getValorAPagar(){
        double valorAPagar = super.getValorAPagar() + ControlePagamento.SALARIO;
        valorAPagar += acrescimo(ControlePagamento.SALARIO, 10);
        return valorAPagar;
    }
}
