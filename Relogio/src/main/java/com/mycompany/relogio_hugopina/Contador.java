//Nome: Hugo Antunes Pina
//Disciplica: Programação de Computadores 2
package com.mycompany.relogio_hugopina;

public class Contador {
    private int limite;
    private int valor;
    
    //Construtor
    
    public Contador (int limite){
        this.limite = limite;
        this.valor = 0;
    }
    
    //Getters e Setters
    //OBS: getter e setters do limites nao foram criados pois, para essa 
    //aplicacao especifica, eles nao sao necessarios
    
    public int getValor(){
        return this.valor;
    }
    
    public String getValorFormatado(){
        String ValorFormatado = String.format("%02d", valor); //mantem os valores sempre com 2 digitos
        return ValorFormatado;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    //Metodos:
    
    public void incrementa(){
        this.valor++;
        if(this.valor == this.limite){
            this.valor = 0;
        }
    }
}
