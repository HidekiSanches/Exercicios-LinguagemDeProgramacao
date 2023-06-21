/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.agregacao.consultoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hidek
 */
public class Consultoria {
    
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList();
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
    
    public Boolean existePorNome(String nome){
        Boolean aux = false;
        for (Desenvolvedor dev : desenvolvedores) {
            if (dev.getNome().equalsIgnoreCase(nome)){
                aux = true;
            }
        }
        return aux;
    }
    
    public void contratar(Desenvolvedor d){
        if (vagas > 0){
            System.out.println("Contratado");
            desenvolvedores.add(d);
            vagas--;
        } else {
            System.out.println("Sem vagas disponíveis!");
        }
    }
    
    public Integer getQuantidadeDesenvolvedores(){
        Integer aux = 0;
        for (Desenvolvedor dev : desenvolvedores){
            aux++;
        }
        return aux;
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile(){
        Integer aux = 0;
        for (Desenvolvedor dev : desenvolvedores){
            if (dev instanceof DesenvolvedorMobile){
                aux++;
            }
        }
        return aux;
    }
    
    public Double getTotalSalarios(){
        Double aux = 0.0;
        for (Desenvolvedor dev : desenvolvedores){
            aux += dev.getSalario();
        }
        return aux;
    }
    
    public List<Desenvolvedor> buscarDesenvolvedorPorNome(String nome){
        List<Desenvolvedor> aux = new ArrayList();
        for (int i = 0; i < desenvolvedores.size(); i++){
            if (desenvolvedores.get(i).getNome().equalsIgnoreCase(nome)){
                aux.add(desenvolvedores.get(i));
            }
        }
        if (aux.size() == 0){
            return null;
        } else {
            return aux;
        }
    }

    @Override
    public String toString() {
        return String.format("Consultoria:\n Nome: %s\n Vagas: %d\n Desenvolvedores: %s", nome, vagas, desenvolvedores);
    }
    
}
