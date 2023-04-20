/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fruta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class Fruta {

    public static void main(String[] args) {
        List<String> frutas = new ArrayList();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma fruta:");
        String frutaDigitada = leitor.next();
        
        Boolean temFruta = false;

        frutas.add("Peira");
        frutas.add("Banana");
        frutas.add("Limão");
        frutas.add("Pitaia");
        frutas.add("Goiaba");
        frutas.add("Laranja");

        for (String fruta : frutas) {
            if (fruta.equalsIgnoreCase(frutaDigitada)) {
                temFruta = true;
            }
        }
        
        if (temFruta){
            System.out.println(String.format("A fruta %s existe na lista", frutaDigitada));
        } else {
            System.out.println(String.format("Não existe a fruta %s na lista", frutaDigitada));
        }
    }

}
