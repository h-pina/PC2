//Nome: Hugo Antunes Pina
//Disciplina: Programação de Computadores II

//Obs: Coloquei todos os comentarios em Ingles pois quis testar o funcionamento
//do javadoc, e como os padroes dele estao todos em ingles, pensei em segui-los
//pelo codigo :D

package Logica;
import java.util.Random;

public class LogicaGame {
    
    //Max and min limits for numbers on the operations
    private int limiteSuperior;
    private int limiteInferior;
    
    //Player information
    private int pontuacao; 
    private String resposta;
    
    //Presented Operations
    private int numOperacao1;
    private String operador; 
    private int numOperacao2;
    
    private static final String[] OPERADORES = {"+","-","*","/"}; 
    
    
    public LogicaGame(int limiteInferior,int limiteSuperior ){
        
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        
        this.resposta = "";
        this.operador = "";
        this.numOperacao1 = 0;
        this.numOperacao2 = 0;
        this.pontuacao = 0;
    }
    
    public int getPontuacao(){
        return this.pontuacao;
    }

    public String getResposta() {
        return resposta;
    }

    public int getNumOperacao1() {
        return numOperacao1;
    }

    public String getOperador() {
        return operador;
    }

    public int getNumOperacao2() {
        return numOperacao2;
    }
    
    
    
    /**
     * Concatenates a new digit to the result string
     * @param novoDigito New digit to be concatenated
     */
    public void addDigitoResultado(String novoDigito){
        this.resposta = this.resposta + novoDigito;
    }
    
    /**
     * Chooses a random number between the superior and inferior limits.
     * It also assigns the chosen number on the state variable of the class, 
     * so it can later be used to check the user's final answer
     * @param numeroOperando which of the numbers in operation are being selected. This value can be 1 or 2.
     */
    public void selecionarNumero(int numeroOperando){
        Random random = new Random();
        int numSelecionado = random.nextInt((limiteSuperior-limiteInferior) + 1) + limiteInferior;
        if (numeroOperando == 1){this.numOperacao1 = numSelecionado;}
        else if (numeroOperando == 2){
            switch(this.operador){//Edge cases
                case "-": //the answer doesn't support negative numbers
                    while(numSelecionado > numOperacao1){
                        numSelecionado = random.nextInt((limiteSuperior-limiteInferior) + 1) + limiteInferior;
                    }
                    break;
                case "/": //there can't be a zero division operation
                    while(numSelecionado == 0){
                        numSelecionado = random.nextInt((limiteSuperior-limiteInferior) + 1) + limiteInferior;
                    }
                    break;
            }

            this.numOperacao2 = numSelecionado; 
        }
    }
    
    /**
     * Chooses a operation to be asked for the player
     */
    public void selecionarOperador(){
        Random random = new Random();
        int indexOperador = random.nextInt(OPERADORES.length);
        this.operador = OPERADORES[indexOperador];
    }
    
    /**
     * Checks whether the player answer is correct or not
     * @return true for a correct answer and false for a wrong answer
     */
    public boolean checkResposta(){
        int respostaJogador = Integer.valueOf(this.resposta);
        int respostaCorreta = 0;
        switch(this.operador){
            case "+":
                respostaCorreta = numOperacao1 + numOperacao2;
                break;
            case "-":
                respostaCorreta = numOperacao1 - numOperacao2;
                break;
            case "*":
                respostaCorreta = numOperacao1 * numOperacao2;
                break;
            case "/":
                respostaCorreta = numOperacao1 / numOperacao2;
                break;
        }
        if (respostaCorreta == respostaJogador){
            this.pontuacao += 1;
            return true;
        
        }
        else{
            return false;
        }
    }
    
    /**
     * Skips the current operation and generates a new one for the player to 
     * answer
     */
    public void passar(){
        this.resposta = "";
        this.selecionarOperador();
        this.selecionarNumero(1);
        this.selecionarNumero(2);
    }
    
    /**
     * Resets the game by setting the player points to 0 and generating a new operation
     */
    public void reiniciar(){
        this.passar();
        this.pontuacao = 0;
    }    
    
}
