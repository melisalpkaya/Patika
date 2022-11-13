import java.util.Scanner;

public class Fibonacci {

    static int Fib(int num){
        if (num == 1 || num == 2) {
            return 1;
        }
        return Fib(num - 1) + Fib(num - 2);
    }


    public static void main(String[] args) {
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        num1 = scanner.nextInt();

        System.out.println("Fibonacci : " + Fib(num1));
    }
}
