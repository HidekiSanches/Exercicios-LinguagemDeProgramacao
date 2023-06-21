/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hideki.contador.tempo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hidek
 */
public class Teste {

    public static void main(String[] args) {

        ContadorTempo con = new ContadorTempo();
        con.iniciar();

        try {
            Thread.sleep(10000);
            con.finalizar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(con.toString());

    }

}
