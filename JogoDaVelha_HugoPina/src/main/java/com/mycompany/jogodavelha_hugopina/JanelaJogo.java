//Nome: Hugo Antunes Pina
//Programacao de Computadores II

package com.mycompany.jogodavelha_hugopina;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JanelaJogo extends JFrame implements ActionListener,FocusListener {
    
    //Variaveis de Estado do Jogo
    private JogoDaVelha jogoDaVelha;
    private String actualPlayer; //armazena qual jogador esta jogando no momento
    
    //Content Panel
    private JPanel canvas; //tela do jogo

    //Paineis auxiliares de 
    private JPanel leftEmptyPanel; //painel de espaçamento
    private JPanel rightEmptyPanel; //painel de espaçamento
    
    //Containers
        //Instrucoes
    private JPanel instructionContainer; //Conteiner para as instrucoes do jogo
    
        //Jogo
    private JPanel gamePanel; //Container para o jogo e suas mecanicas
    private JPanel playerButtons; //Container para os botoes
    private JPanel tableGridContainer; //Conteiner para a grade do jogo da velha
    private JPanel actionButtons; //Container para botoes de acao (Limpar e Sair)

        //Resultado
    private JPanel resultContainer;
    
    //Textos
    private JLabel instrucao;
    private JLabel msgVitoria;
    
    //Botoes
    private JButton pecaX;
    private JButton pecaO;
    private JButton limpar;
    private JButton sair;
    
    //Campos da grade principal
    private JTextField[] tableGrid;
            
    //Construtor        
    public JanelaJogo(){
        super("Jogo da Velha");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        instanciarComponentes();
        defineLayoutPanels();
        adicionaPanels();
        adicionaComponentes();
        definirEventHandlers();
        
        jogoDaVelha = new JogoDaVelha();
    }
    
    public static void main(String[] args) {
        JanelaJogo janelaJogo = new JanelaJogo();
        janelaJogo.setSize(410,400);
        janelaJogo.setVisible(true);
    }
    
    private void instanciarComponentes(){
        canvas = new JPanel();
        leftEmptyPanel = new JPanel();
        rightEmptyPanel = new JPanel();
        
        gamePanel = new JPanel();
        tableGridContainer = new JPanel();
        playerButtons = new JPanel();
        actionButtons = new JPanel();

        instructionContainer = new JPanel();
        resultContainer = new JPanel();
        
        instrucao = new JLabel("Escolha sua peça e clique na posição desejada");
        instrucao.setFont(new Font("Arial",Font.PLAIN,17));
        
        msgVitoria = new JLabel();
        
        pecaX = new JButton("X");
        pecaO = new JButton("O");
        limpar =  new JButton("Limpar");
        sair = new JButton("Sair");
        
        tableGrid = new JTextField[9];
        for(int i=0;i<9;i++){
            tableGrid[i] = new JTextField("");
            tableGrid[i].setEditable(false); //O usuario
            tableGrid[i].setName(Integer.toString(i));
            tableGrid[i].setHorizontalAlignment(JTextField.CENTER);
        }
    }
    
    private void defineLayoutPanels(){
        canvas.setLayout(new BorderLayout());
        
        instructionContainer.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 0, 10, 0), 
                BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY)));
        
        playerButtons.setLayout(new GridLayout(0,2,10,10));
        tableGridContainer.setLayout(new GridLayout(3,3,10,1));
        actionButtons.setLayout(new GridLayout(0,2,10,10));
        
        
        gamePanel.setLayout(new BorderLayout(20,20));
        
        rightEmptyPanel.setBorder(new EmptyBorder(0, 50, 0, 50));
        leftEmptyPanel.setBorder(new EmptyBorder(0, 50, 0, 50));
        
        resultContainer.setBorder(new EmptyBorder(50, 0, 50, 0));
    }
    
    private void adicionaPanels(){
        
        gamePanel.add(playerButtons,BorderLayout.NORTH);
        gamePanel.add(actionButtons,BorderLayout.SOUTH);
        gamePanel.add(tableGridContainer,BorderLayout.CENTER);
        
        canvas.add(this.instructionContainer,BorderLayout.NORTH);
        canvas.add(this.gamePanel,BorderLayout.CENTER);
        canvas.add(this.leftEmptyPanel,BorderLayout.WEST);
        canvas.add(this.rightEmptyPanel,BorderLayout.EAST);
        canvas.add(this.resultContainer,BorderLayout.SOUTH);
        
        this.add(this.canvas);
    }
    
    private void adicionaComponentes(){
        instructionContainer.add(this.instrucao);
        
        playerButtons.add(pecaX);
        playerButtons.add(pecaO);
        
        actionButtons.add(limpar);
        actionButtons.add(sair);
        
        for (int i = 0; i<9;i++){
            tableGridContainer.add(tableGrid[i]);
        }
        
        resultContainer.add(msgVitoria);
    }
    
    private void definirEventHandlers(){
        pecaX.addActionListener(this);
        pecaO.addActionListener(this);
        limpar.addActionListener(this);
        sair.addActionListener(this);
        
        for(int i=0;i<9;i++){
            tableGrid[i].addFocusListener(this);
        }
    }
    
    private void clearGame(){
        jogoDaVelha = new JogoDaVelha();
        for(int i=0;i<9;i++){
            tableGrid[i].setText("");
        }
        msgVitoria.setText("");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "X":
                actualPlayer = "X";
                break;
            case "O":
                actualPlayer = "O";
                break;
            case "Limpar":
                clearGame();
                break;
            case "Sair":
                this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
                break;
                
                
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(!(this.actualPlayer.equals(""))){
            JTextField field = (JTextField)e.getComponent();
            String winner;
            if(jogoDaVelha.jogar(Integer.decode(field.getName()), actualPlayer)){
                field.setText(actualPlayer);
                winner = jogoDaVelha.verificarVencedor();
                if(winner.equals("X")){
                    msgVitoria.setText("Jogador X Venceu!!");
                }
                else if(winner.equals("O")){
                    msgVitoria.setText("Jogador O Venceu!!");
                }
                this.actualPlayer = "";
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {}
    
}
