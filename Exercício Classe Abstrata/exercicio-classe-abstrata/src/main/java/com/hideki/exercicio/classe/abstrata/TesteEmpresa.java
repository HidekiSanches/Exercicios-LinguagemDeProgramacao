/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.exercicio.classe.abstrata;

/**
 *
 * @author hidek
 */
public class TesteEmpresa {
    
    public static void main(String[] args) {
        
        Funcionario func1 = new Vendedor(10000.00, 13.5, "44455566678", "Hideki");
        Funcionario func2 = new Horista(8, 100.00, "11122233312", "Sasaoka");
        
        Empresa emp = new Empresa("Dois cunhados");
        
        emp.registrarFuncionario(func1);
        emp.registrarFuncionario(func2);
        
        System.out.println(emp);
        
    }
    
}
