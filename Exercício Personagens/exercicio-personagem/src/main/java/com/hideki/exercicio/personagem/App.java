/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.personagem;

/**
 *
 * @author hidek
 */
public class App {
    
    public static void main(String[] args) {
        
        Heroi per1 = new Heroi("Batman", "Bruce Wayne");
        Heroi per2 = new Heroi("Homem-Aranha", "Peter Parker");
        
        Vilao per3 = new Vilao("Doutor Destino", "Victor von Doom");
        Vilao per4 = new Vilao("Dick Vigarista", "Dick Dastardly");
        
        SuperPoder poder1 = new SuperPoder("Pegar o pombo", 10);
        SuperPoder poder2 = new SuperPoder("Corrida maluca", 10);
        SuperPoder poder3 = new SuperPoder("Sentido aranha", 6);
        SuperPoder poder4 = new SuperPoder("Dinheiro", 6);
        SuperPoder poder5 = new SuperPoder("Raio", 6);
        
        per4.adicionarPoder(poder1);
        per4.adicionarPoder(poder2);
        per2.adicionarPoder(poder3);
        per3.adicionarPoder(poder4);
        per3.adicionarPoder(poder5);
        per1.adicionarPoder(poder4);
        
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
        
        Confronto con = new Confronto();
        System.out.println("\n\n\n");
        System.out.println("Batman vs Doutor Destino");
        con.lutar(per1, per3);
        System.out.println("Homem-Aranha vs Dick Vigarista");
        con.lutar(per2, per4);
    }
    
}
