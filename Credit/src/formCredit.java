
import javax.swing.JOptionPane;

public class formCredit extends javax.swing.JFrame {
    Double Pokokcicilan;
    
    
    frmCredit credit = new frmCredit();
    public formCredit() {
        initComponents();
    }
    
    public double hitungPokokCicilan(){
        double tampungUangMuka = Double.parseDouble(uangMuka.getText());
        double tampungHargaBarang = Double.parseDouble(hargaBarang.getText());
        double pokokCicilan = tampungHargaBarang - tampungUangMuka;
        String cicilan = Double.toString(pokokCicilan);
        pCicilan.setText(cicilan);
        return pokokCicilan;
    }
    
    public double hitungBungaCicilan(){
        double tampungUangMuka = Double.parseDouble(uangMuka.getText());
        double tampungHargaBarang = Double.parseDouble(hargaBarang.getText());
        double pokokCicilan = tampungHargaBarang - tampungUangMuka;
        double bunga = Double.parseDouble(bungaTahunan.getText());
        double lama = Double.parseDouble(lamaKredit.getText());
        double bungaCicilan = pokokCicilan * bunga * lama / 12;
        String BungaCicilan = Double.toString(bungaCicilan);
        bungaCicilaN.setText(BungaCicilan);
        return bungaCicilan;
    }
    
     public double totalKredit(){
         double TotalKredit1 = hitungPokokCicilan() + hitungBungaCicilan();
         String totalKredit2 = Double.toString(TotalKredit1);
         jLabel21.setText(totalKredit2);
         return TotalKredit1;
     }
     
     public double CicilanPerBulan(){
         double lama = Double.parseDouble(lamaKredit.getText());
         double cicil = hitungPokokCicilan() / lama;
         String totalKredit2 = Double.toString(cicil);
         cicilanPerBulan.setText(totalKredit2);
         return cicil;
     }
     
     public double Penghasilan(){
         double gapok = Double.parseDouble(gajiPokok.getText());
         double bonus1 = Double.parseDouble(bonus.getText());
         double total = gapok + bonus1;
         String penghasilan1 = Double.toString(total);
         total1.setText(penghasilan1);
         return total;
     }
     
     public double limitPinjaman(){
         double jumlahTanggungan = Double.parseDouble(jumlTanggungan.getText());
         double LimitPinjaman = Penghasilan() / (jumlahTanggungan + 1);
         String limitPinjaman1 = Double.toString(LimitPinjaman);
         LimPin.setText(limitPinjaman1);
         return LimitPinjaman;
     }
     
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gajiPokok = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bonus = new javax.swing.JTextField();
        jumlTanggungan = new javax.swing.JTextField();
        pokokCicilan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hargaBarang = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        uangMuka = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lamaKredit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bungaTahunan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        dsadsa = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pCicilan = new javax.swing.JLabel();
        bungaCicilaN = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cicilanPerBulan = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        LimPin = new javax.swing.JLabel();
        Hasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Credit");

        jLabel3.setText("Nama    :");

