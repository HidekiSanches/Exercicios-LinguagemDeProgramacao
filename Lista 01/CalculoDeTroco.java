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
public class CalculoDeTroco {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        Double valorProduto = leitor.nextDouble();
        
        System.out.println("Digite a quantidade do produto: ");
        Double qtdProduto = leitor.nextDouble();
        
        System.out.println("Digite o valor pago pelo cliente: ");
        Double pagoCliente = leitor.nextDouble();
        
        Double troco = pagoCliente - (valorProduto * qtdProduto);
        System.out.println("\nSeu troco será de R$" + troco);
    }
    
}
