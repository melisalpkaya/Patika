import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
            //dersler: mat,fiz,türkçe,kimya,müzik

        int math,physic,turkish,chemistry,music;
        double average;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        math = inp.nextInt();
        if (math<0 || math>100){
            math=0;
        }
        System.out.print("Fizik notunuz: ");
        physic = inp.nextInt();
        if (physic<0 || physic>100){
            physic=0;
        }
        System.out.print("Türkçe notunuz: ");
        turkish = inp.nextInt();
        if (turkish<0 || turkish>100){
            turkish=0;
        }
        System.out.print("Kimya notunuz: ");
        chemistry = inp.nextInt();
        if (chemistry<0 || chemistry>100){
            chemistry=0;
        }
        System.out.print("Müzik notunuz: ");
        music = inp.nextInt();
        if (music<0 || music>100){
            music=0;
        }

        average = (math + physic + turkish + chemistry + music) / 5;
        System.out.println(average);

        if(average <= 55 ){
            System.out.println("Sınıfta kaldınız!");
        }
        else System.out.println("Geçtiniz!");

    }
}
