
package br.edu.ifsul.bcc.too.topico3.respostas;

/**
 *
 * @author telmo
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class Exercicio8 {
    
    private SimpleDateFormat formatador;
    private SimpleDateFormat formatador2;
    
    /*
     8. Codifique um método na classe Exercicio8 para criar e inicializar cinco 
        objetos do tipo Compra com as seguintes informações.
    
        Código 1, emissão:  15/10/2020 15:39:00 100, saída 15/10/2020 17:20
    
        Código 2, emissão:  16/10/2019 10:39:00 150, saída 16/10/2020 10:59
 
        Código 3, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 00:25
 
        Código 4, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 01:25
 
        Código 5, emissão:  31/12/2020 23:55:00 050, saída 01/01/2021 00:33
 
    
        Adicionar os objetos em uma coleção. Após, percorrer e analisar a lista
        para localizar os seguintes objetos/informações:
        
            1) Data de emissão de compra mais recente.
            2) Data de saída mais antiga.
            3) Compra com maior tempo em relação a emissão e a saída.
    */
    
    public Exercicio8(){
        
        resposta8();
    }
    
    private void resposta8(){
        
        List<Compra> listCompras = new ArrayList();
        
        formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS");        
        formatador2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");        
        
        try {
            
            Calendar emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("15/10/2020 15:39:00 100").getTime());
            
            Compra cp = new Compra(1, emissao, new java.util.Date(formatador2.parse("15/10/2020 17:20:00").getTime()));
            
            listCompras.add(cp);
            
            
            emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("16/10/2019 10:39:00 150").getTime());
            
            cp = new Compra(2, emissao, new java.util.Date(formatador2.parse("16/10/2020 10:59:00").getTime()));
            
            listCompras.add(cp);
            
            
            emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("17/10/2020 23:00:00 090").getTime());
            
            cp = new Compra(3, emissao, new java.util.Date(formatador2.parse("18/10/2020 00:25:00").getTime()));
            
            listCompras.add(cp);
            
            
            emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("17/10/2020 23:00:00 090").getTime());
            
            cp = new Compra(4, emissao, new java.util.Date(formatador2.parse("18/10/2020 01:25:00").getTime()));
            
            listCompras.add(cp);
            
            
            emissao = Calendar.getInstance();
            emissao.setTimeInMillis(formatador.parse("31/12/2020 23:55:00 050").getTime());
            
            cp = new Compra(5, emissao, new java.util.Date(formatador2.parse("01/01/2021 00:33:00").getTime()));
            
            listCompras.add(cp);
                        
            
            Compra cpr_emissao_recente = listCompras.get(0);
            Compra cpr_saida_antiga = listCompras.get(0);
            Compra cpr_compra_dif = listCompras.get(0);
            
            
            for(Compra cpr : listCompras){
                
                if(cpr.emissao.getTimeInMillis() > cpr_emissao_recente.emissao.getTimeInMillis()){
                    cpr_emissao_recente = cpr;
                }
                
                if(cpr.saida.getTime() < cpr_saida_antiga.saida.getTime()){
                    cpr_saida_antiga = cpr;
                }
                
                if((cpr_compra_dif.emissao.getTimeInMillis() - cpr_compra_dif.saida.getTime()) > (cpr.emissao.getTimeInMillis() - cpr.saida.getTime())){
                
                    cpr_compra_dif = cpr;
                }
                
            }
            System.out.println("Emissao mais recente código: "+ cpr_emissao_recente.codigo + " Data: " + formatador.format(cpr_emissao_recente.emissao.getTime()));
            System.out.println("Saida mais antiga código: " + cpr_saida_antiga.codigo+ " Data: " +formatador2.format(cpr_saida_antiga.saida.getTime()));
            System.out.println("Maior diferença código: "+cpr_compra_dif.codigo);
            
            
        } catch (ParseException ex) {
            
            ex.printStackTrace();
        }
        
    }
     
    
    public static void main(String args[]){
        
        new Exercicio8();
    }
 
  
}