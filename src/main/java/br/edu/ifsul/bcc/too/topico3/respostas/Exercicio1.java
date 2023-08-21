package br.edu.ifsul.bcc.too.topico3.respostas;

/**
 *
 * @author Prof. Telmo Júnior
 */


import java.util.Scanner;

public class Exercicio1 {        
    
    public static void main(String[] args) {
        
        int[][] rgDados1 = new int[3][3];
    
        int[][] rgDados2 = new int[3][3];
        
        int[][] rgDados3 = new int[3][3];
    
        /*
            1) Com base no método hasNext da classe Scanner obtenha informações do console e 
               inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para somar os dados das matrizes 
               (rgDados1 e rgDados2) e armazene em rgDados3. 
               Por fim imprima no console os dados gerados (rgDados3).
        
               Documentação: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        */
        
        Scanner sc = new Scanner(System.in);
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                System.out.print("Digite um valor: ");
                if(sc.hasNext()){
                    // sc.next(); ...
                    int i = Integer.parseInt(sc.next());
                    rgDados1[linha][coluna] = i;
                    }
                    
                }                
            }
        System.out.println("\nMatriz 1");
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
        
        
                System.out.print(rgDados1[linha][coluna]+ " ");
                if(coluna == 2)
                {
                    System.out.println();
                
                }
                
                
        }     
        }
        
        System.out.println("\n");
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                
                System.out.print("Digite um valor: ");
                if(sc.hasNext()){
                    // sc.next(); ...
                    int i = Integer.parseInt(sc.next());
                    rgDados2[linha][coluna] = i;
                    }
                    
                }                
            }
        System.out.println("\nMatriz 2");
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
        
        
                System.out.print(rgDados2[linha][coluna]+ " ");
                if(coluna == 2)
                {
                    System.out.println();
                
                }
                
                
        }     
        }
        
        System.out.print(rgDados2[0][0]+ rgDados1[0][0]);

        
    }
}
    


