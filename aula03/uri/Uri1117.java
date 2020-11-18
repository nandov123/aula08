package aula03.uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2;

        n1 = -1;
        n2 = -1;

        while (n1 < 0 || n1 > 10) {
            n1 = in.nextDouble();
            if (n1 < 0 || n1 > 10) {
                System.out.println("nota invalida");
            }
        }

        while (n2 < 0 || n2 > 10) {
            n2 = in.nextDouble();
            if (n2 < 0 || n2 > 10) {
                System.out.println("nota invalida");
            }
        }

        System.out.printf("media = %.2f\n", (n1 + n2) / 2);

        in.close();

    }

}
