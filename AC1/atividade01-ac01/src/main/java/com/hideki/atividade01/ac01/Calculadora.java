/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Boolean parada = true;
        Integer inteiro;

        while (parada) {
            System.out.println("\nDigite o número correspondente a operação desejada:");
            System.out.println("\n1 - Soma \n2 - Multiplicação \n3 - Divisão \n4 - Subtração \n5 - Resto \n6 - Potência \n0 - Sair \n");

            Integer esc1 = leitor.nextInt();
            switch (esc1) {
                case 0:
                    System.out.println("Até logo!");
                    parada = false;
                    break;
                case 1:
                    System.out.println("Digite um número inteiro:");
                    inteiro = leitor.nextInt();
                    Integer soma;

                    for (int i = 1; i <= 10; i++) {
                        soma = inteiro + i;
                        System.out.println(String.format("%d + %d = %d", inteiro, i, soma));
                    }
                    break;
                case 2:
                    System.out.println("Digite um número inteiro:");
                    inteiro = leitor.nextInt();
                    Integer mult;

                    for (int i = 1; i <= 10; i++) {
                        mult = inteiro * i;
                        System.out.println(String.format("%d * %d = %d", inteiro, i, mult));
                    }
                    break;
                case 3:
                    System.out.println("Digite um número inteiro:");
                    inteiro = leitor.nextInt();
                    Integer div;

                    for (int i = 1; i <= 10; i++) {
                        div = inteiro / i;
                        System.out.println(String.format("%d / %d = %d", inteiro, i, div));
                    }
                    break;
                case 4:
                    System.out.println("Digite um número inteiro:");
                    inteiro = leitor.nextInt();
                    Integer sub;

                    for (int i = 1; i <= 10; i++) {
                        sub = inteiro - i;
                        System.out.println(String.format("%d - %d = %d", inteiro, i, sub));
                    }
                    break;
                case 5:
                    System.out.println("Digite um número inteiro:");
                    inteiro = leitor.nextInt();
                    Integer resto;

                    for (int i = 1; i <= 10; i++) {
                        resto = inteiro % i;
                        System.out.println(String.format("%d %s %d = %d", inteiro,"%", i, resto));
                    }
                    break;
                case 6:
                    System.out.println("Digite um número inteiro:");
                    inteiro = leitor.nextInt();
                    Integer potencia = 0;

                    for (int i = 1; i <= 10; i++) {
                        if (potencia.equals(0)) {
                            potencia = inteiro;
                        } else {
                            potencia *= inteiro;
                        }
                        System.out.println(String.format("%d ^ %d = %d", inteiro, i, potencia));
                    }
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;
            }
        }
    }

}
