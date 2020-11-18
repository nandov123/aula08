package aula02.uri;

import java.io.IOException;
import java.util.Scanner;

public class uri04 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        double u1, p1, u2, p2, pay;

        // c1 = entrada.nextDouble();
        entrada.nextDouble();
        u1 = entrada.nextDouble();
        p1 = entrada.nextDouble();
        // c2 = entrada.nextDouble();
        entrada.nextDouble();
        u2 = entrada.nextDouble();
        p2 = entrada.nextDouble();
        pay = u1 * p1 + u2 * p2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", pay);
        // System.out.println("MEDIA = " + MEDIA);

        entrada.close(); // encerra a conexão com o teclado
    }
}
