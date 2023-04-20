/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista.poo.encapsulamento;

/**
 *
 * @author hidek
 */
public class TestePokemon {

    public static void main(String[] args) {
        Pokemon poke1 = new Pokemon();
        Pokemon poke2 = new Pokemon();

        TreinadorPokemon treiner = new TreinadorPokemon();

        treiner.setNivel(1);
        treiner.setNome("Sasaoka");

        poke1.setNome("Onix");
        poke1.setTipo("Pedra e Terrestre");
        poke1.setForca(60.0);

        poke2.setNome("Rookidee");
        poke2.setTipo("Voador");
        poke2.setForca(10.0);

        for (int i = 0; i < 5; i++) {
            treiner.treinarPokemon(poke1);
        }

        System.out.println(String.format("Pokémon %s - Tipo: %s - Força: %.1f - Doces: %d", poke1.getNome(), poke1.getTipo(), poke1.getForca(), poke1.getDoces()));

        treiner.evoluirPokemon(poke1, "Steelix", "Metal e Terrestre");

        System.out.println(String.format("Pokémon %s - Tipo: %s - Força: %.1f - Doces: %d", poke1.getNome(), poke1.getTipo(), poke1.getForca(), poke1.getDoces()));

        for (int i = 0; i < 2; i++) {
            treiner.treinarPokemon(poke2);
        }

        System.out.println(String.format("Pokémon %s - Tipo: %s - Força: %.1f - Doces: %d", poke2.getNome(), poke2.getTipo(), poke2.getForca(), poke2.getDoces()));

        treiner.evoluirPokemon(poke2, "Corvisquire", "Voador");

        System.out.println("Treinardo " + treiner.getNome() + " - Nivel: " + treiner.getNivel());

    }

}
