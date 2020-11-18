package aula04.exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String exibir() {
        // System.out.printf("A hora atual é: %02d:%02d:%02d\n", hora, minuto, segundo);
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);

    }

    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora <= 23) {
            hora = novaHora;
        }

    }

    public void setMinuto(int novoMinuto) {
        if (novoMinuto >= 0 && novoMinuto <= 59) {
            minuto = novoMinuto;
        }

    }

    public void setSegundo(int novoSegundo) {
        if (novoSegundo >= 0 && novoSegundo <= 59) {
            segundo = novoSegundo;
        }

    }

}
