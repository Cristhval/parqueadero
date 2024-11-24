public abstract class Vehiculo {

    private String matricula;
    private String modelo;
    private String color;

    public Vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public void estacionar() {
        System.out.println("Estacionando el vehículo: " + matricula);
    }

    public void retirar() {
        System.out.println("Retirando el vehículo: " + matricula);
    }

    //metodos getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


