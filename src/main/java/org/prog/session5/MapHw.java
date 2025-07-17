package org.prog.session5;

import java.util.*;

public class MapHw {
    public static void main(String[] args) {
        Map<String, List<Car3>> map = new HashMap<>();

        map.put("Oleg", new ArrayList<>());
        map.put("Oksana", new ArrayList<>());
        map.put("Igor", new ArrayList<>());
        map.put("Dina", new ArrayList<>());

        map.get("Oleg").add(new Car3(randomColor(),"BMW"));
        map.get("Oksana").add(new Car3(randomColor(), "Mazda"));
        map.get("Igor").add(new Car3(randomColor(),"Opel"));
        map.get("Dina").add(new Car3(randomColor(),"Geely"));
        map.get("Dina").add(new Car3(randomColor(),"Jeep"));
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
