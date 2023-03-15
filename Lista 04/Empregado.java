/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.introducao.poo;

/**
 *
 * @author hidek
 */
public class Empregado {
    
    String nome;
    String cargo;
    Double salario;
    
    Double reajuste = 0.0;
    void reajustarSalario(){
        salario += salario * (reajuste/100);
    }
    
}
