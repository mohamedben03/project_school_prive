/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import School.Modifier_groupe_science1;
import School.affectation_groupe_science1;
import School.affectation_groupe_science1_copier;
import School.ajouter_reservation;
import School.modifier_groupe;
import School.payer_les_depenses;

import classes.fonction;
import form.Panel1;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.security.AuthProvider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
//import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static kabitalib.util.Utilitas.dateFormat;
import school0.pkg1.login;
import menu.MenuItem;
import school0.Ajouter_une_salle;
import school0.PRINCIPAL;
import static school0.PRINCIPAL.tabel_Since;
import static school0.PRINCIPAL.tabel_en;
import static school0.PRINCIPAL.tabel_grop;
import static school0.PRINCIPAL.tabel_sall;
import static school0.PRINCIPAL.tabel_étudiants;
import school0.Payment_Enseignant;
import school0.School_name_and_logo;
import school0.add_model;
import school0.ajote_un_étudiant;
import school0.ajoute_sience;
import school0.changer_mot_de_passe;
import school0.modife_reservation;
import school0.modife_un_étudiant;
import school0.modifi_ensin_grop;
import school0.valide_Suprrime_Siunce;
import school0.valide_suprim;
import school0.valide_suprime_sall;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import static school0.PRINCIPAL.tbel_model;
import school0.ajoute_niuve;
import static school0.pkg1.login.cnx;
import school0.validation_Modifier_science;


