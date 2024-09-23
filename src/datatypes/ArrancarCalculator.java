package datatypes;

public class ArrancarCalculator {
    public static void main(String args[]){
       Calculator casio = new Calculator();
       casio.solveQuadraticEquation("57","-97","2");
        String resultado = casio.result();
        System.out.println("el resultado es "+ resultado );
    }
}
