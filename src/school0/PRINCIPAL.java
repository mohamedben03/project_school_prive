package school0;

import School.ajouter_reservation;
import School.payer_les_depenses;
import classes.fonction;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.scene.image.Image;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import school0.pkg1.login;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import static oracle.jrockit.jfr.events.Bits.intValue;
import static school0.pkg1.login.cnx;


public class PRINCIPAL extends javax.swing.JFrame {

   public String a;
   public  boolean b=true;
    public PRINCIPAL() {
        initComponents();
        tabel_étudiants1();
        affich_tab_reservation();
        tabel_sience();
        tabel_model();
        tabel_Ens();
        School_name_and_logo lo=new School_name_and_logo() ;
        String ar=   lo.Nom_School.getText();
       
        tabel_Sall();
        DefaultTableModel model = (DefaultTableModel) tabel_en.getModel();
          if(model.getRowCount() == 0){  System.out.println("جدول الاساتذة فارغ");   }else{
          selcsqne();}
         Nomber_model(number_ensingent,"SELECT COUNT(*) FROM `enseignant`");//عد الاساتذة
         Nomber_model(nomer_model,"SELECT COUNT(*) FROM `module`");//عدد المواد
         Nomber_model(Nomber_sall1,"SELECT COUNT(*) FROM`groupe`");//عدد الافواج
         Nomber_model(Nomber_sall,"SELECT COUNT(*) FROM`salle`");//عدد القاعات
         Nomber_model(  total_payment,"SELECT SUM(`Montant_payment`) FROM`payment`");//المدخول الكلي
           Nomber_model(  nombre_d_élève,"SELECT COUNT(*) FROM `etudient`");//المدخول التلاميذ
          tabel_etudent2();
          String total_pai=total_payment.getText();//الدخل الاجمالي للمدرسة
          String total_pai_ensingent=total_payment.getText();//اجمالي دخل الاساتذة
           float a=Float.parseFloat(total_pai);
           float b=Float.parseFloat(total_pai_ensingent);
           a=a+b;//صافي الدخل الكلي 
           //revenu_net.setText(a+"");كي نحدم لروكيت نح تعليق 
            //dsigen_tabel();
          
    }
        
      java.util.Date date;
    java.sql.Date sqldate;
      PreparedStatement perpar;
    ResultSet result;
   Color color;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbel_model2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pn4 = new javax.swing.JPanel();
        jS1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        Table_RESERVATION3 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        Table_payment3 = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        serch_etudent = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        lbl_payer_dependens = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pn6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btn_delete_group = new javax.swing.JButton();
        btn_add_group = new javax.swing.JButton();
        btn_chong_ens = new javax.swing.JButton();
        btn_delete_ens = new javax.swing.JButton();
        btn_addmodel = new javax.swing.JButton();
        btn_delet_model = new javax.swing.JButton();
        btn_add_ens = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbel_model = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_en = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabel_grop = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        Serch_model = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        pag2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_étudiants = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_reservation = new javax.swing.JTable();
        ajoute_etude = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        erch_etudent1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabel_sall = new javax.swing.JTable();
        Ajouter_une_salle = new javax.swing.JButton();
        supprimer_salle = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabel_Since = new javax.swing.JTable();
        Suprime_sience = new javax.swing.JButton();
        ajoute_siunce = new javax.swing.JButton();
        num_lin = new javax.swing.JTextField();
        Statistiques = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nombre_d_élève = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        number_ensingent = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        Nomber_sall = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Nomber_sall1 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        nomer_model = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        revenu_net = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        total_payment = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        total_payment_ensigent = new javax.swing.JLabel();
        group_and_andstudent = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabel_etudent2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        layuot_button = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        data_school = new javax.swing.JPanel();
        nom_shol = new javax.swing.JLabel();
        ab = new javax.swing.JLabel();

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "المواد", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel13.setOpaque(false);

