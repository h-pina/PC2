//Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package UI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import Logica.DezPassitos;
import javafx.stage.Stage;


public class JanelaController implements Initializable {
    
    DezPassitos game;
    
    @FXML private GridPane gridPane;
    @FXML private Label attmptsCount;
    @FXML private Label passosCount;
    @FXML private Label msgGanhou;
    @FXML private Label msgPerdeu;
    
    
    @FXML
    private void beginNewGame(){
        
        game = new DezPassitos();
        
        for(int i = 0; i<7;i++){
            for (int j = 0;j<12;j++){
                Button btn = new Button();
                btn.setOnAction(event -> {handleButtonAction(event);});
                btn.setPrefSize(50, 25);
                gridPane.add(btn, j, i);
            }
        }
        
        attmptsCount.setText(String.valueOf(game.getAttempts()));
        passosCount.setText(String.valueOf(game.getPassos()));
        
        msgGanhou.setVisible(false);
        msgPerdeu.setVisible(false);
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        int rowPosition = GridPane.getRowIndex((Node)event.getSource());
        int colPosition = GridPane.getColumnIndex((Node)event.getSource());
        
        Button btn = (Button)event.getSource();
        if(!btn.isDisable()){
            btn.setDisable(true);
            if(game.isBomb(colPosition,rowPosition)){
                game.errou();
                btn.setStyle("-fx-background-color:red");
            }
            else{
                game.acertou();
            }

            attmptsCount.setText(String.valueOf(game.getAttempts()));
            passosCount.setText(String.valueOf(game.getPassos()));

           if(game.isGameOver()){
                game.freezeGame();
                if(game.getPassos() > 8){
                    msgGanhou.setVisible(true);
                }
                else{
                    msgPerdeu.setVisible(true);
                }
            }
        }
    }
    
    @FXML
    private void closeGame(){
        Stage stage = (Stage)gridPane.getScene().getWindow();
        stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        beginNewGame();
    }    
    
}
