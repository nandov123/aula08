package aula03.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, n;

        System.out.print("Digite um número: ");
        n = in.nextInt();
        a = 1;

        System.out.print("Sequência impressa: ");
        while (a <= n) {
            System.out.print(a);
            a = 2 * a;
            if (a <= n) {
                System.out.print(",");
            }
        }

        in.close();
    }

}
