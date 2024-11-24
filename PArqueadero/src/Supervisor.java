public class Supervisor extends Empleado implements Contrato {

    private String responsabilidadAdministrativa;

    //Constructor que inicializa el nombre y permite establecer la responsabilidad
    public Supervisor(String nombre, String responsabilidadAdministrativa) {
        super(nombre);
        this.responsabilidadAdministrativa = responsabilidadAdministrativa;
    }

    //Getter para responsabilidadAdministrativa
    public String getResponsabilidadAdministrativa() {
        return responsabilidadAdministrativa;
    }

    //Setter para responsabilidadAdministrativa
    public void setResponsabilidadAdministrativa(String responsabilidadAdministrativa) {
        this.responsabilidadAdministrativa = responsabilidadAdministrativa;
    }

    //Implementacion del metodo gestionarParqueadero de la interfaz Contrato
    @Override
    public void gestionarParqueadero() {
        System.out.println("El supervisor " + getNombre() + " está gestionando el parqueadero.");
    }
}
