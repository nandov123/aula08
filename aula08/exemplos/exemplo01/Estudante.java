package aula08.exemplos.exemplo01;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante (String nome, String curso) {
        super(nome); // acionando o construtor da superclasse pessoa
        this.curso = curso;
        
    }
        @Override //anotação de sobreposição
        public String toString() {
            return "Nome: " + getNome() + " curso: " + curso;
    
        }
    
}
