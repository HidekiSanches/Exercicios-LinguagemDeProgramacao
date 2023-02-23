/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista03.nivelamento;

import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class ClasseSocial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClassePertence pert = new ClassePertence();
        CalcularSalario calc = new CalcularSalario();

        System.out.println("Digite a sua renda:");
        Double salario = leitor.nextDouble();
        Double renda = calc.salarioMinimo(salario);
        
        System.out.println(String.format("Você recebe aproximadamente %.1f salário mínimo.", renda));
        
        String classe = pert.classeSocial(renda);
        System.out.println(String.format("VocÊ pertence a classe social: %s", classe));
    }

}
