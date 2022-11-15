import java.util.Scanner;

public class OdevDeseneGöreMetot {
    static void Method(int number, int result, int tempNumber) {
        if(tempNumber <= 0) {

            //sayı negatif olmuşsa 5 eklenecek.
            System.out.print(result + " "); // işlem sonucu
            result += 5; // sonuç'a 5 eklendi.
            if(result == number) {
                System.out.print(result + " "); // 5 eklenmiş sonuç
                return;
            }
        }else if(tempNumber > 0) {
            //sayı pozitifse  5 eksiltilecek.

            System.out.print(result + " ");// işlem sonucu
            result -= 5;// sonuç'dan 5 çıkarıldı.
            if (result <= 0) {
                tempNumber = result;// 5 çıkartılmış sonuç
            }
        }
        Method(number,result,tempNumber); //recursive fonksiyon çağırma
    }

    public static void main(String[] args) {

        int number, result, tempNumber;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();

        result = number;
        tempNumber = number;

        if(number == 0) {
            System.out.println("0 kullanılamaz.");
        }else {
            Method(number,result,tempNumber);
        }
    }
}
