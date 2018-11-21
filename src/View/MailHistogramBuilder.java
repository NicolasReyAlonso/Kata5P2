/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Histogram;
import Model.Mail;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nicolasreyalonso
 */
public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> a){
        Histogram <String> toRet = new Histogram();
        Iterator x = a.iterator();
        Mail c;
        while(x.hasNext()){
            c = (Mail) x.next();
            toRet.increment(c.getDomain());
        }
        return toRet;
    }
}
