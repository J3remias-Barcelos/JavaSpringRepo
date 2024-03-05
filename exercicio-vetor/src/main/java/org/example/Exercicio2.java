package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.printf("\nPASSO 02 \n");

        // Passo 2
        Scanner leitorNumero = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: " + (i + 1) + " de 10");
            vetor[i] = leitorNumero.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;
        System.out.println("A média dos números digitados é: " + media);
    }
 }
