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
public class App {

    public static void main(String[] args) {
        Bolo boloChocolate = new Bolo();
        Bolo boloMorango = new Bolo();
        Bolo boloAbacaxi = new Bolo();
        Scanner leitor = new Scanner(System.in);
        Boolean compra = true;
        
        boloChocolate.sabor = "Chocolate";
        boloChocolate.valor = 30.00;
        boloChocolate.qtdVendida = 0;
        
        boloMorango.sabor = "Morango";
        boloMorango.valor = 40.00;
        boloMorango.qtdVendida = 0;
        
        boloAbacaxi.sabor = "Abacaxi";
        boloAbacaxi.valor = 50.00;
        boloAbacaxi.qtdVendida = 0;

        while (compra) {
            System.out.println("Insira o sabor do bolo:");
            System.out.println(" 1 - Chocolate\n 2 - Morango\n 3 - Abacaxi\n 4 - Sair");
            Integer opcao = leitor.nextInt();
            Integer qtdBolo;
            
            switch (opcao) {
                case 1:
                    System.out.println("Insira a quantidade de bolo:");
                    qtdBolo = leitor.nextInt();
                    
                    boloChocolate.comprarBolo(qtdBolo);
                    break;
                case 2:
                    System.out.println("Insira a quantidade de bolo:");
                    qtdBolo = leitor.nextInt();
                    
                    boloMorango.comprarBolo(qtdBolo);
                    break;
                case 3:
                    System.out.println("Insira a quantidade de bolo:");
                    qtdBolo = leitor.nextInt();
                    
                    boloAbacaxi.comprarBolo(qtdBolo);
                    break;
                case 4:
                    compra = false;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
        
        boloChocolate.exibirRelatorio();
        boloMorango.exibirRelatorio();
        boloAbacaxi.exibirRelatorio();
    }

}
