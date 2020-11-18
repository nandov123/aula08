package aula03.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, p, i, par;
        p = 0;
        par = 0;
        i = 0;
        n = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.printf("Digite o %dº número: ", cont);
            n = in.nextInt();

            if (n % 2 == 0) {
                p++;
                par = par + n;
            } else {
                i++;
            }
        }
        System.out.printf("A média dos valores pares é: %.2f\n", (double)par / p);
        System.out.printf("A porcentagem de valores ímpares é: %.0f%%\n", (double)i / (i + p)*100);

        in.close();

    }

}
