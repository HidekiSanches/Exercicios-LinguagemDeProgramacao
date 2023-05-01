package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
     */
    public Boolean existsAlunoPorNome(String nome) {
        Boolean aux = false;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                aux = true;
            }
        }
        return aux;
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {
        if (aluno != null) {
            if (!existsAlunoPorNome(aluno.getNome())) {
                aluno.setAtivo(true);
                alunos.add(aluno);
            }
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equalsIgnoreCase(ra)) {
                alunos.get(i).setAtivo(false);
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        Integer cont = 0;
        for (Aluno aluno : alunos) {
            if (aluno.isAtivo()) {
                cont++;
            }
        }
        return cont;
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        Integer cont = 0;
        for (Aluno aluno : alunos) {
            if (aluno.isAtivo()) {
                if (aluno.getSemestre().equals(semestre)) {
                    cont++;
                }
            }
        }
        return cont;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer cont = 0;
        for (Aluno aluno : alunos) {
            if (!aluno.isAtivo()) {
                cont++;
            }
        }
        return cont;
    }

    public String getNome() {
        return nome;
    }
}
