package domain;

public class Empleado extends Persona {
    
    @Override // Para sobreescritura de metodos de la clase padre
    public void imprimir() {
        System.out.println("Metodo imprimir desde clase hija");
    }
}