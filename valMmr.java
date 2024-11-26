import java.util.Scanner;

public class valMmr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int totalMMR = 0;
            int numPlayers = 5;

            // Mengambil MMR dari masing-masing pemain di dalam sebuah party bro
            for (int i = 1; i <= numPlayers; i++) {
                System.out.print("Masukkan MMR pemain ke-" + i + ": ");
                int mmr = scanner.nextInt();
                totalMMR += mmr;
            }

            // Menghitung rata-rata MMR / logikanya
            int averageMMR = totalMMR / numPlayers;

            // Menentukan rank berdasarkan rata-rata MMR / idk ini cuman spekulasi aja
            String rank;
            if (averageMMR > 1000) {
                rank = "Radiant";
            } else if (averageMMR > 500) {
                rank = "Immortal";
            } else if (averageMMR > 400) {
                rank = "Ascendant";
            } else if (averageMMR > 350) {
                rank = "Diamond";
            } else if (averageMMR > 300) {
                rank = "Platinum";
            } else if (averageMMR > 250) {
                rank = "Gold";
            } else if (averageMMR > 200) {
                rank = "Silver";
            } else {
                rank = "Iron";
            }
            System.out.println("Rata-rata MMR party adalah: " + averageMMR);
            System.out.println("Rank party adalah: " + rank);
            scanner.nextLine();
            System.out.print("Play Agin? Y/N : ");
            String again = scanner.next();
            if (!again.equalsIgnoreCase("Y")) {
                break;
            }
        }   
    }
}
