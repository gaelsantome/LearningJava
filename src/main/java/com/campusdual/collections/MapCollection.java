package com.campusdual.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> instrumentsType = new HashMap<>();

        instrumentsType.put("Guitar", "String");
        instrumentsType.put("Piano", "String");
        instrumentsType.put("drums", "Percussion");
        instrumentsType.put("Violin", "String");

        System.out.println("Map of musical instruments and types");

        for(Map.Entry<String, String> entry :instrumentsType.entrySet()){
            System.out.println(entry.getKey()+ "--" + entry.getValue());
        }
        instrumentsType.put("Piano", "Percussion");
        for(Map.Entry<String, String> entry :instrumentsType.entrySet()){
            System.out.println(entry.getKey()+ "--" + entry.getValue());
        }

        System.out.println("Contains specific key");
        System.out.println(instrumentsType.containsKey("Piano"));

    }
}
