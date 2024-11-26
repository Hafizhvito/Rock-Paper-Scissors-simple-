import java.util.Random;
import java.util.Scanner;

public class rockShesh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] ros = { "r", "p", "s" };
            String computer = ros[new Random().nextInt(ros.length)];

            String player;

            while (true) {
                System.out.print("Please enter [r][p][s] : ");

                player = scanner.nextLine();
                if (player.equalsIgnoreCase("r") || player.equals("p") || player.equals("s")) {
                    break;
                }
                System.out.println(player + "is not a valid move");
            }
            System.out.print("Computer : " + computer + " |");

            if (player.equals(computer)) {
                System.out.println(" The game was a tie ");
            } else if (player.equals("r")) {
                if (computer.equals("p")) {
                    System.out.println(" You Lose!");
                } else if (computer.equals("s")) {
                    System.out.println(" You Win!");
                }
            } else if (player.equals("p")) {
                if (computer.equals("r")) {
                    System.out.println("You Win!");
                } else if (computer.equals("s")) {
                    System.out.println(" You Lose!");
                }
            } else if (player.equals("s")) {
                if (computer.equals("p")) {
                    System.out.println(" You Win!");
                } else if (computer.equals("r")) {
                    System.out.println(" You Lose!");
                }
            }
            System.out.println("Play Agin? Y/N");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}
