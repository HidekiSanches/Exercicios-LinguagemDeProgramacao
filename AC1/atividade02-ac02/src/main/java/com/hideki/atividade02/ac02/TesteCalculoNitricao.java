/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.atividade02.ac02;

import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class TesteCalculoNitricao {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Utilitaria util = new Utilitaria();
        
        Double peso;
        System.out.println("Digite o seu peso:");
        peso = leitor.nextDouble();
        
        Double altura;
        System.out.println("Digite a sua altura:");
        altura = leitor.nextDouble();
        
        util.exibirIMC(peso, altura);
    }
    
}
