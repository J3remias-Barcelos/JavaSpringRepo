package org.example;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitorDia = new Scanner(System.in);

        System.out.printf("Digite o dia: ");

        int dia = leitorDia.nextInt();

        Scanner leitorMes = new Scanner(System.in);

        System.out.printf("Digite o mês: ");

        int mes = leitorMes.nextInt();

        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

        int diaAno = 0;

        for (int i = 0; i < mes - 1; i++) {
            diaAno += diasMes[i];
        }

        diaAno += dia;

        System.out.println("O dia " + dia + "/" + mes + " corresponde ao dia " + diaAno + " do ano.");
    }
}