        tbel_model2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم ", "اسم المادة", "السعر", "المستوى"
            }
        ));
        tbel_model2.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tbel_model2.setSelectionForeground(new java.awt.Color(204, 255, 255));
        tbel_model2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbel_model2MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbel_model2);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setSize(new java.awt.Dimension(900, 500));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pn4.setBackground(new java.awt.Color(255, 255, 255));
        pn4.setLayout(new java.awt.CardLayout());

        jS1.setBorder(null);
        jS1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jPanel20.setBackground(new java.awt.Color(0, 102, 102));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });

        Table_RESERVATION3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Table_RESERVATION3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "المادة", "الفوج", "اسم الطالب", "رقم الطالب", "رقم التسجيل"
            }
        ));
        Table_RESERVATION3.setSelectionBackground(new java.awt.Color(51, 102, 255));
        Table_RESERVATION3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_RESERVATIONMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(Table_RESERVATION3);

        Table_payment3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Table_payment3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "المبلغ المدفوع", "المبلغ المطلوب", "تاريخ الدفع", "رقم الدفع"
            }
        ));
        Table_payment3.setSelectionBackground(new java.awt.Color(51, 102, 255));
        jScrollPane15.setViewportView(Table_payment3);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "بحث", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel19.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("المستوى الدراسي :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("اسم الطالب :");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        serch_etudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        serch_etudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serch_etudentKeyReleased(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("بحث   ");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jLabel17.setOpaque(true);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(serch_etudent, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(10, 11, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(serch_etudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbl_payer_dependens.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_payer_dependens.setForeground(new java.awt.Color(255, 255, 255));
        lbl_payer_dependens.setText("دفع مصاريف");
        lbl_payer_dependens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_payer_dependensMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("حذف دفع");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_payer_dependens, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_payer_dependens)
                    .addComponent(jLabel18))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jS1.setViewportView(jPanel5);

        pn4.add(jS1, "card2");

        pn6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));

        btn_delete_group.setBackground(new java.awt.Color(153, 255, 153));
        btn_delete_group.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_delete_group.setForeground(new java.awt.Color(51, 51, 51));
        btn_delete_group.setText("حذف فوج");
        btn_delete_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_groupActionPerformed(evt);
            }
        });

        btn_add_group.setBackground(new java.awt.Color(153, 255, 153));
        btn_add_group.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add_group.setForeground(new java.awt.Color(51, 51, 51));
        btn_add_group.setText("اضافة فوج");
        btn_add_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_groupActionPerformed(evt);
            }
        });

        btn_chong_ens.setBackground(new java.awt.Color(153, 255, 153));
        btn_chong_ens.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_chong_ens.setForeground(new java.awt.Color(51, 51, 51));
        btn_chong_ens.setText("تعديل استاذ");
        btn_chong_ens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chong_ensActionPerformed(evt);
            }
        });

        btn_delete_ens.setBackground(new java.awt.Color(153, 255, 153));
        btn_delete_ens.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_delete_ens.setText("حذف استاذ");
        btn_delete_ens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_ensActionPerformed(evt);
            }
        });

        btn_addmodel.setBackground(new java.awt.Color(153, 255, 153));
        btn_addmodel.setText("اضافة مادة");
        btn_addmodel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addmodelMouseClicked(evt);
            }
        });
        btn_addmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addmodelActionPerformed(evt);
            }
        });

        btn_delet_model.setBackground(new java.awt.Color(153, 255, 153));
        btn_delet_model.setForeground(new java.awt.Color(51, 51, 51));
        btn_delet_model.setText("حذف مادة");
        btn_delet_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delet_modelActionPerformed(evt);
            }
        });

        btn_add_ens.setBackground(new java.awt.Color(153, 255, 153));
        btn_add_ens.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add_ens.setForeground(new java.awt.Color(51, 51, 51));
        btn_add_ens.setText("اضاقة استاذ");
        btn_add_ens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_ensActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "المواد", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);

        tbel_model.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم ", "اسم المادة", "السعر", "المستوى"
            }
        ));
        tbel_model.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tbel_model.setSelectionForeground(new java.awt.Color(204, 255, 255));
        tbel_model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbel_modelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbel_model);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الاساتذة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel8.setOpaque(false);

        tabel_en.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_en.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم الاستاذ", "اسم", "لقب", "تاريخ الميلاد", "العنوان", "الهاتف", "الاميل", "النسبة"
            }
        ));
        tabel_en.setSelectionBackground(new java.awt.Color(0, 0, 204));
        tabel_en.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_enMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabel_en);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "الافواج", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel10.setOpaque(false);

        tabel_grop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_grop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم الفوج", "اسم الفوج", "اسم القاعة"
            }
        ));
        tabel_grop.setEnabled(false);
        tabel_grop.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane5.setViewportView(tabel_grop);
        if (tabel_grop.getColumnModel().getColumnCount() > 0) {
            tabel_grop.getColumnModel().getColumn(2).setHeaderValue("اسم القاعة");
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("تعديل فوج");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Serch_model.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Serch_modelKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("بحث");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_delete_group, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_add_group))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_delete_ens)
                        .addGap(18, 18, 18)
                        .addComponent(btn_chong_ens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add_ens)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btn_delet_model)
                        .addGap(43, 43, 43)
                        .addComponent(btn_addmodel))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Serch_model, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Serch_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addmodel)
                    .addComponent(btn_delet_model)
                    .addComponent(btn_add_ens, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_chong_ens)
                    .addComponent(btn_delete_ens)
                    .addComponent(btn_add_group)
                    .addComponent(btn_delete_group)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn6Layout = new javax.swing.GroupLayout(pn6);
        pn6.setLayout(pn6Layout);
        pn6Layout.setHorizontalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn6Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pn6Layout.setVerticalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn4.add(pn6, "card3");

        pag2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "التلاميذ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setOpaque(false);

        tabel_étudiants.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_étudiants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم ", "الاسم", "اللقب", "تاريخ الميلاد", "العنوان", "الهاتف", "اميل", "الولي", "رقم هاتف الولي", "اميل الولى"
            }
        ));
        tabel_étudiants.setToolTipText("");
        tabel_étudiants.setRowHeight(25);
        tabel_étudiants.setSelectionBackground(new java.awt.Color(0, 102, 255));
        tabel_étudiants.getTableHeader().setReorderingAllowed(false);
        tabel_étudiants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_étudiantsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel_étudiants);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "الحجز", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel14.setOpaque(false);

        table_reservation.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        table_reservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم الاستاذ", "مادة", "الفوج", "تاريخ الحجز", "رقم الحجز"
            }
        ));
        table_reservation.setRowHeight(25);
        table_reservation.setSelectionBackground(new java.awt.Color(0, 102, 255));
        table_reservation.getTableHeader().setReorderingAllowed(false);
        table_reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_reservationMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(table_reservation);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        ajoute_etude.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajoute_etude.setText("اضافة طالب");
        ajoute_etude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoute_etudeActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("تعديل طالب ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("حذف طالب");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("اضافة حجز");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("حذف حجز");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("تعديل حجز");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        erch_etudent1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erch_etudent1.setBorder(null);
        erch_etudent1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                erch_etudent1KeyReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("بحث");

        javax.swing.GroupLayout pag2Layout = new javax.swing.GroupLayout(pag2);
        pag2.setLayout(pag2Layout);
        pag2Layout.setHorizontalGroup(
            pag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pag2Layout.createSequentialGroup()
                .addGroup(pag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pag2Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(130, 130, 130)
                        .addComponent(jButton8))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(pag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pag2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(173, 173, 173)
                        .addComponent(ajoute_etude)
                        .addContainerGap())
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pag2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(erch_etudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        pag2Layout.setVerticalGroup(
            pag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pag2Layout.createSequentialGroup()
                .addGap(0, 147, Short.MAX_VALUE)
                .addGroup(pag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(erch_etudent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pag2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajoute_etude)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton10)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        pn4.add(pag2, "card4");

        settings.setBackground(new java.awt.Color(0, 102, 102));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "بيانات المدرسة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel12.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("اسم المدرسة و شعار  ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("تغير كلمة السرواسم المستخدم ");

        jButton11.setText("اضافة");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("تغير");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton15.setText("jButton15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton12))
                .addGap(26, 26, 26)
                .addComponent(jButton15)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "القاعات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel15.setOpaque(false);

        tabel_sall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_sall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم القاعة", "سعة القاعة"
            }
        ));
        tabel_sall.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane9.setViewportView(tabel_sall);

        Ajouter_une_salle.setText("اضافة قاعة ");
        Ajouter_une_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajouter_une_salleActionPerformed(evt);
            }
        });

        supprimer_salle.setText("حذف قاعة");
        supprimer_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_salleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(supprimer_salle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ajouter_une_salle))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ajouter_une_salle)
                    .addComponent(supprimer_salle))
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الحصص", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel16.setOpaque(false);

        tabel_Since.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_Since.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم القاعة", "سعة القاعة"
            }
        ));
        tabel_Since.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane10.setViewportView(tabel_Since);

        Suprime_sience.setText("حذف حصة ");
        Suprime_sience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Suprime_sienceActionPerformed(evt);
            }
        });

        ajoute_siunce.setText("اضافة حصة ");
        ajoute_siunce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoute_siunceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(Suprime_sience)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ajoute_siunce))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajoute_siunce)
                    .addComponent(Suprime_sience)))
        );

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(num_lin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addComponent(num_lin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pn4.add(settings, "card2");

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("اجمالي عدد التلاميذ");

        nombre_d_élève.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombre_d_élève.setText("sfsd");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nombre_d_élève)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombre_d_élève))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("اجمالي عدد الاساتذة");

        number_ensingent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        number_ensingent.setText("sdf");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(number_ensingent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(number_ensingent, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Nomber_sall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nomber_sall.setText("sdf");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("اجمالي عدد القاعات");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Nomber_sall, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nomber_sall)
                    .addComponent(jLabel6))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("اجمالي عدد الافواج");

        Nomber_sall1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nomber_sall1.setText("sdf");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(Nomber_sall1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Nomber_sall1))
                .addContainerGap())
        );

        nomer_model.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomer_model.setText("sfsd");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("اجمالي عدد المواد");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(nomer_model)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(26, 26, 26))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomer_model)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("صافي الدخل ");

        revenu_net.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        revenu_net.setText("sfsd");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(revenu_net)
                .addGap(62, 62, 62)
                .addComponent(jLabel11)
                .addGap(23, 23, 23))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revenu_net)
                    .addComponent(jLabel11))
                .addGap(17, 17, 17))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("اجمالي الرسوم");

        total_payment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_payment.setText("sfsd");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(total_payment)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(total_payment))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("اجمالي دخل الاساتذة");

        total_payment_ensigent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_payment_ensigent.setText("sfsd");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_payment_ensigent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(total_payment_ensigent))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout StatistiquesLayout = new javax.swing.GroupLayout(Statistiques);
        Statistiques.setLayout(StatistiquesLayout);
        StatistiquesLayout.setHorizontalGroup(
            StatistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatistiquesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        StatistiquesLayout.setVerticalGroup(
            StatistiquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatistiquesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        pn4.add(Statistiques, "card6");

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الاساتذة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel21.setOpaque(false);

        tabel_etudent2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_etudent2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اميل", "الهاتف", "العنوان", "القب", "الاسم"
            }
        ));
        tabel_etudent2.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane13.setViewportView(tabel_etudent2);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout group_and_andstudentLayout = new javax.swing.GroupLayout(group_and_andstudent);
        group_and_andstudent.setLayout(group_and_andstudentLayout);
        group_and_andstudentLayout.setHorizontalGroup(
            group_and_andstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(group_and_andstudentLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(646, Short.MAX_VALUE))
        );
        group_and_andstudentLayout.setVerticalGroup(
            group_and_andstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(group_and_andstudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        pn4.add(group_and_andstudent, "card7");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/accounts.png"))); // NOI18N
        jButton2.setText("حسابات");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        layuot_button.setBackground(new java.awt.Color(0, 153, 153));
        layuot_button.setLayout(new java.awt.CardLayout());

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student_registration_50px.png"))); // NOI18N
        jButton4.setText("الطلاب ");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teaching.png"))); // NOI18N
        jButton1.setText("النظام");
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(101, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(101, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/الاحصئيات_30px.png"))); // NOI18N
        jButton5.setText("الاحصئيات");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 51, 204));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings_40px.png"))); // NOI18N
        jButton13.setText("الاعدادت");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 51, 204));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/الاحصئيات_30px.png"))); // NOI18N
        jButton14.setText("معلومات ");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton16.setText("jButton16");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(26, 26, 26)
                .addComponent(jButton13)
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addComponent(layuot_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layuot_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        data_school.setBackground(new java.awt.Color(0, 153, 153));

        nom_shol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout data_schoolLayout = new javax.swing.GroupLayout(data_school);
        data_school.setLayout(data_schoolLayout);
        data_schoolLayout.setHorizontalGroup(
            data_schoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_schoolLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(nom_shol, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ab, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        data_schoolLayout.setVerticalGroup(
            data_schoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_schoolLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(data_schoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_shol, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(ab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(data_school, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(data_school, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1158, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pn4.removeAll();
        pn4.repaint();
        pn4.revalidate();
        pn4.add(jS1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       pn4.removeAll();
        pn4.repaint();
        pn4.revalidate();
        pn4.add(pn6);
        
       
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  pn4.removeAll();
        pn4.repaint();
        pn4.revalidate();
        pn4.add(pag2);
        
        
        
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbel_model2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbel_model2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbel_model2MouseClicked

    private void table_reservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_reservationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_reservationMouseClicked

    private void tabel_étudiantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_étudiantsMouseClicked
   
        int index = tabel_étudiants.getSelectedRow();
        TableModel mode = tabel_étudiants.getModel();
        String id = mode.getValueAt(index, 0).toString();
        DefaultTableModel model=( DefaultTableModel)table_reservation.getModel();
        model.setRowCount(0);
        
      String sql="SELECT R.`Num_Reservation`,R.`Date_Reservation`,G.`Nom_Groupe` ,M.`Nom_Module`,E.`Nom_Enseignant` FROM `reservation` R,`groupe` G ,`module` M ,`enseignant` E WHERE G.`Num_Groupe`=R.`Num_Groupe`\n" 
               + "AND M.`Num_Module`=G.`Num_Module`\n" 
               + "AND E.`Num_Enseignant`=G.`Num_Enseignant`\n" 
               + "AND R.`Num_Etudient`=?";
        
         try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, id);
            
            result = perpar.executeQuery();
          
           while(result.next()){
            String Id=result.getString("Num_Reservation");
            String date=result.getString("Date_Reservation");
            String nom_groupe=result.getString("Nom_Groupe");
            String nom_module=result.getString("Nom_Module");
            String nom_enseignant=result.getString("Nom_Enseignant");
        
               model.addRow(new Object[]{nom_enseignant,nom_module,nom_groupe,date,Id});
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
      
    
    }//GEN-LAST:event_tabel_étudiantsMouseClicked

    private void ajoute_etudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoute_etudeActionPerformed
       
   ajote_un_étudiant add=new ajote_un_étudiant();
     add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ajoute_etudeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //تعديل فوج
        modife_group add=new modife_group();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabel_enMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_enMouseClicked
        // يعرض الافواج التي يدرسها لالستاذ
        int index = tabel_en.getSelectedRow();
        TableModel mode = tabel_en.getModel();
        String id = mode.getValueAt(index, 0).toString();
        DefaultTableModel model=( DefaultTableModel)tabel_grop.getModel();
        model.setRowCount(0);
        String sql="SELECT DISTINCT  `groupe`.`Num_Groupe`,`groupe`.`Nom_Groupe` , `groupe`.`Nom_Salle`FROM `groupe`,`enseignant` WHERE `groupe`.`Num_Enseignant`=?";
        try {
            perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, id);
            result = perpar.executeQuery();
            while(result.next()){
                String Id=result.getString("Num_Groupe");
                String nom=result.getString("Nom_Groupe");
                String salle=result.getString("Nom_Salle");
                model.addRow(new Object[]{Id,nom,salle});

            }

        } catch ( Exception e) {
            JOptionPane.showMessageDialog(null,e+ "NO");
        }

    }//GEN-LAST:event_tabel_enMouseClicked

    private void tbel_modelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbel_modelMouseClicked
        int index = tbel_model.getSelectedRow();
        TableModel mode = tbel_model.getModel();
        String id = mode.getValueAt(index, 0).toString();
        DefaultTableModel model=( DefaultTableModel)tabel_en.getModel();
        model.setRowCount(0);
        DefaultTableModel mod=( DefaultTableModel)tabel_grop.getModel();
        mod.setRowCount(0);
        String sql="SELECT * FROM `enseignant` WHERE `Num_Enseignant`IN(SELECT `Num_Enseignant` FROM `groupe` WHERE `groupe`.`Num_Module`=?)";
        try {
            perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, id);
            result = perpar.executeQuery();
            while(result.next()){
                String Id=result.getString("Num_Enseignant");
                String nom=result.getString("Nom_Enseignant");
                String pre=result.getString("prenom_Enseignant");
                String date=result.getString("Date_naissence");
                String addres=result.getString("Address");
                String tele=result.getString("Telephone");
                String email=result.getString("Email");
                String prosot=result.getString("prosontage");
                model.addRow(new Object[]{Id,nom,pre,date,addres,tele,email,prosot});
            }
        } catch ( Exception e) {
            JOptionPane.showMessageDialog(null,e+ "NO");
        }
    }//GEN-LAST:event_tbel_modelMouseClicked

    private void btn_add_ensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_ensActionPerformed
        ajouter_enseignant ens=new ajouter_enseignant();
        ens.setVisible(true);
        ens.setLocationRelativeTo(null);
        ens.pack();
        ens.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_add_ensActionPerformed

    private void btn_delet_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delet_modelActionPerformed
        //حذف مادة
        int  row=tbel_model.getSelectedRow();

        String clle= (String)tbel_model.getModel().getValueAt(row, 0);
        String sql ="DELETE FROM `module` WHERE `Num_Module`=?";
        try {
            perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, clle);
            perpar.executeUpdate();

        } catch (Exception e) {
        }
        DefaultTableModel model = (DefaultTableModel) tbel_model.getModel();
        model.removeRow(row);
    }//GEN-LAST:event_btn_delet_modelActionPerformed

    private void btn_addmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addmodelActionPerformed

    }//GEN-LAST:event_btn_addmodelActionPerformed

    private void btn_addmodelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addmodelMouseClicked
        add_model add=new add_model();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_addmodelMouseClicked

    private void btn_delete_ensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_ensActionPerformed
        //حذف استاذ
        DefaultTableModel model = (DefaultTableModel) tabel_en.getModel();
        DefaultTableModel modell = (DefaultTableModel) tabel_grop.getModel();

        if(model.getRowCount() == 0){System.out.println("جدول الاساتذة فارغ");}
        else if(modell.getRowCount() == 0)
        {
            int ro=tabel_en.getSelectedRow();
            String id= (String)model.getValueAt(ro, 0).toString();
            String sql =  "DELETE FROM `enseignant` WHERE `Num_Enseignant`=?";
            model.removeRow(ro);

            try {
                perpar=  login.cnx.prepareStatement(sql);
                perpar.setString(1, id);
                perpar.executeUpdate();

            } catch (Exception e) {
            }

        }
        else
        {

            int ro=tabel_en.getSelectedRow();
            String id= (String)model.getValueAt(ro, 0).toString();
            modifi_ensin_grop as=new modifi_ensin_grop();
            valide_suprim ens=new valide_suprim();
            ens.setVisible(true);
            ens.setLocationRelativeTo(null);
            ens.pack();
            ens.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ens.selq.setText(ro+"");
            ens.id_enss.setText(id);}
    }//GEN-LAST:event_btn_delete_ensActionPerformed

    private void btn_chong_ensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chong_ensActionPerformed
        //تعديل استاذ
        modefi_ens add=new modefi_ens();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int row=tabel_en.getSelectedRow();
        TableModel model=tabel_en.getModel();
        Date date = new Date();

        String id= (String)model.getValueAt(row, 0).toString();
        String nom_ens= (String)model.getValueAt(row, 1).toString();
        String prinom_ens= (String)model.getValueAt(row, 2).toString();
        String date_ens= (String)model.getValueAt(row, 3).toString();

        String Adress_ens= (String)model.getValueAt(row, 4).toString();
        String phon_ens= (String)model.getValueAt(row, 5).toString();
        String email_ens= (String)model.getValueAt(row, 6).toString();
        String prosntag_ens= (String)model.getValueAt(row, 7).toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            date = dateFormat.parse( date_ens);

        }catch (Exception ex) {

        }
        add.cle_enss.setText(id);
        add.nom_enss.setText(nom_ens);
        add.prenom_ens.setText(prinom_ens);
        add.date_ens.setDate(date);
        add.adress_ens.setText(Adress_ens);
        add.phon_ens.setText(phon_ens);
        add.email_ens.setText(email_ens);


        add.prosntag_ens.setText(prosntag_ens);
        add.cle_enss.getText();
        add.nom_enss.getText();
        add.prenom_ens.getText();
        add.date_ens.getDate();
        add.adress_ens.getText();
        add.phon_ens.getText();
        add.email_ens.getText();
        add.prosntag_ens.getText();

    }//GEN-LAST:event_btn_chong_ensActionPerformed

    private void btn_add_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_groupActionPerformed
        //اضافة فوج
        add_grop add=new add_grop();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_add_groupActionPerformed

    private void btn_delete_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_groupActionPerformed
        //حذف فوج
        int row=tabel_grop.getSelectedRow();
        String clle= (String)tabel_grop.getModel().getValueAt(row, 0);
        String sql ="DELETE FROM `groupe` WHERE `Num_Groupe`=?";
        try {
            perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, clle);
            perpar.executeUpdate();
        } catch (Exception e) {
        }
        DefaultTableModel model = (DefaultTableModel) tabel_grop.getModel();
        model.removeRow(row);

    }//GEN-LAST:event_btn_delete_groupActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  modife_un_étudiant add=new modife_un_étudiant();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         int row=tabel_étudiants.getSelectedRow();
        TableModel model=tabel_étudiants.getModel();
        Date date = new Date();
        
         String id_étudiant= (String)model.getValueAt(row, 0).toString();
        String nom__étudiants= (String)model.getValueAt(row, 1).toString();
        String prinom_étudiants= (String)model.getValueAt(row, 2).toString();
        String date_étudiants= (String)model.getValueAt(row, 3).toString();

        String Adress_étudiants= (String)model.getValueAt(row, 4).toString();
        String phon_étudiants= (String)model.getValueAt(row, 5).toString();
        String email_étudiants= (String)model.getValueAt(row, 6).toString();
        String Gardien_étudiants= (String)model.getValueAt(row, 7).toString();
        String phon_Gardien= (String)model.getValueAt(row, 8).toString();
        String email_Gardien= (String)model.getValueAt(row, 9).toString();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            date = dateFormat.parse( date_étudiants);

        }catch (Exception ex) {

        }
       add.id_étudiants.setText(id_étudiant);
      // add.num_etuden.setText(nom__étudiants);
       add.prinom_etuden.setText(prinom_étudiants);
        add.date_nesser_etuden.setDate(date);
         add.adress_etden.setText(Adress_étudiants);
          add.phon_etuden.setText(phon_étudiants);
                    add.email_etuden.setText(email_étudiants);
                              add.nom_ab.setText(Gardien_étudiants);
                                        add.phon_ab.setText(phon_Gardien);
                                                  add.email_ab.setText(email_Gardien);



        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    ajouter_reservation add=new  ajouter_reservation();      
   int inde = tabel_étudiants.getSelectedRow();
            TableModel model1 = tabel_étudiants.getModel();
        String nom= model1.getValueAt(inde, 1).toString();
      //  add.n.setText(nom);
     add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
      add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         
        int index=tabel_étudiants.getSelectedRow();
       String id_etudient= (String)tabel_étudiants.getModel().getValueAt(index, 0);
       
        String query ="DELETE FROM `reservation` WHERE `Num_Etudient`=?";
      
        try {
            perpar=  login.cnx.prepareStatement(query);
            perpar.setString(1, id_etudient);
            perpar.executeUpdate();
            
        } catch (Exception e) {
        }
       
       String sql ="DELETE FROM `etudient` WHERE `Num_Etudient`=?";
        try {
               perpar=  login.cnx.prepareStatement(sql);
               perpar.setString(1, id_etudient);
               perpar.executeUpdate();
        
            
        } catch (Exception e) {
        }
        DefaultTableModel model = (DefaultTableModel) tabel_étudiants.getModel();
        model.removeRow(index); 
        DefaultTableModel model1=( DefaultTableModel)table_reservation.getModel();
        model1.setRowCount(0);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
  int inde = tabel_étudiants.getSelectedRow();
            TableModel model1 = tabel_étudiants.getModel();
        String nom= model1.getValueAt(inde, 1).toString();

        int index = table_reservation.getSelectedRow();
  modife_reservation MR=new modife_reservation();
        TableModel model = table_reservation.getModel();
        String date = model.getValueAt(index, 4).toString();
          MR.setVisible(true);
        MR.pack();
        MR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     MR.nom_etuden.setText(nom);
        
      // MR.txt_date_reservation.setText(date);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void lbl_payer_dependensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_payer_dependensMouseClicked
