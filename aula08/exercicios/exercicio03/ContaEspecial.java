package aula08.exercicios.exercicio03;

public class ContaEspecial extends Conta{

    private double limite;

    public ContaEspecial (int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    public void setLimite(double novoLimite) {
        limite = novoLimite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            super.sacar(valor);
        }
    }


    
}
