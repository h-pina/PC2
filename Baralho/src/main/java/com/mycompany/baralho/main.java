/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baralho;

public class main {
    public static void main(String[] args) {
        baralho Bar = new baralho();
        card[] cards = Bar.getCards();
        for(int j=0; j<52; j++){
            System.out.println("Naipe: " + cards[j].getNaipe());
            System.out.println("Valor: " + cards[j].getValor());
        }
    }
}

