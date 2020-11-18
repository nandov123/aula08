package aula04.exercicios.exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        irParaPagina(paginaAtual);

    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if (paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public void irParaPagina(int i) {
        if (i >= 0 && i <= totalPaginas) {
            paginaAtual = i;
        } else {
            System.out.printf("Esta página não existe. Escolha uma página entre 0 e %d.\n", totalPaginas);
        }
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void mostrarCapa() {
        paginaAtual = 0;
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + totalPaginas);
    }
}
