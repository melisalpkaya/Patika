import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        //hesap makinesi
        int first,second,selection;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayı:");
        first = input.nextInt();
        System.out.print("İkinci sayı:");
        second = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        selection = input.nextInt();

        if(selection == 1){
            System.out.println("TOPLAMA İŞLEMİ SONUCU: "+ (first + second));
        }
        else if(selection == 2){
            System.out.println("ÇIKARMA İŞLEMİ SONUCU: "+ (first - second));
        }
        else if(selection == 3){
            System.out.println("ÇARPMA İŞLEMİ SONUCU: "+ (first * second));
        }
        else if(selection == 4)
        {
            if(second != 0){
                System.out.println("BÖLME İŞLEMİ SONUCU: "+ (first / second));
            }
            else{
                System.out.println("Bir sayı 0'a bölünemez!!");
            }


        }
        else {
            System.out.println("Yanlış seçim yaptınız!");
        }
    }
}
