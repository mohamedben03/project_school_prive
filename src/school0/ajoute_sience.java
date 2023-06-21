/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school0;

import Main.Main;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginException;
import school0.pkg1.login;
import static Main.Main.tabel_Sincer;

/**
 *
 * @author MOHAMED
 */
public class ajoute_sience extends javax.swing.JFrame {

    /**
     * Creates new form ajoute_sience
     */
    public ajoute_sience() {
        initComponents();
    }

      
      java.util.Date date;
    java.sql.Date sqldate;
      PreparedStatement perpar;
    ResultSet result;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        time_hour = new com.raven.swing.TimePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ajoute_sience = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jour_sience = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        time_since = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        time_hour.setDisplayText(time_since);
        time_hour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                time_hourMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("اضافة حصة ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        ajoute_sience.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("يوم الحصة ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ساعة بداية");

        jour_sience.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "السبت", "الاحد", "الاثنين", "الثلاثاء", "الاربعاء", "الخميس", "الجمعة" }));

        jButton1.setText("عرض الساعة");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        time_since.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_sinceActionPerformed(evt);
            }
        });
        time_since.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                time_sinceKeyPressed(evt);
            }
        });

        jButton2.setText("حفظ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ajoute_sienceLayout = new javax.swing.GroupLayout(ajoute_sience);
        ajoute_sience.setLayout(ajoute_sienceLayout);
        ajoute_sienceLayout.setHorizontalGroup(
            ajoute_sienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoute_sienceLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ajoute_sienceLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(ajoute_sienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ajoute_sienceLayout.createSequentialGroup()
                        .addComponent(jour_sience, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajoute_sienceLayout.createSequentialGroup()
                        .addComponent(time_since)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(106, 106, 106))
        );
        ajoute_sienceLayout.setVerticalGroup(
            ajoute_sienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoute_sienceLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(ajoute_sienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jour_sience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(77, 77, 77)
                .addGroup(ajoute_sienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(time_since, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ajoute_sience, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ajoute_sience, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 time_hour.showPopup(this, 50, 50);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void time_hourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time_hourMouseClicked
   
    }//GEN-LAST:event_time_hourMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    String sql = "INSERT INTO `sience`(`jour`, `Heure_debut`) VALUES (?,?)";
String jour = jour_sience.getSelectedItem().toString();
String time_sen = time_since.getText();

Main.ADDSEICE(new Object[]{
            jour,time_sen,  });
tabel_Sincer.repaint();


DateFormat format = new SimpleDateFormat("hh:mm a");
java.util.Date utilDate;
try {
    utilDate = format.parse(time_sen);
    java.sql.Timestamp sqlDate = new java.sql.Timestamp(utilDate.getTime());

    // تم إنشاء PreparedStatement لإدخال البيانات في الجدول
    perpar = login.cnx.prepareStatement(sql);
    perpar.setString(1, jour);
    perpar.setTimestamp(2, sqlDate);
    perpar.executeUpdate();
    System.out.println("تمت إضافة البيانات بنجاح");

} catch (ParseException | SQLException e) {
    e.printStackTrace();
}
this.dispose();
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void time_sinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_sinceActionPerformed

    }//GEN-LAST:event_time_sinceActionPerformed

    private void time_sinceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_time_sinceKeyPressed
        time_since.setEditable(false);
    }//GEN-LAST:event_time_sinceKeyPressed

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
            java.util.logging.Logger.getLogger(ajoute_sience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajoute_sience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajoute_sience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajoute_sience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajoute_sience().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ajoute_sience;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jour_sience;
    private com.raven.swing.TimePicker time_hour;
    private javax.swing.JTextField time_since;
    // End of variables declaration//GEN-END:variables
}
