public class Operadores {
    public static void main(String args[]) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        if((a % 2) == 0) {
            System.out.println("Es numero par");
        }
        else {
            System.out.println("Es numero impar");
        }
        
        int c = 3, d = 2;
        int e = c + 5 - d;
        System.out.println("e = " + e);
        
        c += 1;
        System.out.println("c = " + c);
        
        var result = (1 > 2) ? "verdadero" : "falso" ;
        System.out.println("result = " + result);
        
        var numero = 8;
        result = ((numero % 2) == 0) ? "par" : "impar";
        System.out.println("result = " + result);
    }
}