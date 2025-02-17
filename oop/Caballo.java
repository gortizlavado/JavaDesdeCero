package oop;

public class Caballo extends Animal {
    public Caballo(String nombre){
        super(nombre);
    }
    public static void galopa(){
        System.out.println("Estoy galopando");
    }
    public void comer(){
        super.comer();
        System.out.print(" cereal");
    }
    public void capitan(){
        if ("Amador".equals(nombre)){
            System.out.print("Capitan salami");
        }
    }
    public void llamamiento(){
        super.llamamiento();
        capitan();
    }
}
