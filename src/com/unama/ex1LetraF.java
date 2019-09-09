package com.unama;

import java.util.Scanner;

public class ex1LetraF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float tvenda;
        double comissao;

        System.out.println("Qual total de vendas ");
        tvenda=sc.nextFloat();
        comissao=tvenda*0.1;
        System.out.println("A comissao será de "+comissao);



    }
}
