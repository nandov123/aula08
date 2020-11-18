package aula03.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, cont, soma;
        cont = 1;
        soma = 0;
        n = 1;

        while (n != 0) {

            System.out.printf("Digite o %dº número: ", cont);
            n = in.nextInt();
            soma = soma + n;
            cont++;
        }
        System.out.println("A soma dos valores é: " + soma);

        in.close();
    }

}
