import java.util.ArrayList;
import java.util.List;

public class ClienteRegular extends Usuario {

    private String suscripcion;
    private List<Reserva> reservaList;//Lista de reservas

    public ClienteRegular(String nombre, String identificacion, String suscripcion) {
        super(nombre, identificacion);
        this.suscripcion = suscripcion;
        this.reservaList = new ArrayList<>();// Inicializa la lista de reservas
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public List<Reserva> getReservaList() {
        return reservaList;
    }

    //metodo para realizar una reserva
    public void realizarReserva(Reserva reserva) {
        reservaList.add(reserva);//Agrega la reserva a la lista
        System.out.println(getNombre() + " ha realizado una reserva.");
    }

    //metodo para cancelar una reserva
    public void cancelarReserva(Reserva reserva) {
        reservaList.remove(reserva);//Elimina la reserva de la lista
        System.out.println(getNombre() + " ha cancelado su reserva.");
    }

    public void mostrarReservas() {
        if (reservaList.isEmpty()) {
            System.out.println("No hay reservas realizadas.");
        } else {
            for (Reserva reserva : reservaList) {
                reserva.mostrarDetalles();
            }
        }
    }
}
