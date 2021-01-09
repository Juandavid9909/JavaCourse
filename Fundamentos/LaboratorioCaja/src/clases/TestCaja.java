package clases;

public class TestCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3, 2, 6);
    
        System.out.println("Volumen caja: " + caja1.calcularVolumen());
    }
}