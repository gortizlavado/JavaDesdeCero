package classes.oop.interfaces;

public interface Persona {
    public void enfadar();

    default public void comer() {
        System.out.println("comiendo");
    }
}
