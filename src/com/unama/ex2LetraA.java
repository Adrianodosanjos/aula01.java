package com.unama;

import java.util.Scanner;

public class ex2LetraA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalcopias;
        double totalpago;

        System.out.println("Informe quantas cópias você deseja:");
        totalcopias = sc.nextInt();

        if(totalcopias<=100){
            totalpago=totalcopias*0.25;

        }else{
            totalpago=totalcopias*0.20;
        }
        System.out.println("total a ser pago é R$"+totalpago);
}}