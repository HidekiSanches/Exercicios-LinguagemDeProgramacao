/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exemplo.classe.abstrata;

/**
 *
 * @author hidek
 */
public class TesteMecanica {
    
    public static void main(String[] args) {
        
        Veiculo veiculo1 = new Bicicleta( 36, 85.0, "Sasaka", 2002, "Fiat");
        Veiculo veiculo2 = new Carro(false, 1.3, "Hideki", 2005, "Ford");
        
        Mecanica mecanica = new Mecanica("Dois cunhados");
        
        mecanica.registrarVeiculoCliente(veiculo1);
        mecanica.registrarVeiculoCliente(veiculo2);
        
        mecanica.exibirRelatorioRevisaoClientes();
        
    }
    
}
