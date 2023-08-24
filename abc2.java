package com.company;

import java.util.Scanner;

public class abc2 {
    public static void main(String[] args) {

        String nome,sexo;
        int idade, qtdh = 0, qtdm = 0;
        double salario, totals = 0;

        Scanner a = new Scanner(System.in);
        int i = 0;

        while (i < 5) {
            i++;


            System.out.println("Digite seu sexo (M para masculino) (F feminino)");
            sexo = a.next();

            System.out.println("Digite sua idade");
            idade = a.nextInt();

            System.out.println("Digite seu salário");
            salario = a.nextDouble();

        if(sexo.equalsIgnoreCase("M")){
            qtdh++;
        }

        else{
            qtdm++;
        }


            totals += salario;
            System.out.println("A quantidade de mulheres é: " + qtdm + ", a quantidade de homens é: " + qtdh + "e a soma do salário de todos é: " + totals);
        }


    }
}


