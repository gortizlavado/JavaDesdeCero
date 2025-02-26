package classes.oop;

public enum Remates {

    normal("potencia caca"),
    x3("potencia tocha"),
    x4("soy el mas chulo");

    String potencia;
    Remates(String potencia) {
        this.potencia = potencia;
    }

    public String getPotencia() {
        return this.potencia;
    }
}
