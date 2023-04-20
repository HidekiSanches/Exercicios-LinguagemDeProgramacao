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
public class TesteIdade {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Utilitaria util = new Utilitaria();

        System.out.println("Digite a sua idade: ");
        Integer idade = leitor.nextInt();

        util.classificaIdade(idade);
    }
}
