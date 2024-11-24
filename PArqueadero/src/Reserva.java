import java.time.LocalTime;
import java.util.Date;

public class Reserva {

    private Date fecha;
    private LocalTime hora;  // Cambiar de Date a LocalTime
    private float duracion;
    private ClienteRegular cliente;  // Relación con ClienteRegular

    //Constructor
    public Reserva(Date fecha, LocalTime hora, float duracion, ClienteRegular cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.cliente = cliente;
    }

    //metodos
    public void crearReserva() {
        System.out.println("Reserva creada para: " + cliente.getNombre());
    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para: " + cliente.getNombre());
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de la reserva para: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);//Muestra solo la hora
        System.out.println("Duración: " + duracion + " horas");
    }

    //metodos getters y setters
    public ClienteRegular getCliente() {
        return cliente;
    }

    public void setCliente(ClienteRegular cliente) {
        this.cliente = cliente;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}

