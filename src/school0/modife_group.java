/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school0;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static school0.PRINCIPAL.tabel_grop;
import school0.pkg1.login;

/**
 *
 * @author MOHAMED
 */
public class modife_group extends javax.swing.JFrame {

    /**
     * Creates new form modife_group
     */
    public modife_group() {
        initComponents();
        nom_ens();
        nom_model();
        nom_sall();
    }
 PreparedStatement perpar;
    ResultSet result;
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txt_nomgroupe = new javax.swing.JTextPane();
        ComboBox_ensein = new javax.swing.JComboBox<>();
        ComboBox_module = new javax.swing.JComboBox<>();
        ComboBox_Salle = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        idm = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("اسم الفوج");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("اسم الاستاذ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("اسم المادة");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("اسم القاعة");

        jScrollPane1.setViewportView(Txt_nomgroupe);

        ComboBox_ensein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_enseinActionPerformed(evt);
            }
        });

        ComboBox_module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_moduleActionPerformed(evt);
            }
        });

        ComboBox_Salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_SalleActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("اضافة ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idm.setEditable(false);
        idm.setBackground(new java.awt.Color(204, 255, 255));
        idm.setForeground(new java.awt.Color(204, 255, 255));
        idm.setBorder(null);
        idm.setCaretColor(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(idm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox_Salle, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComboBox_module, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBox_ensein, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(120, 120, 120))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_ensein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_module, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_Salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox_enseinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_enseinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_enseinActionPerformed

    private void ComboBox_moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_moduleActionPerformed

    }//GEN-LAST:event_ComboBox_moduleActionPerformed

    private void ComboBox_SalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_SalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_SalleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row=tabel_grop.getSelectedRow();
       String id= (String)tabel_grop.getModel().getValueAt(row, 0);
         String module= ComboBox_module.getSelectedItem().toString();
          String enseignant= ComboBox_ensein.getSelectedItem().toString();
           String Salle= ComboBox_Salle.getSelectedItem().toString();
            String nom_groupe=   Txt_nomgroupe.getText();
          
           
   // String sql= "INSERT INTO `groupe`(`Nom_Groupe`, `Num_Enseignant`, `Num_Module`, `Nom_Salle`)SELECT ?,E.`Num_Enseignant`,M.`Num_Module`,? FROM `enseignant` E,`module` M WHERE E.`Nom_Enseignant`=? AND M.`Nom_Module`=?"; 

                
String sql=" UPDATE `groupe` SET `Nom_Groupe`=?,`Num_Enseignant`=(SELECT `Num_Enseignant` FROM `enseignant` WHERE `Nom_Enseignant`=?),`Num_Module`=(SELECT `Num_Module` FROM `module` WHERE `Nom_Module`=?),`Nom_Salle`=? WHERE `Num_Groupe`=?";
            try {

                
               // INSERT INTO `groupe`(`Nom_Groupe`, `Num_Enseignant`, `Num_Module`, `Nom_Salle`) SELECT 'G5',E.`Num_Enseignant`,M.`Num_Module`,'Salle_2' FROM `enseignant` E,`module` M WHERE E.`Num_Enseignant`= 39004718 AND M.`Num_Module`=1; 
                
                
                
               perpar=  login.cnx.prepareStatement(sql);
                
               perpar.setString(1, nom_groupe);
               perpar.setString(2,enseignant);
               perpar.setString(3,module );
               perpar.setString(4, Salle);
               perpar.setString(5,id);
                perpar.execute();

                 Txt_nomgroupe.setText("");
             
           
            } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
     //  JOptionPane.showMessageDialog(null,"??? ????? ??? ????? ??????","Missing information",JOptionPane.ERROR_MESSAGE);
            }
          
        
     this.dispose();
            

    }//GEN-LAST:event_jButton1ActionPerformed
 private void nom_sall(){
    
    String sql="SELECT * FROM `salle`";

   
        try {
            perpar=  login.cnx.prepareStatement(sql);
            ResultSet rs=  perpar.executeQuery();
          
            while(rs.next()){
            ComboBox_Salle.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }
  private void nom_model(){
    
    String sql="SELECT * FROM `module`";

   
        try {
            perpar=  login.cnx.prepareStatement(sql);
            ResultSet rs=  perpar.executeQuery();
          
            while(rs.next()){
            ComboBox_module.addItem(rs.getString(2));
            }
        } catch (Exception e) {
        }
    }
  private void nom_ens(){
    
    String sql="SELECT * FROM `enseignant`";

   
        try {
            perpar=  login.cnx.prepareStatement(sql);
            ResultSet rs=  perpar.executeQuery();
          
            while(rs.next()){
            ComboBox_ensein.addItem(rs.getString(2));
            }
        } catch (Exception e) {
        }
    }
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
            java.util.logging.Logger.getLogger(modife_group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modife_group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modife_group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modife_group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modife_group().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ComboBox_Salle;
    public javax.swing.JComboBox<String> ComboBox_ensein;
    public javax.swing.JComboBox<String> ComboBox_module;
    public javax.swing.JTextPane Txt_nomgroupe;
    private javax.swing.JTextField idm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
