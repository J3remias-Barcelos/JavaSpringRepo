package org.example;

public class TestaControleBonus {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Secretaria
        Secretaria secretaria = new Secretaria("Maria", "123.456.789-00", 1000.0, 500.0);
        // Instanciando um objeto da classe Professor
        Professor professor = new Professor("João", "987.654.321-00", 100, 50.0);
        // Instanciando um objeto da classe Coordenador
        Coordenador coordenador = new Coordenador("José", "111.222.333-44", 200, 60.0, 5);

        // Instanciando um objeto da classe ControleBonus
        ControleBonus controleBonus = new ControleBonus();


        // Adicionando os objetos à lista
        controleBonus.adicionarNaLista(professor);
        controleBonus.adicionarNaLista(coordenador);

        // Exibindo o conteúdo da lista
        controleBonus.exibirConteudo();

        // Calculando a quantidade de bônus
        System.out.println(controleBonus.calcularQtdBonus());
    }
}