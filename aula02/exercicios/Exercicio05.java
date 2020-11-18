package aula02.exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String su, ss;

        ss = "R10p5";

        System.out.printf("Digite a senha: ");

        su = in.next();

        if (su.equals(ss)) {
            System.out.printf("Acesso concedido.\n");
        } else {
            System.out.printf("Acesso negado.\n");
        }

        in.close();
    }

}
