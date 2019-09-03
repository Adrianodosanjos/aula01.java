package com.unama;

import java.util.Scanner;

public class ex1LetraC { Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
            double base;
            double altura;
            double area;
        Scanner leia = new Scanner(System.in);
            System.out.println("Calcule a area do triangulo");
            System.out.print("Informe o valor da base: ");
            base = leia.nextDouble();
            System.out.print("Informe o valor da altura: ");
            altura = leia.nextDouble();
            area = (base*altura)/2;
            System.out.print("A area desse triangulo é "+area+"m²");
    }
}
