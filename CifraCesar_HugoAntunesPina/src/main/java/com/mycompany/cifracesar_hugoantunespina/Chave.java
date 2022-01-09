package com.mycompany.cifracesar_hugoantunespina;

public class Chave {
    private int deslocamento;
    private String alfabeto;

    public Chave(int deslocamento, String alfabeto) {
        this.deslocamento = deslocamento;
        this.alfabeto = alfabeto;
    }
    
    public Chave(int deslocamento) {
        this.deslocamento = deslocamento;
        this.alfabeto = "abcdefghijklmnopqrstuvwxyz";
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
    }

    public String getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String alfabeto) {
        this.alfabeto = alfabeto;
    }


}
