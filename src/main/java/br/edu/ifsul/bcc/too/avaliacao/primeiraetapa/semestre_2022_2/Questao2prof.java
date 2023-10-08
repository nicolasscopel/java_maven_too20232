package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Map;

import java.util.HashMap;

public class Questao2prof {

    private Map<Integer, java.util.Calendar> mapDados = new HashMap();
    private String dadosString = "{codigo:10, data:'2022-01-31'};{codigo:20, data:'1999-10-1'};{codigo:30, data:'1994-06-15'}";
    private SimpleDateFormat formatador;

    private void manipulacaoStrings() {

        String d[] = dadosString.split(";");
        int i = 0;
        Integer cod;
        Calendar dat = Calendar.getInstance();
        formatador = new SimpleDateFormat("yyyy-MM-dd");
        while (i < d.length) {

            try {

                String codigo = d[i].substring(d[i].indexOf(":") + 1, d[i].indexOf(","));
                String data = d[i].substring(d[i].indexOf(":", d[i].indexOf(",")) + 2, d[i].indexOf("'}"));

                cod = Integer.parseInt(codigo);
                
                Calendar cal = Calendar.getInstance();
                cal.setTime(formatador.parse(data));
              
                mapDados.put(cod, cal);
                

            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("erro");
            }

            i++;
        }

    }

    public void imprime() {
        Calendar dat = Calendar.getInstance();
        formatador = new SimpleDateFormat("dd-MM-yyyy");
        int maior=0;
        for (Map.Entry<Integer, java.util.Calendar> m : mapDados.entrySet()) {//ver se da pra organizar a ordem
             System.out.println("Código: " + m.getKey() + " Data: " + formatador.format(m.getValue().getTime()));
        }
    }

    public Questao2prof() {

        manipulacaoStrings();
        imprime();
    }

    public static void main(String args[]) {
        new Questao2prof();
    }
}
