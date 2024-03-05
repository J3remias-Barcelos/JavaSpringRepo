package org.example;

public class Secretaria extends Funcionario{
    // Atributos
    private Double salarioBase;
    private Double valorExtra;


    // Construtor
    public Secretaria(String nome, String cpf, Double salarioBase, Double valorExtra) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.valorExtra = valorExtra;
    }

    // Método abstrato
    public Double calculaSalario() {
        return salarioBase + valorExtra;
    }

    // Getters e Setters
    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getValorExtra() {
        return valorExtra;
    }

    public void setValorExtra(Double valorExtra) {
        this.valorExtra = valorExtra;
    }

    // toString
    @Override
    public String toString() {
        return "Secretaria{" +
                "salarioBase=" + salarioBase +
                ", valorExtra=" + valorExtra +
                '}';
    }
}
