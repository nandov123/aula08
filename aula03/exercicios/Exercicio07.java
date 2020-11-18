package aula03.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int T = 5, A = 2;
        int n, mt, mg;
        n = 0;
        mt = 0;
        mg = 0;

        for (int t = 1; t <= T; t++) {
            for (int a = 1; a <= A; a++) {
                System.out.printf("Digite a nota do aluno %d da turma %d: ", a, t);
                n = in.nextInt();
                mt = mt + n;

            }
            System.out.printf("A média da turma %d é: %.2f\n", t, (double) mt / A);
            mg = mg + mt;
            mt = 0;
        }
        System.out.printf("A média geral é: %.2f\n", (double) mg / (T * A));
        in.close();
    }

}
