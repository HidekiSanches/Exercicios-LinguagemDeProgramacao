/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class Carrinho {
    
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public Integer getQuantidade() {
        return produtos.size();
    }
    
    public void adicionar(Produto produto){
        produtos.add(produto);
    }
    
    public Boolean existPorNome(String nome) {
        Boolean aux = false;
        for (Produto produto : produtos){
            if (produto.getNome().equals(nome)){
                aux = true;
            }
        }
        return aux;
    }
    
    public Integer quantidadePorCategoria(String nome) {
        Integer cont = 0;
        for (Produto produto : produtos){
            if (produto.getCategoria().equals(nome)){
                cont++;
            }
        }
        return cont;
    }
    
    public void limpar() {
        produtos.clear();
    }
    
    public void removerPorNome(String nome){
        for (int i = 0; i < produtos.size(); i ++) {
            if (produtos.get(i).getNome().equals(nome)){
                produtos.remove(i);
            }
        }
    }
    
    public List<Produto> pegarPorNome(String nome){
        List<Produto> aux = new ArrayList();
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                aux.add(produto);
            }
        }
        return aux;
    }
    
    public Double getValorTotal() {
        Double aux = 0.0;
        for (Produto produto : produtos){
            aux += produto.getPreco();
        }
        return aux;
    }

    @Override
    public String toString() {
        return String.format("Carrnho do %s\nProdutos: %s\n", cliente, produtos);
    }
    
}
