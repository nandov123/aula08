package aula02.exercicios;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double p, s;

        System.out.printf("Digite o salário bruto e o valor da prestação: ");

        s = in.nextDouble();
        p = in.nextDouble();

        if (p <= 0.3 * s) {
            System.out.printf("O empréstimo pode ser concedido.\n");
        } else {
            System.out.printf("O empréstimo não pode ser concedido.\n");

        }

        in.close();
    }

}
