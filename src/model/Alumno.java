package model;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * 
 */
public class Alumno extends Persona {

    private String direccion;
    private LocalDate fechaNacimiento;
    private Genero genero;
    private Categoria categoria;
    private Aseguradora seguro;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String telefono, int numeroId,
            String direccion, int dia, int mes, int anio, Genero genero, Categoria categoria, Aseguradora seguro) {

        super(nombre, apellido, telefono, numeroId);
        this.direccion = direccion;

        LocalDate fecha = LocalDate.now();
        fecha.of(anio, Month.values()[mes], dia);
        this.fechaNacimiento = fecha;

        this.genero = genero;
        this.categoria = categoria;
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return super.toString() + ", Direccion: " + getDireccion() + ", Fecha de nacimiento: " + 
                getFechaNacimiento().getDayOfMonth() + "/" + getFechaNacimiento().getMonth() + "/" + getFechaNacimiento().getYear() + ", Categoria: " + getCategoria().toString();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Aseguradora getSeguro() {
        return seguro;
    }

    public void setSeguro(Aseguradora seguro) {
        this.seguro = seguro;
    }

}
