package loops;

public class Recursive {

    public static final String ABECEDARY = "abcdefghijk";

    public static void main(String[] args) {
        readAbecedary(0);
    }

    private static void readAbecedary(int i) {
        if (i > ABECEDARY.length() - 1) {
            return;
        }

        char[] array = ABECEDARY.toCharArray();
        char c = array[i];
        System.out.println(c);
        i++;
        readAbecedary(i);
    }
}
