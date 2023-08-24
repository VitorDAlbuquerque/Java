package com.company;

import java.util.Scanner;

public class Main {

    public static void a (String[] args) {


        double valorp, vfinal;
        int codp, qtdp;

        Scanner a = new Scanner(System.in);

        System.out.println("Digite o código da peça");
        codp = a.nextInt();


        System.out.println("Digite o valor da peça");
        valorp = a.nextDouble();

        System.out.println("Digite a quantidade de peças");
        qtdp = a.nextInt();

        vfinal = qtdp * valorp;

        System.out.println("O valor final é: " +vfinal+  " O código da peça é: " +codp);


    }
}
