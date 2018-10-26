package Kata4.view;

import kata4.model.*;
import java.util.List;
import Kata4.model.Histogram;
import Kata4.model.Mail;
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histo = new Histogram<>();
        
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain());
        }
        
        return histo;
    }   
}
