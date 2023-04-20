/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class TesteCarro {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Modelo1", 20000.00, 2002, "Marca1");
        Carro carro2 = new Carro("Modelo2", 25000.00, 2003, "Marca2");
        Carro carro3 = new Carro("Modelo3", 30000.00, 2004, "Marca3");
        Carro carro4 = new Carro("Modelo4", 35000.00, 2005, "Marca4");
        Carro carro5 = new Carro("Modelo5", 60000.00, 2019, "Marca5");
        List<Carro> carros = new ArrayList();
        
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);
        
        System.out.println(carros);
        
        for (Carro carro : carros){
            if (carro.getAno() > 2018){
                System.out.println("\n" + carro);
            }
        }
        
        for (Carro carro : carros){
            if (carro.getValor() < 60000.00){
                System.out.println("\n" + carro);
            }
        }
        
        for (Carro carro : carros){
            if (carro.getMarca().equals("Marca1")){
                System.out.println("\n" + carro);
            }
        }
    }
    
}
