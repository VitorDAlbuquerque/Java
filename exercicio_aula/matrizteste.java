package com.company;
import java.util.Scanner;
public class matrizteste {

    public static void main(String[] args) {

        int m1[][] = new int[3][3];
        int soma = 0;
        Scanner s = new Scanner(System.in);
        for (int c1=0; c1<3; c1++){
            for (int l1=0; l1<3; l1++){

                System.out.println("Dite o número da coluna: " +c1+ "E da linha: " +l1);
                m1[c1][l1] = s.nextInt();

                System.out.println(m1[c1][l1]);
                if (l1 == c1){
                     soma = soma + m1[c1][l1];
                }
            }
        }



        for (int c1=0; c1<3; c1++) {
            for (int l1 = 0; l1 < 3; l1++) {

                System.out.printf("\t \t" +m1[c1][l1]);

            }
            System.out.println();

        }

        System.out.println("A soma é: "+soma);

    }
}
