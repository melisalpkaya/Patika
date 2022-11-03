import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {


            int r;
            double cevre, alan, pi = 3.14;

            Scanner input = new Scanner(System.in);
            System.out.print("Dairenin yarı çapı: ");
            r = input.nextInt();

            cevre = 2 * pi * r;
            alan = pi * r * r;

            System.out.println("Dairenin Çevresi: " + cevre);
            System.out.print("Dairenin Alanı: " + alan);

        }
}
