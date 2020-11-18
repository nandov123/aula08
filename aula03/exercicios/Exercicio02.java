package aula03.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, cont;

        System.out.print("Digite um número inteiro: ");
        n = in.nextInt();
        cont = 0;

        while (cont <= 10) {
            System.out.printf("%d x %d = %d\n", n, cont, n * cont);
            cont++;
        }
        in.close();
    }

}
