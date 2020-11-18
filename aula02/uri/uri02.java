package aula02.uri;

import java.io.IOException;
import java.util.Scanner;

public class uri02 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int A, B, PROD;

        A = entrada.nextInt();  //lê um número inteiro do teclado e armazena na variável 'numero'
        B = entrada.nextInt();  //lê um número inteiro do teclado e armazena na variável 'numero'
        PROD = (A * B); //alternativa para converter para double
        System.out.println("PROD = " + PROD);

        entrada.close(); //encerra a conexão com o teclado
    }
}
