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
public class SalarioLiquido {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu salário bruto: ");
        Double salario = leitor.nextDouble();
        
        System.out.println("Digite o custo da condução: ");
        Double custo = leitor.nextDouble();
        
        Double INSS = salario*0.1;
        Double IR = salario*0.2;
        Double VT = custo*2*22;
        
        Double salarioLiquido = salario - INSS - IR - VT;
        System.out.println("Seu salário bruto é R$" + salario + ", tem um total de R$" + (INSS + IR + VT) + " em descontos e receberá um líquido de R$" + salarioLiquido);
    }
    
}
