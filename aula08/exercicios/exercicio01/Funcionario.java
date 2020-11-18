package aula08.exercicios.exercicio01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(float perc) {
        salario = salario + salario * perc;
    }
    public String imprimir() {
        return "O nome do funcionário é " + nome + " e seu salário é " + salario + ".";
    }
}
