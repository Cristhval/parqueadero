class Bicicleta extends Vehiculo {

    private String tipoDeMarco;

    public Bicicleta(String matricula, String modelo, String color, String tipoDeMarco) {
        super(matricula, modelo, color);
        this.tipoDeMarco = tipoDeMarco;
    }

    //metodos getters y setters
    public String getTipoDeMarco() {
        return tipoDeMarco;
    }

    public void setTipoDeMarco(String tipoDeMarco) {
        this.tipoDeMarco = tipoDeMarco;
    }
}