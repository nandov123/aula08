package aula09.exemplos.exemplo01;

public class ContaCorrente extends Conta{
    private static final double TAXA_DEPOSITO = 0.1;


    public ContaCorrente (int numero) {
        super(numero);
    }

    @Override
    public boolean depositar(double valor) {
       // if (super.getSaldo() >=0.1) {
            super.depositar(valor);
            if (super.getSaldo() >= 0.1) {
                return super.sacar(TAXA_DEPOSITO);
            }
            return false;
      //  }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= super.getSaldo()) {
            return super.sacar(valor);
        }
        return false;
    }
    
}
