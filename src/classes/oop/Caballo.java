package classes.oop;

public class Caballo extends Animal {
    public Caballo(String nombre){
        super(nombre, 20000);
    }
    public static void galopa(){
        System.out.println("Estoy galopando");
    }
    public void comer(){
        super.comer();
        System.out.print(" cereal");
    }
    private void capitan(){
        if ("Amador".equals(nombre)){
            System.out.print("Capitan salami");
        }
    }
    public void llamamiento(){
        super.llamamiento();
        capitan();
    }
}
