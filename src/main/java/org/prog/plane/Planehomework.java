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

            hangar[i].maxpassengers = random.nextInt(201);

            hangar[i].realpassengers = random.nextInt(hangar[i].maxpassengers + 1);

            if ( hangar[i].realpassengers >= hangar[i].maxpassengers/2) {



                System.out.println("The plane has ID " + hangar[i].flight + " and has real passangers " + hangar[i].realpassengers + " max passangers on the board are " + hangar[i].maxpassengers);

            }


        }
    }


}