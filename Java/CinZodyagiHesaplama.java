import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        
        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        int yil, kalan;
        String burc = " ";

        Scanner input = new Scanner(System.in);

        System.out.print(" Doğum Yılınız : ");
        yil = input.nextInt();

        kalan = yil % 12; //12 ile moddan kalınan bulunur

        switch (kalan) {
            case 0: // kalan 0'sa
                burc = "Maymun";
                break;
            case 1: // kalan 1'se
                burc = "Horoz";
                break;
            case 2:
                burc = "Kopek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Okuz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavsan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yilan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;

        }

        System.out.println("Çin Zodyağı Burcunuz : " + burc);
    }
}
