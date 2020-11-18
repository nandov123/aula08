package aula02.exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        int a;
        boolean res;
        String palavra1, palavra2;

        a = 5;
        palavra1 = "teste";
        palavra2 = "teste";

        res = a == 5;

        System.out.println(res);

        // para strings
        res = (palavra1.equals(palavra2));
        res = (palavra1.equalsIgnoreCase(palavra2)); //ñ case sensitive

        System.out.println(res);

    }

}
