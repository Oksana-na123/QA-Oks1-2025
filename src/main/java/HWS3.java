import java.util.Random;

public class HWS3 {
    public static void main(String[] args) {
        int[] hotelRooms = new int[15];
        Random rand = new Random();
        for (int i = 0; i < hotelRooms.length; i++) {
            hotelRooms[i] = rand.nextInt(25);
        }
        boolean unsorted = hotelRooms.length > 1;
        while (unsorted)  {

            boolean elementsSwitched = false;
            for (int i = 0; i < hotelRooms.length - 1; i++) {
                int currentElement = hotelRooms [i];
                int nextElement = hotelRooms [i + 1];

                if (currentElement > nextElement) {
                    elementsSwitched = true;
                    unsorted = true;
                    hotelRooms[i] = nextElement;
                    hotelRooms[i + 1] = currentElement;
                }
            }

            if (!elementsSwitched) {
                unsorted = false;
            }

        }

        for (int i = 0; i < hotelRooms.length-1; i++) {
            System.out.println(hotelRooms[i]);
        }

    }

}