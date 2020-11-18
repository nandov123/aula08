package aula02.uri;

import java.io.IOException;
import java.util.Scanner;

public class uri03 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        double A, B, C, MEDIA;

        A = entrada.nextDouble();  
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        MEDIA = (A * 2 + B * 3 + C * 5)/10; 
        //System.out.printf("MEDIA = %.1f\n", MEDIA);
        System.out.println("MEDIA = " + MEDIA);

        entrada.close(); //encerra a conexão com o teclado
    }
}
