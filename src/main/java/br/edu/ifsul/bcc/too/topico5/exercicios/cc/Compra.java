/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */
public class Compra {
    
    private Integer id;
    private Calendar data;
    private Float total;
            
    private Jogador jogador;
    private Collection<ItensCompra> itenscompra; //AGREGAÇÃO POR COMPOSICAO

    public Compra() {
    }

    public Compra(Integer id, Calendar data, Float total, Jogador jogador, Collection<ItensCompra> itenscompra) {
        this.id = id;
        this.data = data;
        this.total = total;
        this.jogador = jogador;
        this.itenscompra = itenscompra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Collection<ItensCompra> getItenscompra() {
        return itenscompra;
    }

    public void setItenscompra(Collection<ItensCompra> itenscompra) {
        this.itenscompra = itenscompra;
    }
    
    
    
    
    
}
