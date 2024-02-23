//Multiplicar um número pelo outro sem usar while e sem usar *


import java.util.Scanner;
public class recursiva {



    private static int c=1;
    private static int soma;
    private static int n1=0;

    private static int n2=0;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    n1 = s.nextInt();
    n2 = s.nextInt();
            metodo();

        }

        public static void metodo(){

        soma +=n1;
        System.out.println(soma);

        if (c<n2){
            c++;
            metodo();
        }
    }
    }
