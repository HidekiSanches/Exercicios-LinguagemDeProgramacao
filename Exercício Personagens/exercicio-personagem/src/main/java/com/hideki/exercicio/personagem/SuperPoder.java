/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.personagem;

/**
 *
 * @author hidek
 */
public class SuperPoder {
    
    private String nome;
    private Integer categoria;

    public SuperPoder(String nome, Integer categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Super-Poder:\n Nome: %s\n Categoria: %s", nome, categoria);
    }
    
}
