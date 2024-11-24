
class Carro extends Vehiculo {

    private int numeroDePuertas;

    public Carro(String matricula, String modelo, String color, int numeroDePuertas) {
        super(matricula, modelo, color);
        this.numeroDePuertas = numeroDePuertas;
    }

    //metodos getters y setters
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
}