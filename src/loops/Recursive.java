package loops;

public class Recursive {

    public static final String ABECEDARY = "abcdefghijk";

    public static void main(String[] args) {
        readAbecedary(0);
        System.out.println();
        System.out.println("--------------");
        counterBack(10);
        System.out.println();
        System.out.println("--------------");
        int factorial=factorailOf(5);
        System.out.print(factorial);
    }

    private static void counterBack(int i) {
        if (i == -1) {
            return;
        }

        System.out.print(i + " ");
        //i--;
        counterBack(--i);
    }

    private static void readAbecedary(int i) {
        if (i > ABECEDARY.length() - 1) {
            return;
        }

        char[] array = ABECEDARY.toCharArray();
        char c = array[i];
        System.out.print(c + " ");
        i++;
        readAbecedary(i);
    }
}
