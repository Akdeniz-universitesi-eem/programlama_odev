/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abcasalsayilari;

public class ABCAsalSayilari {

    
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    int abc = a * 100 + b * 10 + c;
                    int cba = c * 100 + b * 10 + a;

                    if (cba > abc && isAsal(abc) && isAsal(cba) && isAsal(a * 10 + b) && isAsal(b * 10 + c) && isAsal(c * 10 + b)) {
                        System.out.println(abc);
                    }
                }
            }
        }
        // TODO code application logic here
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
        /*
  2 ve 3 dışında bir asal sayının yalnızca 6k ± 1 biçiminde olabileceği bir özellik kullanılır.
   Bu nedenle for döngüsü, i değerini 5'ten başlatır ve her adımda 6 ekler.
  Bu, 6k ± 1 formundaki potansiyel asal adaylarını kontrol etmek için kullanılır.

  Döngü her adımda i * i'nin sayi'den küçük veya eşit olduğunu kontrol eder. Bu kontrol, i'nin karekökünden
  büyük değerlere gitmemek için kullanılır. Çünkü eğer sayi bölenlere sahipse, en küçük böleni 
 karekökünün altında veya eşit olacaktır. Eğer böyle bir bölen bulunursa, false döndürülür, yani sayi asal değildir.

Döngü içinde, sayi'nin i ve (i + 2) tam bölenlerini kontrol eder. Eğer sayi bu iki sayıya tam bölünüyorsa,
asal değil kabul edilir ve false döndürülür.

Eğer yukarıdaki koşullardan hiçbiri sağlanmazsa, sayi bir asal sayı olarak kabul edilir ve true döndürülür.
        bunun yerine 
        boolen isasal ==true;
        for(int i=2;i<sayi;i++){if
        (sayi%i==0 ){
        is asal==false;}} 
        KULLANILABİLİR.
        */
        for (int i = 5; i *(i+1) <= sayi; i += 6) {
            if (sayi % i == 0 || sayi % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
