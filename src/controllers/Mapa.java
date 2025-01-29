package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        HashMap();
        LinkedHashMap();
        treeMapa();
    }

    public void HashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);
        // ContainsKey
        System.out.println("Hay peras: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("Kiwi"));
        //Obtener un valor
        System.out.println("Valor de pera " + mapa.get("Pera"));
        //Eliminar Item
        mapa.remove("Pera");
        System.out.println(mapa);

        
    }

    public void LinkedHashMap() {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("\nLinkedHashMap: " + mapa);
        // ContainsKey
        System.out.println("Hay peras: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("Kiwi"));
        // Obtener un valor
        System.out.println("Valor de pera: " + mapa.get("Pera"));
        // Eliminar Item
        mapa.remove("Pera");
        System.out.println("LinkedHashMap después de eliminar Pera: " + mapa);
    }

    public void treeMapa() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("\nTreeMap: " + mapa);
        // ContainsKey
        System.out.println("Hay peras: " + mapa.containsKey("Pera"));
        System.out.println("Hay kiwi: " + mapa.containsKey("Kiwi"));
        // Obtener un valor
        System.out.println("Valor de pera: " + mapa.get("Pera"));
        // Eliminar Item
        mapa.remove("Pera");
        System.out.println("TreeMap después de eliminar Pera: " + mapa);
    }
}
