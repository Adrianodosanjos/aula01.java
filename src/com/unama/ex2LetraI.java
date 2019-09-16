package com.unama;

import java.util.Scanner;

public class ex2LetraI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Insira suas notas das Av1, Av2 e Av3:");
        int a;
        int b;
        int c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int media;
        media=(a+b+c)/3;
        if (media<=3) {
            System.out.println("Reprovado!");
        }else if(media>3&&media<7) {
            System.out.println("Estude você está de recuperação");
        }else{
            System.out.println("Aprovado, Parabéns!");
        }

    }
}
