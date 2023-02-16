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
public class Login {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Boolean ok = true;

        while (ok) {
            System.out.println("Digite o seu usuario:");
            String user = leitor.next();

            System.out.println("Digite a sua senha:");
            String password = leitor.next();
            if ((user.equals("admin")) && (password.equals("#SPtech2022"))) {
                System.out.println("Login realizado com sucesso");
                ok = false;
            } else {
                System.out.println("\nLogin e/ou senha inválidos");
            }
        }
    }

}
