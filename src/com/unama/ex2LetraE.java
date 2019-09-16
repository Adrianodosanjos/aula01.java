package com.unama;

import java.util.Scanner;

public class ex2LetraE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3;
        double media;
        double faltas;


        System.out.println("Histórico Universidade");
        System.out.print("Nota 1:");
        nota1 = sc.nextFloat();
        System.out.print("Nota 2:");
        nota2 = sc.nextFloat();
        System.out.print("Nota 3:");
        nota3 = sc.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;
        if (media <= 3) {
            System.out.println("Reprovado!");
        } else if (media <= 5.9) {
            System.out.println("Recuperação!");
        } else if (media >= 6) {
        System.out.println("Aprovado!");
        }
System.out.print("Quantas faltas você tem?");
        faltas=sc.nextDouble();
        if(faltas<=40) {
            System.out.println(" ");
        }else if(faltas>=41){
            System.out.println("Suas notas foram boas mas você foi reprovado por faltas!");
        }
    }
}

