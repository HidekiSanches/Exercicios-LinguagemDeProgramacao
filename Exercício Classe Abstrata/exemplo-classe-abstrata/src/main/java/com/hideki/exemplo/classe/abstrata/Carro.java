/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exemplo.classe.abstrata;

/**
 *
 * @author hidek
 */
public class Carro extends Veiculo {

    private Boolean possuiEstepe;
    private Double nivelOleo;

    public Carro(Boolean possuiEstepe, Double nivelOleo, String proprietario, Integer anoFabricante, String marca) {
        super(proprietario, anoFabricante, marca);
        this.possuiEstepe = possuiEstepe;
        this.nivelOleo = nivelOleo;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Relatório do carro de " + proprietario);
        if (!possuiEstepe){
            System.out.println("Nescessário comprar um estepe");
        } else {
            System.out.println("Estepe ok");
        }
        
        if (nivelOleo < 1.5){
            System.out.println("Necessário comprar óleo");
        } else {
            System.out.println("Óleo ok");
        }
        
    }

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    @Override
    public String toString() {
        return "Carro{" + "possuiEstepe=" + possuiEstepe + ", nivelOleo=" + nivelOleo + '}';
    }

}
