package br.edu.ifsul.bcc.too.topico3.respostas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

/**
 *
 * @author 20222PF.CC0019
 * https://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 */
public class TesteDatas  {

    private Calendar dataCalendar; // ATRIBUTO DA INSTÂNCIA

    private Date dataDate;

    private SimpleDateFormat formatador;

    public TesteDatas() { //CONSTRUTOR

        System.out.println("Teste com datas::");

        dataCalendar = Calendar.getInstance(); // INICIALIZAÇÃO DE UM  CALENDAR

        dataCalendar.set(Calendar.DAY_OF_MONTH, 12); // ALTERA DATA
        dataCalendar.set(Calendar.YEAR, 1983);
        dataCalendar.set(Calendar.MONTH, 0); //JANEIRO INDICE 0 - DEZEMBRO INDICE 11

        formatador = new SimpleDateFormat("dd/MM/yyyy"); //INICIALIZA E DEFINE O FORMATA        

        String data_formatada = formatador.format(dataCalendar.getTime()); //FORMATA

        System.out.println(data_formatada);//IMPRIME A DATA FORMATADA

        System.out.println("Data em milisegundos: " + dataCalendar.getTimeInMillis());
        
        

        dataDate = new Date(); //INICIALIZAÇÃO DO ATRIBUTO

        System.out.println(dataDate);

        data_formatada = formatador.format(dataDate); //FORMATA

        System.out.println("Data_formatada (java.util.Date) :" + data_formatada);
        System.out.println("data java.util.Date em milis: " + dataDate.getTime());
        
        
        
        
        

        //EXERCICIO 1: IMPRIMIR A DIFERENÇA EM MILIS E DIAS ENTRE dataDate e dataCalendar
        long miliCalendar = dataCalendar.getTimeInMillis();
        long miliDate = dataDate.getTime();

        long diferenca = miliDate - miliCalendar;

        System.out.println("Diferença em milis entre dataDate - dataCalendar: " + diferenca);

        miliCalendar = miliCalendar / 86400000L;
        miliDate = miliDate / 86400000L;

        System.out.println("dataCalendar Dias: " + miliCalendar);
        System.out.println("dataDate Dias: " + miliDate);

        System.out.println("Diferença de dias de dataDate(2023) - dataCalendar (1983): " + (miliDate - miliCalendar));
                        
        

        // EXERCICIO 2: UTILIZAR O MÉTODO COMPARETO DA CLASSE Calendar para testar duas datas e explicar os retornos -1, 0, 1
        System.out.println("Data Maior   - retorno 1: " + dataDate.compareTo(dataCalendar.getTime()));
        System.out.println("Datas Iguais - retorno 0: " + dataDate.compareTo(dataDate));
        
        //System.out.println("Data Menor - retorno -1: "+ dataCalendar.compareTo(dataDate));
        //converter de java.util.date para java.util.Calendar
               
        

        //EXERCICIO 3: CONVERTER A STRING "25/09/1983" PARA java.util.Calendar
        
        
        
        try {
            // Parse a string para um objeto Date
            Date dt = formatador.parse("25/09/1983");

            // Crie um objeto Calendar
            Calendar calendar_date = Calendar.getInstance();

            // Defina a data no objeto Calendar
            calendar_date.setTime(dt);

            // Agora você tem a data em formato Calendar
            System.out.println("Data em formato Calendar: " + calendar_date.getTime());
        } catch (ParseException e) {
            // Trate exceções de análise aqui, como ParseException
            System.out.println("Erro");
        }
       

        
        
        //EXERCICIO 4: CONVERTER A STRING "25/09/1983" PARA java.util.Date
        
        try {
            // Parse a string para um objeto Date
            Date data2 = formatador.parse("25/09/1983");

            // Agora você tem a data em formato Date
            
            System.out.println("Data em formato Date: " + data2);
            
            
        } catch (ParseException e) {
            // Trate exceções de análise aqui, como ParseException
           
        }   
            
    }

    public static void main(String[] args) throws ParseException{

        new TesteDatas(); //CRIAÇÃO DA INSTANCIA
    }

}
