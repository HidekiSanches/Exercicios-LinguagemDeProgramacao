/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exemplo.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class Mecanica {
    
    private String nome;
    private List<Veiculo> veiculos;

    public Mecanica(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList();
    }
    
    public void registrarVeiculoCliente(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    
    public void exibirRelatorioRevisaoClientes(){
        for (Veiculo veiculo: veiculos){
            veiculo.relatorioDeRevisao();
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    @Override
    public String toString() {
        return "Mecanica{" + "nome=" + nome + ", veiculos=" + veiculos + '}';
    }
    
}
