/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.faculade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void matricularAluno(Aluno aluno) {
        aluno.setAtivo(true);
        alunos.add(aluno);
    }

    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equalsIgnoreCase(ra)) {
                alunos.get(i).setAtivo(false);
            }
        }
    }

    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunosPorSemestre(Integer semestre) {
        for (Aluno aluno : alunos) {
            if (aluno.getSemestre().equals(semestre)) {
                System.out.println(aluno);
            }
        }
    }
    
    public void exibirCancelados() {
        for (Aluno aluno: alunos){
            if (!aluno.getAtivo()){
                System.out.println(aluno);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Faculdade %s:\n Alunos: %s\n", nome, alunos);
    }  
    
}
