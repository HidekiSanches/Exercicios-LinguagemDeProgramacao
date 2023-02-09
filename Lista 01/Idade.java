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
public class Idade {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = leitor.next();
        
        System.out.println("Olá, " + nome + "! qual o ano de seu nascimento?");
        Integer ano = leitor.nextInt();
        
        Integer futuraIdade = 2030 - ano;
        
        System.out.println("Em 2030 você terá " + futuraIdade);
    }
    
}
