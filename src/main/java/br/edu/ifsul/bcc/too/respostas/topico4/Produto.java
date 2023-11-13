/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.respostas.topico4;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */
public class Produto {
        
        private Integer id;
        private String nome;
        private Float valor;
        
       private Collection<Foto> fotos; //AGREGAÇÃO POR COMPOSIÇÃO

    public Produto() {
    }

    public Produto(Integer id, String nome, Float valor, Collection<Foto> fotos) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.fotos = fotos;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Collection<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(Collection<Foto> fotos) {
        this.fotos = fotos;
    }
    
    
    //Metodo adicional para complementar o encapsulamento do this.fotos    
     public void setFoto(Foto foto) {
         if(this.fotos == null)
             this.fotos = new ArrayList();
         
        this.fotos.add(foto);
    }
       
        
        
}
