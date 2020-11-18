package aula04.exercicios.exercicio05;

public class App {
    public static void main(String[] args) {
        Ebook e = new Ebook("Entrevista com o Vampiro", "Anne Rice", 313, -1);

        // e.mostrarCapa();
        e.exibirPagina();
        e.avancarPagina();
        System.out.println(e.exibirPagina());
        e.irParaPagina(315);
        e.irParaPagina(0);
        e.retrocederPagina();
        System.out.println(e.exibirPagina());
        e.irParaPagina(313);
        e.avancarPagina();
        System.out.println(e.exibirPagina());

        while (e.exibirPagina() > 5) {
            e.retrocederPagina();
        }
        System.out.println(e.exibirPagina());

    }

}
