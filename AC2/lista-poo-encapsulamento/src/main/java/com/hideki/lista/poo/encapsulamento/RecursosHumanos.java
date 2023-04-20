/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.poo.encapsulamento;

/**
 *
 * @author hidek
 */
public class RecursosHumanos {

    private Integer totalPromovidos = 0;
    private Integer totalReajustes = 0;

    public void reajustarSalario(Colaborador colaborador, Double reajuste) {
        double novoSalario = colaborador.getSalario() * (1 + reajuste);
        colaborador.setSalario(novoSalario);
        totalReajustes++;
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (novoSalario > colaborador.getSalario()) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromovidos++;
        } else {
            System.out.println("Operação inválida");
        }
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustes() {
        return totalReajustes;
    }

}
