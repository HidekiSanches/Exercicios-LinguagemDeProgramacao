/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exemplo.classe.abstrata;

import java.time.LocalDate;

/**
 *
 * @author hidek
 */
public abstract class Veiculo {
    
    protected String proprietario;
    protected Integer anoFabricante;
    protected String marca;

    public Veiculo(String proprietario, Integer anoFabricante, String marca) {
        this.proprietario = proprietario;
        this.anoFabricante = anoFabricante;
        this.marca = marca;
    }
    
    public Integer calcularTempoDeUso(){
        return LocalDate.now().getYear() - anoFabricante;
    }
    
    public abstract void relatorioDeRevisao();

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getAnoFabricante() {
        return anoFabricante;
    }

    public void setAnoFabricante(Integer anoFabricante) {
        this.anoFabricante = anoFabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "proprietario=" + proprietario + ", anoFabricante=" + anoFabricante + ", marca=" + marca + '}';
    }
    
}
