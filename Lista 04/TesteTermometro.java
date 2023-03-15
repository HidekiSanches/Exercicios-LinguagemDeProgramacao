/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.introducao.poo;

import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class TesteTermometro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Termometro termometro = new Termometro();
        Boolean loop = true;
        
        termometro.temperaturaAtual = 20.0;
        termometro.temperaturaMax = 60.0;
        termometro.temperaturaMin = 0.0;
        
        while (loop) {
            System.out.println("1 - Aumentar\n2 - Diminuir\n3 - Fahreinheit\n4 - Sair\n\n");
            Integer opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Quanto você quer aumentar:");
                    Double temperaturaAumentar = leitor.nextDouble();
                    termometro.aumentarTemperatura(temperaturaAumentar);
                    break;
                case 2:
                    System.out.println("Quanto você quer diminuir:");
                    Double temperaturaDiminuir = leitor.nextDouble();
                    termometro.dimunuiTemperatura(temperaturaDiminuir);
                    break;
                case 3:
                    termometro.exibirFahreinheit();
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
    }

}
