
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

class Compra {
    private int codigo;
    private Date emissao;
    private Date saida;
    private int quantidade;

    public Compra(int codigo, Date emissao, Date saida, int quantidade) {
        this.codigo = codigo;
        this.emissao = emissao;
        this.saida = saida;
        this.quantidade = quantidade;
    }

    public Date getEmissao() {
        return emissao;
    }

    public Date getSaida() {
        return saida;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    @Override
        public String toString() {
            return "Código: " + this.codigo + ", Data: " + this.emissao;
        }
}

public class Exercicio8 {
    
    Exercicio8(){
        
    }
    
    /*
     8. Codifique um método na classe Exercicio8 para criar e inicializar cinco 
        objetos do tipo Compra com as seguintes informações.
    
        Código 1, emissão:  15/10/2020 15:39:00 100, saída 15/10/2020 17:20 300
    
        Código 2, emissão:  16/10/2019 10:39:00 150, saída 16/10/2020 10:59 160
 
        Código 3, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 00:25 100
 
        Código 4, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 01:25 100
 
        Código 5, emissão:  31/12/2020 23:55:00 050, saída 01/01/2021 00:33 100
 
    
        Adicionar os objetos em uma coleção. Após, percorrer e analisar a lista
        para localizar os seguintes objetos/informações:
        
            1) Data de emissão de compra mais recente.
            2) Data de saída mais antiga.
            3) Compra com maior tempo em relação a emissão e a saída.
    */
    
    public void metodoCompra() throws ParseException{
        
        List<Compra> listaCompras = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        
        
        try{
            listaCompras.add(new Compra(1, sdf.parse("15/10/2020 15:39:00"), sdf.parse("15/10/2020 17:20:00"), 100));
            listaCompras.add(new Compra(2, sdf.parse("16/10/2019 10:39:00"), sdf.parse("16/10/2020 10:59:00"), 160));
            listaCompras.add(new Compra(3, sdf.parse("17/10/2020 23:00:00"), sdf.parse("18/10/2020 00:25:00"), 100));
            listaCompras.add(new Compra(4, sdf.parse("17/10/2020 23:00:00"), sdf.parse("18/10/2020 01:25:00"), 100));
            listaCompras.add(new Compra(5, sdf.parse("31/12/2020 23:55:00"), sdf.parse("01/01/2021 00:33:00"), 100));
        
        }catch (ParseException e){
            e.printStackTrace();
        }
        
        System.out.println(listaCompras);
            
   
        
    }
    
    public static void main(String []args) throws ParseException{
        
        new Exercicio8().metodoCompra();
        
    }
    
}

