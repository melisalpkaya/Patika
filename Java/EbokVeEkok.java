import java.util.Scanner;

public class EbokVeEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("1. sayıyı gir: ");
         n1 = sc.nextInt();

        System.out.print("2. sayıyı gir: ");
        n2 = sc.nextInt();

        int i = 1;
        int ebob = 1;

        while (i <= n1) {

            if (n1 % i == 0 && n2 % i == 0) {

                ebob = i;

            }

            i++;

        }

        System.out.println("EBOB: " + ebob);
        System.out.print("EKOK: " + (n1*n2) / ebob);

    }
}
