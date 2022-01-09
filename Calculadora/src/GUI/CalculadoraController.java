//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import Application.Calculadora;
import javafx.geometry.Pos;




public class CalculadoraController implements Initializable {
    
    private Calculadora calculadora;
    
    //numberBuffer: armazena os numeros digitados temporariamente, enquanto nenhuma operacao e realizada
    //facilita a concatenacao e limpeza do Display!
    private String numberBuffer; 
    
    private void clearDisplayBuffer(){
        numberBuffer = "";
        display.setText(numberBuffer);
    }
    
    @FXML
    private TextField display;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String buttonPressed = ((Button)event.getSource()).getText();
        
        for(int i = 0; i<10;i++){ // tratamento dos numeros do teclado
            if(buttonPressed.equals(Integer.toString(i))){
                this.numberBuffer = numberBuffer + buttonPressed;
                display.setText(this.numberBuffer);
            }
        }
        if(buttonPressed.equals(",")){ //ponto decimeal
            this.numberBuffer = numberBuffer + ".";
            display.setText(this.numberBuffer);
        }
        
        
        if(buttonPressed.equals("+") || buttonPressed.equals("-") ||  //operadores
                buttonPressed.equals("*") || buttonPressed.equals("/")){
            calculadora.setNumber(numberBuffer); //quando uma operacao e realizada, numberBuffer e enviado para a calculadora
            calculadora.setOperador(buttonPressed);
            clearDisplayBuffer();
        }
        
        else if(buttonPressed.equals("%") || buttonPressed.equals("x^2")){ //modificadores
            calculadora.setNumber(numberBuffer);
            clearDisplayBuffer();
            numberBuffer = calculadora.modificarNum(buttonPressed);
            display.setText(numberBuffer);
            
        }
        
        
        else if(buttonPressed.equals("=")){ //resultado
            calculadora.setNumber(numberBuffer);
            clearDisplayBuffer();
            calculadora.realizarOperacao();
            numberBuffer = calculadora.getStringResultado();
            display.setText(numberBuffer);
        }
        
        
        else if(buttonPressed.equals("C")){ //botao C
            clearDisplayBuffer();
        }
        
        
        else if(buttonPressed.equals("CE")){ //botao CE
            clearDisplayBuffer();
            calculadora.clearOperation();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.calculadora = new Calculadora();
        this.display.setEditable(false);
        this.numberBuffer = "";
        
        display.setAlignment(Pos.BASELINE_RIGHT);
    }    
    
}
