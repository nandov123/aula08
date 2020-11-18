package aula04.exercicios.exercicio06;


public class Robo {
        private int x, y;

    public Robo() {
        x = 0;
        y = 0;

    }

    public void N() {
        if (y < 6) {
            y++;
        }
    }

    public void S() {
        if (y > -6) {
            y--;
        }
    }

    public void L() {
        if (x < 6) {
            x++;
        }
    }

    public void O() {
        if (x > -6) {
            x--;
        }
    }

    public void posicao() {
        System.out.printf("Coordenadas (%d,%d).\n",x,y);
    }


    

    
}