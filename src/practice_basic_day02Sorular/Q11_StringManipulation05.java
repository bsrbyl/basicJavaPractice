package practice_basic_day02Sorular;

import java.util.Locale;
import java.util.Scanner;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 4 kelime giriniz");
        String str1= scanner.next();
        String str2= scanner.next();
        String str3= scanner.next();
        String str4= scanner.next();

        System.out.println(((str1.toUpperCase().charAt(0))+ str1.substring(1))+ " "+ str2+ " "+ str3+ " "+ str4+".");


    }
}
