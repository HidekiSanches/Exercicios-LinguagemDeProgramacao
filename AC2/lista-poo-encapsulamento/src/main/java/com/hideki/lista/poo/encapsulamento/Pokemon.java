/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.poo.encapsulamento;

/**
 *
 * @author hidek
 */
public class Pokemon {

    private Integer doces = 0;
    private String nome;
    private String tipo;
    private Double forca;
    
    public Integer getDoces(){
        return doces;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setForca(Double forca){
        this.forca = forca;
    }
    
    public Double getForca(){
        return forca;
    }

    public void aumentarDoces(Integer quantidade) {
        this.doces += quantidade;
    }

    public void diminuirDoces(Integer quantidade) {
        this.doces -= quantidade;
    }

}
