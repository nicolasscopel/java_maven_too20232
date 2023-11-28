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
public class Veiculo {
    
    private String placa;
    private String modelo;
    private Integer ano;
    private Calendar data_ultimo_servico;

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Calendar getData_ultimo_servico() {
        return data_ultimo_servico;
    }

    
    public void setData_ultimo_servico(Calendar data_ultimo_servico) {
        this.data_ultimo_servico = data_ultimo_servico;
    }
    
    
    //GET AND SETTER PARA RECEBER A DATA EM STRING E MANIPULAR FORA DO CODIGO 
    public String getData_ultimo_servico_string() {
        
       if(this.data_ultimo_servico != null){
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             return sdf.format(this.data_ultimo_servico.getTime());
         }else{
             return null;
         }
    }

    public void setData_ultimo_servico_string(String data_ultimo_servico) {
       if(data_ultimo_servico != null){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar c = Calendar.getInstance();                
                c.setTime(sdf.parse(data_ultimo_servico));
                this.data_ultimo_servico = c;
            } catch (ParseException ex) {
                this.data_ultimo_servico = null;
            }
        }
    }
    
    
    
    
}
