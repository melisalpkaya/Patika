import java.util.Scanner;

public class Bolunenler {
    public static void main(String[] args) {

        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        int number, counter = 0, total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayı isteniyor
        System.out.println("Bir sayı giriniz:");
        number = input.nextInt();

        System.out.println("3 ve 4'e tam bölünen sayılar: ");

        for(int i = 1; i<=number;i++){
            if(i % 3 == 0 && i % 4 == 0 ){

                total = total + i;
                counter++;
                System.out.println(i);

            }
        }

        average = total / counter;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }
}
