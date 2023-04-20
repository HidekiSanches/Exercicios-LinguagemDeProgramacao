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
public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Utilitaria util = new Utilitaria();
        
        System.out.println("Digite a nota de entrega:");
        Double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota da avaliação continuada:");
        Double nota2 = leitor.nextDouble();
        
        Double nota = util.calcularMedia(nota1, nota2);
        System.out.println(String.format("Sua média é: %.2f", nota));
    }
}
