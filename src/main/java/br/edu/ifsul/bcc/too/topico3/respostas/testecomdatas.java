/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico3.respostas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Scopel
 * 
 * https://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
 */
public class testecomdatas {
    
     private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     private Calendar cal = Calendar.getInstance();
     private Calendar cal2 = Calendar.getInstance();
    
    
    public testecomdatas() {
        
        manipulaDatas();
        
    
}
    
    private void manipulaDatas(){
        
         try {
             cal.setTime(sdf.parse("01/01/2023"));
             
         } catch (ParseException ex) {
             System.out.println("Erro ao converter");
         }
         
         System.out.println(sdf.format(cal.getTime())); // IMPRIME A DATA DO FORMATO DESEJADO
         System.out.println(sdf.format(cal2.getTime())); // IMPRIME A DATA DO FORMATO DESEJADO]
         
         long milical = cal.getTimeInMillis();
         long milical2 = cal2.getTimeInMillis();
         
         System.out.println(milical);
         System.out.println(milical2);
         
         long diferenca = milical2 - milical;
         
         System.out.println("Diferença em dias das 2 datas: "+ diferenca / (1000*60*60*24));
        
    }
    
    
    
    
    
    
    
    public static void main(String args[]){
        
        new testecomdatas();

}
}



