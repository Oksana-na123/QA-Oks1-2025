import java.util.Random;
public class HM1 {
    public static void main(String[] args) {
        int[] hotelRooms = new int[10];
        hotelRooms[0] = 1;
        hotelRooms[1] = 8;
        hotelRooms[2] = 5;
        hotelRooms[3] = 7;
        hotelRooms[4] = 3;
        hotelRooms[5] = 2;
        hotelRooms[6] = 4;
        hotelRooms[7] = 9;
        hotelRooms[8] = 6;
        hotelRooms[9] = 10;

        boolean unsorted = hotelRooms.length > 1;

        while (unsorted) {
            boolean elementsSwitched = false;

            for (int i = 1; i < hotelRooms.length; i++) {
                int currentElement = hotelRooms[i];
                int previousElement = hotelRooms[i - 1];

                if (previousElement > currentElement) {
                    elementsSwitched = true;
                    unsorted = true;
                    hotelRooms[i] = previousElement;
                    hotelRooms[i - 1] = currentElement;
                }
            }

            if (!elementsSwitched) {
                unsorted = false;
            }

        }

        for (int i = 0; i < hotelRooms.length; i++) {
            System.out.println(hotelRooms[i]);
        }

    }

}

