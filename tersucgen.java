package Giris;
import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı gir : ");
        int sayi = inp.nextInt();

        for (int i =sayi-1 ; i>=1;i--){
            for (int k =(sayi-i);k>=1;k--){
                System.out.print(" ");
            }
            for (int k =1 ; k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
