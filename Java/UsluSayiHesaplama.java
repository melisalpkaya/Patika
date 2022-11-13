import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int base, exponent, result =1;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayısı: ");
        base = input.nextInt();
        System.out.print("Üs sayısı: ");
        exponent = input.nextInt();

         // 3^2 --> 3 * 3

        for (int i=1; i<=exponent; i++){
            result *= base;
        }

        System.out.print("Cevap--> " + result);
    }
}
