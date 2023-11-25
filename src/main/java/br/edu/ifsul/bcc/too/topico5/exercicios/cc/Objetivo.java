/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

import java.util.Collection;

/**
 *
 * @author Nicolas Scopel
 */
public class Objetivo {
    
    private Integer id;
    private Integer pontos;
    private String descricao;
    
    private Collection<Local> local;

    public Objetivo() {
    }

    public Objetivo(Integer id, Integer pontos, String descricao, Collection<Local> local) {
        this.id = id;
        this.pontos = pontos;
        this.descricao = descricao;
        this.local = local;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<Local> getLocal() {
        return local;
    }

    public void setLocal(Collection<Local> local) {
        this.local = local;
    }
    
    
    
}
