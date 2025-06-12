package org.prog.plane;

import java.util.Random;
import java.util.UUID;

public class Planehomework {
    public static void main(String[] args) {

        Plane[] hangar = new Plane[6];

        Random random = new Random();

        for (int i = 0; i < 6; i++) {

            hangar[i] = new Plane();

            hangar[i].flight = UUID.randomUUID().toString();
            System.out.println(UUID.randomUUID().toString());

            hangar[i].maxpassengers = random.nextInt(201);
            System.out.println(random.nextInt(100, 201));

            hangar[i].realpassengers = random.nextInt(hangar[i].maxpassengers + 1);
            System.out.println(random.nextInt(hangar[i].maxpassengers + 1));


            System.out.println("The plane ID " + hangar[i].flight + " has seating places " + hangar[i].maxpassengers + " there is aboard " + hangar[i].realpassengers + " passengers" );


        }
    }


}
