package com.company;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args){

        double n1, n2;

        Scanner a = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");

        n1 = a.nextDouble();

        System.out.println("Digite a segunda nota: ");

        n2 = a.nextDouble();

        double media = ((n1 * 2.5) + (n2 * 4.5)) / 7;

        System.out.println(media);


}
}
