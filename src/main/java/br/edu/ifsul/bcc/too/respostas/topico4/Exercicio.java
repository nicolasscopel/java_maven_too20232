/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.respostas.topico4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author 20222PF.CC0019
 */
public class Exercicio {
    
        private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         private Calendar cal = Calendar.getInstance();
         Collection<Pessoa> cltP = new ArrayList();
    
    

    
    /*
    - Criar a Main
    - Criar um construtor;
    - Criar um método que retorne a colecao Pessoa
    - Essa coleção devera ter 5 pessoas (1 func, 2 cliente e 2 aluno);
    */
    
    public Exercicio() {
        getPessoas();
        imprimePessoa(cltP);
        
    }
    
    private Collection<Pessoa> getPessoas(){
        
        //FUNCIONARIO
        Pessoa p = new Funcionario(); // Funcionario p = new Funcionario;   Pessoa p = new Funcionario(atributos do funcionario)
        p.setCpf("02292988003");
        p.setRg("5116835512");
        p.setNome("Nicolas");
        p.setLogradouro("Bandeirantes");
        p.setNumero(1050);
        p.setPeso(75.0f);
        p.setDataNasc(Calendar.getInstance());
        p.setStatus(Boolean.TRUE);
        ((Funcionario)p).setData_admissao(Calendar.getInstance());
        ((Funcionario)p).setNumero_ctps("32");
        
        cltP.add(p);
        
        //CLIENTE
        p = new Cliente(Calendar.getInstance(), "nada");
        p.setCpf("61423521072");
        p.setRg("902154873");
        p.setNome("Igor");
        p.setLogradouro("Expedicionário");
        p.setNumero(2012);
        p.setPeso(55.0f);
        p.setDataNasc(Calendar.getInstance());
        p.setStatus(Boolean.FALSE);
        
        cltP.add(p);
        
        
        //CLIENTE
        p = new Cliente(Calendar.getInstance(), "deve");
        p.setCpf("52881789243");
        p.setRg("1256823");
        p.setNome("Marcela");
        p.setLogradouro("Das Vivendas");
        p.setNumero(1542);
        p.setPeso(55.0f);
        p.setDataNasc(Calendar.getInstance());
        p.setStatus(Boolean.FALSE);
        
        cltP.add(p);
        
        //ALUNO
        Aluno a = new Aluno();
        a.setCpf("76589134276");
        a.setRg("6723446");
        a.setNome("Vanderson");
        a.setLogradouro("Das Flores");
        a.setNumero(1542);
        a.setPeso(73.0f);
        a.setDataNasc(Calendar.getInstance());
        a.setStatus(Boolean.FALSE);
        a.setCoeficiente_rendimento(6.9f);
        a.setNumero_matricula("20222PF.CC0019");
  
        cltP.add(a);
                
        //ALUNO
        a = new Aluno();
        a.setCpf("82343990192");
        a.setRg("6352213");
        a.setNome("Antonio");
        a.setLogradouro("7 de Setermbro");
        a.setNumero(1542);
        a.setPeso(73.0f);
        a.setDataNasc(Calendar.getInstance());
        a.setStatus(Boolean.TRUE);
        a.setCoeficiente_rendimento(8.8f);
        a.setNumero_matricula("20200PF.CC0045");
        
        cltP.add(a);
        
        

        
        return null;
    }
    
    private void imprimePessoa(Collection<Pessoa> pessoas){
        //imprimir cada elemento da coleção
        
         for(Pessoa j : pessoas){
                
               if(j instanceof Funcionario){
                   //Funcionario func = (Funcionario) f;
                  // System.out.println("CtPs: " + func.getNumero_ctps());
                   System.out.println("Ctps Func: " + ((Funcionario) j).getNumero_ctps());
                   
               }else if(j instanceof Aluno){
                   System.out.println("Matrícula Aluno: "+ ((Aluno) j).getNumero_matricula());
                   
               }else if(j instanceof Cliente){
                   System.out.println("Data Ultima Compra"+ ((Cliente) j).getData_ultima_compra());
                   
               }else if(j instanceof Pessoa){
                   System.out.println("CPF Pessoa: "+ j.getCpf());
                   
               }
            }
    }
    
    
    public static void main(String[] args){

        new Exercicio(); //CRIAÇÃO DA INSTANCIA
    }
}
