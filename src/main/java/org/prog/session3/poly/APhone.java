package org.prog.session3.poly;

public class APhone implements ICamera{

    @Override
    public void takesPhoto() {
        System.out.println("APhone has takes a photo.");
    }

    @Override
    public String toString() {
        return "APhone";

    }
}
