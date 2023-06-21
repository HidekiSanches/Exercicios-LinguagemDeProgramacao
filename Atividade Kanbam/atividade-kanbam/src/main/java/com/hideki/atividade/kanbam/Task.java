/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.atividade.kanbam;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author hidek
 */
public class Task {

    private String titulo;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private DateTimeFormatter format;

    public Task(String titulo) {
        this.titulo = titulo;
        this.inicio = LocalDateTime.now();
        this.format = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
    }

    public LocalDateTime finalizarTask() {
        this.fim = LocalDateTime.now();
        return LocalDateTime.now();
    }

    public Duration tempoDaTarefa() {
        Duration tempo = Duration.between(inicio, fim);
        System.out.println(tempo.getSeconds());

        return tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }
    

    @Override
    public String toString() {
        return String.format("%s \ninicio: %s \nfim: %s", titulo, inicio.format(format), fim == null ? "" : fim.format(format));
    }

}
