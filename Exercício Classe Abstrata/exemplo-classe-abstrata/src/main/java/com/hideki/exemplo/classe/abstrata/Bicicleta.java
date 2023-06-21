/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exemplo.classe.abstrata;

/**
 *
 * @author hidek
 */
public class Bicicleta extends Veiculo{
    
    private Integer calibragemPneu;
    private Double pesoCiclista;

    public Bicicleta(Integer calibragemPneu, Double pesoCiclista, String proprietario, Integer anoFabricante, String marca) {
        super(proprietario, anoFabricante, marca);
        this.calibragemPneu = calibragemPneu;
        this.pesoCiclista = pesoCiclista;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Exinindo relatório da Bicicleta do " + proprietario);
        if (pesoCiclista == 85 && calibragemPneu != 36){
            System.out.println("Necessário calibrar o pneu");
        } else {
            System.out.println("Calibragem correta, não é necessário calibrar o pneu");
        }
    }

    public Integer getCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(Integer calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }

    public Double getPesoCiclista() {
        return pesoCiclista;
    }

    public void setPesoCiclista(Double pesoCiclista) {
        this.pesoCiclista = pesoCiclista;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "calibragemPneu=" + calibragemPneu + ", pesoCiclista=" + pesoCiclista + '}';
    }
    
}
