import java.util.List;

public class GuessingGame extends javax.swing.JFrame {
        wordModel Wordmodel;
        List<wordModel> bankSoal;
       
        
        
       
    public GuessingGame() {
        bankSoal = WordQuestionGenerator.generateSoal();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jawabanTextField = new javax.swing.JTextField();
        cekAnswerButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        HintButton = new javax.swing.JButton();
        soalTextField = new javax.swing.JLabel();
        HintLabel = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();
        nyawaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cekAnswerButton.setText("Submit");
        cekAnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekAnswerButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        HintButton.setText("Hint");
        HintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintButtonActionPerformed(evt);
            }
        });

        soalTextField.setText("                                     Soalnya disini");

        HintLabel.setText("                                   Hint");
        HintLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                HintLabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        commentLabel.setText("jLabel1");

        nyawaLabel.setText("Nyawa");
        nyawaLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nyawaLabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(HintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(200, 200, 200)
                                    .addComponent(startButton)
                                    .addGap(89, 89, 89)
                                    .addComponent(cekAnswerButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addComponent(soalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jawabanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(commentLabel)
                                    .addComponent(HintButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(nyawaLabel)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(nyawaLabel)
                .addGap(57, 57, 57)
                .addComponent(soalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jawabanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(commentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekAnswerButton)
                    .addComponent(startButton))
                .addGap(18, 18, 18)
                .addComponent(HintButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HintLabel)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        int soalIndex = (int) Math.floor(Math.random() * bankSoal.size());
        System.out.println("Index: " + soalIndex);
        Wordmodel = bankSoal.get(soalIndex); //bankSoal[soalIndex];
        System.out.println(Wordmodel.getBasicWord());
        soalTextField.setText(Wordmodel.acakKata());
        
        Wordmodel.setLife(3);
        nyawaLabel.setText("nyawa anda : "+Wordmodel.getLife());
    }//GEN-LAST:event_startButtonActionPerformed

    private void cekAnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekAnswerButtonActionPerformed
        // TODO add your handling code here:
String jawaban = jawabanTextField.getText().trim();
        Wordmodel.setJawaban(jawaban);
        if (Wordmodel.cekJawaban()) {
            commentLabel.setText("Jenius!");
        } else {
            commentLabel.setText("Coba lagi");
        }
        
    }//GEN-LAST:event_cekAnswerButtonActionPerformed

    private void HintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HintButtonActionPerformed
        // TODO add your handling code here:
        HintLabel.setText(Wordmodel.getHint());
        
        nyawaLabel.setText("nyawa anda : "+ Wordmodel.getLife());
    }//GEN-LAST:event_HintButtonActionPerformed

    private void HintLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_HintLabelAncestorAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_HintLabelAncestorAdded

    private void nyawaLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nyawaLabelAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nyawaLabelAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HintButton;
    private javax.swing.JLabel HintLabel;
    private javax.swing.JButton cekAnswerButton;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JTextField jawabanTextField;
    private javax.swing.JLabel nyawaLabel;
    private javax.swing.JLabel soalTextField;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
