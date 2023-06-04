package model;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * 
 */
public class Administrador extends Empleado {

    private LocalDate fechaContrato;

    public Administrador() {
    }

    public Administrador(String nombre, String apellido, String cedula, String direccion, String telefono, double salario, Genero genero, int dia, int mes, int anio) {
        super(nombre, apellido, cedula, direccion, telefono, salario, genero);

        LocalDate fecha = LocalDate.of(anio, Month.values()[mes], dia);
        this.fechaContrato = fecha;

    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de contrato: " + getFechaContrato().getDayOfMonth() + "/" + getFechaContrato().getMonth() + "/" + getFechaContrato().getYear();
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

}
