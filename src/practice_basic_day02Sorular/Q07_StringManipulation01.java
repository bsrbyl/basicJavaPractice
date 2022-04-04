package practice_basic_day02Sorular;

import java.util.Locale;
import java.util.Scanner;

public class Q07_StringManipulation01 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {




        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz : ");
        String isim= scanner.nextLine().toUpperCase();
        System.out.println("lutfen soyisminiz giriniz : ");
        String soyIsim= scanner.nextLine().toUpperCase();
        System.out.println(isim.concat(" "+ soyIsim));
        System.out.println(isim + " "+ soyIsim);



    }
}
