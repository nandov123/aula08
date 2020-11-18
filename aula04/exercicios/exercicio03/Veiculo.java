package aula04.exercicios.exercicio03;

public class Veiculo {
    private String modelo, marca;
    private double consumo;

    Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    void exibeAtributos() {
        System.out.printf("O modelo do carro é %s e sua marca é %s\n", modelo, marca);
    }

    double getConsumo() {
        return consumo;
    }

    public void setConsumo(double novoConsumo) {
        if(novoConsumo > 0 && novoConsumo < 30) {
            consumo = novoConsumo;
        }
    }

}
