/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school0;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static school0.PRINCIPAL.tabel_grop;
import static school0.PRINCIPAL.tbel_model;
import school0.pkg1.login;

/**
 *
 * @author MOHAMED
 */
public class add_grop extends javax.swing.JFrame {

    
    public add_grop() {
        initComponents();
        nom_model();//تعرض ليست تع مواد
        nom_ens();//تعرض ليست تع استاذ
        nom_sall();//تعرض ليست تع قاعات
    }
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
        jLabel1 = new javax.swing.JLabel();

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
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ComboBox_Salle, 0, 234, Short.MAX_VALUE)
                            .addComponent(ComboBox_module, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_ensein, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(46, 46, 46))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(idm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(idm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ComboBox_ensein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4))
                    .addComponent(ComboBox_module, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComboBox_Salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(189, 189, 151));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("اضافة فوج");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox_SalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_SalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_SalleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(verf()==true){
        int lastRowIndex;
String module= ComboBox_module.getSelectedItem().toString();
          String enseignant= ComboBox_ensein.getSelectedItem().toString();
           String Salle= ComboBox_Salle.getSelectedItem().toString();
            String nom_groupe=   Txt_nomgroupe.getText();
          
           
                           String sql= "INSERT INTO `groupe`(`Nom_Groupe`, `Num_Enseignant`, `Num_Module`, `Nom_Salle`)SELECT ?,E.`Num_Enseignant`,M.`Num_Module`,? FROM `enseignant` E,`module` M WHERE E.`Nom_Enseignant`=? AND M.`Nom_Module`=?"; 

             
            try {

                
               perpar=  login.cnx.prepareStatement(sql);
                
               perpar.setString(1, nom_groupe);
               perpar.setString(2,Salle );
               perpar.setString(3,enseignant );
               perpar.setString(4,module );
               
                perpar.execute();

                 Txt_nomgroupe.setText("");
                 
   
             
           
            } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");

            }
          
            }else{
     JOptionPane.showMessageDialog(null, "ادخل البيانات من فضلك");
}
   this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboBox_moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_moduleActionPerformed
        
    }//GEN-LAST:event_ComboBox_moduleActionPerformed

    private void ComboBox_enseinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_enseinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_enseinActionPerformed
 private boolean verf(){
     boolean a=true;
  if(Txt_nomgroupe.getText().equals("")||ComboBox_ensein.getSelectedItem().equals("")|| ComboBox_module.getSelectedItem().equals("")|| ComboBox_Salle.getSelectedItem().equals(""))
  {
  a=false;
  }
     return a;
        }
    PreparedStatement perpar;
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
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_grop().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
