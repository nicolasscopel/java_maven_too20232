/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author Nicolas Scopel
 */
public class Round {
    
      private Integer id;
      private Integer numero;
      private Calendar inicio;
      private Calendar fim;
    
    
      private Partida partida; //AGREGAÇÃO POR COMPOSIÇÃO
      private Modo modo; // ENUM
      private Collection<Objetivo> objetivo; //AGREGAÇÃO NORMAL

    public Round() {
    }

    public Round(Integer id, Integer numero, Calendar inicio, Calendar fim, Partida partida, Modo modo, Collection<Objetivo> objetivo) {
        this.id = id;
        this.numero = numero;
        this.inicio = inicio;
        this.fim = fim;
        this.partida = partida;
        this.modo = modo;
        this.objetivo = objetivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Modo getModo() {
        return modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }

    public Collection<Objetivo> getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Collection<Objetivo> objetivo) {
        this.objetivo = objetivo;
    }
      
      
      
      
    
}
