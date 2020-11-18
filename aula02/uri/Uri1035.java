package aula02.uri;

import java.util.Scanner;

public class Uri1035 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b, c, d;
        boolean t;


        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        

        t = b > c && d > a && c + d > a + b && c >=0 && d >= 0 && a%2 ==0;

        if (t) {
            System.out.printf("Valores aceitos\n");
        } else {
            
                System.out.printf("Valores nao aceitos\n");
            } 

        in.close();
    }

}
