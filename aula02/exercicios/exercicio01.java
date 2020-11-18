package aula02.exercicios;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Digite um número inteiro: ");

        n = in.nextInt();

        if (n > 20) {

            System.out.println("A metade do número é: " + (float) n / 2);

        }

        in.close();

    }
}
