package classes.oop;

public abstract class AnimalAcuatico extends Animal{

    public AnimalAcuatico(String nombre, int weight) {
        super(nombre, weight);
    }

    public abstract void respirarDebajoDelAgua();

    protected void comerPlancton() {
        System.out.println("Como placton");
    }
}
