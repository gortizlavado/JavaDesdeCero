package classes.oop;

public class Animal4Patas extends Animal{
    public Animal4Patas(String nombre, int weight) {
        super(nombre, weight);
    }

    protected void correr() {
        System.out.print(" -- corro con 4 patas!");
    }
}
