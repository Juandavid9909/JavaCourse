package clases;

public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja() {
        System.out.println("Desde constructor vacio");
    }
    
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
    
    public int getAncho() {
        return this.ancho;
    }
    
    public int getAlgo() {
        return this.alto;
    }

    public int getProfundo() {
        return this.profundo;
    }
    
    public int calcularVolumen() {
        return this.alto * this.ancho * this.profundo;
    }
}