/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

/**
 *
 * @author 20222PF.CC0019
 */
public class ItensCompra {
    
    private Integer id;
    private String quantidade;
    private Float valor;
    
    private Compra compra;
    
    private Artefato artefato;

    public ItensCompra() {
    }

    public ItensCompra(Integer id, String quantidade, Float valor, Compra compra, Artefato artefato) {
        this.id = id;
        this.quantidade = quantidade;
        this.valor = valor;
        this.compra = compra;
        this.artefato = artefato;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Artefato getArtefato() {
        return artefato;
    }

    public void setArtefato(Artefato artefato) {
        this.artefato = artefato;
    }
    
    
    
}
