/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hidek
 */
public class Teste {

    public static void main(String[] args) {
        List<Medicamento> medicamentos = new ArrayList();
        Medicamento remedio = new Medicamento();
        Scanner leitor = new Scanner(System.in);
        Scanner leitorLine = new Scanner(System.in);
        Util util = new Util();
        Boolean terminar = true;

        while (terminar) {
            util.decoracao();
            System.out.println("M E N U");
            util.decoracao();
            System.out.println("Escolha uma opção:");
            System.out.println(" 1 - Cadastrar medicamento");
            System.out.println(" 2 - Exibir medicamentos");
            System.out.println(" 3 - Buscar medicamentos por nome");
            System.out.println(" 4 - Sair");
            Integer opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    util.decoracao();
                    System.out.println("C A D A S T R O");
                    util.decoracao();
                    String nome;
                    do {
                        System.out.println("Digite o nome do medicamento:");
                        nome = leitorLine.nextLine();
                    } while (nome.isBlank());
                    System.out.println("Digite a quantidade do medicamento:");
                    Integer qtdMedicamento = leitor.nextInt();
                    System.out.println("Digite o valor do medicamento:");
                    Double valor = leitor.nextDouble();

                    remedio = new Medicamento(medicamentos, nome, qtdMedicamento, valor);
                    medicamentos.add(remedio);
                    break;
                case 2:
                    util.decoracao();
                    System.out.println("E S T O Q U E");
                    util.decoracao();
                    System.out.println("Medicamentos em estoque:");
                    System.out.println(medicamentos);
                    break;
                case 3:
                    util.decoracao();
                    System.out.println("P E S Q U I S A");
                    util.decoracao();
                    System.out.println("Digite um nome pra pesquisa:");
                    String nomeDigitado = leitorLine.nextLine();
                    Boolean temMemedio = false;
                    for (Medicamento memedio : medicamentos) {
                        if (memedio.getNomeMedicamento().equals(nomeDigitado)) {
                            System.out.println(memedio);
                            temMemedio = true;
                        }
                    }
                    if (temMemedio == false) {
                        System.out.println("Medicamento não cadastrado");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar!");
                    terminar = false;
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
    }

}
