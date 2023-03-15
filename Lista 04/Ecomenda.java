/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.introducao.poo;

/**
 *
 * @author hidek
 */
public class Ecomenda {
    Utilitaria util = new Utilitaria();
    
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    
    Double frete = 0.0;
    void calcularFrete(){
        
        if (tamanho.equals("P")){
            frete = 0.1 * valorEncomenda;
        } else if (tamanho.equals("M")){
            frete = 0.3 * valorEncomenda;
        } else if (tamanho.equals("G")){
            frete = 0.5 * valorEncomenda;
        } else {
            System.out.println("Tamanho invalido!");
        }
        
        if (distancia <= 50){
            frete += 3.00;
        } else if (distancia <= 200){
            frete += 5.00;
        } else {
            frete += 7.00;
        }
    }
    
    void emitirEtiqueta(){
        System.out.println("*****ETIQUETA PARA ENVIO******");
        System.out.println("Endereço do remetente: " + enderecoRemetente);
        System.out.println("Endereço do destinatário: " + enderecoDestinatario);
        
        if (tamanho.equals("P")){
            System.out.println("Tamanho: Pequeno");
        } else if(tamanho.equals("M")){
            System.out.println("Tamanho: Médio");
        } else if(tamanho.equals("G")){
            System.out.println("Tamanho: Grande");
        } else {
            System.out.println("Tamanho: ---\n");
        }
        
        util.decoracao();
        
        System.out.println(String.format("\nValor encomenda: R$%.2f", valorEncomenda));
        System.out.println(String.format("Valor frete: R$%.2f\n", frete));
        
        util.decoracao();
        
        System.out.println(String.format("\nValor total: R$%.2f", (frete + valorEncomenda)));
    }
}
