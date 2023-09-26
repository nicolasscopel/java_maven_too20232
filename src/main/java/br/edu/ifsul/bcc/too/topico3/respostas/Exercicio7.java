package br.edu.ifsul.bcc.too.topico3.respostas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author telmo
 */
public class Exercicio7 {

    Exercicio7() {
        
       
        exer71();// chama o método exer71.

        exer72();//chama o método exer72.
        


    }
    
   
    

    public class Carro {

        private String nomeCarro;
        private String modeloCarro;
        private String fabricanteCarro;
        private String numeroDoChassiCarro;
        private Double valorDeMercadoCarro;

        // Construtor público para inicializar os atributos
            public Carro(String nome, String modelo, String fabricante, String numeroChassi, double valorDeMercado) {
            this.nomeCarro = nome;
            this.modeloCarro = modelo;
            this.fabricanteCarro = fabricante;
            this.numeroDoChassiCarro = numeroChassi;
            this.valorDeMercadoCarro = valorDeMercado;
        }

        // Sobrescreva o método toString para retornar o código e modelo
        @Override
        public String toString() {
            return "Código: " + this.numeroDoChassiCarro + ", Modelo: " + this.modeloCarro;
        }

    }
    
    public void metodoCarro(){
        
        Map<Integer, Carro> carros = new HashMap();
    
        // Criando e inicializando cinco objetos da classe Carro
        Carro carro1 = new Carro("Gol", "2023", "Volkswagen", "56DF234DF", 25000.0);
        Carro carro2 = new Carro("Saveiro", "2019", "Volkswagen", "463DF123", 30000.0);
        Carro carro3 = new Carro("Amarok", "2024", "Volkswagen", "7824FOL", 20000.0);
        Carro carro4 = new Carro("Jetta", "2012", "Volkswagen", "924DFG5", 35000.0);
        Carro carro5 = new Carro("Golf", "2015", "Volkswagen", "873DFSH23", 28000.0);
        
         // Adicionando os carros à lista de carros
        carros.put(0, carro1);
        carros.put(1, carro2);
        carros.put(2, carro3);
        carros.put(3, carro4);
        carros.put(4, carro5);
        
        // Imprimindo a listagem de carros
        for (Map.Entry<Integer, Carro> entry : carros.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", " + entry.getValue());
        }
        
    }
    
    public class Pneu {
        
        private String codigoPneu;
        private String modeloPneu;
        private String posicaoPneu;
        private String medidaPneu;
        private String fabricantePneu;
        private String valorPneu;
        
        //Construtor público para inicializar os atributos
        public Pneu(String codigo, String modelo, String posicao, String medida, String fabricante, String valor){
            this.codigoPneu = codigo;
            this.modeloPneu = modelo;
            this.posicaoPneu = posicao;
            this.medidaPneu = medida;
            this.fabricantePneu = fabricante;
            this.valorPneu = valor;
            
        }
        
        @Override
        public String toString(){
            return "Código: " + this.codigoPneu + " Modelo: " + this.modeloPneu; 
            
        }
        
        
    }
    
    
    
    
    public void metodoPneu(){
        
        List<Pneu> lista = new ArrayList();
        
        Pneu a = new Pneu("1", "Radial", "Overside", "195/55", "Bridgestone", "399,00");
        lista.add(a);
         Pneu b = new Pneu("2", "Verde", "Overside", "175/65", "Michelin", "599,00");
        lista.add(b);
         Pneu c = new Pneu("3", "Misto", "Overside", "185/45", "Continental", "349,00");
        lista.add(c);
         Pneu d = new Pneu("4", "Carga", "Overside", "175/55", "Pireli", "499,00");
        lista.add(d);
        
        System.out.println(lista);//antes
        
        
        
        
        
         System.out.println(lista);//antes
        
        
    }
    
    

    private void exer71() {

        /*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da 
            classe Carro. 
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
         */
    }

    private void exer72() {

        /*        
        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu. 
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela os Pneus.
         */
    }

    private void exer73() {

        /*     
          
        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos:
             criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.        
         */
    }

    public static void main(String[] args) {

        new Exercicio7();
        
        new Exercicio7().metodoCarro();
        new Exercicio7().metodoPneu();
        
        
    }

}
