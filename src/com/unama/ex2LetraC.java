package com.unama;

import java.util.Scanner;

public class ex2LetraC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idade;
        System.out.println("Informe a Idade");
        idade=sc.nextInt();
        if(idade<=10){
            System.out.println("Infantil");
        }else if(idade>10 && idade<=17){
            System.out.println("Juvenil");
        }else{
            System.out.println("Senior");
        }
    }
}
