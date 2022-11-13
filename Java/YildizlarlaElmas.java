import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                //boşluk
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                //yıldız
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= i; k++) {
                //boşluk
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * n - (2 * i + 1)); j++) {
                //yıldız
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
