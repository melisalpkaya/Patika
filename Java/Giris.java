import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        /* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan program.*/
        String userName, password, choice, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız:");
        userName = input.nextLine();

        System.out.print("Şifreniz:");
        password = input.nextLine();

        if(userName.equals("melis") && password.equals("12345")){
            System.out.println("Başarıyla giriş yaptınız!");
        }
        else{
            System.out.println("Şifreniz yanlış!");
            System.out.println("Şifrenizi yenilemek ister misiniz? (Y/N) ");
            choice = input.nextLine();
            if(choice.equals("Y") || choice.equals("y")) {
                System.out.print("Yeni şifreniz:");
                newPassword = input.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                }
                else{
                    System.out.println( "Şifre oluşturuldu" );
                }

            }


        }
    }
}
