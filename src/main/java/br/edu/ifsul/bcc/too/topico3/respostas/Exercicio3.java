
package br.edu.ifsul.bcc.too.topico3.respostas;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author Telmo Júnior
 */
public class Exercicio3 {
    
    public static void main(String[] args) {

        int[][] rgDados1 = new int[3][3];//linha e coluna - se a quantidade de coluna da primeira

        int[][] rgDados2 = new int[3][2];//for igual a quantida de linha da segunda.

        int[][] rgDados3 = new int[2][2];

        /*
            3) Com base nos métodos da classe JOptionPane obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para multiplicar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. Por fim imprima no console os dados gerados (rgDados3).

               Documentação: https://www.devmedia.com.br/introducao-a-interface-gui-no-java/25646
                             https://brasilescola.uol.com.br/matematica/multiplicacao-matrizes.htm
        */
        
        Scanner sc = new Scanner(System.in);
        
        for (int linha=0; linha < rgDados1.length; linha++)
        {
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++)
            {
                                
                String d = JOptionPane.showInputDialog(null, "Informe um valor inteiro:", "Informe", JOptionPane.PLAIN_MESSAGE);
                 // entrada de dados showInputDialog  
                 
                 
                 
                 if(d == null)
                 { 
                     System.out.println("Erro na leitura");
                     coluna --;
                 }
                 else
                 {
                     rgDados1[linha][coluna] = Integer.parseInt(d);
                 }
                 
                 
                 
                 
                 
                 
                //rgDados1[linha][coluna] = Integer.parseInt(d);
                                
            }                        
        } 

    }
    
}
