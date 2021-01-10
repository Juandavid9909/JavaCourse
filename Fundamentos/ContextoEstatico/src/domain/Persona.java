package domain;

public class Persona {

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona(String nombre) {
        this.nombre = nombre;
        
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        
        // Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}