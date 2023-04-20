/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.ac2.segunda.atividade;

/**
 *
 * @author hidek
 */
public class Atividade {
    
    private String nome;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;
    
    public Atividade(String nome, String responsavel, Integer diasEstimados){
        this.nome = nome;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }
    
    public void terminarAtividade(Integer diasUsados){
        this.diasUsados = diasUsados;
    }
    
    public void calcularTempo(){
        if (diasUsados > diasEstimados){
            System.out.println(String.format("Você estimou %d dias, mas a tarefa foi feita em %d dias ( %d dias a mais que o estimado ). Melhore a estimativa.)", diasEstimados, diasUsados, (diasUsados - diasEstimados)));
        } else if (diasUsados < diasEstimados){
            System.out.println(String.format("Você estimou %d dias, e a tarefa foi feita em %d dias ( %d dias a menos que o estimado ). Prabéns!", diasEstimados, diasUsados, (diasEstimados - diasUsados)));
        } else {
            System.out.println(String.format("Você estimou %d dias, e a tarefa foi feita em %d dias, atendendo a estimativa com precisão", diasEstimados, diasUsados));
        }
    }

    @Override
    public String toString() {
        return String.format("Atividade: \nNome: %s \nResponsável: %s \nDias Estimados: %d \nDias Usados: %d", nome, responsavel, diasEstimados, diasUsados);
    }   
    
}
