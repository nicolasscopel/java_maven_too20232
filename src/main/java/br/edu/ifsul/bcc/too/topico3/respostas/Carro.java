/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico3.respostas;
import java.util.List;

/**
 *
 * @author 20222PF.CC0019
 */
public class Carro {

        private String nomeCarro;
        private String modeloCarro;
        private String fabricanteCarro;
        private String numeroDoChassiCarro;
        private Double valorDeMercadoCarro;
        
        

        // Construtor público para inicializar os atributos
        public Carro(String nome, String modelo, String fabricante, String numeroChassi, double valorDeMercado) {
            this.nomeCarro = nome;
            this.modeloCarro = modelo;
            this.fabricanteCarro = fabricante;
            this.numeroDoChassiCarro = numeroChassi;
            this.valorDeMercadoCarro = valorDeMercado;
        }

        // Sobrescreva o método toString para retornar o código e modelo
        @Override
        public String toString() {
            return "Código: " + this.numeroDoChassiCarro + ", Modelo: " + this.modeloCarro;
        }

    }