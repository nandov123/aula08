package aula09.exemplos.exemplo01;

public abstract class Conta {
    //private int agencia;
    private int numero;
    private double saldo;

    public Conta (int numero) {
    //    this.agencia = agencia;
        this.numero = numero;
    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            return true; // o return faz o método finalizar, por isso não precisamos do else.
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
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
