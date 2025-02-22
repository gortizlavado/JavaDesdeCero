package classes.oop;

public class Nutria extends AnimalAcuatico {
    public Nutria(String nombre){
        super(nombre, 2000);
    }
    public static void bucear(){
        System.out.println("Estoy buceando");
    }
    public void pescao(){
        if ("Antonio Recio".equals(nombre)){
            System.out.print("Mayorista no limpia pescado");
        }
    }
    public void llamamiento(){
        super.llamamiento();
        pescao();
    }

    @Override
    public void respirarDebajoDelAgua() {
        System.out.println("Soy capaz de respirar debajo del agua");
    }
}
