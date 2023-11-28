/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author 20222PF.CC0019
 */
public abstract class Pessoa {
    
    private String cpf;
    private String nome;
    private String cep;
    private String complemento;
    private Calendar data_nascimento;

    public Pessoa() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

      public String getData_nascimento_string() {
         if(this.data_nascimento != null){
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             return sdf.format(this.data_nascimento.getTime());
         }else{
             return null;
         }
                 
    }
      
      public void setData_nascimento_string(String data_nascimento) {
        if(data_nascimento != null){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar c = Calendar.getInstance();                
                c.setTime(sdf.parse(data_nascimento));
                this.data_nascimento = c;
            } catch (ParseException ex) {
                this.data_nascimento = null;
            }
        }
       
    }
      
      
    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    
    
}
