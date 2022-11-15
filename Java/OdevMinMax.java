import java.util.Scanner;

public class OdevMinMax {
    public static void main(String[] args) {
        int countNumber, number ;
        int maxNumber = Integer.MIN_VALUE;
        int minNUmber = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        countNumber = input.nextInt();

        for (int i = 1; i <=countNumber; i++) {

            System.out.println(  i + ". sayıyı giriniz :");
             number = input.nextInt();

            if(number > maxNumber){
                maxNumber = number;
            }

            if(number < minNUmber ){
                minNUmber = number;
            }

        }

        System.out.println("En küçük sayı: " + minNUmber);
        System.out.println("En büyük sayı: " + maxNumber);
    }
}
