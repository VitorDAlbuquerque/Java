package com.company;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        int o = 1;
        double carrinho = 0;
        int p = 0;

        while (p ==0 ){



        }
        while (o == 1) {
            String a = JOptionPane.showInputDialog("Deseja adicionar algo ao carrinho? \nO seu total é: R$" + carrinho);
            if (a.equalsIgnoreCase("sim")) {
                String b = JOptionPane.showInputDialog("Digite o ID do que você deseja comprar: ? \n 1. Colar com rastreador - R$ 79,99 \n 2. Pulseira com rastreador - R$ 56.00 \n 3. Pelucia de Golfinho - R$ 40.00 ");
                if (b.equalsIgnoreCase("1")) {
                    carrinho += 79.99;
                }
                if (b.equalsIgnoreCase("2")) {
                    carrinho += 56.00;
                }
                if (b.equalsIgnoreCase("3")) {
                    carrinho += 40.00;
                }
            } else {
                o = 0;
                JOptionPane.showMessageDialog(null, "Seu total deu: R$ " + carrinho + " \nObrigado e volte sempre!");
                System.exit(0);
            }
        }




    }
}

