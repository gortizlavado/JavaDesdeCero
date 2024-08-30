package datatypes;

public class Calculator {

    private String result;

    public String result() {
        return result;
    }

    public void addition(int x, int y) {
        int i = x+y;
        result = String.valueOf(i);
    }

    public void additionOne(int x) {
        int i = x+1;
        result = Integer.toString(i);
    }

    public void calculateTriangleArea(int base, int height) {
        int i = (base*height)/2;
        result = Integer.toString(i);
    }

    public void convertSecondsToHours(int seconds) {
        float x = seconds;
        float i = x/3600f;
        result = Float.toString(i);
    }

    public void convertAgesToDays(int ages) {
       int i = ages*365        ;
        result = Integer.toString(i);
    }

    public void  convertDaysToAges(int days) {
        float i = days / 365f;
        if (days < 365) {
            result = "0";
        } else {
            result = Float.toString(i);
        }
    }

    public void uppercase(String text) {
        result= new String(text.toUpperCase());
    }

    public void findInTheText(String toFind, String text) {
        boolean texto;
        if (text.contains(toFind)) {
            texto = true;
            result = String.valueOf(texto);
        } else result = String.valueOf(false);
    }

    public void solveQuadraticEquation(String a, String b, String c) {
        //TODO JF.
        //tips: Math class
    }
    //https://www.codingame.com/ide/puzzle/power-of-thor-episode-1
}
