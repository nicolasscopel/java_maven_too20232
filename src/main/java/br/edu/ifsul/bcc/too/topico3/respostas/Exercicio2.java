
package br.edu.ifsul.bcc.too.topico3.respostas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Prof. Telmo Júnior
 */
public class Exercicio2 {
    
    static  int[][] rgDados1 = new int[3][3];
    
    static  int[][] rgDados2 = new int[3][3];
        
    static  int[][] rgDados3 = new int[3][3];
    
    public static void main(String[] args) {
        
        /*
            2) Com base no código fonte produzido no exercicio 1, 
        implemente um tratamento de exceção para tratar possível erro na conversão de 
               string para integer no comando "Integer.parseInt(sc.next())".
        
               Documentação: https://www.devmedia.com.br/blocos-try-catch/7339
        */
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nMatriz 1");
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                boolean erro = true;
                
                System.out.print("Digite um valor: ");
                
               while(erro)
               {
                   try
                   {
                       if(sc.hasNext()){
                    // sc.next(); ...
                    int i = Integer.parseInt(sc.next());
                    rgDados1[linha][coluna] = i;
                    erro = false;
                    }
                       
                   }catch(NumberFormatException e){
                       System.out.println("Erro: " +e.getLocalizedMessage()+ " tente novamente");;
                       
                   }
                   
               }
              
                    
                }                
            }
        
        
       
        
         System.out.println("\nMatriz 2");
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                
                boolean erro = true;
                
                System.out.print("Digite um valor: ");
                
               while(erro)
               {
                   try
                   {
                       if(sc.hasNext()){
                    // sc.next(); ...
                    int i = Integer.parseInt(sc.next());
                    rgDados2[linha][coluna] = i;
                    erro = false;
                    }
                       
                   }catch(NumberFormatException e){
                       System.out.println("Erro " +e.getLocalizedMessage()+ " tente novamente");
                       
                   }
                   
               }
                    
                }                
            }
        
        
      
        
        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                                          
                    rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna];
                    }
                    
                }  
        
        
        System.out.println("\nMatriz 1");
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
        
        
                System.out.print(rgDados1[linha][coluna]+ "\t");
                if(coluna == 2)
                {
                    System.out.println();
                
                }
                
                
        }     
        }
        
        System.out.println("\nMatriz 2");
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
        
        
                System.out.print(rgDados2[linha][coluna]+ "\t");
                if(coluna == 2)
                {
                    System.out.println();
                
                }
                
                
        }     
        }
        
        
        
        System.out.println("\nMatriz 3");
        
        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
        
        
                System.out.print(rgDados3[linha][coluna]+ "\t");
                if(coluna == 2)
                {
                    System.out.println();
                
                }
                
                
        }     
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
