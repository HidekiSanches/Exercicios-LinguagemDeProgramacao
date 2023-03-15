/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.introducao.poo;

/**
 *
 * @author hidek
 */
public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void aumentarTemperatura(Double valorAumentar) {
        Double validar = temperaturaAtual + valorAumentar;
        if (validar <= temperaturaMax) {
            temperaturaAtual += valorAumentar;
        } else {
            System.out.println("Temperatura invalida -  Excedeo valor maximo pré definido");
        }
    }

    void dimunuiTemperatura(Double valorDiminuir) {
        Double validar = temperaturaAtual - valorDiminuir;
        if (validar >= temperaturaMin) {
            temperaturaAtual -= valorDiminuir;
        } else {
            System.out.println("Temperatura invalida - Excede o valor minimo pré definido");
        }
    }

    void exibirFahreinheit() {
        Double temperaturaFahreinheit;
        temperaturaFahreinheit = (temperaturaAtual * 9 / 2) + 32;

        System.out.println(String.format("Temperatura: %.1f", temperaturaFahreinheit));
    }

}
