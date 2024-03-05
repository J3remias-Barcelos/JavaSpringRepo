package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.printf("\nPASSO 03 \n");
        // Passo 3
        Scanner leitor = new Scanner(System.in);
        String[] vetor = new String[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um nome: " + (i + 1) + " de 10");
            vetor[i] = leitor.nextLine();
        }
        System.out.println("Digite um nome para pesquisar: ");
        String nome = leitor.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(nome)) {
                System.out.println("Nome encontrado no índice " + (i + 1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nome não encontrado");
        }
    }
}
