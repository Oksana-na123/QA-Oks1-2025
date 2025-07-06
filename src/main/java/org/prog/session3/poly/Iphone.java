package org.prog.session3.poly;

public class Iphone implements ICamera {
    @Override
    public void takesPhoto() {
        System.out.println("iPhone has takes a photo.");
    }

    @Override
    public String toString() {
        return "iPhone";

    }
}
