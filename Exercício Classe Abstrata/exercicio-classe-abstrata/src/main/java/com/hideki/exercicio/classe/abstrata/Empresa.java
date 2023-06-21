/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class Empresa {
    
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList();
    }
    
    public void registrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return String.format("Empresa:\n Nome: %s\n Funcionários: %s", nome, funcionarios);
    }
    
}
