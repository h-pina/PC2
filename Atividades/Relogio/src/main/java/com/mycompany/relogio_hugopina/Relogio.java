//Nome: Hugo Antunes Pina
//Disciplica: Programação de Computadores 2
package com.mycompany.relogio_hugopina;

public class Relogio {
    
    //Campos:
    
    private Contador hora;
    private Contador minuto;
    
    private String displayFormatado;
    private boolean formato24h;
    
    //Construtores:
    
    public Relogio(){
        this.hora = new Contador(24);
        this.minuto = new Contador(60);
        
        this.formato24h = false; //por padrao formato 24h desabilitado
    }
    
    public Relogio(int hora, int minuto){ //recebe valores de hora e minutos iniciais
        this.hora = new Contador(24);
        this.minuto = new Contador(60);
        
        this.formato24h = false;
        
        this.hora.setValor(hora);      
        this.minuto.setValor(minuto);  
    }
    
    //Getters e Setters:
    
    public String getHora(){
        return this.hora.getValorFormatado();
    }
    
    public String getMinuto(){
        return this.minuto.getValorFormatado();
    }
    
    public void setHorario (int hora, int minuto){
        this.hora.setValor(hora);      
        this.minuto.setValor(minuto);   
    }
    
    //Metodos:
    
    public void ticTac(){  // logica de interacao entre os contadores de minuto e hora
        atualizaDisplay();
        this.minuto.incrementa();
        if(this.minuto.getValor() == 0){
            this.hora.incrementa();
        }
    }
    
    private void atualizaDisplay(){ //operacao do display de acordo com o modo selecionado
        if(!formato24h){
            if(this.hora.getValor() >= 12){ //caso o horario ainda tenha passado do meio dia.
                int newHora = this.hora.getValor() - 12;
                displayFormatado = String.format("%02d", newHora) + ":" + this.minuto.getValorFormatado() + " p.m.";
            }
            else{ //caso o horario ainda nao tenha passado do meio dia.
                displayFormatado = this.hora.getValorFormatado() + ":" + this.minuto.getValorFormatado() + " a.m.";
            }
        }
        else{
            displayFormatado = this.hora.getValorFormatado() + ":" + this.minuto.getValorFormatado();
        }
        
        System.out.println(displayFormatado);
    }
    
    public void setFormato24h(boolean formato24h){
        this.formato24h = formato24h;
    }
}
