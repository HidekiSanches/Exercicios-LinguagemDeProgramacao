/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista01.nivelamento;

import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class CalculoDeMedia {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = leitor.next();
        
        System.out.println("Digite a sua primeira nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a sua segunda nota: ");
        Double nota2 = leitor.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println("Olá, " + nome + ". Sua média foi de " + media);
    }
    
}
