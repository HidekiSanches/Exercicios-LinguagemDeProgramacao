/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.relacionamento;

/**
 *
 * @author hidek
 */
public class Produto {
    
    private String nome;
    private String categoria;
    private Double preco;

    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCategoria: %s\nPreço: %.2f\n", nome, categoria, preco);
    }
    
    
}
