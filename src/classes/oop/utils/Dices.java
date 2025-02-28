package classes.oop.utils;

public class Dices {

    public static boolean isPassProbability(int probability) {
        int i = rollDieOf10() * 10;
        System.out.println(i);
        return probability >= i;
    }

    public static int rollDieOf4() {
        return rollDieOf(4);
    }

    public static int rollDieOf5() {
        return rollDieOf(5);
    }

    private static int rollDieOf10() {
        return (int) (Math.random() * 10) + 1;
    }

    private static int rollDieOf(int sides) {
        double random = Math.random();
        double result;
        do {
            double random10 = random * 10;
            result = random10 - (int) random10;
            random = result;
        } while (sides <= result * 10);

        return (int) (result * 10) + 1;
    }
}
