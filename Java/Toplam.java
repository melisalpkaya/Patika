import java.util.Scanner;

public class Toplam {
    public static void main(String[] args) {

        int number, total = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Tek bir sayi giriniz: ");
        number = inp.nextInt();

        while(number % 2 == 0){
            if(number % 4 == 0){
                total += number;
                System.out.println(number);
                System.out.println(total);
            }
            System.out.println("Tek bir sayi giriniz: ");
            number = inp.nextInt();
        }
    }
}
