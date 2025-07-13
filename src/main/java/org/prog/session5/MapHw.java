package org.prog.session5;

import java.util.*;

public class MapHw {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        map.put("Oleg", new ArrayList<>());
        map.put("Oksana", new ArrayList<>());
        map.put("Igor", new ArrayList<>());
        map.put("Dina", new ArrayList<>());

        map.get("Oleg").add(randomColor() + " BMW");
        map.get("Oksana").add(randomColor() + " Mazda");
        map.get("Igor").add(randomColor() + " Opel");
        map.get("Dina").add(randomColor() + " Geely");
        map.get("Dina").add(randomColor() + " Jeep");
        System.out.println(map);
    }
    public static String randomColor() {
        Random random = new Random();
        return switch (random.nextInt(5)) {
            case 0 -> "red";
            case 1 -> "green";
            case 2 -> "blue";
            case 3 -> "yellow";
            case 4 -> "pink";
            default -> "black";
        };
    }
}
