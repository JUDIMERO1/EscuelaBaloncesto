package model;

/**
 *
 * 
 */
public class Aseguradora {
    
    private int nit;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private ServicioUrgencia urgencia;
    private ServicioAmbulancia ambulancia;

    public Aseguradora() {
    }

    public Aseguradora(int nit, String razonSocial, String direccion, String telefono, ServicioUrgencia urgencia, ServicioAmbulancia ambulancia) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.urgencia = urgencia;
        this.ambulancia = ambulancia;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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

    public ServicioUrgencia getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(ServicioUrgencia urgencia) {
        this.urgencia = urgencia;
    }

    public ServicioAmbulancia getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(ServicioAmbulancia ambulancia) {
        this.ambulancia = ambulancia;
    }
    
    
}
