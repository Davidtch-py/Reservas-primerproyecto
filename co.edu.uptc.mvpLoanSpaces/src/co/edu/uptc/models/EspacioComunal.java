package co.edu.uptc.models;

public class EspacioComunal {
    // Atributos
    private final String SALCOM = "SalonComunal";
    private final String DEP = "Cancha Deportiva";
    private final String PARQUE = "Parque Interior";
    private final String PISCINA = "Piscina";
    private String tipo;
    private boolean disponibilidad;
    public static EspacioComunal[] espacioList= new EspacioComunal[4];

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Creating a class called EspacioComunal.
    public EspacioComunal(String tipo, boolean disponibilidad) {
        this.tipo = tipo;
        this.disponibilidad=true;
    }

    // Creating a new instance of the EspacioComunal class for each of the four variables.
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSALCOM() {
        return SALCOM;
    }

    public String getDEP() {
        return DEP;
    }

    public String getPARQUE() {
        return PARQUE;
    }

    public String getPISCINA() {
        return PISCINA;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void RegistrarEspacio(){
        EspacioComunal salon=new EspacioComunal(getSALCOM(), true);
        espacioList[1]= salon;

        EspacioComunal cancha=new EspacioComunal(getDEP(), true);
        espacioList[2]= cancha;

        EspacioComunal piscina=new EspacioComunal(getPISCINA(), true);
        espacioList[3]= piscina;

        EspacioComunal parque=new EspacioComunal(getPARQUE(), true);
        espacioList[4]=parque;
    }
    
    

}
