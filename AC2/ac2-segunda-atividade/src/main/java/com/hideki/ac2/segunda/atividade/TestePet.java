/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.ac2.segunda.atividade;

/**
 *
 * @author hidek
 */
public class TestePet {
    
    public static void main(String[] args) {
        
        Pet pet1 = new Pet("Bono", "Lhasa apso");
        Pet pet2 = new Pet("Ozzy", "Maltes");
        
        PetShop shop = new PetShop("Pet Care");
        
        shop.darBanho(pet2, 100.00);
        shop.darBanho(pet1, 100.00, 10);
        
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(shop);
                
    }
    
}
