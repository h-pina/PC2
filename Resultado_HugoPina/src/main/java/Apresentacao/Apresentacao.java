//Nome: Hugo Antunes Pina
//Disciplina: Programação de Computadores II

//Obs: Coloquei todos os comentarios em Ingles pois quis testar o funcionamento
//do javadoc, e como os padroes dele estao todos em ingles, pensei em segui-los
//pelo codigo :D

package Apresentacao;
import Logica.LogicaGame;

public class Apresentacao extends javax.swing.JFrame {
    
    private LogicaGame game;

    public Apresentacao() {
        this.setTitle("Qual é o Resultado?");
        this.game = new LogicaGame(0,100);
        initComponents();
        this.updateTextFields();
    }

    /**
     * Update all GUI text Fields based on the game variables and functions
     * from the class 'LogicaGame'
     */
    private void updateTextFields(){
        game.selecionarOperador();
        game.selecionarNumero(1);
        game.selecionarNumero(2);
        
        this.operador.setText(game.getOperador());
        this.num1.setText(String.valueOf(game.getNumOperacao1()));
        this.num2.setText(String.valueOf(game.getNumOperacao2()));
        this.resultado.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        num1 = new javax.swing.JLabel();
        operador = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pontuacao = new javax.swing.JLabel();
        opcaoPassar = new javax.swing.JButton();
        opcaoReiniciar = new javax.swing.JButton();
        opcaoSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        teclado0 = new javax.swing.JButton();
        teclado7 = new javax.swing.JButton();
        teclado4 = new javax.swing.JButton();
        teclado1 = new javax.swing.JButton();
        teclado2 = new javax.swing.JButton();
        teclado5 = new javax.swing.JButton();
        teclado8 = new javax.swing.JButton();
        teclado9 = new javax.swing.JButton();
        teclado6 = new javax.swing.JButton();
        teclado3 = new javax.swing.JButton();
        tecladoTentar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Adivinhe o resultado da operação"));

        num1.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        operador.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        operador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        num2.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("=");

        resultado.setEditable(false);
        resultado.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(operador, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(operador, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pontuacao.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        pontuacao.setText("Você tem 0 pontos");

        opcaoPassar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        opcaoPassar.setText("Passar");
        opcaoPassar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoPassarActionPerformed(evt);
            }
        });

        opcaoReiniciar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        opcaoReiniciar.setText("Reiniciar");
        opcaoReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoReiniciarActionPerformed(evt);
            }
        });

        opcaoSair.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        opcaoSair.setText("Sair");
        opcaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSairActionPerformed(evt);
            }
        });

        teclado0.setText("0");
        teclado0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado0ActionPerformed(evt);
            }
        });

        teclado7.setText("7");
        teclado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado7ActionPerformed(evt);
            }
        });

        teclado4.setText("4");
        teclado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado4ActionPerformed(evt);
            }
        });

        teclado1.setText("1");
        teclado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado1ActionPerformed(evt);
            }
        });

        teclado2.setText("2");
        teclado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado2ActionPerformed(evt);
            }
        });

        teclado5.setText("5");
        teclado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado5ActionPerformed(evt);
            }
        });

        teclado8.setText("8");
        teclado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado8ActionPerformed(evt);
            }
        });

        teclado9.setText("9");
        teclado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado9ActionPerformed(evt);
            }
        });

        teclado6.setText("6");
        teclado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado6ActionPerformed(evt);
            }
        });

        teclado3.setText("3");
        teclado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclado3ActionPerformed(evt);
            }
        });

        tecladoTentar.setText("Tentar");
        tecladoTentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecladoTentarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teclado7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teclado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teclado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teclado0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(teclado8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teclado5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teclado2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teclado9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teclado6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teclado3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tecladoTentar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(teclado7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teclado4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(teclado1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(teclado8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teclado5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(teclado9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teclado6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teclado3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teclado2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teclado0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tecladoTentar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(pontuacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opcaoPassar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcaoReiniciar)
                        .addGap(12, 12, 12)
                        .addComponent(opcaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontuacao)
                    .addComponent(opcaoPassar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcaoReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teclado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado7ActionPerformed
        game.addDigitoResultado("7");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado7ActionPerformed

    private void teclado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado8ActionPerformed
        game.addDigitoResultado("8");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado8ActionPerformed

    private void teclado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado9ActionPerformed
        game.addDigitoResultado("9");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado9ActionPerformed

    private void teclado0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado0ActionPerformed
        game.addDigitoResultado("0");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado0ActionPerformed

    private void tecladoTentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecladoTentarActionPerformed
        if(game.checkResposta()){
            this.pontuacao.setText("Voce tem " + game.getPontuacao() + " pontos");
        }
        game.passar();
        updateTextFields();
    }//GEN-LAST:event_tecladoTentarActionPerformed

    private void opcaoPassarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoPassarActionPerformed
        game.passar();
        updateTextFields();
    }//GEN-LAST:event_opcaoPassarActionPerformed

    private void opcaoReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoReiniciarActionPerformed
        game.reiniciar();
        this.pontuacao.setText("Voce tem " + game.getPontuacao() + " pontos");
        updateTextFields();
    }//GEN-LAST:event_opcaoReiniciarActionPerformed

    private void opcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_opcaoSairActionPerformed

    private void teclado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado4ActionPerformed
        game.addDigitoResultado("4");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado4ActionPerformed

    private void teclado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado5ActionPerformed
        game.addDigitoResultado("5");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado5ActionPerformed

    private void teclado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado6ActionPerformed
        game.addDigitoResultado("6");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado6ActionPerformed

    private void teclado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado1ActionPerformed
        game.addDigitoResultado("1");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado1ActionPerformed

    private void teclado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado2ActionPerformed
        game.addDigitoResultado("2");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado2ActionPerformed

    private void teclado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclado3ActionPerformed
        game.addDigitoResultado("3");
        resultado.setText(game.getResposta());
    }//GEN-LAST:event_teclado3ActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apresentacao().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JButton opcaoPassar;
    private javax.swing.JButton opcaoReiniciar;
    private javax.swing.JButton opcaoSair;
    private javax.swing.JLabel operador;
    private javax.swing.JLabel pontuacao;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton teclado0;
    private javax.swing.JButton teclado1;
    private javax.swing.JButton teclado2;
    private javax.swing.JButton teclado3;
    private javax.swing.JButton teclado4;
    private javax.swing.JButton teclado5;
    private javax.swing.JButton teclado6;
    private javax.swing.JButton teclado7;
    private javax.swing.JButton teclado8;
    private javax.swing.JButton teclado9;
    private javax.swing.JButton tecladoTentar;
    // End of variables declaration//GEN-END:variables
}
