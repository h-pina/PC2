//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;

public class CiaTelefonica {
    
    public CiaTelefonica() {}
    
    //Define a regiao de acordo com os 3 primeiros digitos do numero de telefone,
    //excluindo o 9 inicial
    public static String buscaRegiao(String telefone){
        String firstDigits = telefone.substring(1, 4);
        int convertedDigits = Integer.parseInt(firstDigits);
        String regiaoMaisProxima = null; //variavel auxiliar
        
        if(convertedDigits <= 250){
            regiaoMaisProxima = "Norte";
        }
        else if(250 < convertedDigits && convertedDigits <= 500 ){
            regiaoMaisProxima = "Sul";
        }
        else if(500 < convertedDigits && convertedDigits <= 750 ){
            regiaoMaisProxima = "Leste";
        }
        else if(750 < convertedDigits && convertedDigits <= 999 ){
            regiaoMaisProxima = "Oeste";
        }
        
        return regiaoMaisProxima;
    }
    
    
    
    
    
}
