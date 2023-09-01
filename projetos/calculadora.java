public class calculadora {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equalsIgnoreCase("soma")) {
            soma(x, y);
        }

        else if (args[0].equalsIgnoreCase("subtrair")){
            subtrair(x, y);
        }

        else if (args[0].equalsIgnoreCase("divisao")){
            divisao(x,y);
        }
        else {
            multiplicacao(x,y);
        }
    }

    static void soma(int x, int y) {

        System.out.println(x + y);
    }

    static void subtrair (int x, int y ){

        System.out.println(x-y);
    }

    static void divisao (int x , int y){
        System.out.println(x/y);
    }

    static void multiplicacao (int x, int y){
        System.out.println(x *y);
    }
}
