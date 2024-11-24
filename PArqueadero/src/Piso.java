import java.util.ArrayList;
import java.util.List;

public class Piso {

    private int numero;
    private int capacidad;
    private List<Plaza> plazas;//Relacion de composicion con Plaza

    //Constructor
    public Piso(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.plazas = new ArrayList<>();//Inicializamos la lista de plazas
    }

    //metodo para agregar una plaza al piso
    public void agregarPlaza(Plaza plaza) {
        if (plazas.size() < capacidad) {
            plazas.add(plaza);
            System.out.println("Plaza " + plaza.getNumero() + " añadida al piso " + numero);
        } else {
            System.out.println("El piso " + numero + " no tiene capacidad para más plazas.");
        }
    }

    //metodo para obtener las plazas disponibles
    public void obtenerPlazasDisponibles() {
        System.out.println("Plazas disponibles en el piso " + numero + ":");
        for (Plaza plaza : plazas) {
            if (!plaza.estaOcupada()) {
                plaza.mostrarEstado();//Mostrar las plazas libres
            }
        }
    }

    //metodo para mostrar el estado de todas las plazas en el piso
    public void mostrarEstadoPlazas() {
        for (Plaza plaza : plazas) {
            plaza.mostrarEstado();
        }
    }

    //metodos getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Plaza> getPlazas() {
        return plazas;
    }

    public void setPlazas(List<Plaza> plazas) {
        this.plazas = plazas;
    }
}
