/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.respostas.topico4;

/**
 *
 * @author 20222PF.CC0019
 */


public class Aluno extends Pessoa{
    private String numero_matricula;
    private Float coeficiente_rendimento;
    
    //atributo da instância: STRING numero_matricula, FLOAT  coeficiente de rendimento

    public Aluno() {
    }

    public Aluno(String numero_matricula, Float coeficiente_rendimento) {
        this.numero_matricula = numero_matricula;
        this.coeficiente_rendimento = coeficiente_rendimento;
    }

    
    public String getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(String numero_matricula) {
        this.numero_matricula = numero_matricula;
    }
    
    

    public Float getCoeficiente_rendimento() {
        return coeficiente_rendimento;
    }

    public void setCoeficiente_rendimento(Float coeficiente_rendimento) {
        this.coeficiente_rendimento = coeficiente_rendimento;
    }

    
    
    


}