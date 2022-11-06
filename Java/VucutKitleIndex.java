import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        //"Vücut Kitle İndeks" değerini hesaplayan program
        int weight;
        double height, index;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height = input.nextDouble();
        System.out.println(" Lütfen kilonuzu giriniz :");
        weight=input.nextInt();

        index = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : "+ index);

    }
}
