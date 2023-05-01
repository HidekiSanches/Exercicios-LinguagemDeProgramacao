/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.faculade;

/**
 *
 * @author hidek
 */
public class TesteFaculdade {

    public static void main(String[] args) {
        Util util = new Util();

        Aluno aluno01 = new Aluno("123123", "Sasaka", 1);
        Aluno aluno02 = new Aluno("123124", "Hideki", 2);
        Aluno aluno03 = new Aluno("123125", "Thiago", 2);
        Aluno aluno04 = new Aluno("123126", "Sanches", 3);

        Faculdade faculdade = new Faculdade("Sasaka School");

        faculdade.matricularAluno(aluno01);
        faculdade.matricularAluno(aluno02);
        faculdade.matricularAluno(aluno03);
        faculdade.matricularAluno(aluno04);
        util.decoracao();
        faculdade.exibirAlunos();
        util.decoracao();
        
        util.decoracao();
        faculdade.cancelarMatricula("123123");
        faculdade.exibirCancelados();
        util.decoracao();
        
        util.decoracao();
        faculdade.exibirAlunosPorSemestre(2);
        util.decoracao();

    }

}
