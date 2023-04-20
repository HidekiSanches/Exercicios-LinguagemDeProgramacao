/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.atividade02.ac02;

import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class TesteValidacaoNumerica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Utilitaria util = new Utilitaria();

        Integer numero = 0;
        do {
            System.out.println("Digite um numero: ");
            numero = leitor.nextInt();

            if (numero < 0) {
            } else {
                util.verificarPrimo(numero);
            }
        } while (numero >= 0);
        System.out.println("programa encerrado");
    }

}
