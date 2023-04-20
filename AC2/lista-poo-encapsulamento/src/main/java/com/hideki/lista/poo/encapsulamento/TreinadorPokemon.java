/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.poo.encapsulamento;

/**
 *
 * @author hidek
 */
public class TreinadorPokemon {

    private Integer nivel;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        if (nivel < 1) {
            System.out.println("Nivel invalido");
        } else {
            this.nivel = nivel;
        }
    }

    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca() * 1.1);
        pokemon.aumentarDoces(10);
        this.nivel += 2;
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao, String tipoNovo) {
        if (pokemon.getDoces() >= 50) {
            System.out.println("Pokémon " + pokemon.getNome() + " evoluiu para -> " + nomeEvolucao);
            pokemon.setNome(nomeEvolucao);
            pokemon.setTipo(tipoNovo);
            pokemon.diminuirDoces(50);
            this.nivel += 10;
        } else {
            System.out.println("Não foi possível realizar operação");
        }
    }

}
