package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        String element = miLista.get(0);
        System.out.println("element = " + element);
        
        imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        // En Set no se pueden duplicar elementos
        
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        String elementoMapa = miMapa.get("valor1");
        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion) {
//        for(String elemento : coleccion) {
//            System.out.println("elemento = " + elemento);
//        }
        
        System.out.println("---------------------");
        
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}