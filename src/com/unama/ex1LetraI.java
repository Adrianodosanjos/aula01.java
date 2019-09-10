package com.unama;

import java.util.Scanner;

public class ex1LetraI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float camisa,desconto,bermudas,sapato;
        double produto;
        double total;
        System.out.println("Você está na loja Marisa, boas compras!");
        System.out.println("Camisas: com -10% de descontos");
        System.out.println("Shortes e Bermudas: com -20% de descontos");
        System.out.println("Sapatos, Sandálias e Chinelos: com -15% de descontos");
        System.out.println("Aproveite nosas ofertas!");

        System.out.print("O preço da sua camisa é de: ");
        camisa=sc.nextFloat();
        System.out.print("O Preço de seu short ou bermuda é de:");
        bermudas=sc.nextFloat();
        System.out.print("O preço de seu sapato, sandália ou chinelo é de:");
        sapato=sc.nextFloat();
        produto=(camisa*0.1)+(bermudas+0.2)+(sapato*0.15);
        System.out.println("Você recebou -R$"+produto+" de descontos");
        total=(camisa+bermudas+sapato)-(produto);
        System.out.println("O total a pagar será de R$"+total);


    }
}
