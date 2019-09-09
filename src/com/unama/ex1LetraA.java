package com.unama;

import java.util.Scanner;

public class ex1LetraA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Cadastro");
        System.out.print("Informe seu nome:");
        nome=sc.nextLine();
        System.out.print("Informe sua idade");
        idade=sc.nextInt();
        System.out.print("nome "+nome+", idade "+idade+" anos.");

    }
}
