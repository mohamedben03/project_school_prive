/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Main.Main;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static school0.PRINCIPAL.tabel_en;
import school0.pkg1.login;

/**
 *
 * @author MOHAMED
 */
public class fonction {
     java.util.Date date;
    java.sql.Date sqldate;
      PreparedStatement perpar;
    ResultSet result;
    
     public void tabel_Ens()
    {
        
        
        
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
    
        }
    
    public static boolean checkEmptyFields(){
        Main main=new Main();
         return(main.txt_Num_Enseignant.getText().equals("") || main.txt_Nom_Enseignant.getText().equals("") );
}
    
}
