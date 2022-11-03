import java.util.Scanner;

public class KdvHesaplayici {
    public static void main(String[] args) {
        /* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        double tutar,kdvliTutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08;
        Scanner inp = new Scanner(System.in);
        System.out.print("Tutarı giriniz:");
        tutar = inp.nextDouble();

        kdvliTutar = tutar < 1000 ? ((tutar * kdvOrani1) + tutar) : ((tutar * kdvOrani2) + tutar);

        System.out.println("Tutar: " + tutar + "TL");
        System.out.println("0-1000 TL arası KDV Oranı: " + kdvOrani1);
        System.out.println("1000 TL ve sonrası için KDV Oranı: " + kdvOrani2);


        System.out.println("Girilen tutar için KDV'li fiyat: " + kdvliTutar+ "TL");

    }
}
