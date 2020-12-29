public class Primitivos {
    public static void main(String args[]) {
        /*
            Tipos primitivos enteros: byte(8), short(16), int(32), long(64)
        */
        
        byte numeroByte = (byte)129;
        System.out.println("Valor byte = " + numeroByte);
        System.out.println("Valor minimo byte = " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte = " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short = " + Short.MIN_VALUE);
        System.out.println("Valor maximo short = " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int = " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int = " + Integer.MAX_VALUE);
        
        long numeroLong = 223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long = " + Long.MIN_VALUE);
        System.out.println("Valor maximo long = " + Long.MAX_VALUE);
        System.out.println("\n");
        
        /*
            Tipos primitivos flotantes: float(32), double(64)
        */
        
        float numeroFloat = (float)3.4028236E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float = " + Float.MIN_VALUE);
        System.out.println("Valor maximo float = " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308D;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double = " + Double.MIN_VALUE);
        System.out.println("Valor maximo double = " + Double.MAX_VALUE);
        System.out.println("\n");
        
        /*
            Tipos primitivos char
        */
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal2 = (char)33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
        System.out.println("\n");
        
        /*
            Tipos primitivos boolean
        */
        
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean) {
            System.out.println("La bandera es verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        var esAdulto = edad >= 18;
        
        if(esAdulto) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}