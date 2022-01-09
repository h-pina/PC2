//Nome: Hugo Antunes Pina
//Disciplica: Programação de Computadores 2
package com.mycompany.relogio_hugopina;
import java.util.Scanner; // importacao necessaria para receber input do usuario


public class Teste {
    public static void main(String[] args) {
        Relogio clock = new Relogio();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite 1 para utilizar sistema 12 horas e 2 para utilizar o sistema 24 horas: ");
        int resposta = input.nextInt();
        
        if(resposta == 1){
            System.out.println("Sistema 12h!");
            for(int i=0;i<24;i++){
                for(int j=0;j<60;j++){
                    clock.ticTac();
               }
            }
        }
        else{
            System.out.println("Sistema 24h!");
            clock.setFormato24h(true);
            for(int i=0;i<24;i++){
                for(int j=0;j<60;j++){
                    clock.ticTac();
                }
            }
        }
    }
}
