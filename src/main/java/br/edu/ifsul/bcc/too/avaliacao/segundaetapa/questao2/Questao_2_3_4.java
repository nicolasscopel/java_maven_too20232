/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao2;


import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author 20222PF.CC0019
 */
public class Questao_2_3_4 {

    public Questao_2_3_4() {
        
        List<Pessoa> p = inicializaListaPessoas();
        imprimeListaPessoas(p);
        
     

    }

    private List<Pessoa> inicializaListaPessoas() {
        
        List<Pessoa> pessoas = new ArrayList();
        
        Funcionario f1 = new Funcionario();
        
        
        f1.setCpf("11111357788");
        f1.setNome("Zé Chaves");
        f1.setData_nascimento_string("01/05/1983");
        f1.setCep("99052250");
        f1.setComplemento("apartamento 400");
        f1.setNumero_ctps("123");
        f1.setData_admissao_string("20/10/1999");
        
  
        pessoas.add(f1);
        
        
        Cliente c1 = new Cliente();
        
        c1.setCpf("11111357788");
        c1.setNome("Zé Chaves");
        c1.setData_nascimento_string("01/05/1983");
        c1.setCep("99052250");
        c1.setComplemento("apartamento 400");
        c1.setObservacoes("cliente que paga em dia");
        
        
        Collection<Veiculo> veiculo = new ArrayList();
        
        Veiculo veic = new Veiculo();
        
        veic.setAno(1997);
        veic.setModelo("vectra");
        veic.setPlaca("igd1903");
        veic.setData_ultimo_servico_string("01/02/2022");
        
        veiculo.add(veic);
            
        c1.setVeiculo(veiculo);
       
        pessoas.add(c1);
        
        return pessoas;
    }

    //private List<Orcamentos> inicializaListaOrcamentos() {
    //}

    private void imprimeListaPessoas(List<Pessoa> lista) {
        
        
        
         for(Pessoa p: lista){
             
         
             
             if(p instanceof Funcionario){
                 System.out.println("\nFUNCIONARIO");
                 System.out.println("CPF: "+ p.getCpf());
                 System.out.println("Nome: "+ p.getNome());
                 System.out.println("Data de Nascimento:" + p.getData_nascimento_string());
                 System.out.println("CEP: "+ p.getCep());
                 System.out.println("Complemento: "+ p.getComplemento());
                 System.out.println("Numero CTPS: "+ ((Funcionario) p).getNumero_ctps()); //DUAS FORMAS PARA MOSTRAR PARTES ESPECIFICAS
                 Funcionario func = (Funcionario) p;
                 System.out.println("Data Admissao: " + func.getData_admissao_string());
                 
                 //System.out.println("Data Admissao: "+ ((Funcionario) p ).getData_admissao_string());
             }
             
             if(p instanceof Cliente){
                 
                 System.out.println("\nCLIENTE");
                 System.out.println("CPF: "+ p.getCpf());
                 System.out.println("Nome: "+ p.getNome());
                 System.out.println("Data de Nascimento:" + p.getData_nascimento_string());
                 System.out.println("CEP: "+ p.getCep());
                 System.out.println("Complemento: "+ p.getComplemento());
                 System.out.println("Observações: " + ((Cliente) p).getObservacoes());
               
                 for(Veiculo v :((Cliente) p).getVeiculo()){
                     System.out.println("VEICULOS");
                     System.out.println("\t[ Placa: " + v.getPlaca());
                     System.out.println("\tModelo: " + v.getModelo());
                     System.out.println("\tAno: " + v.getAno());
                     System.out.println("\tData Ultimo Serviço: " + v.getData_ultimo_servico_string());
                     System.out.println("\t]");
                     
                 }
                 
             }
             
           
            
        }
        
    }

    //private void imprimeListaOrcamentos(List<Orcamento> lista) {
    //}

    public static void main(String args[]) {

        new Questao_2_3_4();
    }

}


