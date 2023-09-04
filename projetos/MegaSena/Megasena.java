import java.util.Random;

public class Megasena {
    public static void main(String[] args) {

        Random r1 = new Random();

        int resp = Integer.parseInt(args[0]);

        int n = r1.nextInt(10);
        if (resp == n) {
            System.out.println("Parabéns! Você acertou! O número era: " +n);

        }

        else{
            System.out.println("Você errou! O número era: " +n);
        }
    }

}