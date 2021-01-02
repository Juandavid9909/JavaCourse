package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    // Constructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con arg");
        
    }
    
    // Metodos de la clase
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        // return a + b;
        return this.a + this.b;
    }
}