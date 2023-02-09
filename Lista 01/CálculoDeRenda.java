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
public class CálculoDeRenda {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de filhos 0 a 3 anos: ");
        Integer filhosDe0A3 = leitor.nextInt();
        
        System.out.println("Digite a quantidade de filhos 4 a 16 anos: ");
        Integer filhosDe4A16 = leitor.nextInt();
        
        System.out.println("Digite a quantidade de filhos 17 a 18 anos: ");
        Integer filhosDe17A18 = leitor.nextInt();
        
        Integer qtdFilhos = filhosDe0A3 + filhosDe4A16 + filhosDe17A18;
        Double bolsa = (filhosDe0A3 * 25.12)+ (filhosDe4A16 * 15.88) + (filhosDe17A18 * 12.44);
        
        System.out.println("Você tem um total de " + qtdFilhos + " filhos e vai receber R$" + bolsa + " de bolsa");
    }   
    
}
