package aula02.uri;

import java.util.Scanner;

public class Uri1037 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a;

        a = in.nextDouble();

        if (a >= 0 && a <= 25) {
            System.out.printf("Intervalo [0,25]\n");
        } else if (a > 25 && a <= 50) {

            System.out.printf("Intervalo (25,50]\n");
        } else if (a > 50 && a <= 75) {

            System.out.printf("Intervalo (50,75]\n");
        } else if (a > 75 && a <= 100) {

            System.out.printf("Intervalo (75,100]\n");
        } else {
            System.out.printf("Fora de intervalo\n");
        }

        in.close();
    }

}
