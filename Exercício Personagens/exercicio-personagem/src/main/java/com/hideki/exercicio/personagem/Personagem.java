/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.personagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public abstract class Personagem {
    
    protected String codinome;
    protected String nome;
    protected List<SuperPoder> poderes;

    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = new ArrayList();
    }
    
    public void adicionarPoder(SuperPoder poder){
        poderes.add(poder);
    }
    
    public abstract Double getForcaTotal();

    public String getCodinome() {
        return codinome;
    }

    public String getNome() {
        return nome;
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }

    @Override
    public String toString() {
        return String.format("Personagem:\n Nome: %s\n Codinome: %s\n Poderes: %s", nome, codinome, poderes);
    }
    
}
