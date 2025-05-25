import java.util.Random;

public class HWS3 {
    public static void main(String[] args) {
        int[] hotelRooms = new int[15];
        Random rand = new Random();
        for (int i = 0; i < hotelRooms.length; i++) {
            hotelRooms[i] = rand.nextInt(25);
        }

    }
}