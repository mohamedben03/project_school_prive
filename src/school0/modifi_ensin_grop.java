/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school0;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static school0.PRINCIPAL.tabel_en;
import static school0.PRINCIPAL.tabel_grop;
import school0.pkg1.login;

/**
 *
 * @author MOHAMED
 */
public class modifi_ensin_grop extends javax.swing.JFrame {

    
    public modifi_ensin_grop() {
        initComponents();
        nom_ens();
    }
    
 ResultSet result;
 PreparedStatement perpar ,per;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        suprim_ens = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nom_enss = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        pn3 = new javax.swing.JPanel();
        g1 = new javax.swing.JPanel();
        g2 = new javax.swing.JPanel();
        g3 = new javax.swing.JPanel();
        nom_enst = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        btn_suprim = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        suprim_ens.setBackground(new java.awt.Color(0, 153, 153));
        suprim_ens.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("يجب عليك تغير استاذ الافواج");

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("تغير الاستاذ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        nom_enss.setBackground(new java.awt.Color(0, 153, 153));
        nom_enss.setForeground(new java.awt.Color(0, 153, 153));
        nom_enss.setBorder(null);
        nom_enss.setCaretColor(new java.awt.Color(0, 153, 153));
        nom_enss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_enssActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.CardLayout());

        pn3.setLayout(new java.awt.CardLayout());

        g1.setBackground(new java.awt.Color(0, 153, 153));

        g2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout g2Layout = new javax.swing.GroupLayout(g2);
        g2.setLayout(g2Layout);
        g2Layout.setHorizontalGroup(
            g2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        g2Layout.setVerticalGroup(
            g2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout g1Layout = new javax.swing.GroupLayout(g1);
        g1.setLayout(g1Layout);
        g1Layout.setHorizontalGroup(
            g1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        g1Layout.setVerticalGroup(
            g1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, g1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn3.add(g1, "card2");

        g3.setBackground(new java.awt.Color(0, 153, 153));

        nom_enst.setBackground(new java.awt.Color(51, 102, 255));
        nom_enst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nom_enst.setForeground(new java.awt.Color(255, 255, 255));
        nom_enst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_enstActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("حفظ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_suprim.setBackground(new java.awt.Color(0, 102, 204));
        btn_suprim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_suprim.setForeground(new java.awt.Color(255, 255, 255));
        btn_suprim.setText("حذف الاستاذ");
        btn_suprim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suprimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout g3Layout = new javax.swing.GroupLayout(g3);
        g3.setLayout(g3Layout);
        g3Layout.setHorizontalGroup(
            g3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(g3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_suprim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(nom_enst, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        g3Layout.setVerticalGroup(
            g3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, g3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(g3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(nom_enst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_suprim)
                .addContainerGap())
        );

        pn3.add(g3, "card4");

        javax.swing.GroupLayout suprim_ensLayout = new javax.swing.GroupLayout(suprim_ens);
        suprim_ens.setLayout(suprim_ensLayout);
        suprim_ensLayout.setHorizontalGroup(
            suprim_ensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suprim_ensLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(suprim_ensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(suprim_ensLayout.createSequentialGroup()
                        .addGroup(suprim_ensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(suprim_ensLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(suprim_ensLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(nom_enss, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, Short.MAX_VALUE))))
            .addGroup(suprim_ensLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        suprim_ensLayout.setVerticalGroup(
            suprim_ensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suprim_ensLayout.createSequentialGroup()
                .addGroup(suprim_ensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(suprim_ensLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nom_enss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(suprim_ensLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(suprim_ensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(suprim_ensLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(suprim_ensLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(suprim_ens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(suprim_ens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_enssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_enssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_enssActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pn3.removeAll();
        pn3.repaint();
        pn3.revalidate();
        pn3.add(g3);
        btn_suprim.setEnabled(false); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
         String id_ens=nom_enss.getText();
        String nomens=   nom_enst.getSelectedItem().toString();
        String Sql ="DELETE FROM `payment_enseignant` WHERE `Num_Enseignant`=?;";
              ;
        
        
        
        try {
               perpar=  login.cnx.prepareStatement(Sql);
               perpar.setString(1,  id_ens);
               
            perpar.executeUpdate();
         
        } catch (Exception e) {
        }
        
       
        String sql = "UPDATE `groupe` SET `Num_Enseignant`=? WHERE `Num_Enseignant`=?"
              ;
        
        
        
        try {
               perpar=  login.cnx.prepareStatement(sql);
               perpar.setString(1, nomens);
                perpar.setString(2,id_ens );
            perpar.executeUpdate();
         
        } catch (Exception e) {
        }
         btn_suprim.setEnabled(true);
         System.out.println("btn_suprim.isEnabled() = " + btn_suprim.isEnabled());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_suprimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suprimActionPerformed
         String id_ens=nom_enss.getText();
      
        String sql = "DELETE FROM `enseignant` WHERE `Num_Enseignant`=?"
              ;
        
        
        
        try {
               perpar=  login.cnx.prepareStatement(sql);
               perpar.setString(1, id_ens);
            perpar.executeUpdate();
         
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_suprimActionPerformed

    private void nom_enstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_enstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_enstActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
       
    }//GEN-LAST:event_jButton2KeyPressed
  private void nom_ens(){
    
    String sql="SELECT * FROM `enseignant`";

   
        try {
            perpar=  login.cnx.prepareStatement(sql);
            ResultSet rs=  perpar.executeQuery();
          
            while(rs.next()){
            nom_enst.addItem(rs.getString(1));
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
            java.util.logging.Logger.getLogger(modifi_ensin_grop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifi_ensin_grop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifi_ensin_grop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifi_ensin_grop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifi_ensin_grop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_suprim;
    private javax.swing.JPanel g1;
    private javax.swing.JPanel g2;
    private javax.swing.JPanel g3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField nom_enss;
    private javax.swing.JComboBox<String> nom_enst;
    private javax.swing.JPanel pn3;
    public javax.swing.JPanel suprim_ens;
    // End of variables declaration//GEN-END:variables
}