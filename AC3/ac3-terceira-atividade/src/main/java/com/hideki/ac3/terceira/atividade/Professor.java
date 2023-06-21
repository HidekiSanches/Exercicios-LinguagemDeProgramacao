/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.ac3.terceira.atividade;

/**
 *
 * @author hidek
 */
public class Professor {
    
    protected String nome;
    protected String curso;
    protected Double valorCurso;
    protected Integer qtdAlunos;

    public Professor(String nome, Double valorCurso, Integer qtdAlunos) {
        this.nome = nome;
        this.valorCurso = valorCurso;
        this.qtdAlunos = qtdAlunos;
    }
    
    public Double calcularGanho() {
        return (valorCurso * 0.05) * qtdAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(Double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    @Override
    public String toString() {
        return String.format("Professor:\n Nome: %s\n Curso: %s\n Valor: %.2f\n Alunos: %d\n Ganho: %.2f", nome, curso, valorCurso, qtdAlunos, calcularGanho());
    }
    
}