/**
 *
 * @author RavenPC
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
         tabel_nuve();
        logo();
        tabel_Model();
        execute();
        tabel_étudiants13(tabel_étudiants);
         tabel_étudiants13(tabel_étudiants1);
        
         affich_tab_reservation();
         tabel_Ens(Table_Enseignant);
         tabel_Ens(Table_Enseignant2);
         Combobox_recherche_module (ComboBox_recherche_module);
         tabel_Sall();
       tabel_sienc();
         statistic_fonction();//دالة الاحصئيات
         affichier_enseignant_in_combobox(ComboBox_recherche_Enseignant);
         ComboBox_groupe_chooser();
         Cours_Aujourdhui();
           Tabel_Since_Groupe.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      Tabel_Since_Groupe.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاعمدة
        Table_Groupe.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      Table_Groupe.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاع
         
         ActionListener updateDateTime = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = dateFormat.format(new Date());
        jLabel72.setText(" " + dateTime);
    }
    
};
         Timer timer = new Timer(1000, updateDateTime);
        timer.start();

         
         
    }
  java.util.Date date;
    java.sql.Date sqldate;
      PreparedStatement perpar;
    ResultSet result;
   Color color;
   

   
    
    private void execute() {
        ImageIcon icon_tel = new ImageIcon(getClass().getResource("/image/telcom.png"));
        ImageIcon icon_data = new ImageIcon(getClass().getResource("/image/data.png"));
         ImageIcon icon_group = new ImageIcon(getClass().getResource("/image/group.png"));
          ImageIcon icon_statistics = new ImageIcon(getClass().getResource("/image/statistics.png"));
        ImageIcon icon_Teacher = new ImageIcon(getClass().getResource("/image/Teacher.png"));
         ImageIcon icon_stednt = new ImageIcon(getClass().getResource("/image/stdent.png"));
          ImageIcon iconmenu_peincipal = new ImageIcon(getClass().getResource("/image/Menu_prencipl.png"));
        ImageIcon iconStaff = new ImageIcon(getClass().getResource("/image/Menu_prencipl.png"));
        ImageIcon iconSetting = new ImageIcon(getClass().getResource("/menu/setting.png"));
        ImageIcon iconDatabase = new ImageIcon(getClass().getResource("/menu/database.png"));
        ImageIcon iconMessage = new ImageIcon(getClass().getResource("/menu/message.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
        ImageIcon iconNext = new ImageIcon(getClass().getResource("/menu/next.png"));
        //  create submenu staff
        MenuItem menuStaff1 = new MenuItem(iconSubMenu, "بيانات الطلاب ", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(Student_data);
   jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(baynat_atolab);
 
        
            }
            
        });
        MenuItem menuStaff2 = new MenuItem(iconSubMenu, "حسابات الطلاب ",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(Student_accounts);
         jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(lineEtudentData);
            }
        });
           MenuItem menuStaff3 = new MenuItem(iconSubMenu, " الحضور والغياب ",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(Panel_presence_absence_Etudient);
         jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(pannel_presence_absent_elev);
            }
        });
       // MenuItem menuStaff3 = new MenuItem(iconSubMenu, "Staff 003", null);
        //  create submenu setting message
/*
        MenuItem message1 = new MenuItem(iconNext, "Message 001", null);
        MenuItem message2 = new MenuItem(iconNext, "Message 002", null);
        MenuItem message3 = new MenuItem(iconNext, "Message 003", null);*/

        //  create submenu setting 
        MenuItem menuSetting1 = new MenuItem(iconSubMenu, "بيانات الاساتذة ", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(ensinet_data);
    jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(LIneEtdentCALCul);
  
        
            }
        });
       MenuItem menu_Group = new MenuItem(icon_group, "الافواج", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(groups);
    jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(lingroups);
  
  
  
  
        
            }
        });
           MenuItem home = new MenuItem(iconmenu_peincipal, "الصفحة الرئسية", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(panel_Home);
    jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(panel_line_Home);
  
  
  
  
        
            }
        });
        MenuItem staticticitem = new MenuItem(icon_statistics, "الاحصئيات", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(statistic);
    jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(linatatisic);
  
        
            }
        });
          MenuItem menu_data = new MenuItem(icon_data, "بيانات المدرسة", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(Sittins);
    jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(Sttings);
  
        
            }
        });
      //  MenuItem menuSetting3 = new MenuItem(iconSubMenu, "Setting 003", null);
        MenuItem menuSetting4 = new MenuItem(iconSubMenu, "حسابات الاساتذة",  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(hisabat_encinet);
    jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(mostahakat_alastida);
  
        
            }
        });
        

         MenuItem Telcom = new MenuItem(icon_tel, " الاتصلات", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
             panelPrencipal   .removeAll();
    panelPrencipal .repaint();
       panelPrencipal.revalidate();
  panelPrencipal.add(panellTelcom);
    jPanel4   .removeAll();
    jPanel4 .repaint();
       jPanel4.revalidate();
  jPanel4.add(panel_telcom);
  
        
            }
        });
        
        MenuItem menuStaff = new MenuItem(icon_stednt, "الطلاب", null, menuStaff1, menuStaff2,menuStaff3);
        MenuItem menuSetting = new MenuItem(icon_Teacher, "الاساتذة", null, menuSetting1, menuSetting4);
        
        addMenu(home,menuStaff, menuSetting,  menu_Group,menu_data,staticticitem,Telcom);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel100 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        nameSchool = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();
        panelLIne = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panel_line_Home = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lineEtudentData = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        erch_etudent1 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        LIneEtdentCALCul = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ComboBox_recherche_module = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        erch_etudent2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        mostahakat_alastida = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ComboBox_recherche_Enseignant = new javax.swing.JComboBox<>();
        jLabel76 = new javax.swing.JLabel();
        baynat_atolab = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        erch_etudent3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        Sttings = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        serchseince = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        seerch = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        lingroups = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        ComboBox_choix = new javax.swing.JComboBox<>();
        ComboBox_ENS_Mod_Sall = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        serch_groups = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        linatatisic = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        panel_telcom = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        pannel_presence_absent_elev = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        serch_abcebt_and_pesenc = new javax.swing.JTextField();
        panelPrencipal = new javax.swing.JPanel();
        panel_Home = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        Table_SCIENCE_HOJORDUI = new javax.swing.JTable();
        Student_data = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        ajoute_etude = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_étudiants = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_reservation = new javax.swing.JTable();
        Student_accounts = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        Table_payment3 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        Table_RESERVATION3 = new javax.swing.JTable();
        ensinet_data = new javax.swing.JPanel();
        leschent = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        txt_Num_Enseignant = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Nom_Enseignant = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        txt_Prenom_Enseignant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        date_naissence_Ens = new com.toedter.calendar.JDateChooser();
        jPanel28 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_addres_Ens = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        txt_Telephone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        txt_Email_Ens = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        txt_prosontage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        paneldataensient = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Table_Enseignant = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        btn_imprimier_Emploi_temps = new javax.swing.JButton();
        btn_Supprimer_Enseignant = new javax.swing.JButton();
        btn_modifier_Enseignant = new javax.swing.JButton();
        btn_ajouter_Enseignant = new javax.swing.JButton();
        hisabat_encinet = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        Table_cotisation_enseignant = new javax.swing.JTable();
        jPanel42 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Table_montant_enseignant = new javax.swing.JTable();
        lbl_total_montant_enseignant = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Sittins = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        ajoute_siunce = new javax.swing.JButton();
        Suprime_sience = new javax.swing.JButton();
        Ajouter_une_salle = new javax.swing.JButton();
        supprimer_salle = new javax.swing.JButton();
        ajote_nuve = new javax.swing.JButton();
        suprime_niive = new javax.swing.JButton();
        ajoute_model = new javax.swing.JButton();
        suprime_moudel = new javax.swing.JButton();
        suprime_niive1 = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabel_sall = new javax.swing.JTable();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabel_Sincer = new javax.swing.JTable();
        jPanel138 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        Tabel_nive = new javax.swing.JTable();
        jPanel52 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel140 = new javax.swing.JPanel();
        jPanel141 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tabel_modell = new javax.swing.JTable();
        groups = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        Nember_Etudient_en_groupe = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        Montant_groupe = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        Tabel_Since_Groupe = new javax.swing.JTable();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Table_Groupe = new javax.swing.JTable();
        statistic = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        total_payment = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        total_payment_ensigent = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        revenu_net = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        nombre_d_élève = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        number_ensingent = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        Nomber_sall = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        Nomber_sall1 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        nomer_model = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        panellTelcom = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel75 = new javax.swing.JPanel();
        alwali_elev = new javax.swing.JPanel();
        elev_alwali = new javax.swing.JPanel();
        jPanel104 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel105 = new javax.swing.JPanel();
        jPanel102 = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        Nom_alwali = new javax.swing.JLabel();
        jPanel111 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        phon_Alwali = new javax.swing.JLabel();
        jPanel112 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        Email_Alwali = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        jPanel101 = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Nom_elev = new javax.swing.JLabel();
        jPanel108 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        Phon_elev = new javax.swing.JLabel();
        jPanel110 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        Email_Elev = new javax.swing.JLabel();
        encinet = new javax.swing.JPanel();
        telcom_chong = new javax.swing.JPanel();
        telcomElev = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_étudiants1 = new javax.swing.JTable();
        telcomEncinet = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        Table_Enseignant2 = new javax.swing.JTable();
        Panel_presence_absence_Etudient = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel99 = new javax.swing.JPanel();
        jPanel130 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel131 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel115 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel117 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton19 = new javax.swing.JButton();
        jPanel118 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel120 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel121 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel122 = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel124 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel125 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        Table_Enseignant3 = new javax.swing.JTable();
        jPanel126 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        ComboBox_groupe_chooser = new javax.swing.JComboBox<>();
        jPanel127 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        ComboBox_day_chooser = new javax.swing.JComboBox<>();
        jPanel114 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        ComboBox_science_chooser = new javax.swing.JComboBox<>();
        jPanel129 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        day_chooser = new com.toedter.calendar.JDateChooser();
        jPanel92 = new javax.swing.JPanel();
        jPanel132 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel133 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jPanel134 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jPanel135 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jPanel97 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        Table_PRESENCE_ABSENCE = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(0, 0, 153));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 50));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("jLabel72");

        nameSchool.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameSchool.setForeground(new java.awt.Color(255, 255, 255));
        nameSchool.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameSchool.setText("jLabel74");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nameSchool, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(0, 153, 51));
        menus.setForeground(new java.awt.Color(0, 153, 51));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());

        panelLIne.setBackground(new java.awt.Color(255, 255, 255));
        panelLIne.setPreferredSize(new java.awt.Dimension(940, 70));

        jPanel4.setBackground(new java.awt.Color(0, 153, 102));
        jPanel4.setLayout(new java.awt.CardLayout());

        panel_line_Home.setBackground(new java.awt.Color(0, 153, 51));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("الصفحة الرئسية ");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu2.png"))); // NOI18N

        javax.swing.GroupLayout panel_line_HomeLayout = new javax.swing.GroupLayout(panel_line_Home);
        panel_line_Home.setLayout(panel_line_HomeLayout);
        panel_line_HomeLayout.setHorizontalGroup(
            panel_line_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_line_HomeLayout.createSequentialGroup()
                .addContainerGap(673, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_line_HomeLayout.setVerticalGroup(
            panel_line_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_line_HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(panel_line_Home, "card11");

        jPanel16.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("حسابات الطلاب");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("بحث");

        erch_etudent1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erch_etudent1.setBorder(null);
        erch_etudent1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                erch_etudent1KeyReleased(evt);
            }
        });

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/حسبات.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(erch_etudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(erch_etudent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap())
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lineEtudentDataLayout = new javax.swing.GroupLayout(lineEtudentData);
        lineEtudentData.setLayout(lineEtudentDataLayout);
        lineEtudentDataLayout.setHorizontalGroup(
            lineEtudentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
            .addGroup(lineEtudentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lineEtudentDataLayout.setVerticalGroup(
            lineEtudentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(lineEtudentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(lineEtudentData, "card2");

        LIneEtdentCALCul.setBackground(new java.awt.Color(0, 153, 51));

        jLabel8.setBackground(new java.awt.Color(0, 153, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("بيانات الاساتذة ");

        ComboBox_recherche_module.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        ComboBox_recherche_module.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الكل" }));
        ComboBox_recherche_module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_recherche_moduleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("المادة :");

        erch_etudent2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erch_etudent2.setBorder(null);
        erch_etudent2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                erch_etudent2KeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("بحث");

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Teacher data.png"))); // NOI18N

        javax.swing.GroupLayout LIneEtdentCALCulLayout = new javax.swing.GroupLayout(LIneEtdentCALCul);
        LIneEtdentCALCul.setLayout(LIneEtdentCALCulLayout);
        LIneEtdentCALCulLayout.setHorizontalGroup(
            LIneEtdentCALCulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LIneEtdentCALCulLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(erch_etudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(ComboBox_recherche_module, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LIneEtdentCALCulLayout.setVerticalGroup(
            LIneEtdentCALCulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LIneEtdentCALCulLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(LIneEtdentCALCulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_recherche_module, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erch_etudent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(LIneEtdentCALCul, "card3");

        mostahakat_alastida.setBackground(new java.awt.Color(0, 153, 51));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("حسبات الاساتذة");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("الاساتذة");

        ComboBox_recherche_Enseignant.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ComboBox_recherche_EnseignantComponentShown(evt);
            }
        });
        ComboBox_recherche_Enseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_recherche_EnseignantActionPerformed(evt);
            }
        });

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/payment_ens.png"))); // NOI18N

        javax.swing.GroupLayout mostahakat_alastidaLayout = new javax.swing.GroupLayout(mostahakat_alastida);
        mostahakat_alastida.setLayout(mostahakat_alastidaLayout);
        mostahakat_alastidaLayout.setHorizontalGroup(
            mostahakat_alastidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostahakat_alastidaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ComboBox_recherche_Enseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mostahakat_alastidaLayout.setVerticalGroup(
            mostahakat_alastidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostahakat_alastidaLayout.createSequentialGroup()
                .addGroup(mostahakat_alastidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mostahakat_alastidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mostahakat_alastidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addComponent(ComboBox_recherche_Enseignant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(mostahakat_alastida, "card4");

        baynat_atolab.setBackground(new java.awt.Color(0, 153, 51));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("بيانات الطلاب ");

        erch_etudent3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        erch_etudent3.setBorder(null);
        erch_etudent3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                erch_etudent3KeyReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("بحث");

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/students2 .png"))); // NOI18N

        javax.swing.GroupLayout baynat_atolabLayout = new javax.swing.GroupLayout(baynat_atolab);
        baynat_atolab.setLayout(baynat_atolabLayout);
        baynat_atolabLayout.setHorizontalGroup(
            baynat_atolabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baynat_atolabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(erch_etudent3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        baynat_atolabLayout.setVerticalGroup(
            baynat_atolabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addGroup(baynat_atolabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baynat_atolabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(erch_etudent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baynat_atolabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(baynat_atolab, "card5");

        Sttings.setBackground(new java.awt.Color(0, 153, 51));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("بيانات المدرسة");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("بحث ");

        serchseince.setBackground(new java.awt.Color(0, 153, 51));
        serchseince.setForeground(new java.awt.Color(255, 255, 255));
        serchseince.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        serchseince.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchseinceKeyReleased(evt);
            }
        });

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/بيانات المدرسة.png"))); // NOI18N

        seerch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "المستويات", "الحصص", "القاعات", "المواد" }));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("بحث حسب ");

        javax.swing.GroupLayout SttingsLayout = new javax.swing.GroupLayout(Sttings);
        Sttings.setLayout(SttingsLayout);
        SttingsLayout.setHorizontalGroup(
            SttingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SttingsLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(serchseince, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(58, 58, 58)
                .addComponent(seerch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SttingsLayout.setVerticalGroup(
            SttingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SttingsLayout.createSequentialGroup()
                .addGroup(SttingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SttingsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(SttingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serchseince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(seerch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)))
                    .addGroup(SttingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SttingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.add(Sttings, "card6");

        lingroups.setBackground(new java.awt.Color(0, 153, 51));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("الافواج");

        ComboBox_choix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "المواد", "الاساتذة", "القاعات" }));
        ComboBox_choix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_choixActionPerformed(evt);
            }
        });

        ComboBox_ENS_Mod_Sall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الكل" }));
        ComboBox_ENS_Mod_Sall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_ENS_Mod_SallActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("عرض حسبة");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("اختر");

        serch_groups.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serch_groupsKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("بحث");

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/الافواج.png"))); // NOI18N
        jLabel79.setText("jLabel79");

        javax.swing.GroupLayout lingroupsLayout = new javax.swing.GroupLayout(lingroups);
        lingroups.setLayout(lingroupsLayout);
        lingroupsLayout.setHorizontalGroup(
            lingroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lingroupsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(serch_groups, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(ComboBox_ENS_Mod_Sall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(ComboBox_choix, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(110, 110, 110)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        lingroupsLayout.setVerticalGroup(
            lingroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lingroupsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(lingroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_choix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_ENS_Mod_Sall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(serch_groups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(lingroups, "card7");

        linatatisic.setBackground(new java.awt.Color(0, 153, 51));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("احصئيات المدرسة ");

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/احصائيات المدرسةة.png"))); // NOI18N

        javax.swing.GroupLayout linatatisicLayout = new javax.swing.GroupLayout(linatatisic);
        linatatisic.setLayout(linatatisicLayout);
        linatatisicLayout.setHorizontalGroup(
            linatatisicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, linatatisicLayout.createSequentialGroup()
                .addContainerGap(625, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        linatatisicLayout.setVerticalGroup(
            linatatisicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(linatatisic, "card8");

        panel_telcom.setBackground(new java.awt.Color(0, 153, 51));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("الاتصلات");

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/الاتصلات.png"))); // NOI18N

        javax.swing.GroupLayout panel_telcomLayout = new javax.swing.GroupLayout(panel_telcom);
        panel_telcom.setLayout(panel_telcomLayout);
        panel_telcomLayout.setHorizontalGroup(
            panel_telcomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_telcomLayout.createSequentialGroup()
                .addContainerGap(730, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_telcomLayout.setVerticalGroup(
            panel_telcomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_telcomLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(panel_telcom, "card9");

        pannel_presence_absent_elev.setBackground(new java.awt.Color(0, 153, 51));

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("الحضور والغياب");

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/حضور وغياب.png"))); // NOI18N

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("بحث");

        serch_abcebt_and_pesenc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serch_abcebt_and_pesencKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pannel_presence_absent_elevLayout = new javax.swing.GroupLayout(pannel_presence_absent_elev);
        pannel_presence_absent_elev.setLayout(pannel_presence_absent_elevLayout);
        pannel_presence_absent_elevLayout.setHorizontalGroup(
            pannel_presence_absent_elevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_presence_absent_elevLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(serch_abcebt_and_pesenc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pannel_presence_absent_elevLayout.setVerticalGroup(
            pannel_presence_absent_elevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_presence_absent_elevLayout.createSequentialGroup()
                .addComponent(jLabel83)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pannel_presence_absent_elevLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pannel_presence_absent_elevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel84)
                    .addComponent(serch_abcebt_and_pesenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(pannel_presence_absent_elev, "card10");

        javax.swing.GroupLayout panelLIneLayout = new javax.swing.GroupLayout(panelLIne);
        panelLIne.setLayout(panelLIneLayout);
        panelLIneLayout.setHorizontalGroup(
            panelLIneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLIneLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139))
        );
        panelLIneLayout.setVerticalGroup(
            panelLIneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLIneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBody.add(panelLIne, java.awt.BorderLayout.PAGE_START);

        panelPrencipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrencipal.setLayout(new java.awt.CardLayout());

        panel_Home.setBackground(new java.awt.Color(255, 255, 255));
        panel_Home.setLayout(new java.awt.BorderLayout());

        jPanel136.setBackground(new java.awt.Color(255, 255, 255));

        jLabel65.setBackground(new java.awt.Color(0, 153, 51));
        jLabel65.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("طباعة جدول التوقيت");
        jLabel65.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jLabel65.setOpaque(true);
        jLabel65.setPreferredSize(new java.awt.Dimension(200, 60));
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        jPanel136.add(jLabel65);

        panel_Home.add(jPanel136, java.awt.BorderLayout.PAGE_END);

        jPanel137.setBackground(new java.awt.Color(255, 255, 255));

        Table_SCIENCE_HOJORDUI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Table_SCIENCE_HOJORDUI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الاستاذ", "المادة", "القاعة", "الفوج", "التوقيت", "اليوم"
            }
        ));
        Table_SCIENCE_HOJORDUI.setRowSelectionAllowed(false);
        jScrollPane20.setViewportView(Table_SCIENCE_HOJORDUI);

        javax.swing.GroupLayout jPanel137Layout = new javax.swing.GroupLayout(jPanel137);
        jPanel137.setLayout(jPanel137Layout);
        jPanel137Layout.setHorizontalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE)
        );
        jPanel137Layout.setVerticalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel137Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        panel_Home.add(jPanel137, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(panel_Home, "card11");

        Student_data.setBackground(new java.awt.Color(255, 255, 255));
        Student_data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Student_data.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(136, 309));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(106, 26));

        ajoute_etude.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajoute_etude.setText("اضافة طالب");
        ajoute_etude.setPreferredSize(new java.awt.Dimension(120, 40));
        ajoute_etude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoute_etudeActionPerformed(evt);
            }
        });
        jPanel12.add(ajoute_etude);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("تعديل طالب ");
        jButton6.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton6);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("حذف طالب");
        jButton7.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton7);

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("تعديل حجز");
        jButton10.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton10);

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("حذف حجز");
        jButton9.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton9);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("اضافة حجز");
        jButton8.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton8);

        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton23.setText("جدول التوقيت");
        jButton23.setPreferredSize(new java.awt.Dimension(120, 40));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton23);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        Student_data.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(800, 100));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "التلاميذ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.setOpaque(false);

        tabel_étudiants.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_étudiants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اميل الولى", "رقم هاتف الولي", "الولي", "اميل", "الهاتف", "العنوان", "تاريخ الميلاد", "اللقب", " الاسم", "رقم"
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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel7.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(800, 100));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الحجز", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
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
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.add(jPanel9);

        Student_data.add(jPanel7, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(Student_data, "card2");

        Student_accounts.setBackground(new java.awt.Color(255, 255, 255));
        Student_accounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Student_accounts.setLayout(new java.awt.BorderLayout(10, 5));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 51));
        jButton2.setText("حذف دفع");
        jButton2.setPreferredSize(new java.awt.Dimension(140, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("دفع مصاريف");
        jButton1.setPreferredSize(new java.awt.Dimension(140, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(258, 258, 258))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Student_accounts.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 200));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addComponent(jScrollPane15)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 200));

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
                Table_RESERVATION3Table_RESERVATIONMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(Table_RESERVATION3);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel13);

        Student_accounts.add(jPanel3, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(Student_accounts, "card3");

        ensinet_data.setBackground(new java.awt.Color(255, 255, 255));
        ensinet_data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ensinet_data.setLayout(new java.awt.BorderLayout());

        leschent.setBackground(new java.awt.Color(255, 255, 255));
        leschent.setPreferredSize(new java.awt.Dimension(350, 313));
        leschent.setLayout(new javax.swing.BoxLayout(leschent, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setPreferredSize(new java.awt.Dimension(350, 56));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        txt_Num_Enseignant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_Num_Enseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Num_EnseignantActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("رقم التسجيل ");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Num_Enseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Num_Enseignant, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        leschent.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setPreferredSize(new java.awt.Dimension(350, 56));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setPreferredSize(new java.awt.Dimension(299, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("الاسم :");

        txt_Nom_Enseignant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_Nom_Enseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nom_EnseignantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Nom_Enseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nom_Enseignant)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        leschent.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setPreferredSize(new java.awt.Dimension(350, 56));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setPreferredSize(new java.awt.Dimension(299, 40));

        txt_Prenom_Enseignant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("اللقب :");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txt_Prenom_Enseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Prenom_Enseignant)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        leschent.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setPreferredSize(new java.awt.Dimension(350, 56));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setPreferredSize(new java.awt.Dimension(299, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("تاريخ الازدياد :");

        date_naissence_Ens.setMaxSelectableDate(new java.util.Date(253370764918000L));
        date_naissence_Ens.setMinSelectableDate(new java.util.Date(-62135769482000L));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(date_naissence_Ens, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_naissence_Ens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        leschent.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setPreferredSize(new java.awt.Dimension(350, 56));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setPreferredSize(new java.awt.Dimension(299, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("العنوان :");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        txt_addres_Ens.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_addres_Ens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addres_EnsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txt_addres_Ens, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(txt_addres_Ens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        leschent.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setPreferredSize(new java.awt.Dimension(350, 56));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        txt_Telephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_Telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelephoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("الهاتف :");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txt_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel29Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(26, 26, 26)))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        leschent.add(jPanel29);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setPreferredSize(new java.awt.Dimension(350, 56));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        txt_Email_Ens.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("البريد الالكتروني :");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txt_Email_Ens, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Email_Ens, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        leschent.add(jPanel30);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setPreferredSize(new java.awt.Dimension(350, 56));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        txt_prosontage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_prosontage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prosontageKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("النسبة :");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txt_prosontage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_prosontage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        leschent.add(jPanel31);

        ensinet_data.add(leschent, java.awt.BorderLayout.LINE_START);

        paneldataensient.setLayout(new javax.swing.BoxLayout(paneldataensient, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setPreferredSize(new java.awt.Dimension(585, 450));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الاساتذة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel21.setOpaque(false);

        Table_Enseignant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Table_Enseignant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم الاستاذ", "اسم", "لقب", "تاريخ الميلاد", "العنوان", "الهاتف", "الاميل", "النسبة"
            }
        ));
        Table_Enseignant.setSelectionBackground(new java.awt.Color(0, 0, 204));
        Table_Enseignant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_EnseignantMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(Table_Enseignant);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        jScrollPane6.setViewportView(jPanel21);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        paneldataensient.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setPreferredSize(new java.awt.Dimension(590, 30));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel20, java.awt.BorderLayout.LINE_START);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel22, java.awt.BorderLayout.LINE_END);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        btn_imprimier_Emploi_temps.setText("طباعة جدول التوقيت");
        btn_imprimier_Emploi_temps.setPreferredSize(new java.awt.Dimension(140, 40));
        btn_imprimier_Emploi_temps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimier_Emploi_tempsActionPerformed(evt);
            }
        });
        jPanel23.add(btn_imprimier_Emploi_temps);

        btn_Supprimer_Enseignant.setText("حذف استاذ");
        btn_Supprimer_Enseignant.setPreferredSize(new java.awt.Dimension(140, 40));
        btn_Supprimer_Enseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Supprimer_EnseignantActionPerformed(evt);
            }
        });
        jPanel23.add(btn_Supprimer_Enseignant);

        btn_modifier_Enseignant.setText("تعديل استاذ");
        btn_modifier_Enseignant.setPreferredSize(new java.awt.Dimension(140, 40));
        btn_modifier_Enseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifier_EnseignantActionPerformed(evt);
            }
        });
        jPanel23.add(btn_modifier_Enseignant);

        btn_ajouter_Enseignant.setText("اضافة استاذ");
        btn_ajouter_Enseignant.setPreferredSize(new java.awt.Dimension(140, 40));
        btn_ajouter_Enseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouter_EnseignantActionPerformed(evt);
            }
        });
        jPanel23.add(btn_ajouter_Enseignant);

        jPanel18.add(jPanel23, java.awt.BorderLayout.CENTER);

        paneldataensient.add(jPanel18);

        ensinet_data.add(paneldataensient, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(ensinet_data, "card4");

        hisabat_encinet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        hisabat_encinet.setLayout(new java.awt.BorderLayout());

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setPreferredSize(new java.awt.Dimension(150, 426));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setPreferredSize(new java.awt.Dimension(148, 120));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel46, java.awt.BorderLayout.PAGE_START);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setPreferredSize(new java.awt.Dimension(160, 80));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel47, java.awt.BorderLayout.PAGE_END);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setPreferredSize(new java.awt.Dimension(135, 220));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("دفع المصاريف");
        jButton3.setPreferredSize(new java.awt.Dimension(140, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel48.add(jButton3);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("حذف الدفع");
        jButton4.setPreferredSize(new java.awt.Dimension(140, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel48.add(jButton4);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("طباعة الصل ");
        jButton5.setPreferredSize(new java.awt.Dimension(140, 60));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel48.add(jButton5);

        jPanel19.add(jPanel48, java.awt.BorderLayout.CENTER);

        hisabat_encinet.add(jPanel19, java.awt.BorderLayout.LINE_END);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setPreferredSize(new java.awt.Dimension(789, 200));

        jPanel44.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الاساتذة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel44.setOpaque(false);

        Table_cotisation_enseignant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Table_cotisation_enseignant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "المبلغ المدفوع", "المبلغ المستحق", "تاريخ الدفع", "رقم الدفع"
            }
        ));
        Table_cotisation_enseignant.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane16.setViewportView(Table_cotisation_enseignant);

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel38.add(jPanel41, java.awt.BorderLayout.PAGE_END);

        jPanel42.setPreferredSize(new java.awt.Dimension(789, 200));
        jPanel42.setLayout(new javax.swing.BoxLayout(jPanel42, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الاساتذة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel43.setOpaque(false);

        Table_montant_enseignant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Table_montant_enseignant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "المبلغ المستحق", "المادة", "الفوج", "اللقب", "الاسم ", " رقم"
            }
        ));
        Table_montant_enseignant.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane13.setViewportView(Table_montant_enseignant);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbl_total_montant_enseignant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("اجمالي المبالغ المحقق ");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_total_montant_enseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_total_montant_enseignant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel42.add(jPanel45);

        jPanel38.add(jPanel42, java.awt.BorderLayout.CENTER);

        hisabat_encinet.add(jPanel38, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(hisabat_encinet, "card5");

        Sittins.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Sittins.setLayout(new java.awt.BorderLayout());

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel49.setPreferredSize(new java.awt.Dimension(150, 444));
        jPanel49.setLayout(new java.awt.BorderLayout());

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));
        jPanel57.setPreferredSize(new java.awt.Dimension(148, 50));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel49.add(jPanel57, java.awt.BorderLayout.PAGE_START);

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setPreferredSize(new java.awt.Dimension(148, 50));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel49.add(jPanel58, java.awt.BorderLayout.PAGE_END);

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));

        ajoute_siunce.setBackground(new java.awt.Color(255, 255, 255));
        ajoute_siunce.setText("اضافة حصة ");
        ajoute_siunce.setPreferredSize(new java.awt.Dimension(140, 40));
        ajoute_siunce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoute_siunceActionPerformed(evt);
            }
        });
        jPanel59.add(ajoute_siunce);

        Suprime_sience.setBackground(new java.awt.Color(255, 255, 255));
        Suprime_sience.setText("حذف حصة ");
        Suprime_sience.setPreferredSize(new java.awt.Dimension(140, 40));
        Suprime_sience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Suprime_sienceActionPerformed(evt);
            }
        });
        jPanel59.add(Suprime_sience);

        Ajouter_une_salle.setBackground(new java.awt.Color(255, 255, 255));
        Ajouter_une_salle.setText("اضافة قاعة ");
        Ajouter_une_salle.setPreferredSize(new java.awt.Dimension(140, 40));
        Ajouter_une_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajouter_une_salleActionPerformed(evt);
            }
        });
        jPanel59.add(Ajouter_une_salle);

        supprimer_salle.setBackground(new java.awt.Color(255, 255, 255));
        supprimer_salle.setText("حذف قاعة");
        supprimer_salle.setMinimumSize(new java.awt.Dimension(140, 50));
        supprimer_salle.setPreferredSize(new java.awt.Dimension(140, 40));
        supprimer_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_salleActionPerformed(evt);
            }
        });
        jPanel59.add(supprimer_salle);

        ajote_nuve.setBackground(new java.awt.Color(255, 255, 255));
        ajote_nuve.setText("اضافة مستوى");
        ajote_nuve.setPreferredSize(new java.awt.Dimension(140, 40));
        ajote_nuve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajote_nuveActionPerformed(evt);
            }
        });
        jPanel59.add(ajote_nuve);

        suprime_niive.setBackground(new java.awt.Color(255, 255, 255));
        suprime_niive.setText("حذف مستوي");
        suprime_niive.setPreferredSize(new java.awt.Dimension(140, 40));
        suprime_niive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suprime_niiveActionPerformed(evt);
            }
        });
        jPanel59.add(suprime_niive);

        ajoute_model.setBackground(new java.awt.Color(255, 255, 255));
        ajoute_model.setText("اضافة مادة");
        ajoute_model.setPreferredSize(new java.awt.Dimension(140, 40));
        jPanel59.add(ajoute_model);

        suprime_moudel.setBackground(new java.awt.Color(255, 255, 255));
        suprime_moudel.setText("حذف مادة");
        suprime_moudel.setPreferredSize(new java.awt.Dimension(140, 40));
        suprime_moudel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suprime_moudelActionPerformed(evt);
            }
        });
        jPanel59.add(suprime_moudel);

        suprime_niive1.setBackground(new java.awt.Color(255, 255, 255));
        suprime_niive1.setText("تعديل مادة");
        suprime_niive1.setPreferredSize(new java.awt.Dimension(140, 40));
        suprime_niive1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suprime_niive1ActionPerformed(evt);
            }
        });
        jPanel59.add(suprime_niive1);

        jPanel49.add(jPanel59, java.awt.BorderLayout.CENTER);

        Sittins.add(jPanel49, java.awt.BorderLayout.LINE_END);

        jPanel50.setLayout(new javax.swing.BoxLayout(jPanel50, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel51.setLayout(new javax.swing.BoxLayout(jPanel51, javax.swing.BoxLayout.LINE_AXIS));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setPreferredSize(new java.awt.Dimension(200, 220));

        jPanel56.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "القاعات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel56.setOpaque(false);

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

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel53);

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel54.setPreferredSize(new java.awt.Dimension(200, 203));

        jPanel55.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الحصص", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel55.setOpaque(false);

        tabel_Sincer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_Sincer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "يوم", "الساعة"
            }
        ));
        tabel_Sincer.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane10.setViewportView(tabel_Sincer);

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel54);

        jPanel138.setBackground(new java.awt.Color(255, 255, 255));
        jPanel138.setPreferredSize(new java.awt.Dimension(200, 203));

        jPanel139.setBackground(new java.awt.Color(255, 255, 255));
        jPanel139.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "المستويات", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel139.setOpaque(false);

        Tabel_nive.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tabel_nive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم المستوي", "رقم المستوي"
            }
        ));
        Tabel_nive.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane21.setViewportView(Tabel_nive);

        javax.swing.GroupLayout jPanel139Layout = new javax.swing.GroupLayout(jPanel139);
        jPanel139.setLayout(jPanel139Layout);
        jPanel139Layout.setHorizontalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        jPanel139Layout.setVerticalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel138Layout = new javax.swing.GroupLayout(jPanel138);
        jPanel138.setLayout(jPanel138Layout);
        jPanel138Layout.setHorizontalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel138Layout.setVerticalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel138);

        jPanel50.add(jPanel51);

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setPreferredSize(new java.awt.Dimension(789, 200));
        jPanel52.setLayout(new javax.swing.BoxLayout(jPanel52, javax.swing.BoxLayout.LINE_AXIS));

        jPanel60.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "بيانات المدرسة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel60.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("اسم المدرسة و شعار  ");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("تغير كلمة السرواسم المستخدم ");

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

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.setText("تحديث  شعار و اسم المدرسة");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton24)
                .addGap(18, 18, 18)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jButton11)
                    .addComponent(jButton24))
                .addGap(18, 18, 18)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jButton12))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel52.add(jPanel60);

        jPanel140.setBackground(new java.awt.Color(255, 255, 255));
        jPanel140.setPreferredSize(new java.awt.Dimension(800, 185));

        jPanel141.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "المواد", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel141.setOpaque(false);

        tabel_modell.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_modell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "مستوي", "سعر المادة", "اسم المادة"
            }
        ));
        tabel_modell.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane22.setViewportView(tabel_modell);

        javax.swing.GroupLayout jPanel141Layout = new javax.swing.GroupLayout(jPanel141);
        jPanel141.setLayout(jPanel141Layout);
        jPanel141Layout.setHorizontalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        jPanel141Layout.setVerticalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel140Layout = new javax.swing.GroupLayout(jPanel140);
        jPanel140.setLayout(jPanel140Layout);
        jPanel140Layout.setHorizontalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel140Layout.setVerticalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel52.add(jPanel140);

        jPanel50.add(jPanel52);

        Sittins.add(jPanel50, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(Sittins, "card6");

        groups.setBackground(new java.awt.Color(255, 255, 255));
        groups.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        groups.setLayout(new java.awt.BorderLayout());

        jPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel61.setPreferredSize(new java.awt.Dimension(150, 444));
        jPanel61.setLayout(new java.awt.BorderLayout());

        jPanel69.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel61.add(jPanel69, java.awt.BorderLayout.PAGE_START);

        jPanel70.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel61.add(jPanel70, java.awt.BorderLayout.PAGE_END);

        jPanel71.setBackground(new java.awt.Color(255, 255, 255));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setText("اضافة فوج");
        jButton13.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel71.add(jButton13);

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setText("تعديل فوج");
        jButton14.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel71.add(jButton14);

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setText("حذف فوج");
        jButton15.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel71.add(jButton15);

        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton22.setText("تعديل حصة");
        jButton22.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel71.add(jButton22);

        jPanel61.add(jPanel71, java.awt.BorderLayout.CENTER);

        groups.add(jPanel61, java.awt.BorderLayout.LINE_END);

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setLayout(new java.awt.BorderLayout());

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel63.setPreferredSize(new java.awt.Dimension(795, 100));

        jPanel72.setBackground(new java.awt.Color(255, 255, 255));
        jPanel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel72.setPreferredSize(new java.awt.Dimension(350, 37));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("عدد الطلاب في الفوج");

        Nember_Etudient_en_groupe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel72Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(Nember_Etudient_en_groupe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addContainerGap())
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nember_Etudient_en_groupe)))
        );

        jPanel63.add(jPanel72);

        jPanel73.setBackground(new java.awt.Color(255, 255, 255));
        jPanel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel73.setPreferredSize(new java.awt.Dimension(350, 37));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("مدخول الفوج");

        Montant_groupe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel73Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Montant_groupe, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel32)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Montant_groupe)))
        );

        jPanel63.add(jPanel73);

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setText("طباعة قائمة الطلاب للحضور و الغياب");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton16.setPreferredSize(new java.awt.Dimension(350, 37));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel63.add(jButton16);

        jPanel62.add(jPanel63, java.awt.BorderLayout.PAGE_END);

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel64.setLayout(new java.awt.BorderLayout());

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setPreferredSize(new java.awt.Dimension(350, 338));

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الحصص", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel68.setOpaque(false);

        Tabel_Since_Groupe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tabel_Since_Groupe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الساعة", "اليوم"
            }
        ));
        Tabel_Since_Groupe.setGridColor(new java.awt.Color(255, 255, 255));
        Tabel_Since_Groupe.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane12.setViewportView(Tabel_Since_Groupe);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel65Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
            .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel64.add(jPanel65, java.awt.BorderLayout.LINE_START);

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel67.setBackground(new java.awt.Color(255, 255, 255));
        jPanel67.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الافواج", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel67.setOpaque(false);

        Table_Groupe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Table_Groupe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "القاعة", "الاستاذ", "المادة", "اسم الفوج", "رقم الفوج"
            }
        ));
        Table_Groupe.setGridColor(new java.awt.Color(255, 255, 255));
        Table_Groupe.setSelectionBackground(new java.awt.Color(0, 102, 255));
        Table_Groupe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_GroupeMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(Table_Groupe);

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel64.add(jPanel66, java.awt.BorderLayout.CENTER);

        jPanel62.add(jPanel64, java.awt.BorderLayout.CENTER);

        groups.add(jPanel62, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(groups, "card7");

        statistic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        statistic.setLayout(new javax.swing.BoxLayout(statistic, javax.swing.BoxLayout.LINE_AXIS));

        jPanel87.setBackground(new java.awt.Color(255, 255, 255));
        jPanel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel87.setPreferredSize(new java.awt.Dimension(200, 450));

        jPanel89.setBackground(new java.awt.Color(255, 255, 255));
        jPanel89.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "احصاء مدخول المدرسة و حقوق الاساتذة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel89.setOpaque(false);
        jPanel89.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel83.setBackground(new java.awt.Color(255, 255, 255));
        jPanel83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel83.setPreferredSize(new java.awt.Dimension(430, 320));

        jPanel84.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("اجمالي الرسوم");

        total_payment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_payment.setText("sfsd");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addContainerGap())
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(total_payment))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel83.add(jPanel84);

        jPanel86.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("اجمالي دخل الاساتذة");

        total_payment_ensigent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_payment_ensigent.setText("sfsd");

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_payment_ensigent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addContainerGap())
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(total_payment_ensigent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel83.add(jPanel86);

        jPanel85.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("صافي الدخل ");

        revenu_net.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        revenu_net.setText("sfsd");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(revenu_net)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addContainerGap())
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revenu_net)
                    .addComponent(jLabel40))
                .addContainerGap())
        );

        jPanel83.add(jPanel85);

        jPanel89.add(jPanel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 71, 370, 266));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel89.getAccessibleContext().setAccessibleName("احصاء مدخول المدرسة وحقوق الاساتذة");

        statistic.add(jPanel87);

        jPanel90.setBackground(new java.awt.Color(255, 255, 255));
        jPanel90.setPreferredSize(new java.awt.Dimension(200, 450));

        jPanel88.setBackground(new java.awt.Color(255, 255, 255));
        jPanel88.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "احصاء بيانات المدرسة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel88.setOpaque(false);
        jPanel88.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel77.setBackground(new java.awt.Color(255, 255, 255));
        jPanel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel78.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("اجمالي عدد التلاميذ");

        nombre_d_élève.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombre_d_élève.setText("sfsd");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_d_élève)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addContainerGap())
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel34))
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombre_d_élève)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel77.add(jPanel78);

        jPanel79.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("اجمالي عدد الاساتذة");

        number_ensingent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        number_ensingent.setText("sdf");

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(number_ensingent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel79Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(number_ensingent, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel77.add(jPanel79);

        jPanel80.setPreferredSize(new java.awt.Dimension(300, 40));

        Nomber_sall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nomber_sall.setText("sdf");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("اجمالي عدد القاعات");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nomber_sall, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nomber_sall)
                    .addComponent(jLabel36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel77.add(jPanel80);

        jPanel81.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("اجمالي عدد الافواج");

        Nomber_sall1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nomber_sall1.setText("sdf");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nomber_sall1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(Nomber_sall1))
                .addContainerGap())
        );

        jPanel77.add(jPanel81);

        jPanel82.setPreferredSize(new java.awt.Dimension(300, 40));

        nomer_model.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomer_model.setText("sfsd");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText("اجمالي عدد المواد");

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomer_model)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addContainerGap())
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel82Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomer_model)
                    .addComponent(jLabel38))
                .addContainerGap())
        );

        jPanel77.add(jPanel82);

        jPanel88.add(jPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 71, 370, 269));

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        statistic.add(jPanel90);

        panelPrencipal.add(statistic, "card8");

        panellTelcom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panellTelcom.setLayout(new java.awt.BorderLayout());

        jPanel74.setBackground(new java.awt.Color(255, 255, 255));
        jPanel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel74.setPreferredSize(new java.awt.Dimension(140, 383));
        jPanel74.setLayout(new java.awt.BorderLayout());

        jPanel93.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel74.add(jPanel93, java.awt.BorderLayout.PAGE_START);

        jPanel94.setBackground(new java.awt.Color(255, 255, 255));
        jPanel94.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel74.add(jPanel94, java.awt.BorderLayout.PAGE_END);

        jPanel95.setBackground(new java.awt.Color(255, 255, 255));

        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton17.setText("التالميذ");
        jButton17.setPreferredSize(new java.awt.Dimension(140, 60));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel95.add(jButton17);

        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton18.setText("الاساتذة");
        jButton18.setPreferredSize(new java.awt.Dimension(140, 60));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel95.add(jButton18);

        jPanel74.add(jPanel95, java.awt.BorderLayout.CENTER);

        panellTelcom.add(jPanel74, java.awt.BorderLayout.LINE_END);

        jPanel75.setLayout(new java.awt.BorderLayout());

        alwali_elev.setBackground(new java.awt.Color(255, 255, 255));
        alwali_elev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        alwali_elev.setPreferredSize(new java.awt.Dimension(805, 170));
        alwali_elev.setLayout(new java.awt.CardLayout());

        elev_alwali.setBackground(new java.awt.Color(255, 255, 255));
        elev_alwali.setLayout(new javax.swing.BoxLayout(elev_alwali, javax.swing.BoxLayout.LINE_AXIS));

        jPanel104.setBackground(new java.awt.Color(255, 255, 255));
        jPanel104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel104.setPreferredSize(new java.awt.Dimension(200, 138));

        jPanel113.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "ارسال رسالة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel113.setOpaque(false);
        jPanel113.setPreferredSize(new java.awt.Dimension(290, 130));

        jTextField2.setPreferredSize(new java.awt.Dimension(240, 50));
        jPanel113.add(jTextField2);

        jButton20.setText("ارسال رسالة الي الولي ");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel113.add(jButton20);

        jButton21.setText("ارسال رسالة لتلميذ");
        jPanel113.add(jButton21);

        jPanel104.add(jPanel113);

        elev_alwali.add(jPanel104);

        jPanel105.setBackground(new java.awt.Color(255, 255, 255));
        jPanel105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel105.setPreferredSize(new java.awt.Dimension(200, 138));

        jPanel102.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الولي", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel102.setOpaque(false);
        jPanel102.setPreferredSize(new java.awt.Dimension(250, 130));

        jPanel109.setPreferredSize(new java.awt.Dimension(195, 26));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText(":الاسم ");

        Nom_alwali.setBackground(new java.awt.Color(0, 0, 0));
        Nom_alwali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel109Layout = new javax.swing.GroupLayout(jPanel109);
        jPanel109.setLayout(jPanel109Layout);
        jPanel109Layout.setHorizontalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel109Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nom_alwali)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(45, 45, 45))
        );
        jPanel109Layout.setVerticalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel109Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(Nom_alwali)))
        );

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("رقم الهاتف");

        phon_Alwali.setBackground(new java.awt.Color(0, 0, 0));
        phon_Alwali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel111Layout = new javax.swing.GroupLayout(jPanel111);
        jPanel111.setLayout(jPanel111Layout);
        jPanel111Layout.setHorizontalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel111Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phon_Alwali)
                .addGap(0, 105, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(43, 43, 43))
        );
        jPanel111Layout.setVerticalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel111Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(phon_Alwali)))
        );

        jPanel112.setPreferredSize(new java.awt.Dimension(170, 26));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("الاميل");

        Email_Alwali.setBackground(new java.awt.Color(0, 0, 0));
        Email_Alwali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel112Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Email_Alwali)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addGap(49, 49, 49))
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel112Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Email_Alwali))
            .addGroup(jPanel112Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel102Layout = new javax.swing.GroupLayout(jPanel102);
        jPanel102.setLayout(jPanel102Layout);
        jPanel102Layout.setHorizontalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
            .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel102Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel109, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(jPanel112, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
        jPanel102Layout.setVerticalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
            .addGroup(jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel102Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel105.add(jPanel102);

        elev_alwali.add(jPanel105);

        jPanel106.setBackground(new java.awt.Color(255, 255, 255));
        jPanel106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel106.setPreferredSize(new java.awt.Dimension(200, 138));

        jPanel101.setBackground(new java.awt.Color(255, 255, 255));
        jPanel101.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "تلميذ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel101.setOpaque(false);
        jPanel101.setPreferredSize(new java.awt.Dimension(230, 130));

        jPanel107.setPreferredSize(new java.awt.Dimension(195, 26));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText(":الاسم ");

        Nom_elev.setBackground(new java.awt.Color(0, 0, 0));
        Nom_elev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel107Layout = new javax.swing.GroupLayout(jPanel107);
        jPanel107.setLayout(jPanel107Layout);
        jPanel107Layout.setHorizontalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel107Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nom_elev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(19, 19, 19))
        );
        jPanel107Layout.setVerticalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel107Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Nom_elev)))
        );

        jPanel101.add(jPanel107);

        jPanel108.setPreferredSize(new java.awt.Dimension(200, 26));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("رقم الهاتف");

        Phon_elev.setBackground(new java.awt.Color(0, 0, 0));
        Phon_elev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel108Layout = new javax.swing.GroupLayout(jPanel108);
        jPanel108.setLayout(jPanel108Layout);
        jPanel108Layout.setHorizontalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel108Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Phon_elev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(19, 19, 19))
        );
        jPanel108Layout.setVerticalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel108Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(Phon_elev)))
        );

        jPanel101.add(jPanel108);

        jPanel110.setPreferredSize(new java.awt.Dimension(195, 26));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("الاميل");

        Email_Elev.setBackground(new java.awt.Color(0, 0, 0));
        Email_Elev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel110Layout = new javax.swing.GroupLayout(jPanel110);
        jPanel110.setLayout(jPanel110Layout);
        jPanel110Layout.setHorizontalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel110Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Email_Elev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(19, 19, 19))
        );
        jPanel110Layout.setVerticalGroup(
            jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel110Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(Email_Elev)))
        );

        jPanel101.add(jPanel110);

        jPanel106.add(jPanel101);

        elev_alwali.add(jPanel106);

        alwali_elev.add(elev_alwali, "card2");

        encinet.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout encinetLayout = new javax.swing.GroupLayout(encinet);
        encinet.setLayout(encinetLayout);
        encinetLayout.setHorizontalGroup(
            encinetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1045, Short.MAX_VALUE)
        );
        encinetLayout.setVerticalGroup(
            encinetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        alwali_elev.add(encinet, "card3");

        jPanel75.add(alwali_elev, java.awt.BorderLayout.PAGE_END);

        telcom_chong.setBackground(new java.awt.Color(255, 255, 255));
        telcom_chong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        telcom_chong.setPreferredSize(new java.awt.Dimension(805, 230));
        telcom_chong.setLayout(new java.awt.CardLayout());

        telcomElev.setBackground(new java.awt.Color(255, 255, 255));
        telcomElev.setLayout(new java.awt.BorderLayout());

        jPanel96.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "التلاميذ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel96.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel96.setOpaque(false);

        tabel_étudiants1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabel_étudiants1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اميل الولى", "رقم هاتف الولي", "الولي", "اميل", "الهاتف", "العنوان", "تاريخ الميلاد", "اللقب", " الاسم", "رقم"
            }
        ));
        tabel_étudiants1.setToolTipText("");
        tabel_étudiants1.setRowHeight(25);
        tabel_étudiants1.setSelectionBackground(new java.awt.Color(0, 102, 255));
        tabel_étudiants1.getTableHeader().setReorderingAllowed(false);
        tabel_étudiants1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_étudiants1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabel_étudiants1);

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        telcomElev.add(jPanel96, java.awt.BorderLayout.CENTER);

        telcom_chong.add(telcomElev, "card2");

        telcomEncinet.setBackground(new java.awt.Color(255, 255, 255));
        telcomEncinet.setLayout(new java.awt.BorderLayout());

        jPanel98.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الاساتذة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel98.setOpaque(false);

        Table_Enseignant2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Table_Enseignant2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم الاستاذ", "اسم", "لقب", "تاريخ الميلاد", "العنوان", "الهاتف", "الاميل", "النسبة"
            }
        ));
        Table_Enseignant2.setSelectionBackground(new java.awt.Color(0, 0, 204));
        Table_Enseignant2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_Enseignant2MouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(Table_Enseignant2);

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        telcomEncinet.add(jPanel98, java.awt.BorderLayout.CENTER);

        telcom_chong.add(telcomEncinet, "card3");

        jPanel75.add(telcom_chong, java.awt.BorderLayout.CENTER);

        panellTelcom.add(jPanel75, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(panellTelcom, "card9");

        Panel_presence_absence_Etudient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Panel_presence_absence_Etudient.setLayout(new java.awt.BorderLayout());

        jPanel91.setBackground(new java.awt.Color(255, 255, 255));
        jPanel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel91.setLayout(new java.awt.BorderLayout());

        jPanel99.setBackground(new java.awt.Color(255, 255, 255));
        jPanel99.setPreferredSize(new java.awt.Dimension(300, 100));

        jPanel130.setBackground(new java.awt.Color(255, 255, 255));
        jPanel130.setPreferredSize(new java.awt.Dimension(350, 31));

        jLabel66.setBackground(new java.awt.Color(0, 102, 51));
        jLabel66.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("ادراج    ");
        jLabel66.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jLabel66.setOpaque(true);
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel130Layout = new javax.swing.GroupLayout(jPanel130);
        jPanel130.setLayout(jPanel130Layout);
        jPanel130Layout.setHorizontalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel130Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel130Layout.setVerticalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel130Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel99.add(jPanel130);

        jPanel131.setBackground(new java.awt.Color(255, 255, 255));
        jPanel131.setPreferredSize(new java.awt.Dimension(350, 31));

        jLabel67.setBackground(new java.awt.Color(0, 102, 51));
        jLabel67.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("بحث   ");
        jLabel67.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jLabel67.setOpaque(true);
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel131Layout = new javax.swing.GroupLayout(jPanel131);
        jPanel131.setLayout(jPanel131Layout);
        jPanel131Layout.setHorizontalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel131Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel131Layout.setVerticalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel131Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel99.add(jPanel131);

        jPanel91.add(jPanel99, java.awt.BorderLayout.LINE_START);

        jPanel103.setBackground(new java.awt.Color(255, 255, 255));
        jPanel103.setPreferredSize(new java.awt.Dimension(300, 100));

        jPanel115.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الاساتذة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel115.setOpaque(false);

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("الفوج");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel116Layout = new javax.swing.GroupLayout(jPanel116);
        jPanel116.setLayout(jPanel116Layout);
        jPanel116Layout.setHorizontalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel116Layout.createSequentialGroup()
                .addComponent(jComboBox1, 0, 105, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addContainerGap())
        );
        jPanel116Layout.setVerticalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel116Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel117.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "ارسال رسالة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel117.setOpaque(false);
        jPanel117.setPreferredSize(new java.awt.Dimension(230, 130));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setPreferredSize(new java.awt.Dimension(222, 84));
        jScrollPane2.setViewportView(jTextArea2);

        jButton19.setText("jButton1");

        javax.swing.GroupLayout jPanel117Layout = new javax.swing.GroupLayout(jPanel117);
        jPanel117.setLayout(jPanel117Layout);
        jPanel117Layout.setHorizontalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel117Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel117Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel117Layout.setVerticalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel117Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton19))
        );

        jPanel118.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "الولي", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel118.setOpaque(false);
        jPanel118.setPreferredSize(new java.awt.Dimension(300, 130));

        jPanel119.setPreferredSize(new java.awt.Dimension(195, 26));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText(":الاسم ");

        jLabel51.setBackground(new java.awt.Color(0, 0, 0));
        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("jLabel2");

        javax.swing.GroupLayout jPanel119Layout = new javax.swing.GroupLayout(jPanel119);
        jPanel119.setLayout(jPanel119Layout);
        jPanel119Layout.setHorizontalGroup(
            jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel119Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(19, 19, 19))
        );
        jPanel119Layout.setVerticalGroup(
            jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel119Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51)))
        );

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("رقم الهاتف");

        jLabel54.setBackground(new java.awt.Color(0, 0, 0));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("jLabel2");

        javax.swing.GroupLayout jPanel120Layout = new javax.swing.GroupLayout(jPanel120);
        jPanel120.setLayout(jPanel120Layout);
        jPanel120Layout.setHorizontalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel120Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGap(19, 19, 19))
        );
        jPanel120Layout.setVerticalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel120Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)))
        );

        jPanel121.setPreferredSize(new java.awt.Dimension(170, 26));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("الاميل");

        jLabel56.setBackground(new java.awt.Color(0, 0, 0));
        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("jLabel2");

        javax.swing.GroupLayout jPanel121Layout = new javax.swing.GroupLayout(jPanel121);
        jPanel121.setLayout(jPanel121Layout);
        jPanel121Layout.setHorizontalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel121Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addGap(19, 19, 19))
        );
        jPanel121Layout.setVerticalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel121Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)))
        );

        javax.swing.GroupLayout jPanel118Layout = new javax.swing.GroupLayout(jPanel118);
        jPanel118.setLayout(jPanel118Layout);
        jPanel118Layout.setHorizontalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel118Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel120, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel119, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(jPanel121, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel118Layout.setVerticalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
            .addGroup(jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel118Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jPanel120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jPanel121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel122.setBackground(new java.awt.Color(255, 255, 255));
        jPanel122.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "تلميذ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel122.setOpaque(false);
        jPanel122.setPreferredSize(new java.awt.Dimension(230, 130));

        jPanel123.setPreferredSize(new java.awt.Dimension(195, 26));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText(":الاسم ");

        jLabel47.setBackground(new java.awt.Color(0, 0, 0));
        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("jLabel2");

        javax.swing.GroupLayout jPanel123Layout = new javax.swing.GroupLayout(jPanel123);
        jPanel123.setLayout(jPanel123Layout);
        jPanel123Layout.setHorizontalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel123Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(19, 19, 19))
        );
        jPanel123Layout.setVerticalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel123Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47)))
        );

        jPanel122.add(jPanel123);

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("رقم الهاتف");

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("jLabel2");

        javax.swing.GroupLayout jPanel124Layout = new javax.swing.GroupLayout(jPanel124);
        jPanel124.setLayout(jPanel124Layout);
        jPanel124Layout.setHorizontalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel124Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(19, 19, 19))
        );
        jPanel124Layout.setVerticalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel124Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)))
        );

        jPanel122.add(jPanel124);

        jPanel125.setPreferredSize(new java.awt.Dimension(195, 26));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("الاميل");

        jLabel60.setBackground(new java.awt.Color(0, 0, 0));
        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("jLabel2");

        javax.swing.GroupLayout jPanel125Layout = new javax.swing.GroupLayout(jPanel125);
        jPanel125.setLayout(jPanel125Layout);
        jPanel125Layout.setHorizontalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel125Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addGap(19, 19, 19))
        );
        jPanel125Layout.setVerticalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel125Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)))
        );

        jPanel122.add(jPanel125);

        Table_Enseignant3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Table_Enseignant3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم الاستاذ", "اسم", "لقب", "تاريخ الميلاد", "العنوان", "الهاتف", "الاميل", "النسبة"
            }
        ));
        Table_Enseignant3.setSelectionBackground(new java.awt.Color(0, 0, 204));
        Table_Enseignant3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_Enseignant3MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(Table_Enseignant3);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jPanel116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jPanel118, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jPanel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(759, Short.MAX_VALUE)))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(529, 529, 529)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jPanel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jPanel116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)))
                .addComponent(jPanel118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap(96, Short.MAX_VALUE)
                    .addComponent(jPanel115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(267, Short.MAX_VALUE)))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addGap(142, 142, 142)))
        );

        jPanel103.add(jInternalFrame1);

        jPanel126.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("الفوج :");

        ComboBox_groupe_chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_groupe_chooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel126Layout = new javax.swing.GroupLayout(jPanel126);
        jPanel126.setLayout(jPanel126Layout);
        jPanel126Layout.setHorizontalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel126Layout.createSequentialGroup()
                .addComponent(ComboBox_groupe_chooser, 0, 105, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addContainerGap())
        );
        jPanel126Layout.setVerticalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel126Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(ComboBox_groupe_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel103.add(jPanel126);

        jPanel127.setBackground(new java.awt.Color(255, 255, 255));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("اليوم :");

        ComboBox_day_chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_day_chooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel127Layout.createSequentialGroup()
                .addComponent(ComboBox_day_chooser, 0, 105, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel62)
                .addContainerGap())
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel127Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(ComboBox_day_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel103.add(jPanel127);

        jPanel91.add(jPanel103, java.awt.BorderLayout.LINE_END);

        jPanel114.setBackground(new java.awt.Color(255, 255, 255));

        jPanel128.setBackground(new java.awt.Color(255, 255, 255));
        jPanel128.setPreferredSize(new java.awt.Dimension(380, 33));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("التوقيت :");

        javax.swing.GroupLayout jPanel128Layout = new javax.swing.GroupLayout(jPanel128);
        jPanel128.setLayout(jPanel128Layout);
        jPanel128Layout.setHorizontalGroup(
            jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel128Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(ComboBox_science_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel63)
                .addGap(43, 43, 43))
        );
        jPanel128Layout.setVerticalGroup(
            jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel128Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(ComboBox_science_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel114.add(jPanel128);

        jPanel129.setBackground(new java.awt.Color(255, 255, 255));
        jPanel129.setPreferredSize(new java.awt.Dimension(380, 31));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setText("التاريخ :");

        javax.swing.GroupLayout jPanel129Layout = new javax.swing.GroupLayout(jPanel129);
        jPanel129.setLayout(jPanel129Layout);
        jPanel129Layout.setHorizontalGroup(
            jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel129Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(day_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(42, 42, 42))
        );
        jPanel129Layout.setVerticalGroup(
            jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel129Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(day_chooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel114.add(jPanel129);

        jPanel91.add(jPanel114, java.awt.BorderLayout.CENTER);

        Panel_presence_absence_Etudient.add(jPanel91, java.awt.BorderLayout.PAGE_START);

        jPanel92.setBackground(new java.awt.Color(255, 255, 255));
        jPanel92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel132.setBackground(new java.awt.Color(255, 255, 255));
        jPanel132.setPreferredSize(new java.awt.Dimension(250, 31));

        jLabel68.setBackground(new java.awt.Color(0, 102, 51));
        jLabel68.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("تعديل      ");
        jLabel68.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jLabel68.setOpaque(true);
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel132Layout = new javax.swing.GroupLayout(jPanel132);
        jPanel132.setLayout(jPanel132Layout);
        jPanel132Layout.setHorizontalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel132Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel132Layout.setVerticalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel92.add(jPanel132);

        jPanel133.setBackground(new java.awt.Color(255, 255, 255));
        jPanel133.setPreferredSize(new java.awt.Dimension(250, 31));

        jLabel69.setBackground(new java.awt.Color(0, 102, 51));
        jLabel69.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("تسجيل غياب ");
        jLabel69.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jLabel69.setOpaque(true);
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel133Layout = new javax.swing.GroupLayout(jPanel133);
        jPanel133.setLayout(jPanel133Layout);
        jPanel133Layout.setHorizontalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel133Layout.createSequentialGroup()
                    .addContainerGap(102, Short.MAX_VALUE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jPanel133Layout.setVerticalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel133Layout.createSequentialGroup()
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel92.add(jPanel133);

        jPanel134.setBackground(new java.awt.Color(255, 255, 255));
        jPanel134.setPreferredSize(new java.awt.Dimension(250, 31));

        jLabel70.setBackground(new java.awt.Color(0, 102, 51));
        jLabel70.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("تحضير الكل  ");
        jLabel70.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jLabel70.setOpaque(true);
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel134Layout = new javax.swing.GroupLayout(jPanel134);
        jPanel134.setLayout(jPanel134Layout);
        jPanel134Layout.setHorizontalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel134Layout.createSequentialGroup()
                    .addContainerGap(102, Short.MAX_VALUE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );
        jPanel134Layout.setVerticalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel134Layout.createSequentialGroup()
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel92.add(jPanel134);

        jPanel135.setBackground(new java.awt.Color(255, 255, 255));
        jPanel135.setPreferredSize(new java.awt.Dimension(350, 31));

        jLabel71.setBackground(new java.awt.Color(0, 102, 51));
        jLabel71.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("تسجيل الحضور ");
        jLabel71.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jLabel71.setOpaque(true);
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel135Layout = new javax.swing.GroupLayout(jPanel135);
        jPanel135.setLayout(jPanel135Layout);
        jPanel135Layout.setHorizontalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel135Layout.createSequentialGroup()
                    .addContainerGap(123, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );
        jPanel135Layout.setVerticalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel135Layout.createSequentialGroup()
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel92.add(jPanel135);

        Panel_presence_absence_Etudient.add(jPanel92, java.awt.BorderLayout.PAGE_END);

        jPanel97.setBackground(new java.awt.Color(255, 255, 255));
        jPanel97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Table_PRESENCE_ABSENCE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الفوج", "الحالة", "التوقيت", "اليوم", "التاريخ", "لقب الطالب", "اسم الطالب", "رقم الطالب", "رقم الحجز"
            }
        ));
        jScrollPane17.setViewportView(Table_PRESENCE_ABSENCE);

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1185, Short.MAX_VALUE)
            .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE))
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
            .addGroup(jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel97Layout.createSequentialGroup()
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );

        Panel_presence_absence_Etudient.add(jPanel97, java.awt.BorderLayout.CENTER);

        panelPrencipal.add(Panel_presence_absence_Etudient, "card10");

        panelBody.add(panelPrencipal, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE))
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1410, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_étudiantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_étudiantsMouseClicked

        int index = tabel_étudiants.getSelectedRow();
        TableModel mode = tabel_étudiants.getModel();
        String id = mode.getValueAt(index, 9).toString();
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

    private void table_reservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_reservationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_reservationMouseClicked

    private void ajoute_etudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoute_etudeActionPerformed

        ajote_un_étudiant add=new ajote_un_étudiant();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ajoute_etudeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        modife_un_étudiant add=new modife_un_étudiant();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int row=tabel_étudiants.getSelectedRow();
        TableModel model=tabel_étudiants.getModel();
        Date date = new Date();

        String id_étudiant= (String)model.getValueAt(row, 9).toString();
        String nom__étudiants= (String)model.getValueAt(row, 8).toString();
        String prinom_étudiants= (String)model.getValueAt(row, 7).toString();
        String date_étudiants= (String)model.getValueAt(row, 6).toString();

        String Adress_étudiants= (String)model.getValueAt(row, 5).toString();
        String phon_étudiants= (String)model.getValueAt(row, 4).toString();
        String email_étudiants= (String)model.getValueAt(row, 3).toString();
        String Gardien_étudiants= (String)model.getValueAt(row, 2).toString();
        String phon_Gardien= (String)model.getValueAt(row, 1).toString();
        String email_Gardien= (String)model.getValueAt(row, 0).toString();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            date = dateFormat.parse( date_étudiants);

        }catch (Exception ex) {

        }
        add.id_étudiants.setText(id_étudiant);
        add.nom_etuden.setText(nom__étudiants);
        add.prinom_etuden.setText(prinom_étudiants);
        add.date_nesser_etuden.setDate(date);
        add.adress_etden.setText(Adress_étudiants);
        add.phon_etuden.setText(phon_étudiants);
        add.email_etuden.setText(email_étudiants);
        add.nom_ab.setText(Gardien_étudiants);
        add.phon_ab.setText(phon_Gardien);
        add.email_ab.setText(email_Gardien);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int index=tabel_étudiants.getSelectedRow();
        String id_etudient= (String)tabel_étudiants.getModel().getValueAt(index, 9);

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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ajouter_reservation aj=new  ajouter_reservation();
         int index=tabel_étudiants.getSelectedRow();
        TableModel model = tabel_étudiants.getModel();
        String nom =  model.getValueAt(index, 8).toString();
        aj.setVisible(true);
        aj.pack();
        aj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aj.RZ.setText(nom);
       aj.RZ.setText(index +"");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
           int index=table_reservation.getSelectedRow();
        String id_reservation= (String)table_reservation.getModel().getValueAt(index, 4);

        String query ="DELETE FROM `reservation` WHERE `Num_Reservation`=?";

        try {
            perpar=  login.cnx.prepareStatement(query);
            perpar.setString(1, id_reservation);
            perpar.executeUpdate();

        } catch (Exception e) {
        }
        DefaultTableModel model = (DefaultTableModel) table_reservation.getModel();
        model.removeRow(index);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int inde = tabel_étudiants.getSelectedRow();
        TableModel model1 = tabel_étudiants.getModel();
        String nom= model1.getValueAt(inde, 8).toString();

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

    private void Table_RESERVATION3Table_RESERVATIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_RESERVATION3Table_RESERVATIONMouseClicked

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
    }//GEN-LAST:event_Table_RESERVATION3Table_RESERVATIONMouseClicked

    private void erch_etudent1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_erch_etudent1KeyReleased
        Serch(erch_etudent1.getText(), Table_RESERVATION3);
    }//GEN-LAST:event_erch_etudent1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        payer_les_depenses pdep = new  payer_les_depenses();
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

        String sql="SELECT `prix` FROM `module`  WHERE `Nom_Module`=?";
           
         try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, module);
            result = perpar.executeQuery();
          
           while(result.next()){
          
            String Prix=result.getString("prix");
         pdep.lbl_montant.setText(Prix);
 
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           
        int index=Table_payment3.getSelectedRow();
       String id_payment= (String)Table_payment3.getModel().getValueAt(index, 3);
       
        String query = "DELETE FROM `payment` WHERE  `Num_payment`=?";
        try {
            perpar=  login.cnx.prepareStatement(query);
               perpar.setString(1, id_payment);
           perpar.executeUpdate();
            
        } catch (Exception e) {
        }
         DefaultTableModel model = (DefaultTableModel) Table_payment3.getModel();
        model.removeRow(index); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Table_EnseignantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_EnseignantMouseClicked
       int row=Table_Enseignant.getSelectedRow();
        TableModel model=Table_Enseignant.getModel();
        Date date = new Date();

        String id= (String)model.getValueAt(row, 0).toString();
        String nom_ens= (String)model.getValueAt(row, 1).toString();
        String prinom_ens= (String)model.getValueAt(row, 2).toString();
        String date_eprinom_ensns= (String)model.getValueAt(row, 3).toString();

        String Adress_ens= (String)model.getValueAt(row, 4).toString();
        String phon_ens= (String)model.getValueAt(row, 5).toString();
        String email_ens= (String)model.getValueAt(row, 6).toString();
        String prosntag_ens= (String)model.getValueAt(row, 7).toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
 txt_Num_Enseignant.setText(id);
 txt_Nom_Enseignant.setText(nom_ens);
 txt_Prenom_Enseignant.setText(prinom_ens);
  try {
            date = dateFormat.parse( date_eprinom_ensns);

        }catch (Exception ex) {

        }
 //date_naissence_Ens.setDate(date);
 txt_Telephone.setText(phon_ens);
 txt_Email_Ens.setText(email_ens);
 txt_addres_Ens.setText(Adress_ens);
 txt_prosontage.setText(prosntag_ens);
       
    }//GEN-LAST:event_Table_EnseignantMouseClicked

    private void txt_Num_EnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Num_EnseignantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Num_EnseignantActionPerformed

    private void txt_Nom_EnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nom_EnseignantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nom_EnseignantActionPerformed

    private void txt_addres_EnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addres_EnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addres_EnsActionPerformed

    private void txt_TelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelephoneActionPerformed

    private void txt_prosontageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prosontageKeyTyped

        char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prosontageKeyTyped

    private void ComboBox_recherche_moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_recherche_moduleActionPerformed
        // TODO add your handling code here:

        //         ComboBox_enseignant.removeAllItems();
        DefaultTableModel model=( DefaultTableModel)Table_Enseignant.getModel();
        model.setRowCount(0);
        //             ComboBox_recherche_module.addActionListener(ComboBox_recherche_module) ;
        String Nom_Module=(String) ComboBox_recherche_module.getSelectedItem();

        if(ComboBox_recherche_module.getSelectedItem().equals("الكل"))
        {
             tabel_Ens(Table_Enseignant);
        }
        else
        {
            String sql="SELECT  * FROM `enseignant` WHERE `Num_Enseignant`IN(SELECT `Num_Enseignant` FROM `groupe` WHERE `groupe`.`Num_Module` IN(SELECT `Num_Module` FROM `module` WHERE `Nom_Module`=?))";
            try {
                perpar=  login.cnx.prepareStatement(sql);
                perpar.setString(1, Nom_Module);
                result=  perpar.executeQuery();
                while(result.next()){
                    String Num_Enseignant=result.getString("Num_Enseignant");
                    String Nom_Enseignant=result.getString("Nom_Enseignant");
                    String prenom_Enseignant=result.getString("prenom_Enseignant");
                    String Date_naissence=result.getString("Date_naissence");
                    String Address=result.getString("Address");
                    String Telephone=result.getString("Telephone");
                    String Email=result.getString("Email");
                    String prosontage=result.getString("prosontage");

                    model.addRow(new Object[]{prosontage,Email,Telephone,Address,Date_naissence,prenom_Enseignant,Nom_Enseignant,Num_Enseignant});
                }
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_ComboBox_recherche_moduleActionPerformed

    private void erch_etudent2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_erch_etudent2KeyReleased
 Serch(erch_etudent2.getText(), Table_Enseignant);        
    }//GEN-LAST:event_erch_etudent2KeyReleased

    private void btn_ajouter_EnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouter_EnseignantActionPerformed
       
        
         if(!checkEmptyFields()){
             LocalDate CurrentDate = LocalDate.now();
date=date_naissence_Ens.getDate();
     Date currentDate = new Date();
      
 LocalDate birthDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period age = Period.between(birthDate , CurrentDate);
        if (age.getYears() > 20 && age.getYears()<80) {
  JOptionPane.showMessageDialog(null, "تاريخ الميلاد صحيح ويزيد عن 25 سنة.");


       
        
           String Num=   txt_Num_Enseignant.getText();
           String Nom=   txt_Nom_Enseignant.getText().toString();
            String Prenom=  txt_Prenom_Enseignant .getText().toString();
            String Adress=   txt_addres_Ens.getText().toString();
            String Phon= txt_Telephone.getText().toString();
            String Email=   txt_Email_Ens.getText().toString();
            String prosontage=   txt_prosontage.getText().toString();
         
       
                 
         
              
            int numero=Integer.parseInt(Num);
          int proso=Integer.parseInt(prosontage);
         
         
        String sql= "INSERT INTO `enseignant`(`Num_Enseignant`, `Nom_Enseignant`, `prenom_Enseignant`, `Date_naissence`, `Address`, `Telephone`, `Email`, `prosontage`) VALUES (?,?,?,?,?,?,?,?)";
            try {

                perpar=  login.cnx.prepareStatement(sql);
               perpar.setInt(1, numero);
                perpar.setString(2, Nom);

                perpar.setString(3,Prenom);

            sqldate=new java.sql.Date(date.getTime());
         perpar.setDate(4, sqldate);
            perpar.setString(5, Adress);
            perpar.setString(6, Phon);
            perpar.setString(7, Email);
            perpar.setInt(8, proso);



                perpar.execute();
                
            } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");

            }  
             DefaultTableModel model=(DefaultTableModel) Table_Enseignant.getModel();
            model.setRowCount(0);
             tabel_Ens(Table_Enseignant);
         

        }else{         
         JOptionPane.showMessageDialog(null,"تاريخ الميلاد غير صحيح .");
}
        } else {
   JOptionPane.showMessageDialog(null,"قم بادخال الحقول كاملة","Missing information",JOptionPane.ERROR_MESSAGE);
}
        

        
      
          
    }//GEN-LAST:event_btn_ajouter_EnseignantActionPerformed

    private void btn_modifier_EnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifier_EnseignantActionPerformed
   if(!checkEmptyFields()){
        //date=date_naissence_Ens.getDate();
      //  Date currentDate = new Date();
         LocalDate CurrentDate = LocalDate.now();
      
      
 LocalDate birthDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period age = Period.between(birthDate , CurrentDate);
        
        
        if (age.getYears() > 20 && age.getYears()<80) {
       
        
        String id=txt_Num_Enseignant.getText().toString();
            String nem=   txt_Nom_Enseignant.getText().toString();
            String pren=   txt_Prenom_Enseignant.getText().toString();
           
            String adress=   txt_addres_Ens.getText().toString();
            String phon=txt_Telephone.getText().toString();
            String email=txt_Email_Ens.getText().toString();
            String prosntag=txt_prosontage.getText().toString();
        
         sqldate=new java.sql.Date(date.getTime());
                 
        
            String sql="UPDATE `enseignant` SET `Nom_Enseignant`=?,`prenom_Enseignant`=?,`Date_naissence`=?,`Address`=?,`Telephone`=?,`Email`=?,`prosontage`=? WHERE `Num_Enseignant`=?";

            try {
                 perpar=  login.cnx.prepareStatement(sql);
            
               
               

                perpar.setString(8, id);
                perpar.setString(1,nem );
                perpar.setString(2, pren);
                perpar.setDate(3, sqldate);
                perpar.setString(4,  adress);
                perpar.setString(5,  phon);
                perpar.setString(6,   email);
                perpar.setString(7,   prosntag);
                       
                

                perpar.execute();  }
            catch (Exception e) {
        }
            txt_Email_Ens.setText("");
            txt_Num_Enseignant.setText("");
            txt_Nom_Enseignant.setText("");
            txt_Prenom_Enseignant.setText("");
            txt_Telephone.setText("");
            txt_addres_Ens.setText("");
             txt_prosontage.setText("");
             
            DefaultTableModel model=(DefaultTableModel) Table_Enseignant.getModel();
            model.setRowCount(0);
             tabel_Ens(Table_Enseignant);
        }else{        JOptionPane.showMessageDialog(null, "تاريخ الميلاد غير صحيح ");
}
             } else {
        JOptionPane.showMessageDialog(null,"قم بادخال الحقول كاملة","Missing information",JOptionPane.ERROR_MESSAGE);
    
}
            
            
    }//GEN-LAST:event_btn_modifier_EnseignantActionPerformed

    private void btn_Supprimer_EnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Supprimer_EnseignantActionPerformed
        //حذف استاذ
         boolean hasRows = false;
        DefaultTableModel model = (DefaultTableModel) Table_Enseignant.getModel();
        DefaultTableModel modell = (DefaultTableModel) Table_Enseignant.getModel();
         int ro=Table_Enseignant.getSelectedRow();
            String id= (String)model.getValueAt(ro, 0).toString();
             String Sql =  "SELECT * FROM `groupe` WHERE `Num_Enseignant`=?";
             try {
            perpar=  login.cnx.prepareStatement(Sql);
            perpar.setString(1, id);
            result = perpar.executeQuery();
            hasRows = result.next();
        } catch (Exception e) {
        }
             
          
        

        if(model.getRowCount() == 0){System.out.println("جدول الاساتذة فارغ");}
        else if(!hasRows)
        {
            
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

           
            modifi_ensin_grop as=new modifi_ensin_grop();
            valide_suprim ens=new valide_suprim();
            ens.setVisible(true);
            ens.setLocationRelativeTo(null);
            ens.pack();
            ens.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ens.selq.setText(ro+"");
            ens.id_enss.setText(id);}
    }//GEN-LAST:event_btn_Supprimer_EnseignantActionPerformed

    private void erch_etudent3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_erch_etudent3KeyReleased
