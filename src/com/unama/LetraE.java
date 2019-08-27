package com.unama;

import java.util.Scanner;

public class LetraE {
    public static void main(String[] args){
     double totaldevendas;
     double commit;
     double totalareceber;
     double salario;

        Scanner leia = new Scanner(System.in);
        System.out.println("Calcule a comissão de um pc gamer");
        System.out.print("Qual o seu salário fixo:");
        salario = leia.nextDouble();
        System.out.print("Informe o valor do total de vendas:");
        totaldevendas = leia.nextDouble();
        commit = totaldevendas*0.1;
        totalareceber = salario + commit;
        System.out.println("Sua comissão será de R$"+commit);
        System.out.println("Seu salário total será de R$"+totalareceber);






    }
}
