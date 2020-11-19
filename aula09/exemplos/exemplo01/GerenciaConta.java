package aula09.exemplos.exemplo01;


import java.util.HashMap;

public class GerenciaConta {
    //private ArrayList<Conta> listaContas;
    private HashMap<Integer, Conta> mapaContas;

    public GerenciaConta() {
        mapaContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta){
        mapaContas.put(numeroConta,new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        mapaContas.put(numeroConta,new ContaEspecial(numeroConta,limite));
    }

    public void novaContaPoupanca(int numeroConta){
        mapaContas.put(numeroConta,new ContaPoupanca(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor){
        if (mapaContas.get(numeroConta) != null){
            return mapaContas.get(numeroConta).depositar(valor);
        }
        return false; // não achou a conta
        

    }

    public boolean sacar(int numeroConta, double valor){
        if (mapaContas.get(numeroConta) != null){
            return mapaContas.get(numeroConta).sacar(valor);
        }
        return false; // não achou a conta

    }

    public String exibir(int numeroConta) {
        if (mapaContas.get(numeroConta) != null){
            return mapaContas.get(numeroConta).toString();
        }
        return "Conta inválida."; // não achou a conta
    }
    
}
