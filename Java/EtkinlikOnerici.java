import java.util.Scanner;

public class EtkinlikOnerici {
    public static void main(String[] args) {
        //Hava sıcaklığına göre etkinlik öneren program

        /*  Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

        int weather;

        Scanner inp = new Scanner(System.in);

        System.out.println("Hava sıcaklığı nedir?");
        weather = inp.nextInt();

        if(weather<5){
            System.out.println("Kayak yapabilirsin.");
        }
        else if(weather>5 && weather<15){
            System.out.println("Sinema gidebilirsin.");
        }
        else if(weather>15 && weather<25){
            System.out.println("Piknik yapabilirsin.");
        }
        else if(weather>25)
        {
            System.out.println("Yüzme gidebilirsin.");
        }
    }
}
