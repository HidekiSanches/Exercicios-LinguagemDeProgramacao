/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.ac2.segunda.atividade;

/**
 *
 * @author hidek
 */
public class AtividadeTeste {
    
    public static void main(String[] args) {
        
        Atividade atividade1 = new Atividade("Codigo Java", "Hideki", 3);
        Atividade atividade2 = new Atividade("Codigo Javascript", "Sasaoka", 2);
        
        atividade1.terminarAtividade(2);
        
        atividade1.calcularTempo();
        
        System.out.println(atividade1);
        
        atividade2.terminarAtividade(3);
        
        atividade2.calcularTempo();
        
        System.out.println(atividade2);
        
    }
    
}
