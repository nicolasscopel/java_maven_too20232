package br.edu.ifsul.bcc.too.topico3.respostas;

/**
 *
 * @author telmo
 */
public class Exercicio5 {

    private String strDados = "A classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos. Isso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java. Aqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";
    private String teste = "StringParaTeste";
    private String sai = "Teste"; // TARGET
    private String substitui = "Substituir"; // REPLACEMENT
    private String testeespacos = " StringParaTesteDeEspaços ";

    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
   
             https://www.devmedia.com.br/string-em-java-entendendo-e-utilizando-essa-classe/25503
    
     */
    //constutor da classe.
    public Exercicio5() {
        System.out.println("executou o construtor da classe");
        //manipulaString();
    }

    private void manipulaString() {//metodo da classe

        //System.out.println("executou o método manipulastring");
        //System.out.println(strDados);
        System.out.println("1) Método Concat: ");
        // método concat concatena 2 strings
        String r = strDados.concat(" !"); //adicionou o ! no final
        System.out.println(r);

        r = "#".concat(r);
        System.out.println(r); // adicionou o # na frente

        
        
        boolean metodo2 = false;
        System.out.println("2) Método valueOf " + String.valueOf(metodo2));
        //metodo valueOf transforma um tipo primitivo (int, boolean, double) para String
        //System.out.println(String.valueOf(teste));

        
        
        /* STARTSWITH ENDSWITH
        String[] nomes = {"iniciado", "iniciando", "finalizado", "finalizando"};

        for (String recebeNomes : nomes) {
        if (recebeNomes.startsWith("in"))
        System.out.printf("\"%s\" inicia com \"in\" \n", recebeNomes);
        }

        System.out.println();

        for (String recebeNomes : nomes) {
        if (recebeNomes.startsWith("ici", 2))
        System.out.printf("\"%s\" inicia com \"ici\" na posição 2 \n", recebeNomes);
         }

        System.out.println();

        for (String recebeNomes : nomes) {
        if (recebeNomes.endsWith("ado"))
        System.out.printf("\"%s\" termina com \"ado\" \n", recebeNomes);
        }*/
        
    
        
        System.out.println("3) Médoto startsWith");
        //verifica se começa com as letras desejadas

        if (teste.startsWith("Stri", 0)) // primeiro campo para a string e segundo para deslocamento de casas (começa no 0)
        {
            System.out.println("A string começa com /Stri/ ");
        }

        
        
        System.out.println("4) Médoto endsWith");
        //verifica se termina com as letras desejadas

        if (teste.endsWith("ste")) {
            System.out.println("A string termina com /ste/ ");
        }
        
        
        
         System.out.println("5) Médoto indexOf");
        //procura caracteres
        
        String letras = "abcadefghijklmcopqrsdeftuv";
        //TESTA indexOf PARA LOCALIZAR UM CARACTERE EM UM STRING
        System.out.printf("Último 'c' está localizado no index %d\n", letras.indexOf('c'));
        System.out.printf("Último 'a' está localizado no index %d \n", letras.indexOf('a', 1));// 1 é o indice a aprtir de onde deve procurar
        
        
        
        
        
        System.out.println("6) Médoto substring");
        //Permite extrair substrings de strings e fornece 2 métodos substring para permitir que um novo objeto seja criado copiando parte de um objeto string existente.
        
        String nome = "01234567";
        System.out.println("String : " + nome);

        String substring = nome.substring(5); // exclui os elementos de 0 - 4 e pega a partir do 5
        System.out.println("String depois da 5º index: " + "["+substring+"]");
        // 1ª versão – recebe um argumento do tipo inteiro, que especifica a partir de que caractere a cópia deve começar. 
        //A substring retornada contém uma cópia dos caracteres desde esse índice até o último caractere na string.
        

        substring = nome.substring(1, 6); // pega do elemento 1 ao 5 - sempre uma posição a menos do endIndex
        System.out.println("Substring (1,6): " + "["+substring+"]");
        //2ª versão - recebe dois argumentos do tipo inteiro. A String retornada será composta pelo o primeiro argumento e se estende até o caractere anterior ao segundo argumento.
        // PRIMEIRO ARGUMENTO INCLUSIVO E SEGUNDO EXCLUISIVO - INCLUI DO 1 ATÉ ANTES DO ULTIMO
        
        
        
        System.out.println("7) Médoto replace");
        // Retorna um novo objeto contendo a string original com um trecho especificado substituído por outra expressão indicada.
        
        String metodo7 = "mesquita";
        System.out.println(metodo7);
        String nomeAlterado = metodo7.replace('e', 'o'); // SUBSTITUI APENAS UM CHAR
        System.out.println(nomeAlterado);
        System.out.println(teste);
        String testealterado = teste.replace(sai,substitui); // SUBSTITUI UMA SUBSTRING
        System.out.println(testealterado);
        
        
        
        System.out.println("8) Médoto trim");
        // Gera um novo objeto string, removendo todos os caracteres de espaço em branco que aparecem no início ou no fim da string em que o método opera. 
        //O método retorna um novo objeto string contendo a string sem espaço em branco inicial ou final. A string original permanece inalterada.
        
        
        System.out.println("String teste:"+testeespacos);
        System.out.println("String teste sem espaços:"+ testeespacos.trim()); // SEM ESPAÇOS NO COMEÇO E NO FIM
        
        
        System.out.println("9) Médoto compareto");
        //Esse método pode retornar 0 se as strings forem iguais, um número negativo se a string que invoca o compareTo for menor que a string que é passada como um argumento e 
        //um número positivo se a string que invoca o compareTo for maior que a string que é passada como argumento.
        
        String nome1 = "Carlos";
        String nome2 = "Carla";
        String nome3 = "Carlos";

        System.out.println("nome2.compareTo(nome1) = "+nome2.compareTo(nome1)); // NEGATIVO POIS CARLA É MENOR QUE CARLOS
        System.out.println("nome1.compareTo(nome2) = "+nome1.compareTo(nome2)); // POSITIVO POIS CARLOS É MAIOR QUE CARLA
        System.out.println("nome2.compareTo(nome3) = "+nome1.compareTo(nome3)); // 0 POIS SÃO IGUAIS
        
        
        String texto = "A API de Strings é uma das mais utilizadas na linguagem Java";
        String linguagem = texto.substring(texto.indexOf("Java"), texto.length());
        
        
        //COMPARETOIGNORECASE IGNORA LETRAS MAIÚSCULAS OU MINÚSCULAS COMPARA APENAS LETRAS
        
        if (linguagem.compareToIgnoreCase("java") == 0) {
        System.out.println("compareToIgnoreCase: Encontrei a linguagem! Ela é " + linguagem);
        }

        if(linguagem.compareTo("java") == 0) {
         System.out.println("compareTo: Encontrei a linguagem! Ela é " + linguagem);
        }
        

    }

    public static void main(String args[]) {//metodo main

        Exercicio5 e5; // cria o objeto

        e5 = null; // inicializa com o null

        e5 = new Exercicio5(); // inicialização do objeto e5

        //System.out.println(" acessando o atributo da instancia "+e5.strDados);
        //Exercicio5 e_5 = new Exercicio5();//objeto da classe   || cria e inicializa o e_5
        e5.manipulaString();//chamada do metodo a partir do objeto.

        //new Exercicio5(); // criação da instancia se atribuição
    }

}
