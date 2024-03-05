package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitorCarro = new Scanner(System.in);

        String[] modelos = new String[5];

        for (int i = 0; i < modelos.length; i++) {
            System.out.println("Digite o modelo do carro: " + (i + 1) + " de 5");
            modelos[i] = leitorCarro.nextLine();
        }

        Scanner leitorRendimento = new Scanner(System.in);

        int[] rendimento = new int[5];

        for (int i = 0; i < rendimento.length; i++) {
            System.out.println("Digite o rendimento do carro: " + (i + 1) + " de 5");
            rendimento[i] = leitorRendimento.nextInt();
        }

        int menorRendimento = rendimento[0];
        int indiceMenorRendimento = 0;

        for (int i = 1; i < rendimento.length; i++) {
            if (rendimento[i] > menorRendimento) {
                menorRendimento = rendimento[i];
                indiceMenorRendimento = i;
            }
        }

        System.out.println("O carro mais econômico é o " + modelos[indiceMenorRendimento]);

    }
}
