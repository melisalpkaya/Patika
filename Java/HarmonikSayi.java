import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
       // Java ile girilen sayının harmonik serisini bulan program
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısı: ");
        int n = input.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += (1.0/i);
        }
        System.out.println("Harmonik toplam: " + sum);
    }
}
