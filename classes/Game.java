import sport.basket.Canasta;
import sport.basket.LebronJames;

public class Game {

    public static void main(String[] args) {
        Canasta canasta = new Canasta();
        Canasta canastaLJ = new Canasta();
        Integer distance = 8;
        Integer points = 2;
        LebronJames.score(distance);
        canasta.refreshScore(points);
        String score = canasta.getScore();
        String myScore = canastaLJ.getScore();

        System.out.println("Marcador LJ " + score + " puntos");
        System.out.println("Nuestro Marcador " + myScore + " puntos");

        canastaLJ.refreshScore(3);
        String score2 = canasta.getScore();
        String myScore2 = canastaLJ.getScore();

        System.out.println("Marcador LJ " + score2 + " puntos");
        System.out.println("Nuestro Marcador " + myScore2 + " puntos");
    }
}
