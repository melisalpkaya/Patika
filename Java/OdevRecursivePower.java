import java.util.Scanner;

public class OdevRecursivePower {
    static int power(int base, int exponent) {

        if (exponent == 0)
            return 1;

        else if (base == 1)
            return 1;

        else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {

        //, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan program

        Scanner scan = new Scanner(System.in);

        System.out.print("Taban sayısı: ");
        int bottom = scan.nextInt();

        System.out.print("Üs sayısı: ");
        int exponent = scan.nextInt();

        System.out.println("Sonuç :" + power(bottom, exponent));
    }
}
