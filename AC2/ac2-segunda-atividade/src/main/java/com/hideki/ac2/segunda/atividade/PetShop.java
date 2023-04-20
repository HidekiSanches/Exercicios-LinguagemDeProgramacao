/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.ac2.segunda.atividade;

/**
 *
 * @author hidek
 */
public class PetShop {
    
    private String nome;
    private Double faturamentoTotal;
    
    public PetShop(String nome){
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }
    
    public void darBanho(Pet pet, Double valor){
        Integer visita = pet.getQtdVisistasAoPetShop();
        Double gasto = pet.getValorGastoEmPetShop();
        faturamentoTotal += valor;
        visita++;
        gasto += valor;
        pet.setQtdVisistasAoPetShop(visita);
        pet.setValorGastoEmPetShop(gasto);
    }
    
    public void darBanho (Pet pet, Double valor, Integer desconto){
        Integer visita = pet.getQtdVisistasAoPetShop();
        Double gasto = pet.getValorGastoEmPetShop();
        faturamentoTotal += (valor - (valor * (Double.valueOf(desconto)/100)));
        visita++;
        gasto += (valor - (valor * (Double.valueOf(desconto)/100)));
        pet.setQtdVisistasAoPetShop(visita);
        pet.setValorGastoEmPetShop(gasto);
    }

    @Override
    public String toString() {
        return String.format("PetShop: \nNome: %s \nFaturamento: %.2f", nome, faturamentoTotal);
    }
    
    
    
}
