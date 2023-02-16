/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista02.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author hidek
 */
public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 100: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer acerto = 0;
        Integer pares = 0;
        Integer impares = 0;
        for (int i = 0; i <= 200; i++) {
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 100);
            if (numeroSorteado.equals(numeroDigitado) && acerto.equals(0)) {
                acerto++;
                System.out.println(String.format("O numero foi sorteado pela primeira vez na posição %dª", i));
            }
            if (numeroSorteado % 2 == 0) {
                pares++;
            } else if (numeroSorteado % 2 == 1) {
                impares++;
            }
        }
        if (acerto.equals(0)) {
            System.out.println("O seu numero não foi sorteado nenhuma vez");
        }
        System.out.println(String.format("\nForam sorteados %d numeros pares", pares));
        System.out.println(String.format("\nForam sorteados %d numeros impares", impares));
    }

}
