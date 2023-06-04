package model;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JUAN DIEGO
 */
public class Profesor extends Empleado {

    private String especialidad;
    private LocalDate fechaNacimiento;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String cedula, String direccion, String telefono, double salario, Genero genero, String especialidad, int dia, int mes, int anio) {
        super(nombre, apellido, cedula, direccion, telefono, salario, genero);
        this.especialidad = especialidad;

        LocalDate fecha = LocalDate.of(anio, Month.values()[mes], dia);
        this.fechaNacimiento = fecha;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + getEspecialidad() + ", Fecha de nacimiento: " + 
                getFechaNacimiento().getDayOfMonth() + "/" + getFechaNacimiento().getMonth() + "/" + getFechaNacimiento().getYear();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
