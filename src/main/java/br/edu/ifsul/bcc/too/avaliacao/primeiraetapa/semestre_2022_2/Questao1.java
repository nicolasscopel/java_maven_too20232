/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 20222PF.CC0019
 * 
 * 1) Com base na classe Questao1, finalize a implementação do método
converteDados. Esse método deverá converte para Integer cada um dos
elementos do vetor d (variável local). O resultado da conversão deverá ser
armazenado na lista dados (atributo da instância). Caso não seja possível
converter para inteiro, adicionar a informação 0 (zero) na lista da instância.
* 
* 1.1) Com base no código fonte da questão 1, codifique um novo método para
imprimir na saída padrão todos elementos da lista dados (atributo da
instância). Esses dados deverão ser impressos em ordem crescente,
desconsiderando as informações duplicadas. Esse método deverá ser chamado
no construtor, após a chamada do método converteDados.
 */
public class Questao1 {

    private String raw_data = "123,b,22,f,e,7,1,2,3";

    private java.util.List<Integer> dados = new java.util.ArrayList();
    
    private Set<Integer> st;
    
    

    public void converteDados() {

        int i = 0;
      
        String d[] = raw_data.split(",");

        while (i < d.length) {
            try{
                Integer num = Integer.parseInt(d[i]);
                dados.add(num);
                
            }catch(NumberFormatException e){
                dados.add(0);
            }
            
            i++;
        }       
       System.out.println("Dados antes da ordenação: " + dados);  
    }
    
    public void imprimeDadosOrdenado(){
        
        
        int i = 0;
        
        st = new TreeSet();
     
       for( Integer o : dados){            
           
            st.add(dados.get(i));
            i++;

        } 
        System.out.println("Dados apos a ordenação: " + st);
                
    }
    
    

    public Questao1() {
        converteDados();
        imprimeDadosOrdenado();
    }

    public static void main(String args[]) {
        new Questao1();
    }
}
