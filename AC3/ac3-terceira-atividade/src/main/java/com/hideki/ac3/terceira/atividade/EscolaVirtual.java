/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.ac3.terceira.atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class EscolaVirtual {

    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public EscolaVirtual(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList();
    }

    public void contratarProfessor(Professor professor) {
        if (professor != null) {
            if (vagas > 0) {
                vagas--;
                professores.add(professor);
            } else {
                System.out.println("A Escola Virtual " + nome + " não possui vagas disponíveis");
            }
        }
    }

    public void exibirTodos() {
        if (professores.size() > 0) {
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        } else {
            System.out.println("A Escola Virtual " + nome + " não possui professores");
        }
    }

    public void exibePalestrantes() {
        if (professores.size() > 0) {
            List<Palestrante> palestrantes = new ArrayList<>();
            for (Professor professor : professores) {
                if (professor instanceof Palestrante) {
                    palestrantes.add((Palestrante) professor);
                }
            }

            if (palestrantes.size() > 0) {
                for (Palestrante palestra : palestrantes) {
                    System.out.println(palestra);
                }
            } else {
                System.out.println("A Escola Virtual " + nome + " não possui palestrantes");
            }
        }
    }

    public void exibeFolhaDePagamento() {
        Double ganhoTotal = 0.0;

        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Salário: " + professor.calcularGanho());
            System.out.println("------------------------");

            ganhoTotal += professor.calcularGanho();
        }

        System.out.println("Total de funcionários: " + professores.size());
        System.out.println("Valor total a ser pago: " + ganhoTotal);
    }

    public void atualizarValorCurso(String nomeCurso, Double valorNovo) {
        boolean cursoEncontrado = false;

        for (Professor professor : professores) {
            if (professor.getCurso().equalsIgnoreCase(nomeCurso)) {
                professor.setCurso(nomeCurso);
                professor.setValorCurso(valorNovo);
                cursoEncontrado = true;
            }
        }

        if (!cursoEncontrado) {
            System.out.println("Curso inexistente");
        }
    }

    public Professor buscarProfessor(String nome) {
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                return professor;
            }
        }

        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return String.format("Escola:\n Nome: %s\n Vagas: %d\n Professores: %s", nome, vagas, professores);
    }

}
