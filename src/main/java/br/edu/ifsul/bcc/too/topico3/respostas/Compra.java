
package br.edu.ifsul.bcc.too.topico3.respostas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author telmo
 */
public class Compra {
    
    private SimpleDateFormat form  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");;
    
    
    
    public Integer codigo;
    public Calendar emissao;
    public Date saida;
    
    public Compra(Integer codigo, Calendar emissao, Date saida){
        
        this.codigo = codigo;
        this.emissao = emissao;
        this.saida = saida;
    }
    
    /*
    @Override
        public String toString() {
            return "Código: " + this.codigo + ", Modelo: " +  this.emissao;
        }
   */
    
}
