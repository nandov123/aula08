package aula01.exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double n1, n2, resultado;

        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextInt();  //lê um número inteiro do teclado e armazena na variável 'numero'
        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextInt();  //lê um número inteiro do teclado e armazena na variável 'numero'
        //resultado = (n1 + n2)/2;
        resultado = (double)(n1 + n2) / 2; //alternativa para converter para double
        System.out.println("A média do aluno é: " + resultado);

        entrada.close(); //encerra a conexão com o teclado


        
    }
    
}
