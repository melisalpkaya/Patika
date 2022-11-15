import java.util.Scanner;

public class OdevMukemmelSayi {
    public static void main(String[] args) {

        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan program
        int number, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {

            if(number % i == 0){
                sum +=i;
            }

        }

        if(number == sum){
            System.out.println(number + " mükemmel sayıdır.");
        }else{
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
