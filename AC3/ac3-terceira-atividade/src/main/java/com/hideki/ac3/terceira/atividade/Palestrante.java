/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.ac3.terceira.atividade;

/**
 *
 * @author hidek
 */
public class Palestrante extends Professor {
    
    private Integer qtdLive;
    private Double valorLive;

    public Palestrante(Integer qtdLive, Double valorLive, String nome, Double valorCurso, Integer qtdAlunos) {
        super(nome, valorCurso, qtdAlunos);
        this.qtdLive = qtdLive;
        this.valorLive = valorLive;
    }
    
    public Double calcularGanho(){
        return ((valorCurso * 0.05) * qtdAlunos) + (qtdLive * valorLive);
    }

    public Integer getQtdLive() {
        return qtdLive;
    }

    public void setQtdLive(Integer qtdLive) {
        this.qtdLive = qtdLive;
    }

    public Double getValorLive() {
        return valorLive;
    }

    public void setValorLive(Double valorLive) {
        this.valorLive = valorLive;
    }

    @Override
    public String toString() {
        return String.format("%s\n Lives: %d\n Valor: %.2f", super.toString(), qtdLive, valorLive);
    }
    
}
