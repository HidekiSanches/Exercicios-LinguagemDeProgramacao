/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.agregacao.consultoria;

/**
 *
 * @author hidek
 */
public class TesteConsultoria {

    public static void main(String[] args) {

        Consultoria con = new Consultoria("SPTECH", 2);

        Desenvolvedor dev1 = new Desenvolvedor("Sasaka", 8, 100.0);
        Desenvolvedor dev2 = new DesenvolvedorMobile(2, 200.0, "Hideki", 6, 100.0);
        Desenvolvedor dev3 = new Desenvolvedor("Sanches", 8, 130.0);

        System.out.println("=======================================");
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);
        System.out.println("=======================================");

        System.out.println("CONTRATAÇÃO");
        con.contratar(dev3);
        con.contratar(dev2);
        con.contratar(dev1);
        System.out.println(con);
        System.out.println("=======================================");
        System.out.println("Pesquisa: SASAKA\nReseultado: " + con.existePorNome("SASAKA"));
        System.out.println("=======================================");
        System.out.println("Quantidade Desenvolvedores:" + con.getQuantidadeDesenvolvedores());
        System.out.println("Quantidade Desenvolvedores Mobile: " + con.getQuantidadeDesenvolvedoresMobile());
        System.out.println("=======================================");
        System.out.println("Soma dos salários: " + con.getTotalSalarios());
        System.out.println("=======================================");
        System.out.println("Buscar por nome: HIDEKI\nResultado: " + con.buscarDesenvolvedorPorNome("HIDEKI"));
        System.out.println("=======================================");

    }

}