Serch(erch_etudent3.getText(), tabel_étudiants);   
    }//GEN-LAST:event_erch_etudent3KeyReleased

    private void Suprime_sienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suprime_sienceActionPerformed
        int  row=tabel_Sincer.getSelectedRow();

        valide_Suprrime_Siunce add=new valide_Suprrime_Siunce();
        add.roww.setText(row+"");
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_Suprime_sienceActionPerformed

    private void ajoute_siunceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoute_siunceActionPerformed
        ajoute_sience add =new ajoute_sience();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        add.pack();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_ajoute_siunceActionPerformed

    private void Ajouter_une_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajouter_une_salleActionPerformed
        Ajouter_une_salle ens=new Ajouter_une_salle();
        ens.setVisible(true);
        ens.setLocationRelativeTo(null);
        ens.pack();
        ens.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Ajouter_une_salleActionPerformed

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

    private void serchseinceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchseinceKeyReleased
          String ass = seerch.getSelectedItem().toString();
        
          if(ass.equals("المستويات")){
          
           Serch(serchseince.getText(), Tabel_nive);  
          }
          else if(ass.equals("الحصص"))
          {
          Serch(serchseince.getText(), tabel_Sincer);  
          
          
          }
          else if(ass.equals("القاعات"))
          {
          Serch(serchseince.getText(), tabel_sall);  
          
          
          }
          else{
           Serch(serchseince.getText(), tabel_modell);  
          }
              
       
    }//GEN-LAST:event_serchseinceKeyReleased

    private void ComboBox_recherche_EnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_recherche_EnseignantActionPerformed
        // TODO add your handling code here:
        
         
       
       String Nom_Enseignant=(String) ComboBox_recherche_Enseignant.getSelectedItem();
        DefaultTableModel model_2=( DefaultTableModel)Table_montant_enseignant.getModel();
      model_2.setRowCount(0);
       DefaultTableModel model_3=( DefaultTableModel)Table_cotisation_enseignant.getModel();
      model_3.setRowCount(0);
      
        
      
      
        String sql="SELECT G.`Nom_Groupe`,M.`Nom_Module`,EN.`Num_Enseignant`,EN.`Nom_Enseignant`,EN.`prenom_Enseignant`\n" +
                   ",((COUNT(R.`Num_Etudient`)*M.`prix`*EN.`prosontage`)/100)AS SALIRE \n" +
                   "FROM `reservation` R,`groupe`G,`etudient`E ,`enseignant`EN ,`module`M \n" +
                   "WHERE E.`Num_Etudient`=R.`Num_Etudient`\n" +
                   "AND G.`Num_Groupe`=R.`Num_Groupe` \n" +
                   "AND EN.`Num_Enseignant`=G.`Num_Enseignant` \n" +
                   "AND M.`Num_Module`=G.`Num_Module` \n" +
                    "AND EN.`Num_Enseignant`IN(SELECT EN.`Num_Enseignant` FROM `enseignant`EN WHERE EN.`Nom_Enseignant`=?) \n" +
                   "GROUP BY R.`Num_Groupe` ";
         double total_saler=0;
         try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, Nom_Enseignant);
            result = perpar.executeQuery();
            
           
          
           
           while(result.next()){
            String SALIRE=result.getString("SALIRE");
            String Nom_Module=result.getString("Nom_Module");    
             String Nom_Groupe=result.getString("Nom_Groupe");
              String Prenom_Enseignant=result.getString("prenom_Enseignant");
               String nom_Enseignant=result.getString("Nom_Enseignant");
                String Num_Enseignant=result.getString("Num_Enseignant");
               model_2.addRow(new Object[]{SALIRE,Nom_Module,Nom_Groupe,Prenom_Enseignant,nom_Enseignant,Num_Enseignant });
       total_saler+=Double.parseDouble(SALIRE);
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
         lbl_total_montant_enseignant.setText(total_saler +"" );
         
        String Query="SELECT `Num_Payment`, `Date_Payment`, `Montant_Payment` , `Montant_du` FROM `payment_enseignant` PN,`enseignant`EN WHERE EN.`Num_Enseignant` = PN.`Num_Enseignant` AND EN.`Nom_Enseignant`=?";
        
    try {
                
           perpar=  login.cnx.prepareStatement(Query);             
           perpar.setString(1, Nom_Enseignant);
            result = perpar.executeQuery();
           
           
           
           while(result.next()){
            String Montant_Payment=result.getString("Montant_Payment");  
               String Montant_du=result.getString("Montant_du");
              
             String Date_Payment=result.getString("Date_Payment");
             String Num_Payment=result.getString("Num_Payment");
               model_3.addRow(new Object[]{Montant_Payment,Montant_du,Date_Payment, Num_Payment});
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
               
                
                
                
            }
  
 
    
    }//GEN-LAST:event_ComboBox_recherche_EnseignantActionPerformed
   
    
    private void ComboBox_recherche_EnseignantComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ComboBox_recherche_EnseignantComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_recherche_EnseignantComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Payment_Enseignant PE=new Payment_Enseignant();
      int index = Table_montant_enseignant.getSelectedRow();
    TableModel model = Table_montant_enseignant.getModel();
       String num_enseignant = model.getValueAt(index, 5).toString();
        String nom_enseignant = model.getValueAt(index, 4).toString();      
        String montant_du=lbl_total_montant_enseignant.getText();
        PE.setVisible(true);
        PE.num_enseignant.setText(num_enseignant);
        PE.nom_enseignant .setText(nom_enseignant);
        PE.montant_du.setText(montant_du);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         
        int index=Table_cotisation_enseignant.getSelectedRow();
       String Num_Payment= (String)Table_cotisation_enseignant.getModel().getValueAt(index, 3);
       
        String query = "DELETE FROM `payment_enseignant` WHERE  `Num_Payment`=?";
        try {
            perpar=  login.cnx.prepareStatement(query);
               perpar.setString(1, Num_Payment);
           perpar.executeUpdate();
            
        } catch (Exception e) {
        }
         DefaultTableModel model = (DefaultTableModel) Table_cotisation_enseignant.getModel();
        model.removeRow(index); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ComboBox_choixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_choixActionPerformed
Tabel_Since_Groupe.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      Tabel_Since_Groupe.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاعمدة
        Table_Groupe.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      Table_Groupe.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاع        // TODO add your handling code here:
   ComboBox_ENS_Mod_Sall.removeAllItems();
         if(ComboBox_choix.getSelectedItem().equals("الاساتذة"))
        {
            affichier_enseignant_in_combobox(ComboBox_ENS_Mod_Sall);
        }
         else if(ComboBox_choix.getSelectedItem().equals("المواد")){
              Combobox_recherche_module (ComboBox_ENS_Mod_Sall);
         
         }
         else{
                    Salle_combobox();
         }
            
    }//GEN-LAST:event_ComboBox_choixActionPerformed

    private void ComboBox_ENS_Mod_SallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_ENS_Mod_SallActionPerformed
