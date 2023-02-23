/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.lista03.nivelamento;

/**
 *
 * @author hidek
 */
public class ClassePertence {
    
    String classeSocial(Double num1){
        String classeSocial;
        if(num1 <= 2){
            return classeSocial = "E";
        } else if (num1 <= 4){
            return classeSocial = "D";
        } else if (num1 <= 10){
            return classeSocial = "C";
        } else if (num1 <= 20){
            return classeSocial = "B";
        } else {
            return classeSocial = "A";
        }
        
    }
    
}
