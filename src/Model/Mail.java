/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nicolasreyalonso
 */
public class Mail {
    private String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        String regex = "@([[a-zA-Z]{2}.]+).*[a-zA-Z]+";
        Pattern pat = Pattern.compile(regex);
        Matcher a = pat.matcher(mail);
        String toRet = "";
        if (a.find()){
            toRet = a.group(1);
        }
    
        return toRet;
    }
    
    
}
