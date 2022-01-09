
package com.mycompany.sistpagamento_hugopina;

public abstract class Conta implements Pagavel{
    protected int dia;
    protected int mes;
    protected double valor;
    protected String descricao; //Campo descricao adicionado

    public Conta(int dia, int mes, double valor, String descricao) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
