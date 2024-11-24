class Motocicleta extends Vehiculo {

    private String tipoDeCasco;

    public Motocicleta(String matricula, String modelo, String color, String tipoDeCasco) {
        super(matricula, modelo, color);
        this.tipoDeCasco = tipoDeCasco;
    }

    //metodos getters y setters
    public String getTipoDeCasco() {
        return tipoDeCasco;
    }

    public void setTipoDeCasco(String tipoDeCasco) {
        this.tipoDeCasco = tipoDeCasco;
    }
}