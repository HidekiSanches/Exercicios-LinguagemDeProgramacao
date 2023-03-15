/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.introducao.poo;

/**
 *
 * @author hidek
 */
public class AppEncomenda {
    
    public static void main(String[] args) {
        Ecomenda eco = new Ecomenda();
        
        eco.tamanho = "P";
        eco.enderecoRemetente = "Rua Santos da Glória, 18";
        eco.enderecoDestinatario = "Av Dr. Pedro, 255";
        eco.distancia = 42.2;
        eco.valorEncomenda = 87.50;
        
        eco.calcularFrete();
        eco.emitirEtiqueta();
        
    }
    
}
