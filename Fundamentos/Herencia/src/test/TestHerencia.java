package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente("Karen", 'F', 28, "Saturno 15", new Date(), true);
        System.out.println("cliente1 = " + cliente1);
    }
}