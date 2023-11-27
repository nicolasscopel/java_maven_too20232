/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */
public class Servico {
    
    private Integer id;
    private Float valor;
    private Calendar data_inicio;
    private Calendar data_fim;
    
    private StatusServico status;
    private Equipe equipe;
    private Orcamento orcamentos;
    private Collection<Pagamento> pagamentos;

    public Servico() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_fim() {
        return data_fim;
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public StatusServico getStatus() {
        return status;
    }

    public void setStatus(StatusServico status) {
        this.status = status;
    }

    public Equipe getEquipes() {
        return equipe;
    }

    public void setEquipes(Equipe equipes) {
        this.equipe = equipes;
    }

    public Orcamento getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(Orcamento orcamentos) {
        this.orcamentos = orcamentos;
    }

    public Collection<Pagamento> getPagamento() {
        return pagamentos;
    }

    public void setPagamento(Collection<Pagamento> pagamento) {
        this.pagamentos = pagamento;
    }
    
    
    
}
