package aula09.exemplos.exemplo01;

public class ContaPoupanca extends Conta{
    private static double taxaSaque = 1;

    public ContaPoupanca (int numero) {
        super(numero);
    }

    public static void setTaxaSaque(double taxa) {
        if (taxa > 0) {
            taxaSaque = taxa;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= super.getSaldo() + taxaSaque) {
            return super.sacar(valor + taxaSaque);
        }
        return false;
    }

    
}
