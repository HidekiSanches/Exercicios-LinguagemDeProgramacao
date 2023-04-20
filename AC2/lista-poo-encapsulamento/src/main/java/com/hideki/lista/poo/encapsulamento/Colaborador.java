/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.poo.encapsulamento;

/**
 *
 * @author hidek
 */
public class Colaborador {
    
    private String nome;
    private String cargo;
    private Double salario;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setSalario(Double salario){
        if (salario < 1521.00){
            System.out.println("Salário abaixo do salário minimo");
        } else {
            this.salario = salario;
        }
    }
    
    public Double getSalario() {
        return salario;
    }
    
}
