/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tahminoyunu;

import java.util.Scanner;
import java.util.Random;
public class TahminOyunu {

   
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       int min =1;
       int max=100;
               
       
        int rastgeleSayi = random.nextInt(100)+1;
        int tahmin;
        int tahminSayisi = 0;

        System.out.println("1 ile 100 arasında bir sayı tahmin edin.");

        do {
            tahminSayisi++;
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin < min || tahmin > max) {
                System.out.println("Lütfen 1 ile 100 arasında bir sayı girin.");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı deneyin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı deneyin.");
            }
        } while (tahmin != rastgeleSayi);

        System.out.println("Tebrikler! " + tahminSayisi + " tahminde doğru sayıyı buldunuz.");
    
        // TODO code application logic here
    }
    
}
