package org.example;

public class Professor extends Funcionario implements Bonus{
    // Atributos além dos que são herdados da classe Funcionario
    private Integer qtdAulas;
    private Double valorPorHora;


    // Construtor
    public Professor(String nome, String cpf, Integer qtdAulas, Double valorPorHora) {
        super(nome, cpf);
        this.qtdAulas = qtdAulas;
        this.valorPorHora = valorPorHora;
    }

    // Método abstrato
    public Double calculaSalario() {
        return qtdAulas * valorPorHora * 4.5;
    }

    // Método da Interface
    public Double getValorBonus() {
        return calculaSalario() * 0.15;
    }


    // Getters e Setters
    public Integer getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(Integer qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    // toString
    @Override
    public String toString() {
        return "Professor{" +
                "qtdAulas=" + qtdAulas +
                ", valorPorHora=" + valorPorHora +
                '}';
    }
}
