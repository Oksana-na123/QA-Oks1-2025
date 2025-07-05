package org.prog.session2;

//TODO: Add polish car step to painting process

public class CarService {

    private CarPainter vova = new CarPainter();
    private CarPainter sasha = new CarPainter();
    private PolishCar oleg = new PolishCar();

    public void paintCar(Car2 carToPaint, String newCarColor, Car2 carToPolish ) {
        vova.breakDuration = 5;
        sasha.breakDuration = 10;
        if ("black".equals(newCarColor)) {
            coffeeBreak(sasha);
            vova.prepareCarForPainting(carToPaint);



            coffeeBreak(vova);
            sasha.paintCar(carToPolish,"white");
            sasha.polishCar(carToPaint);

        } else {
            coffeeBreak(vova);
            sasha.prepareCarForPainting(carToPaint);


            coffeeBreak(sasha);
            vova.paintCar(carToPolish, "white");
            vova.polishCar(carToPaint);

        }
        oleg.polishCar(carToPaint, newCarColor, "done");
    }


    private void coffeeBreak(CarPainter carPainter) {
        System.out.println("coffeBreak for " + carPainter.breakDuration);
    }
 //   public void polishCar();
}
