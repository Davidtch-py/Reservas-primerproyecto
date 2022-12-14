package co.edu.uptc.models;
import java.time.*;

public class Reserva {

    private String rapto;
    private String espacio;
    private LocalDate fecha;
    private LocalTime hora;
    private int duracion;


    //constructor
    public void ReservaSalon(String rapto,String espacio,boolean disponibilidad, LocalDate fecha, LocalTime hora, int duracion) {
        this.espacio = espacio;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.rapto = rapto;
    }

    


    //Getters and Setters


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    public String getRapto() {
        return rapto;
    }

    public void setRapto(String rapto) {
        this.rapto = rapto;
    }

    
    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }




    public String getapto() {
        return null;
    }
}
