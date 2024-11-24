public class Visitante extends Usuario {

    private float tarifaPorHora;
    private boolean pagoPendiente;

    public Visitante(String nombre, String identificacion, float tarifaPorHora, boolean pagoPendiente) {
        super(nombre, identificacion);
        this.tarifaPorHora = tarifaPorHora;
        this.pagoPendiente = pagoPendiente;
    }

    public float getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(float tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean isPagoPendiente() {
        return pagoPendiente;
    }

    public void setPagoPendiente(boolean pagoPendiente) {
        this.pagoPendiente = pagoPendiente;
    }

    public void pagarTarifa() {
        System.out.println("Tarifa pagada.");
        pagoPendiente = false;
    }

    public void bloquearSalida() {
        if (pagoPendiente) {
            System.out.println("Salida bloqueada: debe pagar la tarifa.");
        } else {
            System.out.println("Salida permitida.");
        }
    }
}
