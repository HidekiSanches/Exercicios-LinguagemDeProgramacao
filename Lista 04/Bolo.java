/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.introducao.poo;

/**
 *
 * @author hidek
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer qtdVendida;

    void comprarBolo(Integer qtdBolo) {
        if ((qtdVendida + qtdBolo) > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        } else {
            System.out.println("Compra realizada com sucesso!");
            qtdVendida += qtdBolo;
        }
    }

    void exibirRelatorio() {
        Double lucro = qtdVendida * valor;
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f", sabor, qtdVendida, lucro));
    }
}
