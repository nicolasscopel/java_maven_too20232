/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 20222PF.CC0019 
 * 2 Com base na classe Questao2 finalize a implementação
 * do método manipulacaoStrings. Esse método deverá adicionar elementos no mapa
 * mapDados (atributo da instância). Cada elemento deve conter a informação do
 * código no formato java.lang.Idnteger e data no formato java.util.Calendar.
 *
 * 2.1) Com base no código fonte da questão 2, codifique um novo método para
 * imprimir na saída padrão todos elementos do mapa mapDados (atributo da
 * instância). Cada impressão deve conter a chave e a data no formato
 * dd/mm/yyyy. Esse método deverá ser chamado no construtor, após a chamada do
 * método manipulacaoStrings.
 */
public class Questao2 {

    private Map<Integer, java.util.Calendar> mapDados = new HashMap();
    private String dadosString = "{codigo:10, data:'2022-01-31'}; {codigo:20, data:'1999-10-1'};{codigo:30, data:'1994-06-15'}";
    
    private SimpleDateFormat formatadordata;

    public Questao2() {

        manipulacaoStrings();
    }

    private void manipulacaoStrings() {

        String d[] = dadosString.split(";");
        int i = 0;
        while (i < d.length) {

            try {
                String codigo = d[i].substring(d[i].indexOf(":") + 1,
                        d[i].indexOf(","));
                String data = d[i].substring(d[i].indexOf(":",
                        d[i].indexOf(",")) + 2, d[i].indexOf("'}"));
                
                //CONVERTER PARA INTEGER E PARA CALENDAR E COLOCAR NO MAPDADOS

            } catch (Exception e) {
                e.printStackTrace();
            }

            i++;
        }
    }
    
    private void arrumaData(){
        formatadordata = new SimpleDateFormat ("dd/mm/yyyy");
    }

    public static void main(String args[]) {
        new Questao2();
    }

}
