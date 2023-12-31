/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */
public class Orcamento {
    
    private Integer id;
    private String observacoes;
    private Calendar data;
    
    private Veiculo veiculo;
    private Cliente cliente;
    private Funcionario funcionario;
    
    private Collection<Peca> peca;
    private Collection<MaoObra> maodeobra;

    public Orcamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Peca> getPeca() {
        return peca;
    }

    public void setPeca(Collection<Peca> peca) {
        this.peca = peca;
    }

    public Collection<MaoObra> getMaodeobra() {
        return maodeobra;
    }

    public void setMaodeobra(Collection<MaoObra> maodeobra) {
        this.maodeobra = maodeobra;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    //GET AND SETTER PARA RECEBER A DATA EM STRING E MANIPULAR FORA DO CODIGO 
    public String getData_string() {
        
       if(this.data != null){
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             return sdf.format(this.data.getTime());
         }else{
             return null;
         }
    }

    public void setData_string(String data) {
       if(data != null){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar c = Calendar.getInstance();                
                c.setTime(sdf.parse(data));
                this.data = c;
            } catch (ParseException ex) {
                this.data = null;
            }
        }
    }
    
    
    
    
}
