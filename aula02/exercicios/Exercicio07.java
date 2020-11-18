package aula02.exercicios;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double s;

        System.out.print("Digite seu salário: ");

        s = in.nextDouble();

        if (s <= 600) {
            System.out.printf("Isento\n");
        } else {
            if (s > 600 && s <= 1200) {
                System.out.printf("20%%\n");
            } else {
                if (s > 1200 && s <= 2000) {
                    System.out.println("25%");
                } else {
                    System.out.println("30%");
                }
            }

        }

        in.close();
    }

}