Tabel_Since_Groupe.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      Tabel_Since_Groupe.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاعمدة
        Table_Groupe.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      Table_Groupe.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاع        // TODO add your handling code here:
         if(ComboBox_choix.getSelectedItem().equals("الاساتذة"))
        {
             
        String Nom_Enseignant = (String) ComboBox_ENS_Mod_Sall.getSelectedItem();
        DefaultTableModel model=( DefaultTableModel)Table_Groupe.getModel();
      model.setRowCount(0);
        
        String sql="SELECT `Num_Groupe`, `Nom_Groupe`, `Nom_Enseignant`, `Nom_Module`, `Nom_Salle` FROM `groupe` G, `enseignant`E, `module` M WHERE E.`Num_Enseignant`=G.`Num_Enseignant` AND M.`Num_Module`=G.`Num_Module` AND E.`Nom_Enseignant`=?";
         try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, Nom_Enseignant);
            result = perpar.executeQuery();
           
           
           
           while(result.next()){
            String salle=result.getString("Nom_Salle");    
              String nom_Enseignant=result.getString("Nom_Enseignant");
               String Nom_Module=result.getString("Nom_Module");
            String Nom_Groupe=result.getString("Nom_Groupe");    
             String Num_Groupe=result.getString("Num_Groupe");
               model.addRow(new Object[]{salle,nom_Enseignant,Nom_Module,Nom_Groupe,Num_Groupe });
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
        
        }
         else   if(ComboBox_choix.getSelectedItem().equals("المواد"))
        {
             
        String Nom_module = (String) ComboBox_ENS_Mod_Sall.getSelectedItem();
        DefaultTableModel model=( DefaultTableModel)Table_Groupe.getModel();
      model.setRowCount(0);
        
        String sql="SELECT `Num_Groupe`, `Nom_Groupe`, `Nom_Enseignant`, `Nom_Module`, `Nom_Salle` FROM `groupe` G, `enseignant`E, `module` M WHERE E.`Num_Enseignant`=G.`Num_Enseignant` AND M.`Num_Module`=G.`Num_Module` AND M.`Nom_Module`=?";
         try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, Nom_module);
            result = perpar.executeQuery();
           
           
           
           while(result.next()){
            String salle=result.getString("Nom_Salle");    
              String nom_Enseignant=result.getString("Nom_Enseignant");
               String Nom_Module=result.getString("Nom_Module");
            String Nom_Groupe=result.getString("Nom_Groupe");    
             String Num_Groupe=result.getString("Num_Groupe");
               model.addRow(new Object[]{salle,nom_Enseignant,Nom_Module,Nom_Groupe,Num_Groupe });
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
        
        }
         else if(ComboBox_choix.getSelectedItem().equals("القاعات"))
        {
             
        String Nom_Salle = (String) ComboBox_ENS_Mod_Sall.getSelectedItem();
        DefaultTableModel model=( DefaultTableModel)Table_Groupe.getModel();
      model.setRowCount(0);
        
        String sql="SELECT `Num_Groupe`, `Nom_Groupe`, `Nom_Enseignant`, `Nom_Module`, `Nom_Salle` FROM `groupe` G, `enseignant`E, `module` M WHERE E.`Num_Enseignant`=G.`Num_Enseignant` AND M.`Num_Module`=G.`Num_Module` AND G.`Nom_Salle`=?";
         try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, Nom_Salle);
            result = perpar.executeQuery();
           
           
           
           while(result.next()){
            String salle=result.getString("Nom_Salle");    
              String nom_Enseignant=result.getString("Nom_Enseignant");
               String Nom_Module=result.getString("Nom_Module");
            String Nom_Groupe=result.getString("Nom_Groupe");    
             String Num_Groupe=result.getString("Num_Groupe");
               model.addRow(new Object[]{salle,nom_Enseignant,Nom_Module,Nom_Groupe,Num_Groupe });
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
        
        }
             
             
         
        
                    
         
        
    }//GEN-LAST:event_ComboBox_ENS_Mod_SallActionPerformed

    private void Table_GroupeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_GroupeMouseClicked
        // TODO add your handling code here:
        
        
         int index  = Table_Groupe.getSelectedRow();  
        TableModel mode = Table_Groupe.getModel();
        String Num_Groupe = mode.getValueAt(index, 4).toString();
        DefaultTableModel model=( DefaultTableModel)Tabel_Since_Groupe.getModel();
      model.setRowCount(0);
        
        String sql="SELECT `jour`, `Heure_debut` FROM `affectation_groupe_sciene` WHERE  `Num_Groupe`=?";
         try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, Num_Groupe);
            result = perpar.executeQuery();
           
           
           while(result.next()){
            String Heure_debut=result.getString("Heure_debut");
            String jour=result.getString("jour");    
            
               model.addRow(new Object[]{Heure_debut,jour });
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
          System.out.println(Num_Groupe+"");
                    int ID=Integer.parseInt(Num_Groupe);

         String Query="SELECT G.`Nom_Groupe` ,COUNT(R.`Num_Etudient`) ,(COUNT(R.`Num_Etudient`)*M.`prix`)AS Monta FROM `reservation` R,`groupe`G,`etudient`E ,`module`M WHERE E.`Num_Etudient`=R.`Num_Etudient` AND G.`Num_Groupe`=R.`Num_Groupe` AND M.`Num_Module`=G.`Num_Module` AND G.`Num_Groupe`=? GROUP BY R.`Num_Groupe`";
              try {
                  perpar =login.cnx.prepareStatement(Query);
                    perpar.setInt(1, ID);
          result=perpar.executeQuery();
          while(result.next()){
              
          Nember_Etudient_en_groupe.setText(result.getInt(2)+"");
          Montant_groupe.setText(result.getInt(3)+"");
          
          }
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(null,e+ "NO");
              }
        
    }//GEN-LAST:event_Table_GroupeMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        affectation_groupe_science1_copier AGS=new affectation_groupe_science1_copier();
        AGS.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        modifier_groupe MG=new modifier_groupe();
        MG.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        
         int index=Table_Groupe.getSelectedRow();
        String num_groupe= (String)Table_Groupe.getModel().getValueAt(index, 4);

        String query =" DELETE FROM `affectation_groupe_sciene` WHERE `Num_Groupe`=?";
                        
        try {
            perpar=  login.cnx.prepareStatement(query);
            perpar.setString(1, num_groupe);
            perpar.execute();

        } catch (Exception e) {
        }

        String sql ="DELETE FROM `groupe` WHERE `Num_Groupe`=?";
        try {
            perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, num_groupe);
            perpar.executeUpdate();

        } catch (Exception e) {
        }
        DefaultTableModel model = (DefaultTableModel) Table_Groupe.getModel();
        model.removeRow(index);
        DefaultTableModel model1=( DefaultTableModel)Tabel_Since_Groupe.getModel();
        model1.setRowCount(0);

    }//GEN-LAST:event_jButton15ActionPerformed

    private void tabel_étudiants1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_étudiants1MouseClicked
  int index = tabel_étudiants1.getSelectedRow();
        TableModel mode = tabel_étudiants1.getModel();
        String nom_elev = mode.getValueAt(index, 8).toString();   
          String phon_elev = mode.getValueAt(index, 4).toString(); 
           String Email_elev = mode.getValueAt(index, 3).toString(); 
            String nom_alwali = mode.getValueAt(index, 2).toString();   
          String phon_alwali = mode.getValueAt(index, 1).toString(); 
           String Email_alwali= mode.getValueAt(index, 0).toString(); 
           
           
           Nom_elev.setText(nom_elev);
           Phon_elev.setText(phon_elev);
           Email_Elev.setText(Email_elev);
           Nom_alwali.setText(nom_alwali);
           phon_Alwali.setText(phon_alwali);
           Email_Alwali.setText(Email_alwali);
    }//GEN-LAST:event_tabel_étudiants1MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       telcom_chong   .removeAll();
    telcom_chong .repaint();
       telcom_chong.revalidate();
  telcom_chong.add(telcomElev);
  
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
          telcom_chong   .removeAll();
    telcom_chong .repaint();
       telcom_chong.revalidate();
  telcom_chong.add(telcomEncinet);
  
    }//GEN-LAST:event_jButton18ActionPerformed

    private void Table_Enseignant2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_Enseignant2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_Enseignant2MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    /*  System.out.println("SimpleEmail Start");
		
	    String smtpHostServer = "smtp.example.com";
	    String emailID = "mmoh89042@gmail.com";
	    
	    Properties props = System.getProperties();

	    props.put("mail.smtp.host", smtpHostServer);

	    Session session = Session.getInstance(props, null);
	    
	   sendEmail(session, emailID,"SimpleEmail Testing Subject", "SimpleEmail Testing Body");*/
   // sendEmail();
  as();
     /*String to = "m.beniouzghoud.mi@lagh-univ.dz";
        String from = "m.beniouzghoud.mi@lagh-univ.dz";
        String subject = "Second: Sending email using GMail";
        String text = "This is a example email send using gmail and java program with out less secure app";
        boolean b = sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }*/
    }//GEN-LAST:event_jButton20ActionPerformed

    private void Table_Enseignant3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_Enseignant3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_Enseignant3MouseClicked

    private void ComboBox_groupe_chooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_groupe_chooserActionPerformed
        // TODO add your handling code here:
        
          ComboBox_day_chooser.removeAllItems();
             //ComboBox_niveau.addActionListener(ComboBox_niveau) ;
            String Nom_Groupe=(String) ComboBox_groupe_chooser.getSelectedItem();
             String sql="SELECT DISTINCT `jour` FROM `affectation_groupe_sciene`AGS,`groupe`G WHERE G.`Num_Groupe`=AGS.`Num_Groupe` AND `Nom_Groupe`=?";

         try {
             perpar=  login.cnx.prepareStatement(sql);
              perpar.setString(1, Nom_Groupe);
             ResultSet rs=  perpar.executeQuery();
             while(rs.next()){
             ComboBox_day_chooser.addItem(rs.getString(1));
             }
         } catch (Exception e) {
              
         }
    }//GEN-LAST:event_ComboBox_groupe_chooserActionPerformed

    private void ComboBox_day_chooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_day_chooserActionPerformed
        // TODO add your handling code here:
         ComboBox_science_chooser.removeAllItems();
        
       String Nom_Groupe=(String) ComboBox_groupe_chooser.getSelectedItem();
        String day_science=(String) ComboBox_day_chooser.getSelectedItem();
             String sql="SELECT `Heure_debut` FROM `affectation_groupe_sciene`AGS,`groupe`G WHERE G.`Num_Groupe`=AGS.`Num_Groupe` AND `Nom_Groupe`=? AND `jour`=?";

         try {
             perpar=  login.cnx.prepareStatement(sql);
              perpar.setString(1, Nom_Groupe);
              perpar.setString(2, day_science);
             ResultSet rs=  perpar.executeQuery();
             while(rs.next()){
             ComboBox_science_chooser.addItem(rs.getString(1));
             }
         } catch (Exception e) {
              
         }
    }//GEN-LAST:event_ComboBox_day_chooserActionPerformed

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        // TODO add your handling code here:
        
        
        
        DefaultTableModel model=( DefaultTableModel)Table_PRESENCE_ABSENCE.getModel();
        model.setRowCount(0);
      
        String Nom_Groupe=(String) ComboBox_groupe_chooser.getSelectedItem();
        String jeur_chooser=(String) ComboBox_day_chooser.getSelectedItem();
        String science_chooser=(String) ComboBox_science_chooser.getSelectedItem();
        date=day_chooser.getDate();
        sqldate=new java.sql.Date(date.getTime());
         String Etat ="  /  ";
        
        String sql="SELECT R.`Num_Reservation`,E.`Num_Etudient`, E.`Nom_Etudient`, E.`prenom_Etudient`, G.`Nom_Groupe` FROM `reservation`R,`etudient`E, `groupe`G WHERE E.`Num_Etudient`=R.`Num_Etudient` AND G.`Num_Groupe`=R.`Num_Groupe` AND G.`Nom_Groupe`=?";
        try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, Nom_Groupe);
            result = perpar.executeQuery();
          
           while(result.next()){
            String Num_Reservation=result.getString("Num_Reservation");
            String Num_Etudient=result.getString("Num_Etudient");
            String Nom_Etudient=result.getString("Nom_Etudient");
            String prenom_Etudient=result.getString("prenom_Etudient");
            String nom_Groupe=result.getString("Nom_Groupe");          
               model.addRow(new Object[]{nom_Groupe,Etat,science_chooser,jeur_chooser,sqldate,prenom_Etudient,Nom_Etudient,Num_Etudient,Num_Reservation});
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
      
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        // TODO add your handling code here:
        
          
        DefaultTableModel model=( DefaultTableModel)Table_PRESENCE_ABSENCE.getModel();
        model.setRowCount(0);
      
        String Nom_Groupe=(String) ComboBox_groupe_chooser.getSelectedItem();
       // String jeur_chooser=(String) ComboBox_day_chooser.getSelectedItem();
        String science_chooser=(String) ComboBox_science_chooser.getSelectedItem();
        date=day_chooser.getDate();
        sqldate=new java.sql.Date(date.getTime());
      //   String Etat ="  /  ";
        
        String sql="SELECT R.`Num_Reservation`,E.`Num_Etudient`, E.`Nom_Etudient`, E.`prenom_Etudient`,PAE.`Date_pre_abs`, PAE.`jeur`, PAE.`Horaire`, PAE.`Etat`,G.`Nom_Groupe` FROM `reservation`R,`etudient`E,`presence_absence_etudient`PAE,`groupe`G WHERE E.`Num_Etudient`=R.`Num_Etudient` \n" +
                   "AND G.`Num_Groupe`=R.`Num_Groupe` \n" +
                   "AND R.`Num_Reservation`=PAE.`Num_Reservation` \n" +
                   "AND G.`Nom_Groupe`=?\n" +
                   "AND PAE.`Date_pre_abs`=?\n" +
                   "AND PAE.`Horaire`=?";
        try {
                
           perpar=  login.cnx.prepareStatement(sql);             
           perpar.setString(1, Nom_Groupe);
           perpar.setDate(2, sqldate);
           perpar.setString(3, science_chooser);
            result = perpar.executeQuery();
          
           while(result.next()){
            String Num_Reservation=result.getString("Num_Reservation");
            String Num_Etudient=result.getString("Num_Etudient");
            String Nom_Etudient=result.getString("Nom_Etudient");
            String prenom_Etudient=result.getString("prenom_Etudient");
            String Date_pre_abs=result.getString("Date_pre_abs");
            String jeur=result.getString("jeur");
            String Horaire=result.getString("Horaire");
            String Etat=result.getString("Etat");
            String nom_Groupe=result.getString("Nom_Groupe");          
               model.addRow(new Object[]{nom_Groupe,Etat,Horaire,jeur,Date_pre_abs,prenom_Etudient,Nom_Etudient,Num_Etudient,Num_Reservation});
       
                  }
           
                } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");
            
            }
      
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        // TODO add your handling code here:
        String Etat="حاضر";
       presence_absence(Etat);
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        // TODO add your handling code here:
          String Etat="غائب";
       presence_absence(Etat);
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        // TODO add your handling code here:
        
          
        int Num_Row = Table_PRESENCE_ABSENCE.getRowCount();
      
        
        int index=Num_Row-1;
         DefaultTableModel model1=( DefaultTableModel)Table_PRESENCE_ABSENCE.getModel();
        //  int index = Table_PRESENCE_ABSENCE.getSelectedRow();
        TableModel model = Table_PRESENCE_ABSENCE.getModel();
        String Etat ="حاضر";
        
        while(index>=0){
        String nom_groupe = model.getValueAt(index, 0).toString();
        String Science = model.getValueAt(index, 2).toString();
        String jeur= model.getValueAt(index, 3).toString();
        String Date= model.getValueAt(index, 4).toString();
        String prenom_Etudient= model.getValueAt(index, 5).toString();
        String nom_Etudient= model.getValueAt(index, 6).toString();
        String num_Etudient= model.getValueAt(index, 7).toString();
        String Num_Reservation = model.getValueAt(index, 8).toString();
        
         date=day_chooser.getDate();
       sqldate=new java.sql.Date(date.getTime());
        
         
        String sql= "INSERT INTO `presence_absence_etudient`(`Date_pre_abs`, `jeur`, `Horaire`, `Etat`, `Num_Reservation`) VALUES (?,?,?,?,?)";
           
            try {

                perpar=  login.cnx.prepareStatement(sql);
                 
                perpar.setDate(1, sqldate);

                perpar.setString(2,jeur);

               perpar.setString(3,Science);
               perpar.setString(4,Etat);
               perpar.setString(5,Num_Reservation);
                
                perpar.execute();

     

            } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");

            }
            model1.removeRow(index);
            model1.addRow(new Object[]{nom_groupe,Etat,Science,jeur,Date,prenom_Etudient,nom_Etudient,num_Etudient,Num_Reservation});
             
             index--;
        }
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        // TODO add your handling code here:
        
         
         DefaultTableModel model1=( DefaultTableModel)Table_PRESENCE_ABSENCE.getModel();
          int index = Table_PRESENCE_ABSENCE.getSelectedRow();
        TableModel model = Table_PRESENCE_ABSENCE.getModel();
        String Etat ="";
        String nom_groupe = model.getValueAt(index, 0).toString();
        String Science = model.getValueAt(index, 2).toString();
        String jeur= model.getValueAt(index, 3).toString();
        String Date= model.getValueAt(index, 4).toString();
        String prenom_Etudient= model.getValueAt(index, 5).toString();
        String nom_Etudient= model.getValueAt(index, 6).toString();
        String num_Etudient= model.getValueAt(index, 7).toString();
        String Num_Reservation = model.getValueAt(index, 8).toString();
        
         date=day_chooser.getDate();
       sqldate=new java.sql.Date(date.getTime());
       
       if( model.getValueAt(index, 1).toString().equals("حاضر"))
       {
        Etat ="غائب";
       }
       else
       {
        Etat ="حاضر";
       }
       
         String sql= "UPDATE `presence_absence_etudient` SET `Etat`=? WHERE `Date_pre_abs`=? AND `Horaire`=? AND`Num_Reservation`=?";
         
             
            try {

                perpar=  login.cnx.prepareStatement(sql);
                 perpar.setString(1,Etat);
                perpar.setDate(2, sqldate);
               perpar.setString(3,Science);         
               perpar.setString(4,Num_Reservation);
                
                perpar.execute();

     

            } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");

            }
             model1.addRow(new Object[]{nom_groupe,Etat,Science,jeur,Date,prenom_Etudient,nom_Etudient,num_Etudient,Num_Reservation});
             model1.removeRow(index);
    
     

    }//GEN-LAST:event_jLabel68MouseClicked

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
   
        validation_Modifier_science MGS=new validation_Modifier_science();
        MGS.setVisible(true);
        MGS.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton22ActionPerformed

    private void btn_imprimier_Emploi_tempsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimier_Emploi_tempsActionPerformed
        // TODO add your handling code here:
         int index  = Table_Enseignant.getSelectedRow();  
        TableModel model_1 = Table_Enseignant.getModel();
        String id = model_1.getValueAt(index, 0).toString();
        try{
        
           // String report="C:\\Users\\MZI System\\Documents\\NetBeansProjects\\JavaApplication1\\src\\School\\Emploi_de_temps_Enseignant.jrxml";
          JasperDesign jd=JRXmlLoader.load("C:\\Users\\MOHAMED\\Documents\\NetBeansProjects\\school0.1\\src\\Raport\\Emploi_de_temps_Enseignant.jrxml");
           
        String Query="SELECT `jour`, `Heure_debut`, `Nom_Groupe`,E.`Num_Enseignant`,E.`Nom_Enseignant` \n" +
                        "FROM `affectation_groupe_sciene` AGS,`groupe` G,`enseignant` E \n" +
                        "WHERE G.`Num_Groupe`= AGS.`Num_Groupe` \n" +
                        "AND E.`Num_Enseignant` = G.`Num_Enseignant` \n" +
                        "AND E.`Num_Enseignant`='"+id+"' \n" +
                        "GROUP BY `jour`, `Heure_debut`";   
           perpar.setString(1, id);
           JRDesignQuery newQuery = new JRDesignQuery();
           newQuery.setText(Query);
           jd.setQuery(newQuery);
           JasperReport jr=JasperCompileManager.compileReport(jd);
           JasperPrint jp=JasperFillManager.fillReport(jr,null,cnx);
           JasperViewer.viewReport(jp,false);
            
            
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, e);
        
        }
    }//GEN-LAST:event_btn_imprimier_Emploi_tempsActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        int index  = tabel_étudiants.getSelectedRow();  
        TableModel model_1 = tabel_étudiants.getModel();
        String id = model_1.getValueAt(index, 9).toString();
        try{
        
           // String report="C:\\Users\\MZI System\\Documents\\NetBeansProjects\\JavaApplication1\\src\\School\\Emploi_de_temps_Enseignant.jrxml";
          JasperDesign jd=JRXmlLoader.load("C:\\Users\\MOHAMED\\Documents\\NetBeansProjects\\school0.1\\src\\Raport\\Emploi_ de_ temps_ de_ Etudient.jrxml");
           
        String Query="SELECT "
                + "E.`Num_Etudient`, E.`Nom_Etudient`,M.`Nom_Module`,G.`Nom_Groupe`,AGS.`jour`, AGS.`Heure_debut`\n" +
                     " FROM `reservation`R,`etudient`E,`module`M,`groupe`G,`affectation_groupe_sciene`AGS\n" +
                     " WHERE E.`Num_Etudient`= R.`Num_Etudient` \n" +
                     "AND G.`Num_Groupe`= R.`Num_Groupe` \n" +
                     "AND G.`Num_Groupe`= AGS.`Num_Groupe` \n" +
                     "AND M.`Num_Module` = G.`Num_Module` \n" +
                     "AND E.`Num_Etudient`='"+id+"'";   
         
           JRDesignQuery newQuery = new JRDesignQuery();
           newQuery.setText(Query);
           jd.setQuery(newQuery);
           JasperReport jr=JasperCompileManager.compileReport(jd);
           JasperPrint jp=JasperFillManager.fillReport(jr,null,cnx);
           JasperViewer.viewReport(jp,false);
             }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, e);
        
        }
        
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
         int index  = Table_Groupe.getSelectedRow();  
        TableModel model_1 = Table_Groupe.getModel();
        String id = model_1.getValueAt(index, 4).toString();
        try{
        
           // String report="C:\\Users\\MZI System\\Documents\\NetBeansProjects\\JavaApplication1\\src\\School\\Emploi_de_temps_Enseignant.jrxml";
          JasperDesign jd=JRXmlLoader.load("C:\\Users\\MOHAMED\\Documents\\NetBeansProjects\\school0.1\\src\\Raport\\report2_List_Etu.jrxml");
           
        String Query="SELECT G.`Num_Groupe`, G.`Nom_Groupe`,M.`Nom_Module`,EN.`Nom_Enseignant`, E.`Num_Etudient`, E.`Nom_Etudient`, E.`prenom_Etudient` FROM `reservation`R,`etudient`E,`enseignant`EN,`groupe` G,`module`M WHERE E.`Num_Etudient`=R.`Num_Etudient` AND G.`Num_Groupe`=R.`Num_Groupe` AND EN.`Num_Enseignant`=G.`Num_Enseignant` AND M.`Num_Module`=G.`Num_Module` AND G.`Num_Groupe`='"+id+"'";   
         //  prepared.setString(1, id);
           JRDesignQuery newQuery = new JRDesignQuery();
           newQuery.setText(Query);
           jd.setQuery(newQuery);
           JasperReport jr=JasperCompileManager.compileReport(jd);
           JasperPrint jp=JasperFillManager.fillReport(jr,null,cnx);
           JasperViewer.viewReport(jp,false);
            
            
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, e);
        
        }
        
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          int index  = Table_cotisation_enseignant.getSelectedRow();  
        TableModel model_1 = Table_cotisation_enseignant.getModel();
        String id = model_1.getValueAt(index, 3).toString();
        try{
        
           // String report="C:\\Users\\MZI System\\Documents\\NetBeansProjects\\JavaApplication1\\src\\School\\Emploi_de_temps_Enseignant.jrxml";
          JasperDesign jd=JRXmlLoader.load("C:\\Users\\MOHAMED\\Documents\\NetBeansProjects\\school0.1\\src\\Raport\\Reception_Cotisation_Enseignant.jrxml");
           
        String Query="SELECT EN.`Nom_Enseignant`,G.`Nom_Groupe`,M.`Nom_Module`,P.`Num_Payment`, P.`Date_Payment`, P.`Montant_Payment`, P.`Num_Enseignant` ,P.Montant_du,COUNT(R.`Num_Etudient`) ,((COUNT(R.`Num_Etudient`)*M.`prix`*EN.`prosontage`)/100)AS SALIRE FROM `reservation` R,`groupe`G,`etudient`E ,`enseignant`EN ,`module`M ,`payment_enseignant` P WHERE E.`Num_Etudient`=R.`Num_Etudient` AND G.`Num_Groupe`=R.`Num_Groupe` AND EN.`Num_Enseignant`=G.`Num_Enseignant` AND M.`Num_Module`=G.`Num_Module` AND EN.`Num_Enseignant`=P.`Num_Enseignant` AND P.`Num_Payment`='"+id+"' GROUP BY R.`Num_Groupe`;";   
         //  prepared.setString(1, id);
           JRDesignQuery newQuery = new JRDesignQuery();
           newQuery.setText(Query);
           jd.setQuery(newQuery);
           JasperReport jr=JasperCompileManager.compileReport(jd);
           JasperPrint jp=JasperFillManager.fillReport(jr,null,cnx);
           JasperViewer.viewReport(jp,false);
            
            
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, e);
        
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        // TODO add your handling code here:
              
        try{
        
            String report="C:\\Users\\MOHAMED\\Documents\\NetBeansProjects\\school0.1\\src\\Raport\\Emploi_de_temps_0.2.jrxml";
            JasperReport jr=JasperCompileManager.compileReport(report);
            JasperPrint jp=JasperFillManager.fillReport(jr,null,cnx);
            JasperViewer.viewReport(jp, false);
            
            
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, e);
        
        }
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
      logo();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void ajote_nuveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajote_nuveActionPerformed
  ajoute_niuve ens=new ajoute_niuve();
        ens.setVisible(true);
        ens.setLocationRelativeTo(null);
        ens.pack();
        ens.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
    }//GEN-LAST:event_ajote_nuveActionPerformed

    private void suprime_niiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suprime_niiveActionPerformed
        
    }//GEN-LAST:event_suprime_niiveActionPerformed

    private void suprime_moudelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suprime_moudelActionPerformed
     int  row=tabel_modell.getSelectedRow();

        String clle= (String)tabel_modell.getModel().getValueAt(row, 2);
        System.out.println(clle);
        String sql ="DELETE FROM `module` WHERE `Nom_Module`=?";
      try {
            perpar=  login.cnx.prepareStatement(sql);
            perpar.setString(1, clle);
            perpar.executeUpdate();

        } catch (Exception e) {
              JOptionPane.showMessageDialog(rootPane, e);
        }
        DefaultTableModel model = (DefaultTableModel) tabel_modell.getModel();
        model.removeRow(row);
    }//GEN-LAST:event_suprime_moudelActionPerformed

    private void serch_groupsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch_groupsKeyReleased
        Serch(serch_groups.getText(), Table_Groupe);    
    }//GEN-LAST:event_serch_groupsKeyReleased

    private void serch_abcebt_and_pesencKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch_abcebt_and_pesencKeyReleased
     Serch(serch_abcebt_and_pesenc.getText(), Table_PRESENCE_ABSENCE);    
    }//GEN-LAST:event_serch_abcebt_and_pesencKeyReleased

    private void suprime_niive1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suprime_niive1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suprime_niive1ActionPerformed
 private boolean checkEmptyFields(){
       
         return(txt_Num_Enseignant.getText().equals("") || txt_Nom_Enseignant.getText().equals("")||txt_Prenom_Enseignant.getText().equals("") || txt_addres_Ens.getText().equals("")||txt_Telephone.getText().equals("") || txt_prosontage.getText().equals("")||txt_Email_Ens.getText().equals("")/* || date_naissence_Ens.getDate().equals("")*/ );
}
 
    
          public  void tabel_étudiants13( JTable tabel)
    {
        //يعرض جدول الاساتذة
        try {
            String sql="SELECT * FROM `etudient`";
            perpar=  login.cnx.prepareStatement(sql);
            result = perpar.executeQuery();
            DefaultTableModel model=( DefaultTableModel)tabel.getModel();
            tabel.setColumnSelectionAllowed(false);
            tabel.getTableHeader().setReorderingAllowed(false);
            while(result.next()){
            model.addRow(new String[]{result.getString(10),result.getString(9),result.getString(8),result.getString(7),result.getString(6),result.getString(5),result.getString(4),result.getString(3),result.getString(2),result.getString(1)});
                                }
            } catch (Exception e) {
                                  }
        tabel.setDefaultEditor(Object.class, null);
        
                    }
          private void Serch(String a,JTable b){
               DefaultTableModel model=( DefaultTableModel)b.getModel();
               TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
               b.setRowSorter(trs);
               trs.setRowFilter(RowFilter.regexFilter(a));
          }
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
                          private void tabel_Ens(JTable tabel)
    {
        //يعرض جدول الاساتذة
        try {
            String sql="SELECT * FROM `enseignant`";
            perpar=  login.cnx.prepareStatement(sql);
            result = perpar.executeQuery();
            DefaultTableModel model=( DefaultTableModel)tabel.getModel();
            tabel.setColumnSelectionAllowed(false);
            tabel.getTableHeader().setReorderingAllowed(false);
            while(result.next()){
            model.addRow(new String[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8)});
                                }
            } catch (Exception e) {
                                  }
         tabel.setDefaultEditor(Object.class, null);
                    }
                          
                           private void Combobox_recherche_module (JComboBox recherche_module ){
          String sql="SELECT * FROM `module` ";

   
         try {
             perpar=  login.cnx.prepareStatement(sql);
             ResultSet rs=  perpar.executeQuery();
          
             while(rs.next()){
             recherche_module.addItem(rs.getString(2));
             }
         } catch (Exception e) {
         }
}
                            public static void AddRo_ens(Object[]dataRow){
         DefaultTableModel module=(DefaultTableModel)Table_Enseignant.getModel();
         module.addRow(dataRow);
  }
                            
                            public static void AddRo_Etudent(Object[]dataRow){
         DefaultTableModel module=(DefaultTableModel)tabel_étudiants.getModel();
         module.addRow(dataRow);
  }
                            
                            
                            public static void AddRo_payment_Eanseignant(Object[]dataRow){
         DefaultTableModel module=(DefaultTableModel)Table_cotisation_enseignant.getModel();
         module.addRow(dataRow);
  }
                             public static void ADDSALL (Object[]dataRow){
         //تعمل تحديث للجدول
        DefaultTableModel module=(DefaultTableModel)tabel_sall.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
          int row=tabel_sall.getSelectedRow(); 
  }
                             public static void ADDSEICE (Object[]dataRow){
         //تعمل تحديث للجدول
        DefaultTableModel module=(DefaultTableModel)tabel_Sincer.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
          int row=tabel_Sincer.getSelectedRow(); 
  }
                             
      private void tabel_Sall()
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
      
      
      
       private void tabel_sienc()
    {
        try {
         
           String sql="SELECT* FROM `sience`";
             perpar=  login.cnx.prepareStatement(sql);
    
      result = perpar.executeQuery();
        
     DefaultTableModel model=( DefaultTableModel)tabel_Sincer.getModel();
      tabel_Sincer.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      tabel_Sincer.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاعمدة
     
   while(result.next()){
   model.addRow(new String[]{result.getString(1),result.getString(2)});
   }
        } catch (Exception e) {
        }
        tabel_Sincer.setDefaultEditor(Object.class, null);
    }        
   
               
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
            private void statistic_fonction(){
                
                
                String sql1="SELECT SUM(SALIRE_total) FROM( SELECT `Nom_Enseignant`,SUM(SALIRE) AS SALIRE_total FROM( SELECT EN.`Nom_Enseignant`,G.`Nom_Groupe` , ((COUNT(R.`Num_Etudient`)*M.`prix`*EN.`prosontage`)/100)AS SALIRE FROM `reservation` R,`groupe`G,`etudient`E ,`enseignant`EN ,`module`M WHERE E.`Num_Etudient`=R.`Num_Etudient` AND G.`Num_Groupe`=R.`Num_Groupe` AND EN.`Num_Enseignant`=G.`Num_Enseignant` AND M.`Num_Module`=G.`Num_Module` GROUP BY R.`Num_Groupe`)AS Table_intermedier_1 GROUP BY `Nom_Enseignant`) AS Table_intermedier_2";
            String sql2="SELECT SUM(Montant_groupe) FROM( SELECT G.`Nom_Groupe` ,COUNT(R.`Num_Etudient`) ,(COUNT(R.`Num_Etudient`)*M.`prix`)AS Montant_groupe FROM `reservation` R,`groupe`G,`etudient`E ,`module`M WHERE E.`Num_Etudient`=R.`Num_Etudient` AND G.`Num_Groupe`=R.`Num_Groupe` AND M.`Num_Module`=G.`Num_Module` GROUP BY R.`Num_Groupe`) AS Table_intermedier_1";
              Nomber_model(number_ensingent,"SELECT COUNT(*) FROM `enseignant`");//عد الاساتذة
         Nomber_model(nomer_model,"SELECT COUNT(*) FROM `module`");//عدد المواد
         Nomber_model(Nomber_sall1,"SELECT COUNT(*) FROM`groupe`");//عدد الافواج
         Nomber_model(Nomber_sall,"SELECT COUNT(*) FROM`salle`");//عدد القاعات
         Nomber_model(  total_payment,"SELECT SUM(`Montant_payment`) FROM`payment`");//المدخول الكلي
           Nomber_model(  nombre_d_élève,"SELECT COUNT(*) FROM `etudient`");//المدخول التلاميذ
                Nomber_model(total_payment_ensigent, sql1);
                 Nomber_model(total_payment, sql2);
          String total_pai=total_payment.getText();//الدخل الاجمالي للمدرسة
          String total_pai_ensingent=total_payment_ensigent.getText();//اجمالي دخل الاساتذة
           float a=Float.parseFloat(total_pai);
           float b=Float.parseFloat(total_pai_ensingent);
           a=a-b;//صافي الدخل الكلي 
           revenu_net.setText(a+"");
            
            }
            private void affichier_enseignant_in_combobox(JComboBox eb){
            
            String sql="SELECT * FROM `enseignant` ";

   
         try {
             perpar=  login.cnx.prepareStatement(sql);
             ResultSet rs=  perpar.executeQuery();
          
             while(rs.next()){
             eb.addItem(rs.getString(2));
             }
         } catch (Exception e) {
         }
            
            
            }
            
   
      private void Salle_combobox(){
    
    String sql="SELECT * FROM `salle` ";

   
        try {
            perpar=  login.cnx.prepareStatement(sql);
            ResultSet rs=  perpar.executeQuery();
          
            while(rs.next()){
            ComboBox_ENS_Mod_Sall.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }
      
      /**
	 * Utility method to send simple HTML email
	 * @param session
	 * @param toEmail
	 * @param subject
	 * @param body
	 */
      private void as(){
      

// TODO add your handling code here:
String ToEmail = "m.mi@laghz";
String FromEmail = "m.beniou.dz";//studyviral2@gmail.com
String FromEmailPassword = "19hhoh";//You email Password from you want to send email
String Subjects = "jjj";
Properties properties = new Properties();
properties.put("mail.smtp.auth","true");
properties.put("mail.smtp.starttls.enable","true");
properties.put("mail.smtp.host","smtp.gmail.com");
properties.put("mail.smtp.port","25");
 Session session = Session.getInstance(properties,
         new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
               return new javax.mail.PasswordAuthentication(FromEmail, FromEmailPassword);
            }
         });

/*Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication(){
return new PasswordAuthentication(FromEmail, FromEmailPassword);
}
});*/
try{
MimeMessage message = new MimeMessage(session);
message.setFrom(new InternetAddress(FromEmail));
message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
message.setSubject(Subjects);
message.setText("jjl");
System.out.println("tama");
Transport.send(message);
    System.out.println("tama");
}catch(Exception ex){
System.out.println(""+ex);
}
      
      
      }
	private void sendEmail(){
		 boolean isSent = true;
        try {
            //Properties properties = new Properties();
            Properties properties = System.getProperties();
           // properties.setProperty("mail.smtp.submitter", contactUs.getMailField().getText());
            //properties.setProperty("mail.smtp.auth", "false");
            properties.setProperty("mail.smtp.host", "localhost");
            //properties.put("mail.smtp.user", txtfrom.getText());
            //properties.put("mail.smtp.port", txtPort.getText());
            //properties.put("mail.smtp.socketFactory.port", txtPort.getText());
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            properties.put("mail.smtp.socketFactory.fallback", "false");

            //Authenticator mailAuthenticator = new MailAuthenticator();
            Session mailSession = Session.getDefaultInstance(properties);
            Message message = new MimeMessage(mailSession);

            InternetAddress fromAddress = new InternetAddress("mmoh89042@gmail.com");
            InternetAddress toAddress = new InternetAddress("mmoh89042@gmail.com");

            message.setFrom(fromAddress);
            message.setRecipient(Message.RecipientType.TO, toAddress);
            message.setSubject("jj");
            message.setText("ll");
            System.out.println("rr1");
            Transport.send(message);
            System.out.println("ee");
        } catch (Exception ex) {
          
            isSent = false;
        }
        if (isSent == true) {
            System.out.println("erore");
        }
	}
      
       public boolean sendEmail(String to, String from, String subject, String text) {
        boolean flag = false;

        //logic
        //smtp properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "535");
        properties.put("mail.smtp.host", "smtp.gmail.com");

        String username = "mmoh89042@gmail.com";
        String password = "bac2020mt";


        //session
         Session session = Session.getInstance(properties,
         new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
               return new javax.mail.PasswordAuthentication(username, password);
            }
         });

        try {

            Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setFrom(new InternetAddress(from));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return flag;
    }
       
        private void ComboBox_groupe_chooser(){
    
      String sql="SELECT * FROM `groupe` ";

   
         try {
             perpar=  login.cnx.prepareStatement(sql);
             ResultSet rs=  perpar.executeQuery();
          
             while(rs.next()){
             ComboBox_groupe_chooser.addItem(rs.getString(2));
             }
         } catch (Exception e) {
         }
     }
         public static void ADDelev (Object[]dataRow){
         //تعمل تحديث للجدول
        DefaultTableModel module=(DefaultTableModel)tabel_étudiants.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
          int row=tabel_étudiants.getSelectedRow(); 
  }
           
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
                          nameSchool .setText(resultt);
                       logo.setIcon(new ImageIcon(scaledImage));

             }

        } catch (Exception e) {
        }
   
        }
       public void tabel_nuve()
    {
        try {
         
            String sql="SELECT * FROM `niveau` ";
             perpar=  login.cnx.prepareStatement(sql);
    
      result = perpar.executeQuery();
        
     DefaultTableModel model=( DefaultTableModel)Tabel_nive.getModel();
      Tabel_nive.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      Tabel_nive.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاعمدة
     
   while(result.next()){
   model.addRow(new String[]{result.getString(2),result.getString(1)});
   }
        } catch (Exception e) {
        }
        Tabel_nive.setDefaultEditor(Object.class, null);
    }
         public void tabel_Model()
    {
        try {
         
            String sql="SELECT  m.Nom_Module, m.prix, n.Nom_niveau\n" +
"FROM Module m\n" +
"JOIN Niveau n ON m.Num_niveau = n.Num_niveau";
             perpar=  login.cnx.prepareStatement(sql);
    
      result = perpar.executeQuery();
        
     DefaultTableModel model=( DefaultTableModel)tabel_modell.getModel();
      tabel_modell.setColumnSelectionAllowed(false);// هذون بش ميتحركوش الاعمدة
      tabel_modell.getTableHeader().setReorderingAllowed(false);// بش ميتحركوش الاعمدة
     
   while(result.next()){
   model.addRow(new String[]{result.getString(3),result.getString(2),result.getString(1)});
   }
        } catch (Exception e) {
        }
        tabel_modell.setDefaultEditor(Object.class, null);
    }
       
       public static void AddRowtoJTable(Object[]dataRow){
         //تعمل تحديث للجدول
        DefaultTableModel module=(DefaultTableModel)tabel_modell.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
          int row=tabel_modell.getSelectedRow(); 
  }
      public static void AddRowt(Object[]dataRow){
         //تعمل تحديث للجدول
        DefaultTableModel module=(DefaultTableModel)Tabel_nive.getModel();
         module.addRow(dataRow);
         add_model add=new add_model();
          int row=Tabel_nive.getSelectedRow(); 
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
     private void presence_absence(String Etat){
    
    
         DefaultTableModel model1=( DefaultTableModel)Table_PRESENCE_ABSENCE.getModel();
          int index = Table_PRESENCE_ABSENCE.getSelectedRow();
        TableModel model = Table_PRESENCE_ABSENCE.getModel();
       // String Etat ="غائب";
        String nom_groupe = model.getValueAt(index, 0).toString();
        String Science = model.getValueAt(index, 2).toString();
        String jeur= model.getValueAt(index, 3).toString();
        String Date= model.getValueAt(index, 4).toString();
        String prenom_Etudient= model.getValueAt(index, 5).toString();
        String nom_Etudient= model.getValueAt(index, 6).toString();
        String num_Etudient= model.getValueAt(index, 7).toString();
        String Num_Reservation = model.getValueAt(index, 8).toString();
        
         date=day_chooser.getDate();
       sqldate=new java.sql.Date(date.getTime());
        
         
        String sql= "INSERT INTO `presence_absence_etudient`(`Date_pre_abs`, `jeur`, `Horaire`, `Etat`, `Num_Reservation`) VALUES (?,?,?,?,?)";
           
            try {

                perpar=  login.cnx.prepareStatement(sql);
                 
                perpar.setDate(1, sqldate);

                perpar.setString(2,jeur);

               perpar.setString(3,Science);
               perpar.setString(4,Etat);
               perpar.setString(5,Num_Reservation);
                
                perpar.execute();

     

            } catch ( Exception e) {
                JOptionPane.showMessageDialog(null,e+ "NO");

            }
             model1.addRow(new Object[]{nom_groupe,Etat,Science,jeur,Date,prenom_Etudient,nom_Etudient,num_Etudient,Num_Reservation});
             model1.removeRow(index);
    
    
    
    }
     private void Cours_Aujourdhui(){
         
              LocalDate today = LocalDate.now();
    Locale arabicLocale=new Locale("ar");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE").withLocale(arabicLocale);
    String dayname=today.format(formatter);
     String jeur="الجمعة";
                
               
             
         try {
           String sql="SELECT AGS.`jour`, AGS.`Heure_debut`, G.`Nom_Groupe`,S.`Nom_Salle`,\n" +
                      "E.`Nom_Enseignant`,M.`Nom_Module` \n" +
                      "FROM `affectation_groupe_sciene` AGS,`groupe` G ,`salle` S ,\n" +
                      "`enseignant` E,`module` M \n" +
                      "WHERE G.`Num_Groupe`=AGS.`Num_Groupe` \n" +
                      "AND S.`Nom_Salle`=G.`Nom_Salle` \n" +
                      "AND E.`Num_Enseignant`=G.`Num_Enseignant` \n" +
                      "AND M.`Num_Module`=G.`Num_Module` \n" +
                      "AND AGS.`jour`=?\n" +
                      "ORDER BY AGS.`Heure_debut`";
                    
             perpar=  login.cnx.prepareStatement(sql);
             perpar.setString(1, jeur);
             result = perpar.executeQuery();
        
     DefaultTableModel model=( DefaultTableModel)Table_SCIENCE_HOJORDUI.getModel();
     
   while(result.next()){
   model.addRow(new String[]{result.getString(5),result.getString(6),result.getString(4),result.getString(3),result.getString(2),result.getString(1)});
   }
        } catch (Exception e) {
        }
         
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter_une_salle;
    private javax.swing.JComboBox<String> ComboBox_ENS_Mod_Sall;
    private javax.swing.JComboBox<String> ComboBox_choix;
    private javax.swing.JComboBox<String> ComboBox_day_chooser;
    private javax.swing.JComboBox<String> ComboBox_groupe_chooser;
    private javax.swing.JComboBox<String> ComboBox_recherche_Enseignant;
    private javax.swing.JComboBox<String> ComboBox_recherche_module;
    private javax.swing.JComboBox<String> ComboBox_science_chooser;
    private javax.swing.JLabel Email_Alwali;
    private javax.swing.JLabel Email_Elev;
    private javax.swing.JPanel LIneEtdentCALCul;
    private javax.swing.JLabel Montant_groupe;
    private javax.swing.JLabel Nember_Etudient_en_groupe;
    private javax.swing.JLabel Nom_alwali;
    private javax.swing.JLabel Nom_elev;
    private javax.swing.JLabel Nomber_sall;
    private javax.swing.JLabel Nomber_sall1;
    private javax.swing.JPanel Panel_presence_absence_Etudient;
    private javax.swing.JLabel Phon_elev;
    private javax.swing.JPanel Sittins;
    private javax.swing.JPanel Sttings;
    private javax.swing.JPanel Student_accounts;
    private javax.swing.JPanel Student_data;
    public javax.swing.JButton Suprime_sience;
    public static javax.swing.JTable Tabel_Since_Groupe;
    public static javax.swing.JTable Tabel_nive;
    public static javax.swing.JTable Table_Enseignant;
    public static javax.swing.JTable Table_Enseignant2;
    public static javax.swing.JTable Table_Enseignant3;
    public static javax.swing.JTable Table_Groupe;
    private javax.swing.JTable Table_PRESENCE_ABSENCE;
    public static javax.swing.JTable Table_RESERVATION3;
    private javax.swing.JTable Table_SCIENCE_HOJORDUI;
    public static javax.swing.JTable Table_cotisation_enseignant;
    public static javax.swing.JTable Table_montant_enseignant;
    private javax.swing.JTable Table_payment3;
    private javax.swing.JButton ajote_nuve;
    private javax.swing.JButton ajoute_etude;
    private javax.swing.JButton ajoute_model;
    private javax.swing.JButton ajoute_siunce;
    private javax.swing.JPanel alwali_elev;
    private javax.swing.JPanel baynat_atolab;
    private javax.swing.JButton btn_Supprimer_Enseignant;
    private javax.swing.JButton btn_ajouter_Enseignant;
    private javax.swing.JButton btn_imprimier_Emploi_temps;
    private javax.swing.JButton btn_modifier_Enseignant;
    private com.toedter.calendar.JDateChooser date_naissence_Ens;
    private com.toedter.calendar.JDateChooser day_chooser;
    private javax.swing.JPanel elev_alwali;
    private javax.swing.JPanel encinet;
    private javax.swing.JPanel ensinet_data;
    private javax.swing.JTextField erch_etudent1;
    private javax.swing.JTextField erch_etudent2;
    private javax.swing.JTextField erch_etudent3;
    private javax.swing.JPanel groups;
    private javax.swing.JPanel hisabat_encinet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    public javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_total_montant_enseignant;
    private javax.swing.JPanel leschent;
    private javax.swing.JPanel linatatisic;
    private javax.swing.JPanel lineEtudentData;
    private javax.swing.JPanel lingroups;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel mostahakat_alastida;
    private javax.swing.JLabel nameSchool;
    private javax.swing.JLabel nombre_d_élève;
    private javax.swing.JLabel nomer_model;
    private javax.swing.JLabel number_ensingent;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelLIne;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrencipal;
    private javax.swing.JPanel panel_Home;
    private javax.swing.JPanel panel_line_Home;
    private javax.swing.JPanel panel_telcom;
    private javax.swing.JPanel paneldataensient;
    private javax.swing.JPanel panellTelcom;
    private javax.swing.JPanel pannel_presence_absent_elev;
    private javax.swing.JLabel phon_Alwali;
    private javax.swing.JLabel revenu_net;
    private javax.swing.JComboBox<String> seerch;
    private javax.swing.JTextField serch_abcebt_and_pesenc;
    private javax.swing.JTextField serch_groups;
    private javax.swing.JTextField serchseince;
    private javax.swing.JPanel statistic;
    private javax.swing.JButton supprimer_salle;
    private javax.swing.JButton suprime_moudel;
    private javax.swing.JButton suprime_niive;
    private javax.swing.JButton suprime_niive1;
    public static javax.swing.JTable tabel_Sincer;
    public static javax.swing.JTable tabel_modell;
    public static javax.swing.JTable tabel_sall;
    public static javax.swing.JTable tabel_étudiants;
    public static javax.swing.JTable tabel_étudiants1;
    public static javax.swing.JTable table_reservation;
    private javax.swing.JPanel telcomElev;
    private javax.swing.JPanel telcomEncinet;
    private javax.swing.JPanel telcom_chong;
    private javax.swing.JLabel total_payment;
    private javax.swing.JLabel total_payment_ensigent;
    private javax.swing.JTextField txt_Email_Ens;
    public static javax.swing.JTextField txt_Nom_Enseignant;
    public static javax.swing.JTextField txt_Num_Enseignant;
    private javax.swing.JTextField txt_Prenom_Enseignant;
    private javax.swing.JTextField txt_Telephone;
    private javax.swing.JTextField txt_addres_Ens;
    private javax.swing.JTextField txt_prosontage;
    // End of variables declaration//GEN-END:variables
}
