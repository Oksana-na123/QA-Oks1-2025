package org.prog.plane;

import java.util.Random;
import java.util.UUID;

public class Planehomework {
    public static void main(String[] args) {

        Plane[] hangar = new Plane[50];

        Random random = new Random();

        for (int i = 0; i < hangar.length; i++) {

            hangar[i] = new Plane();

            hangar[i].flight = UUID.randomUUID().toString();

            hangar[i].maxpassengers = random.nextInt(1, 201);

            hangar[i].realpassengers = random.nextInt(hangar[i].maxpassengers + 1);

            hangar[i].percent = hangar[i].realpassengers * 100 / hangar[i].maxpassengers;



        }


        boolean unsorted = hangar.length > 1;
        while (unsorted) {
            boolean elementsSwitched = false;
            for (int i = 1; i < hangar.length; i++) {

                Plane currentElement = hangar[i];
                Plane previousElement = hangar[i - 1];

                if (previousElement.percent > currentElement.percent) {

                    elementsSwitched = true;
                    unsorted = true;

                    hangar[i] = previousElement;
                    hangar[i - 1] = currentElement;

                }


                if (!elementsSwitched) {
                    unsorted = false;
                }
            }
        }
        for (int i = 0; i < hangar.length; i++) {
            if (hangar[i] != null) {
                System.out.println("The plane ID " + hangar[i].flight + " has seating places " + hangar[i].percent + " precent " + hangar[i].maxpassengers + " there is aboard " + hangar[i].realpassengers + " passengers");
            }
        }
    }
}


//        hangar[y] = new Plane();
//
//            boolean unsorted = hangar[i].percent > 1;
//            while (unsorted) {
//                boolean elementsSwitched = false;
//                for (int y = 1; y < hangar[i].percent; y++) {
//                    int currentElement = hangar[i].percent ;
//                    int previousElement = hangar[i-1].percent;
//
//                    if (previousElement > currentElement) {
//                        elementsSwitched = true;
//                        unsorted = true;
//                        hangar[i-1].percent = currentElement;
//                        hangar[i].percent = previousElement;
//                    }
//                    if (!elementsSwitched) {
//                        unsorted = false;
//                    }
//                    System.out.println(hangar[i].percent);
//                }


// }
// }



