package aula02.exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //int numeroInteiro;
        double numeroDouble;

        //System.out.println("Digite seu nome: ");
        // nome = entrada.next(); // até encontrar espaço
        numeroDouble = entrada.nextInt(); 

        System.out.println(numeroDouble);

        entrada.close();

    }
}
