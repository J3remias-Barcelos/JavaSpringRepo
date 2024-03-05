package org.example;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.printf("\nPASSO 01 ");
        // Passo 1
        Scanner leitorNumero = new Scanner(System.in);
        int[] vetor = new int[7];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: " + (i + 1) + " de 7");
            vetor[i] = leitorNumero.nextInt();
        }

        System.out.println("Ordem de inserção: "); // Para ordenar os números na ordem que foram inseridos
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }

        System.out.println("Ordem inversa: "); // Para ordenar os números na ordem inversa que foram inseridos(For ao contrário)
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
