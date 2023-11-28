/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */
public class Cliente extends Pessoa{
    
    private String observacoes;
    
    private Collection<Veiculo> veiculo;
    
    

    public Cliente() {
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Collection<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Collection<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
    
}
