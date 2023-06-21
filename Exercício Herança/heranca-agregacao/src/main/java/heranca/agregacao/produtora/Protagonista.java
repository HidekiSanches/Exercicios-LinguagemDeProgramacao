/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.agregacao.produtora;

/**
 *
 * @author hidek
 */
public class Protagonista extends Ator{
    
    private Integer qtdHoratrabalhadaProtagonista;
    private Double valorHoraTrabalhadaProtagonista;

    public Protagonista(Integer qtdHoratrabalhadaProtagonista, Double valorHoraTrabalhadaProtagonista, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoratrabalhadaProtagonista = qtdHoratrabalhadaProtagonista + getQtdHorasTrabalhadas();
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    public Integer getQtdHoratrabalhadaProtagonista() {
        return qtdHoratrabalhadaProtagonista;
    }

    public void setQtdHoratrabalhadaProtagonista(Integer qtdHoratrabalhadaProtagonista) {
        this.qtdHoratrabalhadaProtagonista = qtdHoratrabalhadaProtagonista;
    }

    public Double getValorHoraTrabalhadaProtagonista() {
        return valorHoraTrabalhadaProtagonista;
    }

    public void setValorHoraTrabalhadaProtagonista(Double valorHoraTrabalhadaProtagonista) {
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (valorHoraTrabalhadaProtagonista*qtdHoratrabalhadaProtagonista);
    }

    @Override
    public String toString() {
        return String.format("Protagonistas:\n Nome: %s\n Horas Trabalhadas: %dh\n Valor: R$%.2f\n Salário: R$%.2f", nome, qtdHoratrabalhadaProtagonista, valorHoraTrabalhadaProtagonista, getSalario());
    }
    
}
