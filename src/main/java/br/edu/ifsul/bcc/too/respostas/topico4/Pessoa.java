/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.respostas.topico4;

import java.util.Calendar;

/**
 *
 * @author 20222PF.CC0019
 */
public class Pessoa {
    
    private String cpf;
    private String rg;
    private String nome;
    private String logradouro;
    private Integer numero;
    private Calendar dataNasc;
    private Float peso;
    private Boolean status;
    
    //Atributos da instancia: cpf,rg,nome,logradouro,numero
    // data de nasc, peso
    
    // contrutor - Insert code - Constructor
    // construtor com parametros
    
    // encapsulamento Insert code - getter and setter

    public Pessoa() {
    }

    public Pessoa(String cpf, String rg, String nome, String logradouro, Integer numero, Calendar dataNasc, Float peso, Boolean status) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.dataNasc = dataNasc;
        this.peso = peso;
        this.status = status;
    }

   

   
 
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    
    public Calendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    
    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

   
    
    
    
}
