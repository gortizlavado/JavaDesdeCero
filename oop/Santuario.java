package oop;

public class Santuario {

    public static void main(String[] args){
        Animal[] jaula=new Animal[5];
        Caballo potro= new Caballo("mente fria");
        jaula[0]=potro;
        Caballo.galopa();
        potro.comer();
        Nutria.bucear();
        Animal perro=new Animal("Pepe");
        jaula[1]=perro;
        perro.comer();
        Nutria nutria=new Nutria("chispas");
        jaula[2]=nutria;
        nutria.comer();
        jaula[3]=new Caballo("Amador");
        Nutria antonio=new Nutria("Antonio Recio");
        jaula[4]=antonio;
        antonio.llamamiento();
        for (int i=0;i<jaula.length;i++){
            System.out.println();
            jaula[i].llamamiento();
        }
    }
}
