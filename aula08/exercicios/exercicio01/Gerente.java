package aula08.exercicios.exercicio01;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    public Gerente(String nome, double salario, int nFuncionarios) {
        super(nome, salario);
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public void aumentarSalario(float perc) {
        super.aumentarSalario(perc+0.2f)  ; //precisa colocar o f no final pq o padrão é double
    }

    @Override
    public String imprimir() {
        return super.imprimir() + " - " + nFuncionarios;
    }
    
}
