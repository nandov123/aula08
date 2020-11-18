package aula08.exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Gerente g = new Gerente("Fernando",5000,4);

        //Upcast
        Funcionario func = new Gerente("Danilo",5000,10);
        g.aumentarSalario(0.1f);
        func.aumentarSalario(0.1f);
        System.out.println(g.imprimir());
        System.out.println(func.imprimir());
    }
    
}
