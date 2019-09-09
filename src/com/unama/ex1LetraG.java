package com.unama;

import java.util.Scanner;

public class ex1LetraG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float banana,abacate, abacaxi,uva, mamao, limao, laranja, cheiroverde, cebola, alface, pepino, cenoura, tomate;
        double totaldefrutas;
        double totaldeverduras;
        double totalapagar;

        System.out.println("Olá feirante, informe quantas frutas você deseja levar");
        System.out.println("Banana");
        banana=sc.nextFloat();
        System.out.println("Abacate");
        abacate=sc.nextFloat();
        System.out.println("Abacaxi");
        abacaxi=sc.nextFloat();
        System.out.println("Uva");
        uva=sc.nextFloat();
        System.out.println("Mamão");
        mamao=sc.nextFloat();
        System.out.println("Limão");
        limao=sc.nextFloat();
        System.out.println("Laranja");
        laranja=sc.nextFloat();
        totaldefrutas=(banana+0.50)+(abacate+1.50)+(abacaxi+3.00)+(uva+0.20)+(mamao+1.50)+(limao+1.00)+(laranja+1.00);
        System.out.println("Você pagará R$"+totaldefrutas);

        System.out.println("Agora informe quantas verduras e legumes você deseja levar.");
        System.out.println("Cheiro verde");
        cheiroverde=sc.nextFloat();
        System.out.println("Cebola");
        cebola=sc.nextFloat();
        System.out.println("Alface");
        alface=sc.nextFloat();
        System.out.println("Pepnino");
        pepino=sc.nextFloat();
        System.out.println("Cenoura");
        cenoura=sc.nextFloat();
        System.out.println("Tomate");
        tomate=sc.nextFloat();
        totaldeverduras=(cheiroverde+1.00)+(cebola+0.50)+(alface+1.00)+(pepino+0.80)+(cenoura+0.60)+(tomate+0.50);
        System.out.println("Você pagará R$"+totaldeverduras);

        totalapagar=totaldefrutas+totaldeverduras;
        System.out.println("Sua conta total a pagar será de R$"+totalapagar);

    }
}
