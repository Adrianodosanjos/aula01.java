package com.unama;

import java.util.Scanner;

public class ex2LetraJ {
        public static void menu(){
            System.out.println("Escolha o que você deseja:");
            System.out.println("1. Soma");
            System.out.println("2. Raiz");
            System.out.println("0. Sair");
            System.out.println("Opcao:");
}
        public static void Soma(){
            System.out.println("Soma");
        }

        public static void Raiz(){
            System.out.println("Raiz");
        }

        public static void Sair(){
            System.out.println(" ");
        }


        public static void main(String[] args) {
            int opcao;
            Scanner entrada = new Scanner(System.in);

            do {
                menu();
                opcao = entrada.nextInt();switch (opcao){
                    case 1:
                        Soma();
                        System.out.println("Insira dois números");
                        double a,b;
                        double soma;
                        a=entrada.nextDouble();
                        System.out.println("+");
                        b=entrada.nextDouble();
                        soma=a+b;
                        System.out.println("O resultado de "+a+" + "+b+" = "+soma);
                        System.out.println("==============================================");
                        break;

                    case 2:
                        Raiz();
                        System.out.println("Insira um número");
                        int x;
                        double c;
                        x=entrada.nextInt();
                        c=Math.sqrt(x);
                        System.out.println("A raíz quadrada de "+x+" = "+c);
                        System.out.println("==============================================");
                        break;



                    default:
                        System.out.println("Saindo...");
                }
            } while(opcao != 0);
        }
}