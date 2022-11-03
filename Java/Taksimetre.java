import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        /* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
            Taksimetre KM başına 2.20 TL tutmaktadır.
            Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
            Taksimetre açılış ücreti 10 TL'dir.  */


        double km;
        double kmBasi = 2.20, baslangic = 10, total;

        Scanner input = new Scanner(System.in);
        System.out.print("KM: ");
        km = input.nextDouble();

        total = (km * kmBasi) + baslangic;

        total = (total < 20) ? 20 : total;

        System.out.print("Taksimetre tutarı: " + total);
    }
}
