package com.company;
import java.util.Scanner;
public class vet1 {

    public static void main(String[] args) {

        double notas[] = new double[10];
        Scanner a = new Scanner(System.in);

        for (int i=0; i<10; i++){

            System.out.println("Digite sua nota: ");
            notas[i] = a.nextDouble();

        }
        System.out.println("A nota 7 é: " +notas[7]+ " E a nota 9 é: " +notas[9]);
    }
}
