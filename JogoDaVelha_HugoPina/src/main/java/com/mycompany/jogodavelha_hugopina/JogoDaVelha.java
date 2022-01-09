//Nome: Hugo Antunes Pina
//Programacao de Computadores II

package com.mycompany.jogodavelha_hugopina;

public class JogoDaVelha {
    private String[][] tabuleiro; //armazena os estados do jogo
    
    public JogoDaVelha(){
        tabuleiro = new String[3][3];
        for (int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                tabuleiro[i][j] = "";
            }
        }
    }
    
    //a funcao retorna se a peca foi corretamente colocada na posicao desejada
    //caso a posicao ja tenha sido preenchida, retorna false.
    public boolean jogar(int posicao, String peca){
        int linha = posicao/3;
        int coluna = posicao%3;
        
        if(tabuleiro[linha][coluna] == ""){
            tabuleiro[linha][coluna] = peca;
            return true;
        }
        else{return false;}
    }
    
    
    public String verificarVencedor(){
        int i;
        
        //linhas
        for(i = 0; i<3;i++){
            if(tabuleiro[i][1].equals(tabuleiro[i][0]) && tabuleiro[i][1].equals(tabuleiro[i][2]) ){
                if(!(tabuleiro[i][0].equals(""))){ //garante que a comparacao realizada nao foi de espacos vazios
                    return tabuleiro[i][0];
                }
            }   
        }
        
        
        //colunas
        for(i = 0; i<3;i++){
            if(tabuleiro[1][i].equals(tabuleiro[0][i]) && tabuleiro[1][i].equals(tabuleiro[2][i]) ){
                if(!(tabuleiro[0][i].equals(""))){
                    return tabuleiro[0][i];
                }
            }   
        }
        
        //diagonal principal
        if(tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][2]) ){
            if(!(tabuleiro[0][0].equals(""))){
                return tabuleiro[0][0];
            }
        }
        
        //diagonal secundaria
        if(tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][0]) ){
            if(!(tabuleiro[0][2].equals(""))){
                return tabuleiro[0][2];
            }
        }
        
        return "No winners"; //Esta string nao e usada para nada em especifico
    }
    
}
