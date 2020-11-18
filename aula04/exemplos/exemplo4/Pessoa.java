package aula04.exemplos.exemplo4;

public class Pessoa {
    //atributos - características
    String nome;


    // método construtor
    Pessoa(String nomePessoa) {
        nome = nomePessoa;
    }



    //métodos - ações
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }
    
}
