package aula03.uri;


import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1064 {
 
    public static void main(String[] args) {
        
    
        Scanner in = new Scanner(System.in);

        double n, v, av;
        n = 0;
        v = 0;
        av = 0;

        for (int i=1; i <= 6; i++) {
            n = in.nextDouble();
            if (n > 0) {
                v++;
                av = av + n;
            }

        }
        //if (v == 1) {
         //   System.out.println((int)v + " valor positivo");
        //} else {

        System.out.println((int)v + " valores positivos");
       // }
        System.out.printf("%.1f\n",av/v);
        in.close();
    }
    
}
