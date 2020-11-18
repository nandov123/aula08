package aula03.uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        
    
        Scanner in = new Scanner(System.in);

        int n, s;

        s = 2002;
        n = 0;

        while (n != s) {
            n = in.nextInt();
            if (n != s) {
                System.out.println("Senha Invalida");
            } else { System.out.println("Acesso Permitido");
        }
        }
        


        in.close();

    }

    
}
