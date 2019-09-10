package com.unama;

import java.util.Scanner;

public class ex1LetraJ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float reais,dolar,totalemreaiss;
        double totalemdolar;
        double totalemreais;

        System.out.println("Conversor de Real para Dólar");

        System.out.print("R$");
        reais=sc.nextFloat();
        totalemdolar=reais/4.09;
        System.out.print("Será de $"+totalemdolar);
       
        System.out.println(" ");
        System.out.println("Conversor de Dólar para Real");
        System.out.print("$");
        dolar=sc.nextFloat();
        totalemreais=dolar*4.09;
        System.out.print("Será de R$"+totalemreais);
    
    }
}
