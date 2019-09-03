package com.unama;

import java.util.Scanner;

public class ex2LetraB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Produzido,defeito;
        System.out.println("Informe o total produzido");
        Produzido=sc.nextInt();
        System.out.println("Informe o total com defeito");
        defeito=sc.nextInt();
        Double limiar=Produzido*0.1;
                if(defeito<=limiar){
                    System.out.println("Não precisa de manutenção");
                }else{
                    System.out.println("Precisa de manutenção");
                }
    }
}
