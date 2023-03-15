/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.introducao.poo;

/**
 *
 * @author hidek
 */
public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado emp = new Empregado();
        Empregado eu = new Empregado();

        emp.nome = "João";
        emp.cargo = "Analista de Sistemas";
        emp.salario = 5400.00;
        emp.reajuste = 15.0;

        eu.nome = "Thiago";
        eu.cargo = "Desenvolvedor Fullstack";
        eu.salario = 7000.00;
        eu.reajuste = 15.0;
        
        emp.reajustarSalario();
        System.out.println(String.format("Nome: %s \nCargo: %s \nSalário: %.2f \n\n\n", emp.nome, emp.cargo, emp.salario));
        
        eu.reajustarSalario();
        System.out.println(String.format("Nome: %s \nCargo: %s \nSalário: %.2f", eu.nome, eu.cargo, eu.salario));
    }

}
