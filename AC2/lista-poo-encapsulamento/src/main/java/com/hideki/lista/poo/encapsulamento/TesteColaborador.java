/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.poo.encapsulamento;

/**
 *
 * @author hidek
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador();
        Colaborador colab2 = new Colaborador();
        RecursosHumanos rh = new RecursosHumanos();

        colab1.setNome("Hideki");
        colab1.setCargo("Desenvolvidor Back-end");
        colab1.setSalario(2400.00);

        colab2.setNome("Sasaoka");
        colab2.setCargo("Deselvolvidor Front-end");
        colab2.setSalario(2000.00);

        System.out.println(String.format("\nColaborador 1: %s, %s, R$%.2f \nColaborador 2: %s, %s, R$%.2f\n", colab1.getNome(), colab1.getCargo(), colab1.getSalario(), colab2.getNome(), colab2.getCargo(), colab2.getSalario()));

        rh.promoverColaborador(colab1, "Desenvolvedor Fullsatack", 3000.00);
        rh.promoverColaborador(colab2, "Analista", 1800.00);

        rh.reajustarSalario(colab2, 0.09);

        System.out.println(String.format("\nColaborador 1: %s, %s, R$%.2f \nColaborador 2: %s, %s, R$%.2f\n", colab1.getNome(), colab1.getCargo(), colab1.getSalario(), colab2.getNome(), colab2.getCargo(), colab2.getSalario()));
        System.out.println("Total promovidos: " + rh.getTotalPromovidos());
        System.out.println("Total salários reajustados: " + rh.getTotalReajustes());
    }

}
