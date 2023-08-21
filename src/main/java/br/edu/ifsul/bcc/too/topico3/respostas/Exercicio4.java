package br.edu.ifsul.bcc.too.topico3.respostas;

/**
 *
 * @author telmo junior
 */
public class Exercicio4 {

    /*
      4) Teste e recupere duas informações recebidas por parâmetro no método main. Para isso execute 
          a main informando dois valores. 
         Caso os valores sejam inteiros positivos. Calcule a média e imprima na tela o resultado. 
         Caso contrário, informe e finalize o programa.
             
        Comando para compilação (a partir do diretorio java): javac br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4.java
    
        Comando para execução (a partir do diretorio java): java br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4
     */
    public Exercicio4() {

    }

    public static void main(String[] args) {

        if (args.length == 2) {
            
           // System.out.println("Parametro/argumento recebido pela funcao main: " + args[2]);
            System.out.println("Primeiro Parametro: "+args[0]);
            System.out.println("Segundo Parametro: "+args[1]);
            
            Float p1 = Float.parseFloat(args[0]);
            Float p2 = Float.parseFloat(args[1]);
            
            Float m = (p1 + p2) / 2f;
                    
            
            System.out.println("Media dos valores digitados: "+m);
             
             
             
             
             
        } else {
            System.out.println("Não recebeu Parametro/argumento recebido pela funcao main.");
        }

    }

}
