public class Ciclos {
    public static void main(String args[]) {
        inicio:
        for(var counter = 0; counter < 3; counter++) {
            if((counter % 2) != 0) {
                continue inicio; // Ir a la linea de codigo de la etiqueta
            }
            System.out.println("counter = " + counter);
        }
        
        //for(var contador = 0; contador < 3; contador++) {
            //if((contador % 2) == 0) {
                //System.out.println("contador = " + contador);
                //break;
            //}
        //}
    }
}