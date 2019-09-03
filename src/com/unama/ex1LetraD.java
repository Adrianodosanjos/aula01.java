package com.unama;

import java.util.Scanner;

public class ex1LetraD {
    public static void main(String[] args){
        double perimetro;
        double raio;
        double area;
        double pi;

        Scanner leia = new Scanner(System.in);
        System.out.println("Calculo do perímetro e área de circulo.");
                //Perimetro (2*pi*r)
                //area (pi*raio^2)
        System.out.print("informe o raio desse círculo: ");
        raio = leia.nextDouble();
        pi = 3.14;
        perimetro = 2*pi*raio;
        area = pi*Math.pow(raio,2);

        System.out.println("Seu círculo tem perímetro de "+perimetro+"m e sua area é de "+area+"m²");


    }
}
