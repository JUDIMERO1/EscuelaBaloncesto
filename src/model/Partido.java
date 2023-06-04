package model;

/**
 *
 * 
 */
public class Partido {

    private int marcador;
    private String arbitro;
    private String hora;
    private String equipoContrincante;
    private double valorArbitraje;

    public Partido() {
    }

    public Partido(int marcador, String arbitro, String hora, String equipoContrincante, double valorArbitraje) {
        this.marcador = marcador;
        this.arbitro = arbitro;
        this.hora = hora;
        this.equipoContrincante = equipoContrincante;
        this.valorArbitraje = valorArbitraje;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEquipoContrincante() {
        return equipoContrincante;
    }

    public void setEquipoContrincante(String equipoContrincante) {
        this.equipoContrincante = equipoContrincante;
    }

    public double getValorArbitraje() {
        return valorArbitraje;
    }

    public void setValorArbitraje(double valorArbitraje) {
        this.valorArbitraje = valorArbitraje;
    }

}
