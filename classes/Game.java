import sport.basket.Canasta;

import static sport.basket.LebronJames.score;

public class Game {

    public static void main(String[] args) {
        Canasta canasta = new Canasta();
        Canasta canastaLJ = new Canasta();
        Integer distance = 8;
        Integer points = score(distance);
        for (int i=0; i < 5; i++) {
            System.out.println("Possession " + (i + 1));
            if (i % 2 == 0) {
                canasta.refreshScore(points);
            } else {
                canastaLJ.refreshScore(3);
            }
            muestraDelMarcador(canasta,canastaLJ);
            System.out.println();
        }

        //playWithForLoop();
    }

    public static void muestraDelMarcador(Canasta canasta,Canasta canastaLJ) {
        System.out.println("Marcador LJ " + canasta.getScore() + " puntos");
        System.out.println("Nuestro marcador " + canastaLJ.getScore() + " puntos");
    }

    public static void playWithForLoop() {
        System.out.println("Playing with loop 'for'");
        for (int i=0; i<5; i++) {
            System.out.println(i);
        }

        String[] arrayString = {"a", "b", "c"};
        System.out.println("position zero: " + arrayString[0]);
        System.out.println("position one: " + arrayString[1]);
        System.out.println("position two: " + arrayString[2]);

        System.out.println("------ BUCLE ------");
        for (int i=0; i < 3; i++) {
            System.out.println(arrayString[i]);
        }
    }
}
