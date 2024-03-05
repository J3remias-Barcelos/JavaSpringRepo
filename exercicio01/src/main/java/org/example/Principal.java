package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int anoAtual, anoNascimento, qtdeAnos;

        System.out.println("Entre com o ano atual");

        anoAtual = new Scanner(System.in).nextInt();

        System.out.println("Entre com o ano de nascimento");

        anoNascimento = new Scanner(System.in).nextInt();

        qtdeAnos = anoAtual - anoNascimento;

        System.out.println("Em " + anoAtual + " voce faz (ou ja fez) " + qtdeAnos + " anos!");
    }
}