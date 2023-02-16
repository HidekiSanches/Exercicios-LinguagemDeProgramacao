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
public class Votacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer queijo = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Vote no seu sabor de pizza favorito: ");
            Integer voto = leitor.nextInt();
            switch (voto){
                case 5: 
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50: 
                    queijo++;
                    break;
                default:
                    System.out.println("Numero votado invalido!");
                    i--;
            }
        }
        System.out.println(String.format("Mussarela: %d", mussarela));
        System.out.println(String.format("Calabresa: %d", calabresa));
        System.out.println(String.format("Queijos: %d", queijo));

        if (queijo > mussarela && queijo > calabresa) {
            System.out.println("\nQueijos é o sabor mais votado");
        }
        if (mussarela > queijo && mussarela > calabresa) {
            System.out.println("\nMussarela é o sabor mais votado");
        }
        if (calabresa > mussarela && calabresa > queijo) {
            System.out.println("\nCalabresa é o sabor mais votado");
        }
        if (queijo.equals(mussarela)) {
            System.out.println("\nHouve um empate entre queijos e mussarela");
        }
        if (queijo.equals(calabresa)) {
            System.out.println("\nHouve um empate entre queijos e calabresa");
        }
        if (calabresa.equals(mussarela)) {
            System.out.println("\nHouve um empate entre calabresa e mussarela");
        }
    }
}
