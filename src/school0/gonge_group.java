/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school0;

import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import school0.pkg1.login;
import static Main.Main.tabel_Sincer;
import javax.swing.JOptionPane;

/**
 *
 * @author MOHAMED
 */
public class gonge_group extends javax.swing.JFrame {

   
    public gonge_group() {
        initComponents();
        compocx_jour_siunce ();
    }
PreparedStatement perpar;
    ResultSet result;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        suprime_since = new javax.swing.JButton();
        time_suence = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jour_seunce = new javax.swing.JComboBox<>();
        RAW = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("يجب عليك تغير الفوج من الحصة ااولا ");

        jButton1.setText("تغير ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        suprime_since.setText("حذف ");
        suprime_since.setEnabled(false);
        suprime_since.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suprime_sinceActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("اختر اليوم");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("اختر الساعة");

        jour_seunce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jour_seunceMouseClicked(evt);
            }
        });
        jour_seunce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jour_seunceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(RAW)
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(suprime_since, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time_suence, 0, 144, Short.MAX_VALUE)
                    .addComponent(jour_seunce, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(RAW)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jour_seunce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suprime_since)
                    .addComponent(jLabel3)
                    .addComponent(time_suence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   suprime_since.setEnabled(true);
        int raw=Integer.parseInt(RAW.getText());//هذا به نقدر نوصل للقيم لتنمحيهم من لجدول  تع لححص
 System.out.println(raw+"jjjjjj");
           String joure= (String)tabel_Sincer.getModel().getValueAt(raw, 0);
           String Houre= (String)tabel_Sincer.getModel().getValueAt(raw, 1);
           String jour = jour_seunce.getSelectedItem().toString();
            String time = time_suence.getSelectedItem().toString();
         
            
 
          String Sql="UPDATE `affectation_groupe_sciene` SET `jour`=?,`Heure_debut`=? WHERE `jour`=? AND`Heure_debut`=?";
          try {
             
             perpar=login.cnx.prepareStatement(Sql);
             perpar.setString(1, jour);
             perpar.setString(2,time);
             perpar.setString(3, joure);
               perpar.setString(4, Houre);
                 perpar.executeUpdate();
    System.out.println("تمت إضافة البيانات بنجاح");
        } catch (Exception e) {
               System.out.println("لم تتم إضافة البيانات ");
                  JOptionPane.showMessageDialog(rootPane, e);
        }
          
         
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
      
    }//GEN-LAST:event_jButton1KeyPressed

    private void jour_seunceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jour_seunceActionPerformed
  
        
    }//GEN-LAST:event_jour_seunceActionPerformed

    private void jour_seunceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jour_seunceMouseClicked
    String jour = jour_seunce.getSelectedItem().toString();
        String sql="SELECT `Heure_debut` FROM `sience` WHERE `jour`=?";
        try {
            perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, jour);
            result=perpar.executeQuery();
            time_suence.removeAllItems();
            while(result.next()){
                time_suence.addItem(result  .getString(1));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jour_seunceMouseClicked

    private void suprime_sinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suprime_sinceActionPerformed
     
        DefaultTableModel model = (DefaultTableModel) tabel_Sincer.getModel();
        int raw=Integer.parseInt(RAW.getText());
         String joure= (String)tabel_Sincer.getModel().getValueAt(raw, 0);
           String Houre= (String)tabel_Sincer.getModel().getValueAt(raw, 1);
          
             
             
        String sql="DELETE FROM `sience` WHERE `jour`=? AND`Heure_debut`=?";
         
         try {
               perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, joure);
            perpar.setString(2, Houre);
           perpar.executeUpdate();
           
        } catch (Exception e) {
             System.out.println("mmmmmm");
                JOptionPane.showMessageDialog(rootPane, e);
        }
          model.removeRow(raw);
           tabel_Sincer.repaint();
           this.dispose();
    }//GEN-LAST:event_suprime_sinceActionPerformed

    private  void compocx_jour_siunce (){
    
    String Sql ="SELECT `jour` FROM `sience` ";
        try {
                perpar=  login.cnx.prepareStatement(Sql);    
                 result = perpar.executeQuery();
                  while(result.next()){
            jour_seunce.addItem(result  .getString(1));
            }
        } catch (Exception e) {
        }
    
    }
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
            java.util.logging.Logger.getLogger(gonge_group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gonge_group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gonge_group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gonge_group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gonge_group().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel RAW;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jour_seunce;
    private javax.swing.JButton suprime_since;
    private javax.swing.JComboBox<String> time_suence;
    // End of variables declaration//GEN-END:variables
}
