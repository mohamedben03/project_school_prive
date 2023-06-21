package classes;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MZI System
 */
public class DBConnexion {
     static String username ="root";
    static String password="";
    static String Con_string="jdbc:mysql://localhost/school0.1?useUnicode=yes&characterEncoding=UTF-8";
    
    
    static Connection con=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(Con_string,username,password);
            System.out.println("Connected");
            return con;
       
    }
     catch(Exception  e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }   
    }

    
    
}