payer_les_depenses pdep=new payer_les_depenses();
        int index = Table_RESERVATION3.getSelectedRow();
        TableModel model = Table_RESERVATION3.getModel();
        String module = model.getValueAt(index, 0).toString();
        String groupe = model.getValueAt(index, 1).toString();
        String nom_etudient = model.getValueAt(index, 2).toString();
        String num_reservation = model.getValueAt(index, 3).toString();
       
        pdep.setVisible(true);
        pdep.pack();
        pdep.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pdep.lbl_nom_module.setText(module);
        pdep.lbl_nom_groupe.setText(groupe);
        pdep.lbl_nom_etudient.setText(nom_etudient);
        pdep.lbl_num_reservation.setText(num_reservation);
        
        
                
    }//GEN-LAST:event_lbl_payer_dependensMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void Table_RESERVATIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_RESERVATIONMouseClicked

        int index = Table_RESERVATION3.getSelectedRow();
        TableModel mode = Table_RESERVATION3.getModel();
        String id = mode.getValueAt(index, 4).toString();
        DefaultTableModel model=( DefaultTableModel)Table_payment3.getModel();
        model.setRowCount(0);

        String sql="SELECT P.`Num_payment`,p.`Date_payment`,M.`prix`,P.`Montant_payment` FROM `payment`P,`reservation` R,`module` M,`groupe` G WHERE P.`Num_Reservation`=R.`Num_Reservation`"
        +" AND G.`Num_Groupe`=R.`Num_Groupe`"
        +" AND M.`Num_Module`=G.`Num_Module`"
        +" AND R.`Num_Reservation`=?";

        try {

            perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, id);

            result = perpar.executeQuery();

            while(result.next()){
                String Id=result.getString("Num_payment");
                String date=result.getString("Date_payment");
                String Prix=result.getString("prix");
                String montant_payment=result.getString("Montant_payment");

                model.addRow(new Object[]{montant_payment,Prix,date,Id});

            }

        } catch ( Exception e) {
            JOptionPane.showMessageDialog(null,e+ "NO");

        }
    }//GEN-LAST:event_Table_RESERVATIONMouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  pn4.removeAll();
        pn4.repaint();
        pn4.revalidate();
        pn4.add(Statistiques);        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void supprimer_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_salleActionPerformed

       // int count ;
      //  String Sql="SELECT COUNT(*) FROM groupe WHERE`Nom_Salle`=?";
          int  row=tabel_sall.getSelectedRow();
          valide_suprime_sall sa=new valide_suprime_sall();
          sa.RAw.setText(row+"");
                  
       sa.setVisible(true);
        sa.setLocationRelativeTo(null);
        sa.pack();
        sa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   
    }//GEN-LAST:event_supprimer_salleActionPerformed

    private void Ajouter_une_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajouter_une_salleActionPerformed
        Ajouter_une_salle ens=new Ajouter_une_salle();
        ens.setVisible(true);
        ens.setLocationRelativeTo(null);
        ens.pack();
        ens.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Ajouter_une_salleActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     School_name_and_logo ens=new School_name_and_logo();
        ens.setVisible(true);
        ens.setLocationRelativeTo(null);
        ens.pack();
        ens.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   
         
      

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         changer_mot_de_passe ens=new changer_mot_de_passe();
        ens.setVisible(true);
        ens.setLocationRelativeTo(null);
        ens.pack();
        ens.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void ajoute_siunceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoute_siunceActionPerformed
  ajoute_sience add =new ajoute_sience();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_ajoute_siunceActionPerformed

    private void Suprime_sienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suprime_sienceActionPerformed
