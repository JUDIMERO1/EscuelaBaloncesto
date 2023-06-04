package model;

/**
 *
 * 
 */
public class PadreResponsable extends Persona {

    private String email;

    public PadreResponsable() {
    }

    public PadreResponsable(String nombre, String apellido, String telefono, int numeroId, String email) {
        super(nombre, apellido, telefono, numeroId);
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + ", Email: " + getEmail();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
