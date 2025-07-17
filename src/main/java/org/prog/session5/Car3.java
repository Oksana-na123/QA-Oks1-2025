package org.prog.session5;

public class Car3 {
    private String brand;
    private String color;
    public Car3(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Car3{color='" + color + "', model='" + brand + "'}";
    }
}

