package com.unama;

import java.util.Scanner;

public class ex2LetraF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b;

        System.out.println("O maior");
        System.out.println("Informe 2 números");
        a=sc.nextInt();
        b=sc.nextInt();

        if(a>b) {
            System.out.println(+a + " é o maior");
        }else{
            System.out.println(+b+" é o maior");
        }
    }
}
