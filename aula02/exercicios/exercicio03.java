package aula02.exercicios;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n1, n2;

        System.out.printf("Digite dois números: ");

        n1 = in.nextDouble();
        n2 = in.nextDouble();

        if (n1 > n2) {
            System.out.printf("%.2f %.2f\n", n1, n2);
        } else {
            System.out.printf("%.2f %.2f\n", n2, n1);

        }

        in.close();
    }

}
