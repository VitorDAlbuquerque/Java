package com.company;
import java.util.Scanner;
public class nfl {
    public static void main(String[] args) {

        String times[] = new String[3];
        int vit[] = new int[3];
        int der[] = new int[3];
        double chance[] = new double[3];

        Scanner nome = new Scanner(System.in);
        Scanner jogo = new Scanner (System.in);

        for (int i=0; i<3; i++) {
            System.out.println("Qual o nome do " + (i + 1) + "° time");
            times[i] = nome.next();
            System.out.println("Qual a quantidade de vitórias do: " +(i+1)+ " time");
            vit[i] = jogo.nextInt();
            System.out.println("Qual a quantidade de derrotas do: " +(i+1)+ " time");
            der[i] = jogo.nextInt();


            chance[i]= vit[i] * 0.33 * 100;
            }

       for (int n=0; n<3; n++){
        System.out.println("A chance do time: " + times[n] + " ganhar é: "+ chance[n]);
       }

    }
}
