import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // ========== Creacion del Parqueadero ==========
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Av. Principal 123");

        //========== Creacion y gestion de los Pisos ==========
        Piso piso = new Piso(1, 3);

        //Crear plazas
        Plaza plaza1 = new Plaza(1, 15.0f);
        Plaza plaza2 = new Plaza(2, 20.5f);
        Plaza plaza3 = new Plaza(3, 18.0f);

        //Agregar plazas al piso
        piso.agregarPlaza(plaza1);
        piso.agregarPlaza(plaza2);
        piso.agregarPlaza(plaza3);

        //Mostrar estado de las plazas
        System.out.println("\nEstado de las plazas del piso:");
        piso.mostrarEstadoPlazas();
        System.out.println();

        //========== Creacion de Usuarios ==========
        ClienteRegular clienteRegular = new ClienteRegular("Pepe Jaramillo", "123456", "Premium");
        Visitante visitante = new Visitante("Roberto Sanches", "11122233", 10.5f, true);
        ClienteRegular clienteRegular2 = new ClienteRegular("Mateo Perez","112333", "Premium");

        //Agregar usuarios al parqueadero
        parqueadero.addUsuario(clienteRegular);
        parqueadero.addUsuario(visitante);
        parqueadero.addUsuario(clienteRegular2);

        //Listar usuarios
        System.out.println("Usuarios en el parqueadero:");
        for (Usuario usuario : parqueadero.getUsuarioList()) {
            System.out.println("Nombre: " + usuario.getNombre() + ", Identificación: " + usuario.getIdentificacion());
            if (usuario instanceof ClienteRegular) {
                System.out.println("Suscripción: " + ((ClienteRegular) usuario).getSuscripcion());
            }
        }
        System.out.println();

        // ========== Reservas de Clientes ==========
        //Cliente Regular realiza y cancela una reserva
        Reserva reserva1 = new Reserva(new Date(), LocalTime.of(14, 30), 2.5f, clienteRegular);
        Reserva reserva2 = new Reserva(new Date(),LocalTime.of(9, 0), 6.3f, clienteRegular2);

        //Realizar las reservas
        clienteRegular.realizarReserva(reserva1);
        clienteRegular2.realizarReserva(reserva2);

        //Cancelar una reserva
        clienteRegular2.cancelarReserva(reserva2);

        //Mostrar reservas
        clienteRegular.mostrarReservas();
        System.out.println();

        // ========== Estado de las Plazas y Reservas ==========
        //Mostrar el estado de las plazas disponibles
        piso.obtenerPlazasDisponibles();
        System.out.println();

        //========== Estacionamiento de Vehículos ==========
        //Crear vehiculos
        Motocicleta moto = new Motocicleta("123ABC", "Yamaha", "Rojo", "Integral");
        Carro carro = new Carro("456DEF", "Toyota", "Azul", 4);

        //Estacionar vehiculos en las plazas
        plaza1.estacionarVehiculo(moto);
        plaza2.estacionarVehiculo(carro);

        //Mostrar estado de las plazas
        plaza1.mostrarEstado();
        plaza2.mostrarEstado();
        System.out.println();

        //Retirar un vehiculo
        plaza1.retirarVehiculo();
        plaza1.mostrarEstado();
        plaza2.mostrarEstado();
        System.out.println();

        // ========== Gestion de Reservas ==========
        //Plaza1 se marca como ocupada por la reserva
        plaza1.marcarLugarOcupado(reserva1);
        piso.mostrarEstadoPlazas();
        System.out.println();

        //Liberar la plaza 1
        plaza1.liberarLugar();
        piso.mostrarEstadoPlazas();
        System.out.println();

        // ========== Creacion y Gestion de Empleados ==========
        //Crear empleados
        Empleado empleado1 = new Supervisor("Carlos Pérez", "Gestión de Operaciones");
        Empleado empleado2 = new Supervisor("María García", "Administración de Recursos");

        //Agregar empleados al parqueadero
        parqueadero.addEmpleado(empleado1);
        parqueadero.addEmpleado(empleado2);

        //Mostrar empleados
        System.out.println("Empleados en el parqueadero:");
        for (Empleado empleado : parqueadero.getEmpleadoList()) {
            System.out.println("- " + empleado.getNombre());
        }
        System.out.println();

        // ========== Creacion de Cajero y metodos de Pago ==========
        //Crear cajero
        Cajero cajero = new Cajero("Carlos Martínez", 1000.0f, 500.0f);

        //Asociar usuarios al cajero
        cajero.addUsuario(clienteRegular);
        cajero.addUsuario(visitante);

        //Crear metodos de pago
        MetodoDePago metodo1 = new MetodoDePago("Tarjeta de credito", "Visa", clienteRegular);
        MetodoDePago metodo2 = new MetodoDePago("Tarjeta de credito", "Visa", visitante);

        //Agregar los metodos de pago al cliente
        clienteRegular.agregarMetodoDePago(metodo1);
        visitante.agregarMetodoDePago(metodo2);

        //Mostrar los metodos de pago del cliente
        clienteRegular.mostrarMetodosDePago();
        visitante.mostrarMetodosDePago();

        //Verificar pagos
        System.out.println("Cajero: " + cajero.getNombre());
        cajero.verificarPagos();
        System.out.println();

        //Visitante paga tarifa
        visitante.pagarTarifa();

        //Bloquear salida si el visitante no paga
        visitante.bloquearSalida();

        //Listar usuarios atendidos por el cajero
        System.out.println("Usuarios atendidos por el cajero:");
        for (Usuario usuario : cajero.getUsuarioList()) {
            System.out.println("Nombre: " + usuario.getNombre() + ", Identificación: " + usuario.getIdentificacion());
        }
        System.out.println();

        // ========== Supervision y Gestion del Parqueadero ==========
        //Crear un supervisor
        Supervisor supervisor = new Supervisor("Laura Gómez", "Gestión de Mantenimiento");

        //Mostrar informacion del supervisor
        System.out.println("Supervisor: " + supervisor.getNombre());
        System.out.println("Responsabilidad: " + supervisor.getResponsabilidadAdministrativa());

        //Ejecutar el metodo gestionarParqueadero
        supervisor.gestionarParqueadero();
    }
}
