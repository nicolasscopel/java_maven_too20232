/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */
public class Jogador {
    
    private String nickname;
    private String senha;
    private Integer pontos;
    private Calendar data_cadastro;
    private Calendar data_ultimo_login;
    private Endereco endereco;
    
    private Collection<Artefato> artefato;
    private Collection<Patente> patente;
    private Collection<Compra> compra;

    public Jogador() {
    }

    public Jogador(String nickname, String senha, Integer pontos, Calendar data_cadastro, Calendar data_ultimo_login, Endereco endereco, Collection<Artefato> artefato, Collection<Patente> patente, Collection<Compra> compra) {
        this.nickname = nickname;
        this.senha = senha;
        this.pontos = pontos;
        this.data_cadastro = data_cadastro;
        this.data_ultimo_login = data_ultimo_login;
        this.endereco = endereco;
        this.artefato = artefato;
        this.patente = patente;
        this.compra = compra;
    }



   

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    public Collection<Artefato> getArtefato() {
        return artefato;
    }

    public void setArtefato(Collection<Artefato> artefato) {
        this.artefato = artefato;
    }

    public Collection<Patente> getPatente() {
        return patente;
    }

    public void setPatente(Collection<Patente> patente) {
        this.patente = patente;
    }
    
    public void setPatente(Patente patente) {
        if(this.patente == null){
            this.patente = new ArrayList();
        }
        this.patente.add(patente);
    }

    public Collection<Compra> getCompra() {
        return compra;
    }

    public void setCompra(Collection<Compra> compra) {
        this.compra = compra;
    }

    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
            
}
