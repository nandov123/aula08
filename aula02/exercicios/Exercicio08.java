package aula02.exercicios;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b, c;
        boolean t;

        System.out.print("Digite o comprimento dos 3 lados do triângulo: ");

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        t = (a > (b + c)) || (b > (a + c)) || (c > (b + a));

        if (t) {
            System.out.printf("Esses comprimentos não formam um triângulo.\n");
        } else {
            if (a == b && b == c) {
                System.out.printf("O triângulo é equilatero.\n");
            } else {
                if (a != b && a != c && b != c) {
                    System.out.println("O triângulo é escaleno");
                } else {
                    System.out.println("O triângulo é isósceles");
                }
            }

        }

        in.close();
    }

}