        jLabel4.setText("Alamat  :");

        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });

        jLabel5.setText("Status   :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status", "Jomblo", "Menikah" }));

        jLabel6.setText("Telpon Rumah :");

        jLabel7.setText("Telpon Mobile:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Gaji Pokok :");

        jLabel9.setText("Jumlah Tanggungan:");

        jLabel22.setText("Bonus :");

        bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonusActionPerformed(evt);
            }
        });

        jumlTanggungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlTanggunganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(Alamat)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(gajiPokok, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bonus)
                    .addComponent(jumlTanggungan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(gajiPokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jumlTanggungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Nasabah", jPanel1);

        jLabel2.setText("Credit");

        jLabel10.setText("Harga Barang :");

        hargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaBarangActionPerformed(evt);
            }
        });

        jLabel11.setText("Uang Muka :");

        jLabel12.setText("Lama Kredit :");

        lamaKredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamaKreditActionPerformed(evt);
            }
        });

        jLabel13.setText("Bulan");

        jLabel14.setText("Bunga Per Tahun :");

        bungaTahunan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bungaTahunanActionPerformed(evt);
            }
        });

        jLabel15.setText("%");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        dsadsa.setText("Detail Hasil Cicilan");

        jLabel17.setText("Pokok Cicilan             :   ");

        jLabel18.setText("Bunga Cicilan            :   ");

        jLabel19.setText("Total Cicilan               :   ");

        jLabel20.setText("Cicilan Per Bulan      :");

        pCicilan.setText("0");

        bungaCicilaN.setText("0");

        jLabel21.setText("0");

        cicilanPerBulan.setText("0");

        jLabel23.setText("Penghasilan Bulanan :");

        total1.setText("0");

        jLabel24.setText("Limit Pinjaman :");

        LimPin.setText("0");

        javax.swing.GroupLayout pokokCicilanLayout = new javax.swing.GroupLayout(pokokCicilan);
        pokokCicilan.setLayout(pokokCicilanLayout);
        pokokCicilanLayout.setHorizontalGroup(
            pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokokCicilanLayout.createSequentialGroup()
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pokokCicilanLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)))
                            .addGroup(pokokCicilanLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)))
                        .addGap(27, 27, 27)
                        .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pokokCicilanLayout.createSequentialGroup()
                                .addComponent(lamaKredit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(pokokCicilanLayout.createSequentialGroup()
                                .addComponent(bungaTahunan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(pokokCicilanLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(submit))
                            .addComponent(hargaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(uangMuka)))
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pokokCicilanLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pCicilan))
                            .addGroup(pokokCicilanLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bungaCicilaN))
                            .addGroup(pokokCicilanLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(dsadsa))))
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cicilanPerBulan))
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total1)
                            .addComponent(LimPin)))
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2))
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        pokokCicilanLayout.setVerticalGroup(
            pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokokCicilanLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(uangMuka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12))
                    .addGroup(pokokCicilanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lamaKredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bungaTahunan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dsadsa)
                .addGap(26, 26, 26)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(pCicilan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(bungaCicilaN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cicilanPerBulan))
                .addGap(18, 18, 18)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(total1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pokokCicilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(LimPin))
                .addGap(18, 18, 18)
                .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Analisa Kredit", pokokCicilan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void lamaKreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamaKreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamaKreditActionPerformed

    private void hargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaBarangActionPerformed

    private void bungaTahunanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bungaTahunanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bungaTahunanActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        hitungPokokCicilan();
        hitungBungaCicilan();
        totalKredit();
        CicilanPerBulan();
        Penghasilan();
        limitPinjaman();
        
        try {
        if(limitPinjaman() > CicilanPerBulan()) {
         Hasil.setText("Analisa Di Setujui untuk menyicil "+nama.getText());
        } else {
         Hasil.setText("Maaf belum di Setujui untuk menyicil "+nama.getText());
        }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(Hasil,"asdasd");
       } 
        nama.setText("");
        Alamat.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        gajiPokok.setText("");
        bonus.setText("");
        jumlTanggungan.setText("");
        hargaBarang.setText("");
        uangMuka.setText("");
        lamaKredit.setText("");
        bungaTahunan.setText("");
    }//GEN-LAST:event_submitActionPerformed

    private void bonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bonusActionPerformed

    private void jumlTanggunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlTanggunganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlTanggunganActionPerformed

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
            java.util.logging.Logger.getLogger(formCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formCredit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JLabel Hasil;
    private javax.swing.JLabel LimPin;
    private javax.swing.JTextField bonus;
    private javax.swing.JLabel bungaCicilaN;
    private javax.swing.JTextField bungaTahunan;
    private javax.swing.JLabel cicilanPerBulan;
    private javax.swing.JLabel dsadsa;
    private javax.swing.JTextField gajiPokok;
    private javax.swing.JTextField hargaBarang;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jumlTanggungan;
    private javax.swing.JTextField lamaKredit;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel pCicilan;
    private javax.swing.JPanel pokokCicilan;
    private javax.swing.JButton submit;
    private javax.swing.JLabel total1;
    private javax.swing.JTextField uangMuka;
    // End of variables declaration//GEN-END:variables
}
