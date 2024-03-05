package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: " + (i + 1) + " de 10");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Digite um número para pesquisar: ");
        int numero = leitor.nextInt();

        int ocorrencias = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                ocorrencias++;
            }
        }
        System.out.println("O número " + numero + " ocorre " + ocorrencias + " vezes");
    }
}
