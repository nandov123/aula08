package aula04.exercicios.exercicio04;

public class App {
    public static void main(String[] args) {

        Relogio r = new Relogio(23, 59, 50);

        r.setHora(26);
        r.setSegundo(60);
        // r.exibir();
        System.out.println(r.exibir());

    }
}
