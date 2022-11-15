import java.util.Scanner;

public class OdevRecursivePrimeNumber {

    static String isPrime(int number, int i) {

        if (i == (number / 2) + 1 ) {
           return number + " asal sayıdır.";
        }

        if ( number % i == 0) {
            return  number + " asal sayı değildir.";


        }
        i++ ;
        return isPrime(number, i);

    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int i = 2 ;
        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();

        System.out.println(isPrime(number, i));

    }
}
