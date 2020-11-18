package aula08.exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("São Paulo","Corinthians");
        Placar p3 = new Placar("São Paulo","Corinthians",3,0);

        System.out.println(p1.imprimirPlacar());
        System.out.println(p2.imprimirPlacar());
        System.out.println(p3.imprimirPlacar());
        
    }
    
}
