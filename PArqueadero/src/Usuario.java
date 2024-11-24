import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private String nombre;
    private String identificacion;
    private List<MetodoDePago> metodosDePago;//Lista de metodos de pago

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.metodosDePago = new ArrayList<>();//Inicializa la lista de metodos de pago
    }

    //metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    //metodo para comprobar el metodo de pago
    public void comprobarMetodoDePago() {
        System.out.println("Comprobando método de pago...");
    }

    //metodo para agregar un metodo de pago
    public void agregarMetodoDePago(MetodoDePago metodoDePago) {
        metodosDePago.add(metodoDePago);
        System.out.println("Método de pago agregado para " + getNombre());
    }

    //metodo para mostrar todos los métodos de pago
    public void mostrarMetodosDePago() {
        System.out.println("Métodos de pago de " + getNombre() + ":");
        for (MetodoDePago metodo : metodosDePago) {
            metodo.mostrarDetalles();
        }
    }
}
