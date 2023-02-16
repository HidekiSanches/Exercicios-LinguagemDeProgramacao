/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista02.nivelamento;

/**
 *
 * @author hidek
 */
public class ContadorVariado {
    public static void main(String[] args) {
        Double num = 0.15;
        for (int i = 0; i < 33; i++){
            System.out.println(String.format("%.2f", num));
            num += 0.15;
        }
    }
}
