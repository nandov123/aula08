package aula08.exercicios.exercicio03;

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
    public void sacar(double valor) {
        if (valor <= super.getSaldo() + taxaSaque) {
            super.sacar(valor + taxaSaque);
        }
    }

    
}