int  row=tabel_Since.getSelectedRow();

        valide_Suprrime_Siunce add=new valide_Suprrime_Siunce();
        add.roww.setText(row+"");
         add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    }//GEN-LAST:event_Suprime_sienceActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        pn4.removeAll();
        pn4.repaint();
        pn4.revalidate();
        pn4.add(settings);   
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        pn4.removeAll();
        pn4.repaint();
        pn4.revalidate();
        pn4.add(group_and_andstudent);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
color=color.black;      
color=JColorChooser.showDialog(this, "Select acolor", color);
Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("value.txt"));
                writer.write(color.getRGB());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
File file = new File("color.txt");
        if (file.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                int savedRGB = Integer.parseInt(reader.readLine());
                color  = new Color(savedRGB);
                System.out.println("Saved color: " + color);
                layuot_button.setBackground(color);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void serch_etudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch_etudentKeyReleased
     String a=serch_etudent.getText();
        Serch(a,Table_RESERVATION3);
    }//GEN-LAST:event_serch_etudentKeyReleased

    private void Serch_modelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Serch_modelKeyReleased
        
        
        Serch(Serch_model.getText(),tabel_étudiants);
    }//GEN-LAST:event_Serch_modelKeyReleased

    private void erch_etudent1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_erch_etudent1KeyReleased
        Serch(erch_etudent1.getText(), tabel_étudiants);
    }//GEN-LAST:event_erch_etudent1KeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
          try{
        
            String report="C:\\Users\\MOHAMED\\Documents\\NetBeansProjects\\school0.1\\src\\school0\\report1.jrxml";
            JasperReport jr=JasperCompileManager.compileReport(report);
            JasperPrint jp=JasperFillManager.fillReport(jr,null,cnx);
            JasperViewer.viewReport(jp, false);
            
            
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, e);
        
        }
        
    }//GEN-LAST:event_jButton16ActionPerformed
