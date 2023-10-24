/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 package sayibasamaklarinaayirma;
import java.util.Scanner;

public class Sayibasamaklarinaayirma {

   
    public static void main(String[] args) {
        // TODO code application logic hereScanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

        int basamakToplam = toplamBasamaklar(sayi);

        if (isAsal(basamakToplam)) {
            System.out.println("Basamakların toplamı (" + basamakToplam + ") bir asal sayıdır.");
        } else {
            System.out.println("Basamakların toplamı (" + basamakToplam + ") bir asal sayı değildir.");
        }
        public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        if (sayi <= 3) {
            return true;
        }
        if (sayi % 2 == 0 || sayi % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= sayi; i += 6) {
            if (sayi % i == 0 || sayi % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Bir sayının basamaklarını toplayan fonksiyon
    public static int toplamBasamaklar(int sayi) {
        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;
    }
    }
    


