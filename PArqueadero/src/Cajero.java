import java.util.ArrayList;
import java.util.List;

public class Cajero extends Empleado {

    private float manejoDeCobros;
    private float manejoDePagos;
    private List<Usuario> usuarioList;

    public Cajero(String nombre, float manejoDeCobros, float manejoDePagos) {
        super(nombre);
        this.manejoDeCobros = manejoDeCobros;
        this.manejoDePagos = manejoDePagos;
        this.usuarioList = new ArrayList<>();
    }

    public float getManejoDeCobros() {
        return manejoDeCobros;
    }

    public void setManejoDeCobros(float manejoDeCobros) {
        this.manejoDeCobros = manejoDeCobros;
    }

    public float getManejoDePagos() {
        return manejoDePagos;
    }

    public void setManejoDePagos(float manejoDePagos) {
        this.manejoDePagos = manejoDePagos;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void addUsuario(Usuario usuario) {
        usuarioList.add(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        usuarioList.remove(usuario);
    }

    public void verificarPagos() {
        System.out.println("Verificando pagos para " + usuarioList.size() + " usuarios.");
    }

    public void registrarPrenda() {
        System.out.println("Registrando prenda...");
    }
}
