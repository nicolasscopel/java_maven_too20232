
package br.edu.ifsul.bcc.too.topico3.respostas;

/**
 *
 * @author telmo
 */
public class Exercicio5 {
    
   private String strDados = "A classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos. Isso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java. Aqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";
    
    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
   
             https://www.devmedia.com.br/string-em-java-entendendo-e-utilizando-essa-classe/25503
    
    */
    
    //constutor da classe.
    public Exercicio5(){
              System.out.println("executou o construtor da classe");
              //manipulaString();
    }
    
   
    
    private void manipulaString(){//metodo da classe
        
        //System.out.println("executou o método manipulastring");
        //System.out.println(strDados);
        
        System.out.println("1) Método Concat: ");
        // método concat concatena 2 strings
        String r = strDados.concat(" !"); //adicionou o ! no final
        System.out.println(r);
        
        r = "#".concat(r);
        System.out.println(r); // adicionou o # na frente
        
        boolean teste = false;
        System.out.println("2) Método valueOf " + String.valueOf(teste));
        //metodo valueOf transforma um tipo primitivo (int, boolean, double) para String
        //System.out.println(String.valueOf(teste));
        
        
        
     
        
       
        
    }
    
    public static void main(String args[]){//metodo main
        
        
        Exercicio5 e5; // cria o objeto
        
        e5 = null; // inicializa com o null
        
        e5 = new Exercicio5(); // inicialização do objeto e5
        
        //System.out.println(" acessando o atributo da instancia "+e5.strDados);
        
        //Exercicio5 e_5 = new Exercicio5();//objeto da classe   || cria e inicializa o e_5
        
        e5.manipulaString();//chamada do metodo a partir do objeto.
        
        //new Exercicio5(); // criação da instancia se atribuição
        
      
        
    }
    
    
    
    
    
}
