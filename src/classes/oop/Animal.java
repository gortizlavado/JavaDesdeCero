package classes.oop;

public class Animal {
    //Atributos y gilipolleces q se me ocurran
    public String nombre;
    private int weight;
    //Constructor porculero
    public Animal(String nombre, int weight){
        this.nombre=nombre;
        this.weight=weight;
    }
    //Metodos
    public int getWeight() {
        return weight;
    }
    public void llamamiento(){
        System.out.print(nombre+": ");
    }
    public void comer(){
        System.out.println(nombre +": "+"Estoy comiendo");
    }
    public static void andar(){
        System.out.println("Estoy andando");
    }

}
