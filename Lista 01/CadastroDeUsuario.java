package com.hideki.lista01.nivelamento;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hidek
 */
public class CadastroDeUsuario {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Login: ");
        String login = leitor.next();
        
        System.out.println("Senha: ");
        String senha = leitor.next();
        
        System.out.println("Vezes antes do bloqueo: ");
        Integer vezes = leitor.nextInt();
        
        System.out.println("\nSeu login é " + login + " e sua senha é " + senha + ". Você tem " + vezes + "tentativas antes de ser bloqueado");
    }
    
}
