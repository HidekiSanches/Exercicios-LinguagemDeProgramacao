/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.agregacao.consultoria;

/**
 *
 * @author hidek
 */
public class DesenvolvedorMobile extends Desenvolvedor{
    
    private Integer qtdTrabalhadasMobile;
    private Double valorHorasTrabalhadas;

    public DesenvolvedorMobile(Integer qtdTrabalhadasMobile, Double valorHorasTrabalhadas, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdTrabalhadasMobile = qtdTrabalhadasMobile + getQtdHorasTrabalhadas();
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
    }

    public Integer getQtdTrabalhadasMobile() {
        return qtdTrabalhadasMobile;
    }

    public void setQtdTrabalhadasMobile(Integer qtdTrabalhadasMobile) {
        this.qtdTrabalhadasMobile = qtdTrabalhadasMobile;
    }

    public Double getValorHorasTrabalhadas() {
        return valorHorasTrabalhadas;
    }

    public void setValorHorasTrabalhadas(Double valorHorasTrabalhadas) {
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (valorHoraTrabalhada * qtdHorasTrabalhadas);
    }
    
    

    @Override
    public String toString() {
        return String.format("Desenvolvedor Mobile:\n Nome: %s\n Horas Trabalhadas: %dh\n Valor: R$%.2f\n Salário: R$%.2f", nome, qtdTrabalhadasMobile, valorHorasTrabalhadas, getSalario());
    }
    
    
    
}
