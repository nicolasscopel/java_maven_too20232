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
        
        //List<Pessoa> p = inicializaListaPessoas();
        //imprimeListaPessoas(p);
        
        List<Orcamento> o = inicializaListaOrcamentos();
        imprimeListaOrcamentos(o);
        
     

    }

    private List<Pessoa> inicializaListaPessoas() {
        
        List<Pessoa> pessoas = new ArrayList();
        
        Funcionario f1 = new Funcionario();
        
        //funcionario
        f1.setCpf("11111357788");
        f1.setNome("Zé Chaves");
        f1.setData_nascimento_string("01/05/1983");
        f1.setCep("99052250");
        f1.setComplemento("apartamento 400");
        f1.setNumero_ctps("123");
        f1.setData_admissao_string("20/10/1999");
        
  
        pessoas.add(f1);
        
        
        Cliente c1 = new Cliente();
        
        //CLIENTE
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

    private List<Orcamento> inicializaListaOrcamentos() {
        
        List<Orcamento> orcamentos = new ArrayList();
        
        Orcamento o1 = new Orcamento();
        
        o1.setId(1);
        o1.setObservacoes("carro em péssimas condições");
        o1.setData_string("14/12/2022");
                        
        //CLIENTE COMO NAO É COLLECTION N PRECISA CRIAR
        Cliente c1 = new Cliente();
        c1.setCpf("11111357788");
        c1.setNome("Zé Chaves");
        c1.setData_nascimento_string("01/05/1983");
        c1.setCep("99052250");
        c1.setComplemento("apartamento 400");
        c1.setObservacoes("cliente que paga em dia");
        o1.setCliente(c1);
        
        Veiculo v = new Veiculo();
        v.setAno(1997);
        v.setModelo("vectra");
        v.setPlaca("igd1903");
        v.setData_ultimo_servico_string("01/02/2022");
        o1.setVeiculo(v);
        
        orcamentos.add(o1);
        
        Orcamento o2 = new Orcamento();
        o2.setId(2);
        o2.setObservacoes("carro em péssimas condições");
        o2.setData_string("15/12/2022");
        
        orcamentos.add(o2);
        
     
        
        return orcamentos;
    }

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

    private void imprimeListaOrcamentos(List<Orcamento> lista) {
        
        for(Orcamento o : lista){
            System.out.println("ORCAMENTO");
            System.out.println("Id: "+ o.getId());
            System.out.println("Observações: " + o.getObservacoes());
            System.out.println("Data: "+ o.getData_string());
            
            if(o.getCliente()!= null){
                System.out.println("CLIENTE");
                System.out.println("\tCPF: " +o.getCliente().getCpf());
                System.out.println("\tNome: " + o.getCliente().getNome());
                System.out.println("\tData Nascimento: " + o.getCliente().getData_nascimento_string());
                System.out.println("\tComplemento: " + o.getCliente().getComplemento());
                System.out.println("\tObservações: " + o.getCliente().getObservacoes());
                }
            
            if(o.getVeiculo() != null){
                System.out.println("VEICULO");
                Veiculo v = o.getVeiculo();
                System.out.println("\tPlaca: " + v.getPlaca());
                System.out.println("\tModelo: "+ v.getModelo());
                System.out.println("\tAno: "+ v.getAno());
                System.out.println("\tData Ultimo Serviço: "+ v.getData_ultimo_servico_string());
                
            }
            
        }
    }

    public static void main(String args[]) {

        new Questao_2_3_4();
    }

}


