import java.util.ArrayList;
import java.util.List;

public class Parqueadero {

    private String nombre;
    private String direccion;
    private List<Usuario> usuarioList;//Relacion 1 a muchos con Usuario
    private List<Empleado> empleadoList;//Relacion 1 a muchos con Empleado
    private List<Piso> pisoList;//Relacion de composicion con Piso

    public Parqueadero(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.usuarioList = new ArrayList<>();
        this.empleadoList = new ArrayList<>();
        this.pisoList = new ArrayList<>();//Inicializamos la lista de pisos
    }

    //metodos para usuarioList
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void addUsuario(Usuario usuario) {
        usuarioList.add(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        usuarioList.remove(usuario);
    }

    //metodos para empleadoList
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void addEmpleado(Empleado empleado) {
        empleadoList.add(empleado);
    }

    public void removeEmpleado(Empleado empleado) {
        empleadoList.remove(empleado);
    }

    //metodos para pisoList
    public List<Piso> getPisoList() {
        return pisoList;
    }

    public void addPiso(Piso piso) {
        pisoList.add(piso);
        System.out.println("Piso " + piso.getNumero() + " añadido al parqueadero " + nombre);
    }

    public void removePiso(Piso piso) {
        pisoList.remove(piso);
        System.out.println("Piso " + piso.getNumero() + " removido del parqueadero " + nombre);
    }

    //Getters y setters para nombre y direccion
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //metodo para generar un ticket de entrada
    private void darTicketDeEntrada() {
        System.out.println("Se ha generado un ticket de entrada.");
    }

    //metodo para mostrar el estado de todos los pisos en el parqueadero
    public void mostrarEstadoPisos() {
        System.out.println("Estado de los pisos en el parqueadero " + nombre + ":");
        for (Piso piso : pisoList) {
            piso.mostrarEstadoPlazas();//Mostrar el estado de las plazas en cada piso
        }
    }
}
