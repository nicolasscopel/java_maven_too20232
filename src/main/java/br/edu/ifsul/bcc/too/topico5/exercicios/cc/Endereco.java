/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

/**
 *
 * @author 20222PF.CC0019
 */
public class Endereco {
    
    private Integer Id;
    private String cep;
    private String complemento;
   
    

    public Endereco() {
    }

    public Endereco(Integer Id, String cep, String complemento) {
        this.Id = Id;
        this.cep = cep;
        this.complemento = complemento;
       
    }

    
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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
    
    
    
    
}
