import java.util.Random;
/**
 * roller
 */
public class roller {

    public static void main(String[] args) {

        Random number = new Random();
        int x = number.nextInt(6) + 6;

        System.out.println("Random " + x );
    }
}