package com.mycompany.baralho;

public class baralho {
    private  String[] naipes = {"Espadas", "Paus", "Ouros", "Copas"};
    private card[] baralho;
    
    public baralho(){
        baralho = new card[52];
        int contNaipe = 0;
        int contValor = 1;
        for(int i = 0; i<52; i++){
            baralho[i] = new card(naipes[contNaipe], contValor);
            contValor++;
            if(contValor == 14){
                contValor = 1;
                contNaipe++;
            }
        }
    }
    
    public card[] getCards(){
        return baralho;
    }
}
