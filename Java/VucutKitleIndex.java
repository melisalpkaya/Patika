import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        //"Vücut Kitle İndeks" değerini hesaplayan program
        int kilo;
        double boy, indeks;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();
        System.out.println(" Lütfen kilonuzu giriniz :");
        kilo=input.nextInt();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : "+ indeks);

    }
}
