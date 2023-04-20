/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.relacionamento;

/**
 *
 * @author hidek
 */
public class Teste {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Banana", "Fruta");
        Produto produto2 = new Produto("Maçã", "Fruta");
        Produto produto3 = new Produto("Ype", "Limpeza");

        produto1.setPreco(3.00);
        produto2.setPreco(3.50);
        produto3.setPreco(12.50);

        Carrinho carrinho1 = new Carrinho("Jorge");
        Carrinho carrinho2 = new Carrinho("Sasaka");

        carrinho1.adicionar(produto1);
        carrinho1.adicionar(produto1);
        carrinho1.adicionar(produto2);
        carrinho1.adicionar(produto3);
        System.out.println(carrinho1 + "\n");
        
        carrinho2.adicionar(produto3);
        System.out.println(carrinho2 + "\n");
        
        System.out.println(carrinho1.existPorNome("Banana"));
        System.out.println(carrinho1.getQuantidade());
        System.out.println(carrinho1.quantidadePorCategoria("Fruta"));
        System.out.println(carrinho1.pegarPorNome("Banana"));

        carrinho2.removerPorNome("Ype");
        System.out.println(carrinho2);
        
        System.out.println(carrinho1.getValorTotal());
        
        carrinho1.limpar();
        System.out.println(carrinho1);
    }

}
