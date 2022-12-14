/**
 * The main method of the program
 */
package co.edu.uptc.run;

import java.time.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import co.edu.uptc.models.*;

public class MVP {

    // The main method of the program.
    public static void main(String[] args) {

        // MENU
        System.out.println("Bienvenido a la aplicacion de reservas de espacios");
        System.out.println("1. Registrar reserva");
        System.out.println("2. Consultar disponibilidad");
        System.out.println("3. Calcular valor de reserva");
        System.out.println("4. Calcular multa no uso de espacio reservado");
        System.out.println("5. Cancelar reserva de espacio reservado");
        System.out.println("6. Consultar deudas");
        System.out.println("7. Salir");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        String fecha;
        switch (opcion) {

            case 1:
                //metodo Registrar reserva
                
                System.out.println("#####Registrar reserva#####");
                System.out.println("Ingrese el No apto del Propietario");
                String apto = sc.next();
                System.out.println("Ingrese el espacio a reservar");
                System.out.println("1. Salon de eventos");
                System.out.println("2. Cancha de deportiva");
                System.out.println("3. Piscina");
                System.out.println("4. Parque interior");
                String espacio = null;
                int opc = sc.nextInt();
                try {

                    switch (opc) {
                        case 1:
                            espacio = EspacioComunal.espacioList[1].getTipo();
                            break;
                        case 2:
                            espacio = EspacioComunal.espacioList[2].getTipo();
                            break;
                        case 3:
                            espacio = EspacioComunal.espacioList[3].getTipo();
                            break;
                        case 4:
                            espacio = EspacioComunal.espacioList[4].getTipo();
                            break;
                        default:
                            System.err.println("ERROR, INGRESE NUMEROS DEL 1 AL 4");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.err.println("SOLO NUMEROS");
                }
                
                System.out.println("INGRESE LA FECHA DE RESERVA");
                System.out.println("Utilice formato YYYY-MM-DD");
                fecha = sc.next();
                LocalDate fh = LocalDate.parse(fecha);

                System.out.println("INGRESE LA HORA DE RESERVA");
                System.out.println("Utilice formato HH:MM");
                String hora = sc.next();
                LocalTime hr = LocalTime.parse(hora);

                System.out.println("INGRESE LA DURACION DE LA RESERVA(En horas)");
                int dr = sc.nextInt();
                EspacioApp.registrarReserva(apto, espacio, fh, hr, dr);

            case 2:
                //Metodo de disponibilidad
                System.out.println("Consultar disponibilidad");
                System.out.println("Ingrese el No apto del Propietario");
                apto = sc.next();

                System.out.println("Ingrese el espacio a consultar");
                System.out.println("1. Salon de eventos");
                System.out.println("2. Cancha de deportiva");
                System.out.println("3. Piscina");
                System.out.println("4. Parque interior");

                opc = sc.nextInt();
                try {

                    switch (opc) {
                        case 1:
                            espacio = EspacioComunal.espacioList[1].getTipo();
                            break;
                        case 2:
                            espacio = EspacioComunal.espacioList[2].getTipo();
                            break;
                        case 3:
                            espacio = EspacioComunal.espacioList[3].getTipo();
                            break;
                        case 4:
                            espacio = EspacioComunal.espacioList[4].getTipo();
                            break;
                        default:
                            System.err.println("ERROR, INGRESE NUMEROS DEL 1 AL 4");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.err.println("SOLO NUMEROS");
                }
                System.out.println("INGRESE LA FECHA DE CONSULTA");
                System.out.println("Utilice formato YYYY-MM-DD");
                fecha = sc.next();
                fh = LocalDate.parse(fecha);
                System.out.println("INGRESE LA HORA DE CONSULTA");
                System.out.println("Utilice formato HH:MM");
                hora = sc.next();
                hr = LocalTime.parse(hora);
                System.out.println("INGRESE LA DURACION DE LA CONSULTA");
                dr = sc.nextInt();
                if (EspacioComunal.espacioList[opc].getDisponibilidad() != false) {
                    System.out.println("El espacio ya esta reservado");
                } else {
                    System.out.println("El espacio esta disponible");
                }

                break;
            case 3:
                // crear un metodo para calcular el valor de la reserva teniendo en cue
                System.out.println("Calcular valor de reserva");
                System.out.println("Ingrese el No apto del Propietario");
                apto = sc.next();

                break;
            case 4:
                System.out.println("Calcular multa no uso de espacio reservado");
                System.out.println("Ingrese el No apto del Propietario");
                apto = sc.next();
                for(int i=0;i<19;i++){
                  if (apto==EspacioApp.reservaList[1].getapto()){
                    
                  }  
                }

                break;
            case 5:
                System.out.println("Cancelar reserva de espacio reservado");
                System.out.println("Ingrese el No apto del Propietario");
                apto = sc.next();
                System.out.println("Ingrese el espacio a cancelar");
                System.out.println("1. Salon de eventos");
                System.out.println("2. Cancha de deportiva");
                System.out.println("3. Piscina");
                System.out.println("4. Parque interior");

                try {
                    opc = sc.nextInt();
                    switch (opc) {
                        case 1:

                            break;

                        default:
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.err.println("SOLO NUMEROS");
                }
                break;
            case 6:
                System.out.println("Consultar deudas");
                System.out.println("Ingrese el No apto del Propietario");
                break;
            case 7:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
                break;

        }
    }

}
