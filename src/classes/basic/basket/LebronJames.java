package classes.basic.basket;

public class LebronJames {
    public static void main(String[] args) {
        Pelota willson = new Pelota();
        System.out.println("Im the king y tengo la pelota");
        Integer distance= new Integer(20);
        score(distance);
    }

    public static void score() {
        //String points= new String("3+1");
        Integer points= new Integer(3);
        shoot(points);
        //System.out.println("Celebra");
    }

    private static void shoot(String points) {
        System.out.println(points + "puntos");
    }

    private static void shoot(Integer points) {
        System.out.println(points + "puntos");
    }

    public static Integer score(Integer distance) {
        Integer puntos = new Integer(0) ;
        //System.out.println(distance + "m");
        if (distance > 10) {
            shoot(3);
            puntos= 3;
        } else {
           shoot(2);
           puntos= 2;
        }
        //System.out.println("Celebra");

        return puntos ;
    }


}

