package practice_basic_day01sorular;

import java.util.Scanner;

public class Q08_Scanner01 {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tamsayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sonuc=sayi1+sayi2;
        System.out.println("sayilar toplami : " + sonuc);
    }




}
