/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.atividade.kanbam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author hidek
 */
public class Teste {

    public static void main(String[] args) {

        Task task1 = new Task("Lavar roupa");
        Task task2 = new Task("Ler livro");
        Task task3 = new Task("Lição de LP");

        task1.finalizarTask();

        LocalDate data = LocalDate.parse("2024-11-20");
        Sprint sprint = new Sprint(data);
        
        sprint.adicionarTarefa(task1);
        sprint.adicionarTarefa(task2);
        sprint.adicionarTarefa(task3);
        
        sprint.exibirRelatorio();

    }

}
