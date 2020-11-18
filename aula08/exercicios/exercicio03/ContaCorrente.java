package aula08.exercicios.exercicio03;

public class ContaCorrente extends Conta{
    private static final double TAXA_DEPOSITO = 0.1;


    public ContaCorrente (int numero) {
        super(numero);
    }

    @Override
    public void depositar(double valor) {
       // if (super.getSaldo() >=0.1) {
            super.depositar(valor);
            if (super.getSaldo() >= 0.1) {
                super.sacar(TAXA_DEPOSITO);
            }
      //  }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= super.getSaldo()) {
            super.sacar(valor);
        }
    }
    
}
