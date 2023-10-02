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
 *  Com base na classe Questao3 codifique um novo método para classificar os
    dados do vetor dados (atributo da instância). A classificação deverá ser
    realizada de forma ascendente. Esse método deverá ser chamado no
    construtor da classe. Após, imprima na saída padrão os dados classificados.
*   
 */
public class Questao3 {

    private Integer[] dados = {40, -10, 60, -1, 5, -25, 11, 3};
    private Set<Integer> st;

    public Questao3() {
        
            classificaDados();
    }
    
    public void classificaDados() {
        
        st = new TreeSet();
        int i = 0;
        
        for(Object o : dados){
            st.add(dados[i]);
            i++;
        }
        
        System.out.println(st);
        
    }

    public static void main(String args[]) {

        new Questao3();
    }

}
