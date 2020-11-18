package aula03.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, p, i;
        p = 0;
        i = 0;
        n = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.printf("Digite o %dº número: ", cont);
            n = in.nextInt();

            if (n % 2 == 0) {
                p++;
            } else {
                i++;
            }
        }
        System.out.println("O total de pares é: " + p);
        System.out.println("O total de ímpares é: " + i);

        in.close();

    }

}
