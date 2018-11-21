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
import java.util.List;

/**
 *
 * @author nicolasreyalonso
 */
public class Kata5P2 {
    private static String fileName = "/Users/nicolasreyalonso/NetBeansProjects/kata4/email.txt";
    private static List <Mail> a;
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
        a = MailListReader.read(fileName); 
    }
    public static void process(){
        b = MailHistogramBuilder.build(a);
    }
    public static void output(){
        HistogramDisplay hist = new HistogramDisplay(b);
        hist.execute();
    }
}
