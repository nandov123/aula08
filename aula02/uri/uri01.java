package aula02.uri;

import java.util.Scanner;

public class uri01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A, B, SOMA;

        A = entrada.nextInt();  //lê um número inteiro do teclado e armazena na variável 'numero'
        B = entrada.nextInt();  //lê um número inteiro do teclado e armazena na variável 'numero'
        SOMA = (A + B); //alternativa para converter para double
        System.out.println("SOMA = " + SOMA);

        entrada.close(); //encerra a conexão com o teclado


        
    }
    
}