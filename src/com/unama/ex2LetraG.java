package com.unama;

import java.util.Scanner;

public class ex2LetraG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Par ou Ímpar?");
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
            //PAR
        } else {
            System.out.println("Ímpar");
            //ÍMPAR
        }
    }
}