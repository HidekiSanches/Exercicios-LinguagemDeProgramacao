/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.personagem;

/**
 *
 * @author hidek
 */
public class Confronto {
    
    public void lutar(Heroi heroi, Vilao vilao){
        if (heroi.getForcaTotal() > vilao.getForcaTotal()){
            System.out.println("VENCEDOR " + heroi.getNome() + "!");
        } else if (vilao.getForcaTotal() > heroi.getForcaTotal()){
            System.out.println("VENCEDOR " + vilao.getNome() + "!");
        } else {
            System.out.println("EMPATE");
        }
    }
    
}
