package com.unama;

import java.util.Scanner;

public class ex2LetraKfaltafazer {
    public static void menu(){
        System.out.println("Selecione o seu cargo (1-6)");
        System.out.println("1. Escriturario(a)");
        System.out.println("2. Secretario(a)");
        System.out.println("3. Caixa");
        System.out.println("4. Gerente");
        System.out.println("5. Diretor(a)");
        System.out.println("0. Sair");
    }

    public static void Escriturario(){
        System.out.println("Escriturario(a)");
    }

    public static void Secretario(){
        System.out.println("Secretario(a)");
    }
    public static void Caixa() {
        System.out.println("Caixa");
    }

    public static void Gerente() {
        System.out.println("Gerente");
    }

    public static void Diretor() {
        System.out.println("Diretor(a)");
    }

    public static void Sair(){
        System.out.println("Saindo...");
    }


    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        do{
            menu();
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    Escriturario();
                    System.out.print("Qual seu salário atual: R$");
                    double salario;
                    salario=entrada.nextDouble();
                    double reajuste;
                    reajuste=(salario*0.5)+salario;
                    System.out.println("Reajuste de 50%, seu salário será de: R$"+reajuste);
                    break;

                case 2:
                    Secretario();
                    System.out.print("Qual seu salário atual: R$");
                    double salarioo;
                    salarioo=entrada.nextDouble();
                    double reajustee;
                    reajustee=(salarioo*0.35)+salarioo;
                    System.out.println("Reajuste de 35%, seu salário será de: R$"+reajustee);
                    break;

                case 3:
                    Caixa();
                    System.out.print("Qual seu salário atual: R$");
                    double salariooo;
                    salariooo=entrada.nextDouble();
                    double reajusteee;
                    reajusteee=(salariooo*0.2)+salariooo;
                    System.out.println("Reajuste de 20%, seu salário será de: R$"+reajusteee);
                    break;

                case 4:
                    Gerente();
                    System.out.println("Gerente");
                    System.out.print("Qual seu salário atual: R$");
                    double salarioooo;
                    salarioooo=entrada.nextDouble();
                    double reajusteeee;
                    reajusteeee=(salarioooo*0.1)+salarioooo;
                    System.out.println("Reajuste de 10%, seu salário será de: R$"+reajusteeee);
                    break;

                    case 5:
                    Diretor();
                        System.out.println("Diretor");
                        System.out.println("Seu salário será fixo: R$7000");
                        System.out.println("Você não receberá reaguste!");

                    break;


                default:
                    System.out.println("Saindo...");
            }
        } while(opcao != 0);
    }
}

