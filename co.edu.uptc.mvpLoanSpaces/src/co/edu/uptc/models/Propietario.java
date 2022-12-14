package co.edu.uptc.models;

public class Propietario {
    private String apto, name, lastName;
    private float deuda=0;
    private String dCuant;
    private int reservaL=0;
    Propietario[] propietarioList=new Propietario[10];
    private final String CREADO="Creado";
    private final String DEUDA="Con deuda";
    private final String DIA="Al Dia";
    private final String MOROSO="Moroso";
    
    public String getCREADO() {
        return CREADO;
    }

    public String getDEUDA() {
        return DEUDA;
    }

    public String getDIA() {
        return DIA;
    }

    public String getMOROSO() {
        return MOROSO;
    }

    // Constructor
    public Propietario(String apto, String name, String lastName, float deuda,String deudaCuant,int reservaL) {
        this.apto = apto;
        this.name = name;
        this.lastName = lastName;
        this.deuda = deuda;
        this.reservaL=reservaL;
        this.dCuant=getCREADO;
    }

    // Getters and Setters
    public int getReservaL() {
        return reservaL;
    }
    
    public void setReservaL(int reservaL) {
        this.reservaL = reservaL;
    }

    
    public String getDeudaCuant() {
        return deudaCuant;
    }
    public void setDeudaCuant(String deudaCuant) {
        this.deudaCuant = deudaCuant;
    }

    public String getapto() {
        return apto;
    }

    public void setapto(String apto) {
        this.apto = apto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public String getApto() {
        return apto;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    

    

    Propietario propietario1=new Propietario("101", "Juan", "Barajas", 0,Creado,0);
    propietarioList[1]=propietario1;
    Propietario propietario2=new Propietario("102", "Cesar", "Michi", 0, Creado,0);
    propietarioList[2]=propietario2;
    Propietario propietario3=new Propietario("103", "David", "Rodriguez", 0, Creado,0);
    propietarioList[3]=propietario3;
    
    
    
   
}