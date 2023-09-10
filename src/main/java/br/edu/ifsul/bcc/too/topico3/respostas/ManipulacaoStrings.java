
package br.edu.ifsul.bcc.too.topico3.respostas;

import java.lang.String;


public class ManipulacaoStrings {
    
    
    //CONSTRUTOR
    public ManipulacaoStrings(String t, String t2, String t3, String t4)
            {
                System.out.println("Executou o construtor");
                testeComparacaoStrings(t, t2, t3, t4); // CHAMADA DO MÉTODO
                testeSplit("1,2,3,4,5,6,7,a,b,c,8");
            }
    
    
    private void testeSplit(String param){
        
        // Utilizando o método java.lang.String.split, imprima uma lista de informações inteira
        // Na saída padrão, caso não seja possível converter para inteiro imprima a informação -
        /* EXEMPLO
        1
        2
        3
        4
        5
        6
        7
        -
        -
        -
        8
        */
        
        String [] meuVetor;
        
        meuVetor = param.split(",");
        
        int tam = meuVetor.length;
        
        System.out.println("Tamanho do vetor: " + tam);
        
        for(int i = 0; i < tam; i++){
        try{
            Integer item = Integer.parseInt(meuVetor[i]);
            System.out.println(item);

            
        }catch(NumberFormatException e){
            System.out.println("-");
        }
            
            
        }
        
        
    }
    
    
    //METODO
    private void testeComparacaoStrings(String t, String t2, String t3, String t4)
    {
        // ACESSAR AS VARIÁVEIS TEXTO, TEXTO2, TEXTO3, TEXTO4
        
        
        System.out.println("--- == ---");
        if(t == t2) // == testa instancia
        { 
            System.out.println("t tem a mesma instância de t2");
        }
        else
        {
            System.out.println("t não tem a mesma instância de t2");
        }
        
        if(t == t3) // == testa instancia
        { 
            System.out.println("t tem a mesma instância de t3");
        }
        else
        {
            System.out.println("t não tem a mesma instância de t3");
        }
        
        
        
        System.out.println("--- equals ---");
        if(t.equals(t2)) // equals testa o conteúdo
        { 
            System.out.println("t tem o mesmo conteúdo de t2");
        }
        else
        {
            System.out.println("t não tem o mesmo conteúdo de t2");
        }
        
        if(t.equals(t3))
        { 
            System.out.println("t tem o mesmo conteúdo de t3");
        }
        else
        {
            System.out.println("t não tem o mesmo conteúdo de t3");
        }
        
        
        
        System.out.println("--- equalsIgnoreCase ---");
        if(t.equalsIgnoreCase(t2)) // equalsIgnoreCase testa o conteúdo
        { 
            System.out.println("t tem o mesmo conteúdo de t2");
        }
        else
        {
            System.out.println("t não tem o mesmo conteúdo de t2");
        }
        if(t.equalsIgnoreCase(t3))
        { 
            System.out.println("t tem o mesmo conteúdo de t3");
        }
        else
        {
            System.out.println("t não tem o mesmo conteúdo de t3");
        }
        
        
        System.out.println("--- compareTo ---");
        // CARACTERE MINÚSCULO SEMPRE MENOR QUE MAIÚSCULO 
        
        System.out.println("Comparação de t com t2: "+ t.compareTo(t2));
        System.out.println("Comparação de t2 com tt: "+ t2.compareTo(t));
        System.out.println("Comparação de t com t3: "+ t.compareTo(t3));
        
        
        
        System.out.println("--- compareToIgnoreCase ---");
        // IGNORA MINÚSCULO E MAIÚSCULO 
        
        System.out.println("Comparação de t com t2: "+ t.compareToIgnoreCase(t2));
        System.out.println("Comparação de t com t3: "+ t.compareToIgnoreCase(t3));
        
        
        
    }
    
        
    public static void main(String[] args) {
        
        /*
            Uma String armazena uma sequência de caracteres. Apesar de ser fácil de utilizar, essa classe possui diversas 
            características que podem não ser óbvias para quem está tendo o seu primeiro contato com ela.
        
            Por exemplo, um objeto String é imutável, o que significa que o texto que ele carrega nunca é alterado. 
            Sempre que um texto precisa ser modificado é utilizado mais espaço em memória para que uma nova String seja 
            criada contendo a nova versão dele. Essas características serão o assunto que abordaremos primeiro.
        
        */
        
        String texto = "Qualquer texto entre aspas é uma String"; // INICIALIZADA A APRTIR DE UMA CONSTANTE
        String texto2 = new String("qualquer texto entre aspas é uma String"); // RECEBEU UMA NOVA ALOCAÇÃO DE MEMORIA
        String texto3 = "Qualquer texto entre aspas é uma String";
        String texto4 = new String("Qualquer texto entre aspas é uma String");
        
        "Qualquer texto entre aspas é uma String".length();
        
        String txt;
        
     
        new ManipulacaoStrings(texto, texto2, texto3, texto4); // INSTANCIA
        
     
        
        //Implementar um construtor para essa classe
        //No método main criar uma instancia ManipulacaoStrings
        //No construtor desta classe, chamar o método testeComparacaoStrings
        //No método testeComparacaoStrings implementar rotinas para testar os seguintes comandos
        //comando: ==, equals, equalsIgnoreCase, compareTo, compareToIgnoreCase
        // usando as variaveis texto, texto2 e txt;
        // https://www.devmedia.com.br/string-em-java-entendendo-e-utilizando-essa-classe/25503
        
        
    }
    
    
}


   