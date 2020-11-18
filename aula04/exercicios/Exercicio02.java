package aula04.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite três números inteiros: ");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println("O menor número é: " + menorNumero(a, b, c));

        in.close();
    }

    static int menorNumero(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

}