public void selcsqne(){
    // تعرض لي دائما سطرملون الاول في جدول الاستاذ
    tabel_en.setRowSelectionInterval(0,0);
        int index = 0;
        TableModel mode = tabel_en.getModel();
        String id = mode.getValueAt(index, 0).toString();
        DefaultTableModel model=( DefaultTableModel)tabel_grop.getModel();
        model.setRowCount(0);
        String sql="SELECT DISTINCT  `groupe`.`Num_Groupe`,`groupe`.`Nom_Groupe` , `groupe`.`Nom_Salle`FROM `groupe`,`enseignant` WHERE `groupe`.`Num_Enseignant`=?";
         try {
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, id);
           result = perpar.executeQuery();           
           while(result.next()){
            String Id=result.getString("Num_Groupe");
            String nom=result.getString("Nom_Groupe");
            String salle=result.getString("Nom_Salle");
            model.addRow(new Object[]{Id,nom,salle});
                  }
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            }}
  //________________________________________________________________________________
    public static void AddRowtoJTable(Object[]dataRow){
         //تعمل تحديث للجدول
        DefaultTableModel module=(DefaultTableModel)tbel_model.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
          int row=tbel_model.getSelectedRow(); 
  }
     public static void ADDSEICE (Object[]dataRow){
         //تعمل تحديث للجدول
        DefaultTableModel module=(DefaultTableModel)tabel_Since.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
          int row=tabel_Since.getSelectedRow(); 
  }
      public static void ADDSALL (Object[]dataRow){
         //تعمل تحديث للجدول
        DefaultTableModel module=(DefaultTableModel)tabel_sall.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
          int row=tabel_sall.getSelectedRow(); 
  }
  //________________________________________________________________________________
    public static void Addgrop(Object[]dataRow){
       //تعمل تحديث للفوج
         DefaultTableModel module=(DefaultTableModel)tabel_grop.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
         int row=tabel_grop.getSelectedRow(); }
  //تجري تحدسث على جدول الاساتذة
    public static void AddRo_ens(Object[]dataRow){
         DefaultTableModel module=(DefaultTableModel)tabel_en.getModel();
         module.addRow(dataRow);
  }
  //________________________________________________________________________________
  //تاخذ القيم الي واجهة التعديل 
    public static void Add_tablens(Object[]dataRow){
      modefi_ens add=new modefi_ens();
        int row=tabel_en.getSelectedRow();
        DefaultTableModel  model=(DefaultTableModel)tabel_en.getModel();
        model.addRow(dataRow);
        model.setValueAt(add.cle_enss.getText(), row, 0);
              model.setValueAt( add.nom_enss.getText(), row,1);
              model.setValueAt( add.prenom_ens.getText(), row, 2);
              model.setValueAt( add.date_ens.getDate(), row, 3); 
              model.setValueAt( add.adress_ens.getText(), row, 4); 
              model.setValueAt( add.phon_ens.getText(), row, 5); 
              model.setValueAt( add.email_ens.getText(), row, 6); 
              model.setValueAt( add.prosntag_ens.getText(), row, 7);   
              model.removeRow(row);
  }

  //________________________________________________________________________________
    public void logo(){
    
        String sql="SELECT  `name`, `logo` FROM `school` WHERE `id`=1;";
         try {
                         perpar=  login.cnx.prepareStatement(sql);
                         result =perpar.executeQuery();
                         
                         while (result.next()) {     
                             String schoolName=result.getString("name");
                              byte[] imageData = result.getBytes("logo");
                              
                              
                               InputStream inputStream = new ByteArrayInputStream(imageData);
                               
                                Image image = ImageIO.read(inputStream);
                                  Image scaledImage = image.getScaledInstance(100, 50, Image.SCALE_SMOOTH);
                              ImageIcon imageIcon = new ImageIcon(imageData);
                           String charset = "UTF-8"; // تعيين ترميز النص
                            byte[] bytes = schoolName.getBytes(charset);//تحويلا النص الي صغة  لغة العربية
                          String resultt = new String(bytes, charset);
                           ab.setText(resultt);
                           nom_shol.setIcon(new ImageIcon(scaledImage));

             }

        } catch (Exception e) {
        }
   
        }
    
    
  //يعرض جدول الافواج 
    
 public void tabel_grop()
    {
        try {
         
            String sql="SELECT * FROM `groupe`";
             perpar=  login.cnx.prepareStatement(sql);
    
      result = perpar.executeQuery();
        
     DefaultTableModel model=( DefaultTableModel)tabel_grop.getModel();
       tabel_grop.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
       tabel_grop.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاعمدة
     
   while(result.next()){
   model.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5)});
   }
    tabel_grop.setDefaultEditor(Object.class, null);
        } catch (Exception e) {
        }
    }
   public void tabel_Sall()
    {
        try {
         
            String sql="SELECT * FROM `salle`";
             perpar=  login.cnx.prepareStatement(sql);
    
      result = perpar.executeQuery();
        
     DefaultTableModel model=( DefaultTableModel)tabel_sall.getModel();
      tabel_sall.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      tabel_sall.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاعمدة
     
   while(result.next()){
   model.addRow(new String[]{result.getString(1),result.getString(2)});
   }
        } catch (Exception e) {
        }
        tabel_sall.setDefaultEditor(Object.class, null);
    }
  //==================================================================================______________
  
  public void tabel_model() {
    try {
        //يعرض جدول الافواج لكن لم نستعملها لاننا نستعمل الثانية في جدول الاساتذة
        String sql = "SELECT `module`.`Num_Module`, `module`.`Nom_Module`, `module`.`prix`, `niveau`.`Num_niveau`, `niveau`.`Nom_niveau` FROM `module` JOIN `niveau` ON `module`.`Num_niveau` = `niveau`.`Num_niveau`";
        perpar = login.cnx.prepareStatement(sql);
        result = perpar.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) tbel_model.getModel();
        tbel_model.setColumnSelectionAllowed(false);
        tbel_model.getTableHeader().setReorderingAllowed(false);
        
        while (result.next()) {
            model.addRow(new String[]{result.getString(1), result.getString(2), result.getString(3), result.getString(5)});
        }
    } catch (Exception e) {
    }
    tbel_model.setDefaultEditor(Object.class, null);
}
    //==================================================================================______________
        public void tabel_Ens()
    {
        //يعرض جدول الاساتذة
        try {
            String sql="SELECT * FROM `enseignant`";
            perpar=  login.cnx.prepareStatement(sql);
            result = perpar.executeQuery();
            DefaultTableModel model=( DefaultTableModel)tabel_en.getModel();
            tabel_en.setColumnSelectionAllowed(false);
            tabel_en.getTableHeader().setReorderingAllowed(false);
            while(result.next()){
            model.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                                }
            } catch (Exception e) {
                                  }
         tabel_en.setDefaultEditor(Object.class, null);
                    }
          public void tabel_sience()
    {
        //يعرض جدول الاساتذة
        try {
            String sql="SELECT * FROM `sience` ";
            perpar=  login.cnx.prepareStatement(sql);
            result = perpar.executeQuery();
            DefaultTableModel model=( DefaultTableModel)tabel_Since.getModel();
            tabel_en.setColumnSelectionAllowed(false);
            tabel_en.getTableHeader().setReorderingAllowed(false);
            while(result.next()){
            model.addRow(new String[]{result.getString(1),result.getString(2)});
                                }
            } catch (Exception e) {
                                  }
         tabel_Since.setDefaultEditor(Object.class, null);
                    }
    //=====================================================================================
               public void affich_tab_reservation()
    {
        try {
           String sql="SELECT R.`Num_Reservation`,E.`Num_Etudient`,E.`Nom_Etudient`,G.`Nom_Groupe` ,M.`Nom_Module` FROM `reservation` R,`etudient` E,`groupe` G ,`module` M WHERE G.`Num_Groupe`=R.`Num_Groupe`"
                     +" AND M.`Num_Module`=G.`Num_Module`"
                     +" AND E.`Num_Etudient`=R.`Num_Etudient`";
                    // +" AND R.`Num_Etudient`='2'; ";
             perpar=  login.cnx.prepareStatement(sql);
    
      result = perpar.executeQuery();
        
     DefaultTableModel model=( DefaultTableModel)Table_RESERVATION3.getModel();
     
   while(result.next()){
   model.addRow(new String[]{result.getString(5),result.getString(4),result.getString(3),result.getString(2),result.getString(1)});
   }
        } catch (Exception e) {
        }
        Table_RESERVATION3.setDefaultEditor(Object.class, null);
    }


          public void tabel_étudiants1()
    {
        //يعرض جدول الاساتذة
        try {
            String sql="SELECT * FROM `etudient`";
            perpar=  login.cnx.prepareStatement(sql);
            result = perpar.executeQuery();
            DefaultTableModel model=( DefaultTableModel)tabel_étudiants.getModel();
            tabel_étudiants.setColumnSelectionAllowed(false);
            tabel_étudiants.getTableHeader().setReorderingAllowed(false);
            while(result.next()){
            model.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10)});
                                }
            } catch (Exception e) {
                                  }
        tabel_étudiants.setDefaultEditor(Object.class, null);
        
                    }
          //الاحصائيات
         
          
           
           //دالة الاحصئيات
            private  void Nomber_model(JLabel  a,String Sql){
          
           //String sql="SELECT COUNT(*) FROM `module`";
              try {
                  perpar =login.cnx.prepareStatement(Sql);
          result=perpar.executeQuery();
          if(result.next()){
          
          a.setText(result.getInt(1)+"");
          }
              } catch (Exception e) {
                  System.out.println("خطا");
              }
          }
           
         
          
          
         private  void tabel_etudent2(){
         
         String sql ="SELECT `Nom_Etudient`,`prenom_Etudient`,`Address`,`Telephone`,`Email` FROM `etudient` ";
             try {
                 perpar =login.cnx.prepareStatement(sql);
                result= perpar.executeQuery();
              DefaultTableModel model=( DefaultTableModel)tabel_etudent2.getModel();
            tabel_en.setColumnSelectionAllowed(false);
            tabel_en.getTableHeader().setReorderingAllowed(false);
            while(result.next()){
            model.addRow(new String[]{result.getString(5),result.getString(4),result.getString(3),result.getString(2),result.getString(1)});
                                }
             } catch (Exception e) {
             }
          tabel_etudent2.setDefaultEditor(Object.class, null);
         }
          
      //خاصة ب ديزابن جداول 
          private  void  dsigen_tabel(){
          
           //خاصة ب  ديزاين جدول الحجز
           table_reservation.getTableHeader().setFont(new  Font("segoe UI",Font.BOLD,12));
           table_reservation.getTableHeader().setOpaque(false);
            table_reservation.getTableHeader().setBackground(new Color(32,136,203));
             table_reservation.getTableHeader().setForeground(new Color(255,255,255));
            table_reservation.setRowHeight(25);
            //خاصة بدزاين جدول الطلاب 
            tabel_étudiants.getTableHeader().setFont(new  Font("segoe UI",Font.BOLD,12));
           tabel_étudiants.getTableHeader().setOpaque(false);
            tabel_étudiants.getTableHeader().setBackground(new Color(32,136,203));
             tabel_étudiants.getTableHeader().setForeground(new Color(255,255,255));
            tabel_étudiants.setRowHeight(25);}
          
          private void Serch(String a,JTable b){
               DefaultTableModel model=( DefaultTableModel)b.getModel();
               TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
               b.setRowSorter(trs);
               trs.setRowFilter(RowFilter.regexFilter(a));
          }
          
          
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter_une_salle;
    private javax.swing.JLabel Nomber_sall;
    private javax.swing.JLabel Nomber_sall1;
    private javax.swing.JTextField Serch_model;
    private javax.swing.JPanel Statistiques;
    public javax.swing.JButton Suprime_sience;
    private javax.swing.JTable Table_RESERVATION3;
    private javax.swing.JTable Table_payment3;
    public javax.swing.JLabel ab;
    private javax.swing.JButton ajoute_etude;
    private javax.swing.JButton ajoute_siunce;
    private javax.swing.JButton btn_add_ens;
    private javax.swing.JButton btn_add_group;
    private javax.swing.JButton btn_addmodel;
    private javax.swing.JButton btn_chong_ens;
    private javax.swing.JButton btn_delet_model;
    private javax.swing.JButton btn_delete_ens;
    private javax.swing.JButton btn_delete_group;
    public static javax.swing.JPanel data_school;
    private javax.swing.JTextField erch_etudent1;
    private javax.swing.JPanel group_and_andstudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jS1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel layuot_button;
    private javax.swing.JLabel lbl_payer_dependens;
    public javax.swing.JLabel nom_shol;
    private javax.swing.JLabel nombre_d_élève;
    private javax.swing.JLabel nomer_model;
    public javax.swing.JTextField num_lin;
    private javax.swing.JLabel number_ensingent;
    private javax.swing.JPanel pag2;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn6;
    private javax.swing.JLabel revenu_net;
    private javax.swing.JTextField serch_etudent;
    private javax.swing.JPanel settings;
    private javax.swing.JButton supprimer_salle;
    public static javax.swing.JTable tabel_Since;
    public static javax.swing.JTable tabel_en;
    public static javax.swing.JTable tabel_etudent2;
    public static javax.swing.JTable tabel_grop;
    public static javax.swing.JTable tabel_sall;
    public static javax.swing.JTable tabel_étudiants;
    public static javax.swing.JTable table_reservation;
    public static javax.swing.JTable tbel_model;
    public static javax.swing.JTable tbel_model2;
    private javax.swing.JLabel total_payment;
    private javax.swing.JLabel total_payment_ensigent;
    // End of variables declaration//GEN-END:variables
}
