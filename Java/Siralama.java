import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        //girilen 3 sayıyı küçükten büyüğe sıralayan program

        int first,second,third;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. sayı: ");
        first = inp.nextInt();
        System.out.print("2. sayı: ");
        second = inp.nextInt();
        System.out.print("3. sayı: ");
        third = inp.nextInt();

      if((first>second) && (first>third)){
          if(second>third){
              System.out.println("1>2>3");
          }
          else{
              System.out.println("1>3>2");
          }
      }
      else if((second>first) && (second>third)){
          if (first>third){
              System.out.println("2>1>3");
          }
          else
          {
              System.out.println("2>3>1");
          }
        }
      else{
          if(first>second){
              System.out.println("3>1>2");
          }
          else{
              System.out.println("3>2>1");
          }
      }
    }
}
