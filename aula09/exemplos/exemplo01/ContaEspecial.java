package aula09.exemplos.exemplo01;

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
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            return super.sacar(valor);
        }
        return false;
    }


    
}
