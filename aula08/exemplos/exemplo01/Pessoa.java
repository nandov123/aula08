package aula08.exemplos.exemplo01;
public class Pessoa {
    private String nome;
    private String endereco;
    //private String telefone;

    public Pessoa(){} //Polimorfismo, dois métodos com o mesmo nome

    public Pessoa(String nome) { //super classe
        this.nome = nome;
    }

    public Pessoa(String nome, String endereco) { //super classe
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    @Override //anotação de sobreposição
    public String toString() {
        return "Nome: " + nome;

    }
}
