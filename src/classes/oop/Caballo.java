package classes.oop;

public class Caballo extends Equino {
    public Caballo(String nombre, boolean herradura){
        super(nombre, 20000, herradura);
    }
    public void galopa(){
        System.out.print("Estoy galopando");
        if(super.tieneHerradura()) {
            System.out.print(" con herradura");
        }
        super.correr();
        System.out.println();
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
