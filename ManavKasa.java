import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67,domates = 1.11, muz= 0.95,patlican = 5;


        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo,toplamFiyat;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç kilo?");
        armutKilo = input.nextDouble();
        System.out.println("Elma Kaç kilo?");
        elmaKilo = input.nextDouble();
        System.out.println(" Domates Kaç kilo?");
        domatesKilo = input.nextDouble();
        System.out.println(" Muz Kaç kilo?");
        muzKilo = input.nextDouble();
        System.out.println("Patlıcan Kaç kilo?");
        patlicanKilo = input.nextDouble();

        toplamFiyat = (armutKilo * armut) + (elmaKilo * elma) + (domatesKilo * domates) + (muzKilo * muz) + (patlicanKilo * patlican);
        System.out.println("Toplam tutar: " +toplamFiyat +"TL");


    }
}
