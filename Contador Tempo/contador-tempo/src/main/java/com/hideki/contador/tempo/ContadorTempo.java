/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.contador.tempo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author hidek
 */
public class ContadorTempo {

    private LocalDateTime start;
    private DateTimeFormatter format;

    public ContadorTempo() {
        this.format = DateTimeFormatter.ofPattern("hh:mm:ss");
        this.start = LocalDateTime.now();
    }

    public void iniciar() {
        start = LocalDateTime.now();
    }

    public Duration finalizar() {
        Duration tempo = Duration.between(start, LocalDateTime.now());
        System.out.println(tempo.getSeconds());

        return tempo;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return String.format("Contador:\n Start: %s\n End: %s\n Diferença: %s", start.format(format), LocalDateTime.now().format(format), finalizar());
    }

}
