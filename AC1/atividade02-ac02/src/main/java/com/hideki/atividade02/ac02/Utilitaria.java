/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.atividade02.ac02;

/**
 *
 * @author hidek
 */
public class Utilitaria {

    Double calcularMedia(Double primeiraNota, Double segundaNota) {
        return ((primeiraNota * 0.4) + (segundaNota * 0.6));
    }

    void classificaIdade(Integer idade) {
        if (idade <= 2) {
            System.out.println("Bebê");
        } else if (idade <= 11) {
            System.out.println("Criança");
        } else if (idade <= 19) {
            System.out.println("Adolecente");
        } else if (idade <= 30) {
            System.out.println("Jovem");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }

    Double calcularDesconto(Double preco, Integer quantidade) {
        if (quantidade.equals(1)) {
            return (preco * 0.9);
        } else if (quantidade.equals(2)) {
            return (preco * 0.8) * quantidade;
        } else {
            return (preco * 0.7) * quantidade;
        }
    }

    void exibirNotaFiscal(Double preco, Integer quantidade) {
        Double desconto = calcularDesconto(preco, quantidade);
        System.out.println("\n---------------------------------------------------------");
        System.out.println(String.format("Valor do produto: R$%.2f" , preco));
        System.out.println("Quantidade: " + quantidade);
        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("Valor com desconto: R$%.2f" , desconto));
    }
    
    Double calcularIMC(Double peso, Double altura){
        return peso / (altura * altura);
    }
    
    void exibirIMC(Double peso, Double altura){
        Double IMC = calcularIMC(peso, altura);
        System.out.println(String.format("IMC: %.2f", IMC));
    }
    
    void verificarPrimo(Integer numero){
        Integer vezes = 0;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                vezes++;
            }
        }
        
        if (vezes.equals(2)){
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo");
        }
    }
}
