package com.unama;

import javafx.scene.paint.Stop;

import java.util.Scanner;

public class ex2LetraH {
    public static void menu(){
        System.out.println("Peso ideal");
        System.out.println("1. Masculino");
        System.out.println("2. Feminino");
        System.out.println("0. Sair");
        System.out.println("Opcao:");
    }

    public static void Masculino(){
        System.out.println("Masculino");
    }

    public static void Feminino(){
        System.out.println("Feminino");
    }

    public static void Sair(){
        System.out.println(" ");
    }


    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        do{
            menu();
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    Masculino();
                    System.out.println("Quantos metros você tem?");
                    double alturahomem;
                    alturahomem=entrada.nextDouble();
                    double homem;
                    homem=(alturahomem*73)-58;
                    System.out.println("O seu peso ideal é de "+homem+"Kg");
                    System.out.println("==============================================");
                    break;

                case 2:
                    Feminino();
                    System.out.println("Quantos metros você tem?");
                    double alturamulher;
                    alturamulher=entrada.nextDouble();
                    double mulher;
                    mulher=(alturamulher*62)-45;
                    System.out.println("O seu peso ideal é de "+mulher+"Kg");
                    System.out.println("==============================================");
                    break;



                default:
                    System.out.println("Saindo...");
            }
        } while(opcao != 0);
    }
}

