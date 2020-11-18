package aula08.exercicios.exercicio02;

public class Placar {
    private String time1,time2;
    private int placar1,placar2;

    public Placar(){}

    public Placar(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Placar(String time1, String time2, int placar1,int placar2) {
        this.time1 = time1;
        this.time2 = time2;
        this.placar1 = placar1;
        this.placar2 = placar2;
    }

    public String imprimirPlacar() {
        //return time1 + " " + placar1 + " X " + placar2 + " " + time2;
        return ((time1 == null) ? "" : time1) + " " + placar1 + " X " + placar2 + " " + ((time2 == null) ? "" : time2) ;
    }
    
}
