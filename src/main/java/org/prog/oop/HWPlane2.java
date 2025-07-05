package org.prog.oop;

import java.util.Random;
import java.util.UUID;

import static org.prog.oop.HWPlane.*;

public class HWPlane2 {
    public static void main(String[] args) {
        HWPlane bigPlane = new HWPlane();
        HWPlane smallPlane = new HWPlane();


        flightNumber = UUID.randomUUID().toString();

        System.out.println(UUID.randomUUID().toString());
        bigPlane.size = "Big plane";
        smallPlane.size = " Small plane";

        Random random = new Random();
        bigPlane.maxPassengers = random.nextInt(201);
        for (int i = 0; i < 1; i++) {
            System.out.println(random.nextInt(100, 201));
        }
        bigPlane.realypassengers = random.nextInt(bigPlane.maxPassengers + 1);
        for (int i = 0; i < 1; i++) {
            System.out.println(random.nextInt(bigPlane.maxPassengers + 1));

        }
        smallPlane.maxPassengers = random.nextInt(201);
        for (int i = 0; i < 1; i++) {
            System.out.println(random.nextInt(100, 201));
        }
        smallPlane.realypassengers = random.nextInt(smallPlane.maxPassengers + 1);
        for (int i = 0; i < 1; i++) {
            System.out.println(random.nextInt(smallPlane.maxPassengers + 1));


            System.out.println("We have" + " with ID " + flightNumber + " which has maximum number persons " + maxPassengers + " but real persons on the bord " + realypassengers);
        }
    }
}