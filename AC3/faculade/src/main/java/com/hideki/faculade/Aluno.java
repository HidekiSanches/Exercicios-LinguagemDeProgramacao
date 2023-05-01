/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.faculade;

/**
 *
 * @author hidek
 */
public class Aluno {
    
    private String ra;
    private String nome;
    private Integer semestre;
    private Boolean ativo;

    public Aluno(String ra, String nome, Integer semestre) {
        this.ra = ra;
        this.nome = nome;
        this.semestre = semestre;
        this.ativo = false;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return String.format("Aluno:\n ra: %s\n nome: %s\n semestre: %d\n ativo: %s\n", ra, nome, semestre, ativo ? "Sim" : "Não");
    }
    
}
