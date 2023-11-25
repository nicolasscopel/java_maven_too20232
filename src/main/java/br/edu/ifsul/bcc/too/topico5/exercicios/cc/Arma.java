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
public class Arma extends Artefato{
    
    private Float comprimento_cano;
    
    private Tipo tipo;
    
    private Collection<Municao> municao;

    
    public Arma() {
    }
    
    
    public Arma(Float comprimento_cano, Tipo tipo, Collection<Municao> municao) {
        this.comprimento_cano = comprimento_cano;
        this.tipo = tipo;
        this.municao = municao;
    }


    public Float getComprimento_cano() {
        return comprimento_cano;
    }

    public void setComprimento_cano(Float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Collection<Municao> getMunicao() {
        return municao;
    }

    public void setMunicao(Collection<Municao> municao) {
        this.municao = municao;
    }
    
    
    
}
