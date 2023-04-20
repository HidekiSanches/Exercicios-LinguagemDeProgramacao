/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.ac2.segunda.atividade;

/**
 *
 * @author hidek
 */
public class Pet {
    
    private String nome;
    private String raca;
    private Integer qtdVisistasAoPetShop;
    private Double valorGastoEmPetShop;
    
    public Pet(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
        this.qtdVisistasAoPetShop = 0;
        this.valorGastoEmPetShop = 0.0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setQtdVisistasAoPetShop(Integer qtdVisistasAoPetShop) {
        this.qtdVisistasAoPetShop = qtdVisistasAoPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }

    public Integer getQtdVisistasAoPetShop() {
        return qtdVisistasAoPetShop;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    } 

    @Override
    public String toString() {
        return String.format("Pet: \nNome: %s \nRaça: %s \nVisitas: %d \nGasto: %.2f", nome, raca, qtdVisistasAoPetShop, valorGastoEmPetShop);
    }
    
}
