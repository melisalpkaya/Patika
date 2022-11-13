import java.util.Scanner;

public class KuvvetleriDortVeBes {
    public static void main(String[] args) {

        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.
        int number;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            System.out.println("4'ün kuvvetleri--> " + i);
        }
        System.out.println(" * * * * * * * * * * * * * ");
        for (int j = 1; j <= number; j *= 5) {
            System.out.println("5'in kuvvetleri--> " + j);
        }
    }
}
