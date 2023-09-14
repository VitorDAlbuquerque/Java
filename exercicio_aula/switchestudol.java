package com.company;
import java.util.Scanner;
public class switchestudol {

public static void main(String[] args) {

        double n1, n2, result;
        char escolha;

        Scanner a = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = a.nextDouble();

        System.out.println("Digiteo segundo número: ");
        n2 = a.nextDouble();

        System.out.println("Digite a operação: m = multiplicação, s = Soma, d = divisão e  n = subtração. ");

        escolha = a.next().charAt(0);

        switch (escolha) {
        case 'm':
        result = n1 * n2;
        System.out.println(result);
        break;
        case 's':
        result = n1 + n2;
        System.out.println(result);
        break;
        case 'd':
        if (n2 != 0){

        result = n1 / n2;
        System.out.println(result);}
        else{
        System.out.println("Digite um segundo número diferente de 0.");
        }
        break;
        case 'n':
        result = n1 - n2;
        System.out.println(result);
        break;


        }
        }
        }
