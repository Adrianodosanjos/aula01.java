package com.unama;

import java.util.Scanner;

public class ex1LetraB {

    public static void main(String[] args) {
	int numero;
	int dobro;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá vamos calcular o Dobro");
        System.out.print("Informe o número: ");
        numero = scanner.nextInt();
        dobro = numero * 2;
        System.out.println("O dobro do numero "+numero+ " é "+dobro);

    }
}
