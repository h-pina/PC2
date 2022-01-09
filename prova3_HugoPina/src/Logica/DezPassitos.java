//Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package Logica;

import java.util.Random;

public class DezPassitos {
    
    private boolean[][] grid;
    
    private boolean gameOver;
    private int attempts;
    private int passos;
    
    public DezPassitos(){
        grid = new boolean[12][7]; 
        gameOver = false;
        attempts = 10;
        passos = 0;
        placeBombs();
    }
    
    private void placeBombs(){ 
        Random random = new Random();
        int colPosition = random.nextInt(12);
        int rowPosition = random.nextInt(7);
        
        for(int i = 0;i<60;i++){
            if(grid[colPosition][rowPosition] == false){
                grid[colPosition][rowPosition] = true;
            }
            else while(grid[colPosition][rowPosition] == true){
                colPosition = random.nextInt(12);
                rowPosition = random.nextInt(7);
                if(grid[colPosition][rowPosition] == false){
                    grid[colPosition][rowPosition] = true;
                    break;
                }
            }
        }
    }
    
    public boolean isBomb(int colPosition, int rowPosition){
        return grid[colPosition][rowPosition];
    }
    
    public boolean isGameOver(){
        if(attempts == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void acertou(){
        if(!gameOver){
            attempts -= 1;
            passos += 1;
        }
        
    }
    
    public void errou(){
        if(!gameOver){
            attempts -= 1;
        }
    }

    public int getAttempts() {
        return attempts;
    }


    public int getPassos() {
        return passos;
    }
    
    public void freezeGame(){
        gameOver = true;
    }   
}
