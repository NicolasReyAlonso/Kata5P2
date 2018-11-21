/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Mail;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicolasreyalonso
 */
public class MailListReaderDB {
    public static List<String>read(String URL, String sql){
        List<String> toRet = new ArrayList<>();     
        try(Connection con = DriverManager.getConnection("jdbc:sqlite:"+URL); 
            Statement stmt = con.createStatement(); 
            ResultSet rs = stmt.executeQuery(sql)){
        String c = "";
        while(rs.next()){
            c = rs.getString(1);
            toRet.add(c);
            
        }
        
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        
        
        return toRet;
    }
}
