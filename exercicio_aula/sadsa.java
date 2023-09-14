package com.company;
import java.util.Scanner;
public class sadsa {

    public static void main(String[] args) {

       String placa;

        Scanner a = new Scanner(System.in);

        System.out.println("Digite o número da placa:");
        placa = a.next();
        char fin = placa.charAt(placa.length() - 1);

        if (fin == '1' || fin == '2' ){
            System.out.println("Rodizio segunda");

        }
        else if (fin == '3' || fin == '4'){
                System.out.println("Rodizio terça");
            }
        else if (fin == '5' || fin == '6'){
            System.out.println("ROdizio quarta");
        }

        else if (fin == '7' || fin == '8'){
            System.out.println("ROdizio quinta");
        }
        else{
            System.out.println("Rodizio sexta");
        }


    }
}
