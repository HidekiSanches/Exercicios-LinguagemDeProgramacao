/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista02.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author hidek
 */
public class Loteria {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 10: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 10);
        
        Integer tentativas = 1;
        while (numeroDigitado < numeroSorteado) {
            System.out.println("\nTentar novamente: ");
            numeroDigitado = leitor.nextInt();
            
            tentativas++;
        }
        System.out.println("\nAcertou!!!");
        
        if (tentativas <= 3){
            System.out.println("Você é MUITO sortudo!");
        } else if (tentativas <= 10){
            System.out.println("Você é sortudo");
        } else {
            System.out.println("é melhor você árar de apostar e ir trabalhar");
        }
    }
    
}
