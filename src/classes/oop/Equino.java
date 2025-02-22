package classes.oop;

public class Equino extends Animal4Patas {
    private boolean herradura;

    public Equino(String nombre, int weight, boolean herradura) {
        super(nombre, weight);
        this.herradura = herradura;
    }

    protected boolean tieneHerradura() {
        return this.herradura;
    }
}
