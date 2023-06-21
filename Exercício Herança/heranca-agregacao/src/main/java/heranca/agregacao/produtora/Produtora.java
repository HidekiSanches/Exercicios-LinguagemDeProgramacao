/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.agregacao.produtora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class Produtora {

    private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Boolean existePorNome(String nome) {
        Boolean aux = false;
        for (Ator ator : atores) {
            if (ator.getNome().equalsIgnoreCase(nome)) {
                aux = true;
            }
        }
        return aux;
    }

    public void contratar(Ator d) {
        if (vagas > 0) {
            System.out.println("Contratado");
            atores.add(d);
            vagas--;
        } else {
            System.out.println("Sem vagas disponíveis!");
        }
    }

    public Integer getQuantidadeAtores() {
        Integer aux = 0;
        for (Ator ator : atores) {
            aux++;
        }
        return aux;
    }

    public Integer getQuantidadeProtagonistas() {
        Integer aux = 0;
        for (Ator ator : atores) {
            if (ator instanceof Protagonista) {
                aux++;
            }
        }
        return aux;
    }

    public Double getTotalSalarios() {
        Double aux = 0.0;
        for (Ator ator : atores) {
            aux += ator.getSalario();
        }
        return aux;
    }

    public List<Ator> buscarAtorPorNome(String nome) {
        List<Ator> aux = new ArrayList();
        for (int i = 0; i < atores.size(); i++) {
            if (atores.get(i).getNome().equalsIgnoreCase(nome)) {
                aux.add(atores.get(i));
            }
        }
        if (aux.size() == 0) {
            return null;
        } else {
            return aux;
        }
    }

    @Override
    public String toString() {
        return String.format("Produtora:\n Nome: %s\n Vagas: %d\n Desenvolvedores: %s", nome, vagas, atores);
    }

}
