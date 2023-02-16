/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista02.nivelamento;

import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class Acumulador {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numéro: ");
        System.out.println("OBS: só para no 0!");
        Integer numeroDigitado = leitor.nextInt();
        Integer soma = 0;
        
        while (numeroDigitado != 0){
            soma += numeroDigitado;
            
            System.out.println("Digite um numéro: ");
            numeroDigitado = leitor.nextInt();
        }
        System.out.println(String.format("A soma dos números é %d", soma));
    }
    
}
