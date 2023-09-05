import java.util.Scanner;
import perso.*;
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        perso j = new perso();
        mob m = new mob();
        mob2 m2 = new mob2();
        mob3 m3 = new mob3();

        JOptionPane.showInputDialog("O que deseja fazer? \n 1. Ir para a floresta \n 2. Ir para as cavernas \n 3. Ir para a cachoeira");

        int vidamob = m.vidam(j.dano);
        System.out.println(vidamob);



    }

}