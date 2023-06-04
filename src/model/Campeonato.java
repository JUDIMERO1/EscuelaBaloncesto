package model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 *
 */
public class Campeonato {

    private int numeroCampeonato;
    private LocalDate fecha;
    private String horaInicio;
    private String horaFin;
    private String lugar;
    private ArrayList<Partido> partidos;

    public Campeonato() {
    }

    public Campeonato(int numeroCampeonato, int dia, int mes, int anio, String horaInicio, String horaFin, String lugar) {
        this.numeroCampeonato = numeroCampeonato;

        LocalDate fecha = LocalDate.of(anio, Month.values()[mes], dia);
        this.fecha = fecha;

        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        this.partidos = new ArrayList();
    }

    public int getNumeroCampeonato() {
        return numeroCampeonato;
    }

    public void setNumeroCampeonato(int numeroCampeonato) {
        this.numeroCampeonato = numeroCampeonato;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    

}
