package aula02.uri;

import java.io.IOException;
import java.util.Scanner;

public class uri05 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int inp, n100, n50, n20, n10, n5, n2, n1;

        inp = entrada.nextInt();
        n100 = inp/100;
        n50 = (inp % 100)/50;
        n20 = ((inp % 100)%50)/20;
        n10 = (((inp % 100)%50)%20)/10;
        n5 = ((((inp % 100)%50)%20)%10)/5;
        n2 = (((((inp % 100)%50)%20)%10)%5)/2;
        n1 = ((((((inp % 100)%50)%20)%10)%5)%2)/1;
        //pay = u1 * p1 + u2 * p2; 
        System.out.printf("%d\n", inp);
        System.out.printf("%d nota(s) de R$ 100,00\n", n100);
        System.out.printf("%d nota(s) de R$ 50,00\n", n50);
        System.out.printf("%d nota(s) de R$ 20,00\n", n20);
        System.out.printf("%d nota(s) de R$ 10,00\n", n10);
        System.out.printf("%d nota(s) de R$ 5,00\n", n5);
        System.out.printf("%d nota(s) de R$ 2,00\n", n2);
        System.out.printf("%d nota(s) de R$ 1,00\n", n1);
        

        entrada.close(); //encerra a conexão com o teclado
    }
}
