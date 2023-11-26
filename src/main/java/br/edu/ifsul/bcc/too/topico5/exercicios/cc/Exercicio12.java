
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 * @author telmo
 */
public class Exercicio12 {
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Calendar cal = Calendar.getInstance();
    Collection<Jogador> jogador = new ArrayList();
    
    
    
    public Exercicio12(){     
    
        
        //QAUDRADO - PRIVATE
        //BOLINHA VERDE - PUBLIC
        
        
        inicializaListJogadores();

    }
    /*
    11.1 Codificar no pacote br.edu.ifsul.bcc.too.base.topico5.exercicios.cc 
    o diagrama de classe sobre o estudo de caso: Counter Strike
    
    11.1.1 Criar uma rotina para adicionar objetos (dois) do tipo Jogador em uma 
    lista. Cada jogador deverá ter uma lista (2 objetos) de Arma e Municao e  
    dua patentes. Em seguida, imprima na saída padrão, os jogadores
    com seus respectivos artefatos e patentes.
    */
    private List<Object> inicializaListJogadores(){  
        
        Jogador j = new Jogador();
        Patente pat = new Patente();
 
        j.setNickname("spam?caguei");
        
        pat.setCor("Rosa");
        pat.setId(1);
        pat.setNome("Global");
        j.setPatente(pat);
        
        pat = new Patente();
        pat.setCor("Verde");
        pat.setId(10);
        pat.setNome("Prata");
        j.setPatente(pat);
        
        
     
        
        
        
        
        
        
        
        jogador.add(j);
        
       
        
        return null;
    }
    
    private void imprimeListJogadores(List<Object> lista){  
        
        
    }
    
    public static void main(String args[]){
        new Exercicio12();
    }

}
