package aula08.exemplos.exemplo02;

public class Jogador {
    private String nome;
    private static int pontos;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public  void addPontos(int pontos) {
        if(pontos > 0) {
            //super(pontos) += pontos; // this.pontos = this.pontos + pontos
          this.pontos += pontos; // this.pontos = this.pontos + pontos
        }
    }

    public String getNome() {
        return nome;
    }

    public static int getPontos() {
        return pontos;
    }

    @Override
    public String toString() {
        return nome + ": " + pontos;
    }
    
    
}
