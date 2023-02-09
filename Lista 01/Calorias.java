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
public class Calorias {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tempo em minutos que passou aquecendo: ");
        Integer aquecer = leitor.nextInt();
        
        System.out.println("Digite o tempo em minutos que passou no aeróbico: ");
        Integer aerobico = leitor.nextInt();
        
        System.out.println("Digite o tempo em minutos que passou na musculação: ");
        Integer musculacao = leitor.nextInt();
        
        Integer minTotal = aquecer + aerobico + musculacao;
        Integer perdaCaloria = (aquecer * 12) + (aerobico * 20) + (musculacao * 25);
        System.out.println("Olá, Jorge. Você fez um total de " + minTotal + " minutos de exercícios e perdeu cerca de " + perdaCaloria + " calorias");
    }
    
}
