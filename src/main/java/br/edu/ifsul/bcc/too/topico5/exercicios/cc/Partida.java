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
public class Partida {
    
      private Integer id;
      private Calendar inicio;
      private Calendar fim;
    
      private Jogador jogador; // ASSOCIAÇÃO
      
      private Collection<Round> round; //AGREGAÇÃO POR COMPOSIÇÃO

    public Partida() {
    }

    public Partida(Integer id, Calendar inicio, Calendar fim, Jogador jogador, Collection<Round> round) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.jogador = jogador;
        this.round = round;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Collection<Round> getRound() {
        return round;
    }

    public void setRound(Collection<Round> round) {
        this.round = round;
    }
      
      
    
}
