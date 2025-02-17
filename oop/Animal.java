package oop;

public class Animal {
    //Atributos y gilipolleces q se me ocurran
    public String nombre;
    //Constructor porculero
    public Animal(String nombre){
        this.nombre=nombre;

    }
    //Metodos
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
