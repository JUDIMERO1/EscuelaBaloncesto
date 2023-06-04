package model;

/**
 *
 * 
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String telefono;
    private double salario;
    private Genero genero;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, String direccion, String telefono, double salario, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.genero = genero;
    }
    
    @Override
    public String toString(){
        return "Empleado [Nombre: " + getNombre() + ", apellido: " + getApellido() + ", Cedula: " + getCedula() + ", Direccion: " + getDireccion() + ", telefono: " + getTelefono() + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    

}
