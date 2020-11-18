package aula02.uri;

import java.util.Scanner;

public class Uri1048 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double s, n;

        s = in.nextDouble();

        if (s <= 3000 && s > 2000) {
            n = (s-2000) * 0.08;
            System.out.printf("R$ %.2f\n",n);

        
        } else if (s > 3000 && s <= 4500) {
            n = (1000 * 0.08)+ (s - 3000) * 0.18;
            System.out.printf("R$ %.2f\n",n);

        } else if (s > 4500) {
            n = (1000 * 0.08)+ 1500 * 0.18 + (s - 4500) * 0.28;
            System.out.printf("R$ %.2f\n",n);

        
        } else {
            System.out.println("Isento");
        }


        in.close();
    }

}
