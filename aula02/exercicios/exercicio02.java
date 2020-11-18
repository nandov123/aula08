package aula02.exercicios;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2, nota;

        n1 = in.nextDouble();
        n2 = in.nextDouble();

        nota = n1 * 0.4 + n2 * 0.6;

        if (nota >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");

        }

        in.close();

    }

}
