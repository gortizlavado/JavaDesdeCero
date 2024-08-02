import sport.basket.Canasta;
import sport.basket.LebronJames;

import static sport.basket.LebronJames.score;

public class Game {

    public static void main(String[] args) {
        Canasta canasta = new Canasta();
        Canasta canastaLJ = new Canasta();
        Integer distance = 8;
        //score(distance);
        canasta.refreshScore(score(distance));

        muestraDelMarcador(canasta,canastaLJ);

        canastaLJ.refreshScore(3);

        muestraDelMarcador(canasta,canastaLJ);

    }

    public static void muestraDelMarcador(Canasta canasta,Canasta canastaLJ) {
        System.out.println("Marcador LJ " + canasta.getScore() + " puntos");
        System.out.println("Nuestro marcador " + canastaLJ.getScore() + " puntos");
    }
}
