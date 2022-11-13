import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        int number, counter = 0, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        number = input.nextInt();

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
            counter++;
        }
        System.out.println("basamak sayısı: " + counter);
        System.out.println("basamak toplamı: " + sum);
    }
}
