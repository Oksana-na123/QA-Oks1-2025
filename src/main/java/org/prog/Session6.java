package org.prog;

//TODO: 1. Add class Plane which has current passengers count,
// max passengers cound and flight ID as string "AA-1001"
// 2. Create new Plane, set passengers, max passengers and flight id

public class Session6 {

    /**
     * ###############################
     * ###[aliceCar@Car]##############
     * #######s3->[]##################
     * #####[s1->"some string"]#######
     * ######[s2->""]#################
     * ##################[bobCar@Car]#
     * ###############################
     * ###############################
     */

    public static void main(String[] args) {
        Car aliceCar = new Car();
        Car bobCar = new Car();

        aliceCar.color = "blue";
        aliceCar.model = "3";
        bobCar.color = "red";

        aliceCar.going = "Kyiv";
        bobCar.going = "Lviv";

        System.out.println(aliceCar.color + " is going to " + aliceCar.going);
        System.out.println(bobCar.color + " is going to " + bobCar.going);
//        System.out.println(aliceCar.color);
//        System.out.println(bobCar.color);

        aliceCar.goTo();
        bobCar.goTo();

        aliceCar.refuel(25, "diesel");
        bobCar.refuel(15, "gasoline");

//        System.out.println(aliceCar.model);
//        System.out.println(bobCar.model);
//
//        String s1 = "some string";
//        String s2 = "";
//        String s3 = null;
    }
}
