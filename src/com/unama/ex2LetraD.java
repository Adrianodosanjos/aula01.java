package com.unama;

import java.util.Scanner;

public class ex2LetraD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int c;
                System.out.println("Classifique o triângulo");
                System.out.println("Defina o lado ABC do seu triângulo");
       System.out.print("Lado A:");
        a=sc.nextInt();
        System.out.print("Lado B:");
        b=sc.nextInt();
        System.out.print("Lado C:");
        c=sc.nextInt();
        if(a==b&&b==c){
            System.out.println("Triângulo Equilátero");
        }else if(a==b&&b!=c||a!=b&&a==c){
            System.out.println("Triângulo Isósceles");
        }else{
            System.out.println("Triângulo Escaleno");
        }
    }
}
