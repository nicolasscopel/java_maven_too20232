/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.respostas.topico4;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */

//Classe Funcionario é a subclasse (classe filha)
//Classe Pessoa é a SuperClasse (classe mãe)
public class Funcionario extends Pessoa {
    
    private String numero_ctps;
    private Calendar data_admissao;
    // atributo STRING numero_ctps e CALENDAR data de admissao

    // o funcionario poderia estar vinculado com vários cursos
    // um curso pode estar vinculado a nenhum ou a vários funcionários
    private Collection<CursoAprimoramento> cursos;
    
    public Funcionario() {
    }


    public Funcionario(String numero_ctps, Calendar data_admissao, Collection<CursoAprimoramento> cursos) {
        this.numero_ctps = numero_ctps;
        this.data_admissao = data_admissao;
        this.cursos = cursos;
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
        this.data_admissao= data_admissao;
    }

    public Collection<CursoAprimoramento> getCursos() {
        return cursos;
    }

    public void setCursos(Collection<CursoAprimoramento> cursos) {
        this.cursos = cursos;
    }

  
    
    
    
    
    
}
