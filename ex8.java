package com.company;
import java.util.Scanner;
import java.lang.Math;
public class ex8 {

    public static void main (String[] args){

    int raio = 0;

    Scanner a = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
    raio = a.nextInt();

    double v = Math.PI * Math.pow(raio, 3);

    System.out.println(v);

    }

}


