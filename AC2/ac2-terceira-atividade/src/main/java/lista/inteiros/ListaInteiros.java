/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class ListaInteiros {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        Boolean semZero = true;
        Integer numero = null;
        Integer maior = null;
        Integer menor = null;

        while (semZero) {
            System.out.println("Insira um numero:");
            numero = leitor.nextInt();

            if (numero.equals(0)) {
                System.out.println("Programa encerrado");
                semZero = false;
            } else {
                numeros.add(numero);
            }
        }
        System.out.println("\nPares:");
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("\nImpares:");
        for (Integer num : numeros) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println("\nSoma:");
        Integer soma = 0;
        for (Integer num : numeros) {
            soma += num;
        }
        System.out.println(soma);
        System.out.println("\nMenor:");
        for (Integer num : numeros) {
            if (menor == null) {
                menor = num;
            } else if (menor > num) {
                menor = num;
            }
        }
        System.out.println(menor);
        System.out.println("\nMaior:");
        for (Integer num : numeros) {
            if (maior == null) {
                maior = num;
            } else if (maior < num) {
                maior = num;
            }
        }
        System.out.println(maior);
    }

}
