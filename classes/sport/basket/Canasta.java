package sport.basket;

public class Canasta {

    private Integer score = 0;

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
