/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;
import View.MailListReaderDB;
import java.util.List;

/**
 *
 * @author nicolasreyalonso
 */
public class Kata5P2 {
    private static String URL = "/Users/nicolasreyalonso/NetBeansProjects/kata5P1/mail.db";
    private static String sql = "SELECT direccion FROM email";
    private static List <String> a;
    private static Histogram<String> b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        execute();
        
        
    }
    public static void execute(){
    input();
    process();
    output();

    }
    public static void input(){
        a = MailListReaderDB.read(URL, sql); 
    }
    public static void process(){
        b = MailHistogramBuilder.buildSt(a);
    }
    public static void output(){
        HistogramDisplay hist = new HistogramDisplay(b);
        hist.execute();
    }
}
