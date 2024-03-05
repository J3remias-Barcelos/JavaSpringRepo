package org.example;

public abstract class Funcionario {
    // Atributos que serão herdados pelas classes filhas
    private String nome;
    private String cpf;

    // Construtor
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    // Método abstrato
    public abstract Double calculaSalario();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // toString
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
