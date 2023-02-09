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
public class Calculadora {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Primeiro numero: ");
        Double num1 = leitor.nextDouble();
        
        System.out.println("Segundo numero: ");
        Double num2 = leitor.nextDouble();
        
        Double soma = num1+num2;
        Double sub = num1-num2;
        Double mult = num1*num2;
        Double div = num1/num2;
        
        System.out.println("\nResultado da soma: " + soma + "\nResultado da subtração: " + sub + "\nResultado da multiplicação: " + mult+ "\n Resultado da divisão: " +div);
    }
    
}
