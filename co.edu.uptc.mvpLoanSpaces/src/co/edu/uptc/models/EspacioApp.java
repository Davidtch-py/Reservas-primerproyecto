
package co.edu.uptc.models;
import java.time.*;
public class EspacioApp {
    private int valorReserva;   
    public static Reserva[] reservaList=new Reserva[20];
    public EspacioApp(int valorReserva) {

        this.valorReserva = valorReserva;
    }

    public static void registrarReserva(String apto, String espacio, LocalDate fecha, LocalTime hora, int duracion) {
        
    }
    public static void consultarDisponibilidad(String espacio, LocalDate fh, LocalTime hr, int dr) {
        
	} 
    


 
    public static void consultarValorReserva(String espacio) {
        
    }

    public static void consultarmultaReserva(String espacio) {
        
    }
    
    public static void cancelarReserva(String espacio) {
        
    }




}
