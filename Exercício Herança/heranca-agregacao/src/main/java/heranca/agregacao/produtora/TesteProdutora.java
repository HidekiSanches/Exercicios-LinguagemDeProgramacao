/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.agregacao.produtora;

/**
 *
 * @author hidek
 */
public class TesteProdutora {
    
    public static void main(String[] args) {
        
        Produtora pro = new Produtora("ARTE", 2);

        Ator ator1 = new Ator("Sasaka", 8, 100.0);
        Ator ator2 = new Protagonista(2, 200.0, "Hideki", 6, 100.0);
        Ator ator3 = new Ator("Sanches", 8, 130.0);

        System.out.println("=======================================");
        System.out.println(ator1);
        System.out.println(ator2);
        System.out.println(ator3);
        System.out.println("=======================================");

        System.out.println("CONTRATAÇÃO");
        pro.contratar(ator3);
        pro.contratar(ator2);
        pro.contratar(ator1);
        System.out.println(pro);
        System.out.println("=======================================");
        System.out.println("Pesquisa: SASAKA\nReseultado: " + pro.existePorNome("SASAKA"));
        System.out.println("=======================================");
        System.out.println("Quantidade Desenvolvedores:" + pro.getQuantidadeAtores());
        System.out.println("Quantidade Desenvolvedores Mobile: " + pro.getQuantidadeProtagonistas());
        System.out.println("=======================================");
        System.out.println("Soma dos salários: " + pro.getTotalSalarios());
        System.out.println("=======================================");
        System.out.println("Buscar por nome: HIDEKI\nResultado: " + pro.buscarAtorPorNome("HIDEKI"));
        System.out.println("=======================================");
        
    }
    
}
