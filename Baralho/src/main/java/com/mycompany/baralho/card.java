package com.mycompany.baralho;

public class card {
    private String naipe;
    int valor;
    
    //class constructors
    public card(){
        this.naipe = "";
        this.valor = 0;
    }
    public card(String naipe, int valor){
        this.naipe = naipe;
        this.valor = valor;
    }
    
    //getters and setters
    public void setNaipe(String naipe){this.naipe = naipe ;}
    public void setValor(int valor){this.valor = valor ;}
    
    public String getNaipe(){return this.naipe;}
    public int getValor(){return this.valor;}

    String getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
