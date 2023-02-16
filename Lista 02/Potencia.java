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
public class Potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da base:");
        Integer base = leitor.nextInt();

        System.out.println("Digite o valor do expoente:");
        Integer expoente = leitor.nextInt();

        Integer potencia = 0;
        for (int i = 0; i < expoente; i++) {
            if (potencia.equals(0)) {
                potencia = base;
            } else {
                potencia *= base;
            }
        }
        
        if (expoente.equals(0)){
            potencia = 1;
        }

        System.out.println(potencia);
    }

}
