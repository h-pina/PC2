package com.mycompany.cifracesar_hugoantunespina;

public class CifraDeCesar {

    public CifraDeCesar() {}
    
    public String cifrar(String mensagem, Chave chave){
        char[] msgTmp = mensagem.toCharArray();
        String alphabet = chave.getAlfabeto();
        int shift = chave.getDeslocamento();
        
        for(int i = 0; i<msgTmp.length;i++){
             int posInicial=alphabet.indexOf(msgTmp[i]);
             int posFinal = posInicial + shift;
             if(posFinal < 0){
                 posFinal = alphabet.length() + posFinal;
             }
             else if(posFinal > alphabet.length()-1){
                 posFinal -= alphabet.length();
             }
             msgTmp[i] = alphabet.charAt(posFinal);
        }
        String decryptedMsg = String.valueOf(msgTmp);
        return decryptedMsg;
    }
    
    public String decifrar(String msg_cifrada, Chave chave){
        char[] msgTmp = msg_cifrada.toCharArray();
        String alphabet = chave.getAlfabeto();
        int shift = chave.getDeslocamento();
        
        for(int i = 0; i<msgTmp.length;i++){
             int posInicial=alphabet.indexOf(msgTmp[i]);
             int posFinal = posInicial - shift;
             
             if(posFinal < 0){
                 posFinal = alphabet.length() + posFinal;
             }
             else if(posFinal > alphabet.length()-1){
                 posFinal -= alphabet.length();
             }
             msgTmp[i] = alphabet.charAt(posFinal);
        }
        String decryptedMsg = String.valueOf(msgTmp);
        return decryptedMsg;
    }
    
}
