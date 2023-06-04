package model;

/**
 *
 * @author JUAN DIEGO
 */
public class ServicioUrgencia {
    
    private String telContacto;
    private String entidad;

    public ServicioUrgencia() {
    }

    public ServicioUrgencia(String telContacto, String entidad) {
        this.telContacto = telContacto;
        this.entidad = entidad;
    }

    public String getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(String telContacto) {
        this.telContacto = telContacto;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    
}
