public class MetodoDePago {

    private String tipo;
    private String detalles;
    private Usuario usuario;//Relacion con Usuario

    //Constructor
    public MetodoDePago(String tipo, String detalles, Usuario usuario) {
        this.tipo = tipo;
        this.detalles = detalles;
        this.usuario = usuario;
    }

    //metodos getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //metodo para mostrar detalles del metodo de pago
    public void mostrarDetalles() {
        System.out.println("Tipo de pago: " + tipo);
        System.out.println("Detalles: " + detalles);
    }
}
