import java.util.Scanner;

public class OdevTersUcgen {
    public static void main(String[] args) {

        //basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen program
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt();

        for(int i = 0; i <= num; i++){

            for (int j = 1 ; j <= i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*num-(2*i+1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
