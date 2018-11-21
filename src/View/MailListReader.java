/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Mail;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicolasreyalonso
 */
public class MailListReader{
    public static List<Mail>read(String fileName){
        List<Mail> toRet = new ArrayList<Mail>();
        File b = new File(fileName);
       
        try{
        Scanner a = new Scanner(b);
        String c = "";
        while(a.hasNextLine()){
            c = a.nextLine();
            if(!c.equals("")){
                toRet.add(new Mail(c));
            }
        }
        
        }catch(Exception e){
            System.out.print("File not Found");
        }
        
        
        
        return toRet;
    }
}
