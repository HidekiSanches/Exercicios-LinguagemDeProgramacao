/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.personagem;

/**
 *
 * @author hidek
 */
public class Heroi extends Personagem{

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double aux = 0.0;
        for (SuperPoder poder : poderes){
           aux += Double.valueOf(poder.getCategoria() + (poder.getCategoria() * 1.15));
        }
        return aux;
    }

}
