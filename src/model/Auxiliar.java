package model;

/**
 *
 * 
 */
public class Auxiliar extends Empleado {

    private int edad;

    public Auxiliar() {
    }

    public Auxiliar(String nombre, String apellido, String cedula, String direccion, String telefono, double salario, Genero genero, int edad) {
        super(nombre, apellido, cedula, direccion, telefono, salario, genero);
        this.edad = edad;
    }

    
    
    @Override
    public String toString() {
        return super.toString() + ", Edad: " + getEdad();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
