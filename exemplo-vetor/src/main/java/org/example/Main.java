package org.example;

import java.util.Scanner;

public class Main {
    public static void exibeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor indice: [" + i + "]= " + vetor[i]);
        }
    }

    public static void leVetor(int[] vetor) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor para o vetor: [" + i + "]");
            vetor[i] = leitor.nextInt();
        }
    }

    public static void somaDosValores(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("A soma dos valores do vetor 1° é: " + soma);
    }

    public static void quantidadeDeValoresPares(int[] vetor) {
        int quantidade = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                quantidade++;
            }
        }
        System.out.println("A quantidade de valores pares do vetor 1° é: " + quantidade);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criação de um Vetor de ints, de tamanho 5
        int[] vetor = new int[5];

        // Criação de um 2° vetor de ints, já inicializado com valores
        int[] vetor2 = {100, 200, 300, 400, 500, 600, 700};

        // Criação de um vetor de Strings
        String[] vetorString = new String[5];

        // Declaração de um 4° Vetor, que terá seu tamanho digitado pelo Usuario
        int[] vetor4;
        int tamanho;

        // Preenchendo o vetor com valores
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 10;
        }

        // Preenchendo o vetor com valores digitados pelo usuario
        leVetor(vetor);

        // Exibindo o vetor
        System.out.println("\n Vetor1:");
        exibeVetor(vetor);

        // Exibindo o vetor2
        System.out.println("\n Vetor2:");
        exibeVetor(vetor2);

        // Exibindo o vetor de Strings
        for (int i = 0; i < vetorString.length; i++) {
            System.out.println("Digite um valor para o vetor de Strings: [" + i + "]");
            vetorString[i] = leitor.next();
        }

        // Exibindo o vetor de Strings
        for (String s : vetorString) {
            System.out.println(s);
        }

        // Solicita que o usuario digite o tamanho do vetor4
        // Esse valor devera ser maior do que 2
        do {
            System.out.println("Digite o tamanho do vetor4: ");
            System.out.println("O tamanho deve ser maior do que 2");
            tamanho = leitor.nextInt();
        } while (tamanho <= 2);

        // Criação do vetor4
        vetor4 = new int[tamanho];

        // Exibindo o vetor4
        System.out.println("\n Vetor4:");
        leVetor(vetor4);


        // Desafio 01 Exibir a soma dos valores do 1° Vetor(Vetor)
        somaDosValores(vetor);


        // Desafio 02 Exibir a quantidade de valores pares do 1° Vetor(Vetor)
        quantidadeDeValoresPares(vetor);

        // Desafio 03 Criar um vetor de Strings inicializando com os nomes dos dias da semana, ("Domingo", "Segungda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
        // Ficar num loop pedindo que o usuario digite um valor entre 1 a 7.
        // Enquanto não for um numero valido solicitar novamente
        // Exibir o dia da semana correspondente ao numero digitado
        // Sendo que 1 é Domingo, 2 É Segunda, 3 é Terca, etc...

        String[] diasDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        int dia;

        do {
            System.out.println("Digite um valor entre 1 a 7: ");
            dia = leitor.nextInt();
            if (dia >= 1 && dia <= 7) {
                System.out.println("O dia da semana correspondente ao numero digitado é: " + diasDaSemana[dia - 1]);
            }
        } while (dia < 1 || dia > 7);
    }
}