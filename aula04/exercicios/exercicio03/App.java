package aula04.exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("v20", "Toyota", 10);

        v.exibeAtributos();

        v.setConsumo(50);

        System.out.println(v.getConsumo());
    }

}
