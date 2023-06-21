/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.atividade.kanbam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class Sprint {

    private LocalDate inicio;
    private LocalDate fim;
    private List<Task> tarefas;

    public Sprint(LocalDate fim) {
        this.inicio = LocalDate.now();
        this.tarefas = new ArrayList();
        this.fim = fim;
    }

    public void adicionarTarefa(Task tarefa) {
        if (tarefa != null) {
            Boolean aux = false;
            for (int i = 0; i < tarefas.size(); i++) {
                if (tarefas.get(i).getTitulo().equalsIgnoreCase(tarefa.getTitulo())) {
                    aux = true;
                }
            }

            if (aux) {
                System.out.println("Tarefa já cadastrada!");
            } else {
                tarefas.add(tarefa);
            }
        } else {
            System.out.println("Tarefa não passada como parametro");
        }
    }

    public void concluirTarefa(Task tarefa) {
        if (tarefa != null) {
            for (int i = 0; i < tarefas.size(); i++) {
                if (tarefas.get(i).getTitulo().equalsIgnoreCase(tarefa.getTitulo())) {
                    tarefas.get(i).finalizarTask();
                }
            }
        } else {
            System.out.println("Tarefa não passada como parametro");
        }
    }

    public void exibirRelatorio() {
        System.out.println("---------------Tarefas Concluídas---------------");
        int cont = 0;
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getFim() != null) {
                cont++;
                System.out.println((cont) + " - " + tarefas.get(i));
            }
        }
        System.out.println("---------------Tarefas Pendentes---------------");
        cont = 0;
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getFim() == null) {
                cont++;
                System.out.println(cont + " - " + tarefas.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Sprint{" + "inicio=" + inicio + ", fim=" + fim + ", tarefas=" + tarefas + '}';
    }

}
