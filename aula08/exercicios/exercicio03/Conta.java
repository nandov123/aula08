package aula08.exercicios.exercicio03;

public abstract class Conta {
    //private int agencia;
    private int numero;
    private double saldo;

    public Conta (int numero) {
    //    this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor >= 0) {
            saldo -= valor;
        }
    }

 /*   public int getAgencia() {
        return agencia;
    }*/

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return //"Agência: " + agencia + "\n" +
        "Conta: " + numero + "\n" +
        "Saldo: R$" + saldo;
    }
    
}
