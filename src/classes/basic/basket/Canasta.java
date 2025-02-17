package classes.basic.basket;

public class Canasta {

    private Integer score;

    public Canasta() {
        score = 0;
    }

    public Canasta(Integer startWith) {
        score = startWith;
    }

    public static void main(String[] args) {
        System.out.println("Encesta");
    }

    public void refreshScore(Integer points) {
        score = score + points;
    }

    public String getScore() {
        String s = String.valueOf(score);
        //System.out.println("Score as text: " + s);
        return score.toString();
    }
}
