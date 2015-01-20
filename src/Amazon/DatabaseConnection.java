package Amazon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class DatabaseConnection {
       
    
    public static void main (String []args) {
        LoginPage.main(args);
        new DatabaseConnection();
        
        
        
       
    }
    DatabaseConnection(){
        try{
        String host ="jdbc:derby://localhost:1527/am_login";
        String username= "adm";
        String password= "adm";
        Connection con = DriverManager.getConnection(host, username, password);
        
        Statement st = con.createStatement();
        String sql = "SELECT * from LOGIN";
        ResultSet rs = st.executeQuery(sql);
        
        

        

        
        
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }   
}


