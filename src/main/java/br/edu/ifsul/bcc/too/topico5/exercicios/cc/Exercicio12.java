
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
        
        
        Collection<Jogador> j = inicializaListJogadores();
        
        imprimeListJogadores(j);
        
        //imprimeListJogadores(inicializaListJogadores());

    }
    /*
    11.1 Codificar no pacote br.edu.ifsul.bcc.too.base.topico5.exercicios.cc 
    o diagrama de classe sobre o estudo de caso: Counter Strike
    
    11.1.1 Criar uma rotina para adicionar objetos (dois) do tipo Jogador em uma 
    lista. Cada jogador deverá ter uma lista (2 objetos) de Arma e Municao e  
    dua patentes. Em seguida, imprima na saída padrão, os jogadores
    com seus respectivos artefatos e patentes.
    */
    private Collection<Jogador> inicializaListJogadores(){  
        
        Collection<Jogador> jogadores = new ArrayList();
        
        //CRIACAO DOS JOGADORES
        
        Jogador j1 = new Jogador();
        Arma a1 = new Arma();
        Municao m1 = new Municao();
        Patente p11 = new Patente();
        Patente p12 = new Patente();
        
        Collection<Artefato> arts = new ArrayList();
         
        a1.setComprimento_cano(12.3f);
        arts.add(a1);
        arts.add(m1);
        
        j1.setArtefato(arts);
        
        //ADICIONANDO PATENTE
        p11.setId(1);
        p12.setId(2);
        
        j1.setPatente(p11);
        j1.setPatente(p12);
        
        j1.setData_cadastro(Calendar.getInstance());
        
        jogadores.add(j1);
        
        
        Jogador j2 = new Jogador();
        Arma a21 = new Arma();
        Municao m21= new Municao();
       
 
       
        
        jogadores.add(j2);
     
        
        return jogadores;
    }
    
    private void imprimeListJogadores(Collection<Jogador> jogadores){  
        
        for(Jogador j : jogadores){
             
            
                  
            //MAIS UM FOR PRA ARTEFATOS E PATENTES
            
            for(Patente p: j.getPatente()){
                
                System.out.println(p.getId());
            }
            for(Artefato a : j.getArtefato()){
                System.out.println(a);
            }
            
            
        }
        
        
    }
    
    public static void main(String args[]){
        new Exercicio12();
    }

}
