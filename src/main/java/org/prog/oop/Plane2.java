package org.prog.oop;

import java.io.File;
import java.util.Random;
import java.util.UUID;

public class Plane2 {
    public static void main(String[] args) {



        Plane bigPlane = new Plane();
        Plane smallPlane = new Plane();


        Plane.flight = UUID.randomUUID().toString();


        System.out.println(UUID.randomUUID().toString());

        System.out.println("ID" + Plane.flight);

        Random random = new Random();
        Plane.maxPassengers = random.nextInt(201);
        for (int i = 0; i < 1; i++) {

                System.out.println(random.nextInt(100, 201));

            Plane.realypassengers = random.nextInt(Plane.maxPassengers + 1);

            for (int і = 0; i < 1; i++) {
                System.out.println(random.nextInt(Plane.maxPassengers + 1));


            }
        }
        System.out.println( "We have" + plane + "with ID " + plane.flight + " which has maximum number of passengers " + plane.maxPassengers + " but there are " + plane.realypassengers + " passwngers");


    }

}