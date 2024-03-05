package org.example;

public class Coordenador extends Funcionario implements Bonus{
    // Atributos além dos que são herdados da classe Funcionario
    private Integer qtdHorasAulaCoordenada;
    private Double valorPorHoras;
    private Integer qtdCursosCoordenados;


    // Construtor
    public Coordenador(String nome, String cpf, Integer qtdHorasAulaCoordenada, Double valorPorHoras, Integer qtdCursosCoordenados) {
        super(nome, cpf);
        this.qtdHorasAulaCoordenada = qtdHorasAulaCoordenada;
        this.valorPorHoras = valorPorHoras;
        this.qtdCursosCoordenados = qtdCursosCoordenados;
    }

    // Método abstrato
    public Double calculaSalario() {
        return (qtdHorasAulaCoordenada * valorPorHoras * 4.5) + (qtdCursosCoordenados * 500);
    }

    // Método da Interface
    public Double getValorBonus() {
        return calculaSalario() * 0.20;
    }


    // Getters e Setters
    public Integer getQtdAulasCoordenacao() {
        return qtdHorasAulaCoordenada;
    }

    public void setQtdAulasCoordenacao(Integer qtdAulasCoordenacao) {
        this.qtdHorasAulaCoordenada = qtdAulasCoordenacao;
    }

    public Double getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(Double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    public Integer getQtdCursosCoordenados() {
        return qtdCursosCoordenados;
    }

    public void setQtdCursosCoordenados(Integer qtdCursosCoordenados) {
        this.qtdCursosCoordenados = qtdCursosCoordenados;
    }


    // toString
    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdAulasCoordenacao=" + qtdHorasAulaCoordenada +
                ", valorPorHoras=" + valorPorHoras +
                ", qtdCursosCoordenados=" + qtdCursosCoordenados +
                '}';
    }
}
