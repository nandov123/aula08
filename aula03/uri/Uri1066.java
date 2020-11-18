package aula03.uri;

import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1066 {
 
    public static void main(String[] args) {
        
    
        Scanner in = new Scanner(System.in);

        int n, e, o, p, ne;
        n = 0;
        e = 0;
        o = 0;
        p = 0;
        ne = 0;

        for (int i = 1; i <= 5; i++) {
            n = in.nextInt();
            if (n % 2 ==0) {
                e++;
            } else {
                o++;
            }
            if (n > 0) {
                p++;
            } else if (n < 0) {
                ne++;
            }
        }
 
        System.out.println(e + " valor(es) par(es)");
        System.out.println(o + " valor(es) impar(es)");
        System.out.println(p + " valor(es) positivo(s)");
        System.out.println(ne + " valor(es) negativo(s)");

        in.close();
 
    }
 
}