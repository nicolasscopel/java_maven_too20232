/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

import java.util.Collection;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Scopel
 */
public class Mapa {
    
    private Integer id;
    private String nome;
    
    private Collection<Local> local;

    public Mapa() {
    }

    public Mapa(Integer id, String nome, Collection<Local> local) {
        this.id = id;
        this.nome = nome;
        this.local = local;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Local> getLocal() {
        return local;
    }

    public void setLocal(Collection<Local> local) {
        this.local = local;
    }
    
    
    
    
    
    
    
}
