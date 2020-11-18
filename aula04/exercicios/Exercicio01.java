package aula04.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Digite um número para saber se é par: ");
        n = in.nextInt();

        System.out.println(e_par(n));
        in.close();
    }

    static String e_par(int n) {
        String p;

        if (n % 2 == 0) {
            p = "O número é par.";
        } else {
            p = "O número não é par.";
        }
        return p;

    }

}
