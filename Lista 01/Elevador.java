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
public class Elevador {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o limite de peso do elevador: ");
        Double peso = leitor.nextDouble();
        
        System.out.println("Digite o limite de pessos no elevador: ");
        Integer pessoas = leitor.nextInt();
        
        System.out.println("Digite o peso da primeira pessoa: ");
        Double pesoPessoa1 = leitor.nextDouble();
        
        System.out.println("Digite o peso da segunda pessoa: ");
        Double pesoPessoa2 = leitor.nextDouble();
        
        System.out.println("Digite o peso da terceira pessoa: ");
        Double pesoPessoa3 = leitor.nextDouble();
        
        Double somaPesos = pesoPessoa1 + pesoPessoa2 + pesoPessoa3;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + pessoas + " pessoas. O peso total no elevador é de " + somaPesos + ", sendo que ele suporta " + peso);
    }
    
}
