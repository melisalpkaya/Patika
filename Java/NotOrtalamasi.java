import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
         /* Java ile matematik, fizik, kimya, türkçe, tarih ve müzik derslerinin sınav puanları alınacak ve
         ortalama hesaplanacak (geçti-geçmedi), ekrana verilecek */

        // dersler
        int matematik, fizik, kimya, turkce, tarih, muzik;


        Scanner puan = new Scanner(System.in);

        // Ali sınavlardan kaç aldı?
        System.out.print("Matematik notu:");
        matematik = puan.nextInt();

        System.out.print("Fizik notu:");
        fizik = puan.nextInt();

        System.out.print("Kimya notu:");
        kimya = puan.nextInt();

        System.out.print("Türkçe notu:");
        turkce = puan.nextInt();

        System.out.print("Tarih notu:");
        tarih = puan.nextInt();

        System.out.print("Müzik notu:");
        muzik = puan.nextInt();

        // ortalama için toplam ve sonuc adında değişken tanımlandı
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        float sonuc = toplam / 6f;

        System.out.println("Öğrenci ortalaması:" + sonuc );
        String kosul = (sonuc >= 60) ? "Başarılı." : "Başarısız.";
        System.out.print(kosul);
    }
}
