
package br.edu.ifsul.bcc.too.topico3.respostas;


/**
 *
 * @author Nicolas Scopel
 */
public class Pneu implements Comparable<Pneu> {
    
    
         private String codigo;//atributo da instância.
        private String modelo;
        private String posicao;
        private String medida;
        private String fabricante;
        private String valor;
    
    //construtor protegido - somente acessível dentro do pacote.
    public Pneu(){
        
    }
    
    public Pneu(String codigo, String modelo, String posicao, String medida, String fabricante, String valor){
        
        //os dados recebidos por parametro são utilizados para inicilizar os atributos da instância.
        
        //atributo da instância recebe o parâmetro.
            this.codigo = codigo;
            this.modelo = modelo;
            this.posicao = posicao;
            this.medida = medida;
            this.fabricante = fabricante;
            this.valor = valor;
    }

    @Override
    public int compareTo(Pneu t) {
        
        //ascendente pela matricula
        //return this.matricula.compareTo(t.matricula);
        
        //descendente pela matricula
        //return t.matricula.compareTo(this.matricula);
        
        //ascendente pelo nome
         //return this.modelo.compareTo(t.modelo);
        
        //desccendente pelo nome
          return t.modelo.compareTo(this.modelo);
        
    }
    
    //o metodo toString pertence a classe java.lang.Object.
    //polimorfismo: alteração de forma (sobreescrita de método).
    
    @Override
        public String toString() {
            return "Código: " + this.codigo + " Modelo: " + this.modelo;

        }
    
   
}
