package model;

/**
 *
 * @author JUAN DIEGO
 */
public class ServicioAmbulancia {

    private String placa;
    private String telContacto;
    private String entidad;

    public ServicioAmbulancia() {
    }

    public ServicioAmbulancia(String placa, String telContacto, String entidad) {
        this.placa = placa;
        this.telContacto = telContacto;
        this.entidad = entidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
