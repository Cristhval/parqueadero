public class Plaza {

    private int numero;
    private float tamaño;
    private Reserva reserva;//Relacion con Reserva
    private Vehiculo vehiculo;//Relacion de agregacion con Vehiculo

    // Constructor
    public Plaza(int numero, float tamaño) {
        this.numero = numero;
        this.tamaño = tamaño;
        this.reserva = null;//Inicialmentela plaza no tiene una reserva
        this.vehiculo = null;//Inicialmente la plaza no tiene un vehículo estacionado
    }

    //metodo para comprobar si la plaza esta ocupada
    public boolean estaOcupada() {
        return reserva != null || vehiculo != null;//Si hay una reserva o un vehiculo la plaza esta ocupada
    }

    //metodo para marcar la plaza como ocupada por una reserva
    public void marcarLugarOcupado(Reserva reserva) {
        if (this.reserva == null) {
            this.reserva = reserva;
            System.out.println("Plaza " + numero + " ocupada por la reserva de " + reserva.getCliente().getNombre());
        } else {
            System.out.println("La plaza " + numero + " ya está ocupada.");
        }
    }

    //metodo para liberar la plaza de la reserva
    public void liberarLugar() {
        if (this.reserva != null) {
            System.out.println("Plaza " + numero + " liberada de la reserva de " + reserva.getCliente().getNombre());
            this.reserva = null;
        } else {
            System.out.println("La plaza " + numero + " ya está libre.");
        }
    }

    //metodo para estacionar un vehiculo en la plaza
    public void estacionarVehiculo(Vehiculo vehiculo) {
        if (this.vehiculo == null) {
            this.vehiculo = vehiculo;
            System.out.println("Vehículo " + vehiculo.getMatricula() + " estacionado en la plaza " + numero);
        } else {
            System.out.println("La plaza " + numero + " ya está ocupada por otro vehículo.");
        }
    }

    //metodo para retirar un vehiculo de la plaza
    public void retirarVehiculo() {
        if (this.vehiculo != null) {
            System.out.println("Vehículo " + vehiculo.getMatricula() + " retirado de la plaza " + numero);
            this.vehiculo = null;
        } else {
            System.out.println("No hay vehículo en la plaza " + numero + " para retirar.");
        }
    }

    //metodo para mostrar el estado de la plaza
    public void mostrarEstado() {
        if (estaOcupada()) {
            if (reserva != null) {
                System.out.println("Plaza " + numero + " ocupada por la reserva de " + reserva.getCliente().getNombre());
            } else if (vehiculo != null) {
                System.out.println("Plaza " + numero + " ocupada por el vehículo " + vehiculo.getMatricula());
            }
        } else {
            System.out.println("Plaza " + numero + " está libre.");
        }
    }

    //metodos getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
