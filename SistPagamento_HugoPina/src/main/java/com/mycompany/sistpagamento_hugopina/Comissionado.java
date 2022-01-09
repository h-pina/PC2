//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;

public class Comissionado extends Empregado {
    private double valorTotalVendas;

    
    public Comissionado(String nome, String sobrenome, int numIdent, double valorTotalVendas) {
        super(nome, sobrenome, numIdent);
        this.valorTotalVendas = valorTotalVendas;
    }

    
    
    public double getTotalVendas() {
        return valorTotalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.valorTotalVendas = totalVendas;
    }
    
 
    
    @Override
    public double getValorAPagar(){
        double valorAPagar = this.valorTotalVendas * 0.06;
        return valorAPagar;
    }
}
