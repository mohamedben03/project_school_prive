/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school0;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static school0.PRINCIPAL.tabel_en;
import school0.pkg1.login;
import static Main.Main.tabel_Sincer;

/**
 *
 * @author MOHAMED
 */
public class valide_Suprrime_Siunce extends javax.swing.JFrame {


    public valide_Suprrime_Siunce() {
        initComponents();
    }

     PreparedStatement perpar;
    ResultSet result;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        num_lin = new javax.swing.JLabel();
        roww = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("هل انت متاكد من الحذف ");

        jButton1.setText("نعم");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("الغاء");

        num_lin.setBackground(new java.awt.Color(0, 102, 102));
        num_lin.setForeground(new java.awt.Color(0, 102, 102));

        roww.setBackground(new java.awt.Color(0, 102, 102));
        roww.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(num_lin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roww)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_lin)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(roww)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
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
      String Sql ="SELECT COUNT(*) FROM affectation_groupe_sciene WHERE`jour`= ? AND`Heure_debut`=?";

      
       int row =Integer.parseInt(roww.getText());
        
           String joure= (String)tabel_Sincer.getModel().getValueAt(row, 0);
           String Houre= (String)tabel_Sincer.getModel().getValueAt(row, 1);
           int count;
        try {
           perpar=  login.cnx.prepareStatement(Sql);
            perpar.setString(1, joure);
            perpar.setString(2, Houre);
            result = perpar.executeQuery();
              if(result.next()){//هذي بش نعرف بيه ايلا حصص راهم يقراو فيها تلاميذ ولا لا
            count=result.getInt(1);
            num_lin.setText(count +"");//هذا متغير نحفظ فيه لقيمة تاع عدد الاسطر
                
                System.out.println(count);} else {
    System.out.println("No rows returned.");
}
        } catch (Exception e) {
        }
       String  a=num_lin.getText();
       
       int num_group_Ils_étudient=Integer.parseInt(a);
       if(num_group_Ils_étudient==0){ 
           
        String sql="DELETE FROM `sience` WHERE `jour`=? AND`Heure_debut`=?";
         
         try {
               perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, joure);
            perpar.setString(2, Houre);
           perpar.executeUpdate();
           
        } catch (Exception e) {
             System.out.println("mmmmmm");
        }
           DefaultTableModel model = (DefaultTableModel) tabel_Sincer.getModel();
           model.removeRow(row);
           tabel_Sincer.repaint();

       }
       else{
           
                 gonge_group add=new gonge_group();

                  add.RAW.setText(row+"");  //هذا نمررو بش نقدر نجيب ببيه يوم والساعة لي حاب نمحيهم
                  
       
         add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

           
           System.out.println("يجب عليك تغير الفوج");
       }
       this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(valide_Suprrime_Siunce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(valide_Suprrime_Siunce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(valide_Suprrime_Siunce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(valide_Suprrime_Siunce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new valide_Suprrime_Siunce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel num_lin;
    public javax.swing.JLabel roww;
    // End of variables declaration//GEN-END:variables
}
