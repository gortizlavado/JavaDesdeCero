package classes.sport.basket;

class Pelota {
    public static void main(String[] args) {
        botar();
        System.out.println("Estoy botando");
        encestar(4);
    }

    public static void botar() {
        Integer bounce = new Integer(3);
        System.out.println("He dado " + bounce + " botes");
    }

    public static void encestar(Integer bounce) {
        if (bounce >= 4) {
            System.out.println("Has encestado");
        } else {
            System.out.println("No has encestado");
        }
    }
}