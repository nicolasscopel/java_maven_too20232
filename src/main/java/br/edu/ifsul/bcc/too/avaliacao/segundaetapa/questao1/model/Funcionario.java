/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author 20222PF.CC0019
 */
public class Funcionario extends Pessoa{
    
    private String numero_ctps;
    private Calendar data_admissao;
    private Calendar data_demissao;
    
    private Cargo cargo;

    public Funcionario() {
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Calendar getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Calendar data_admissao) {
        this.data_admissao = data_admissao;
    }
    
    public String getData_admissao_string(){
        if(this.data_admissao != null){
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             return sdf.format(this.data_admissao.getTime());
         }else{
             return null;
         }
    }
    
     public void setData_admissao_string(String data_admissao) {
        if(data_admissao != null){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar c = Calendar.getInstance();                
                c.setTime(sdf.parse(data_admissao));
                this.data_admissao = c;
            } catch (ParseException ex) {
                this.data_admissao = null;
            }
        }
       
    }

    public Calendar getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Calendar data_demissao) {
        this.data_demissao = data_demissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    
    
}
