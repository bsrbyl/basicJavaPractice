package practice_basic_day03Sorular;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz

     */
    public static void main(String[] args) {

        uzunlukCevirmeMetodu();
    }

    private static void uzunlukCevirmeMetodu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        double sonuc = 0;
        System.out.print("Girdiginiz sayiyi metreye cevirmek icin : 1\n kilometreye cevirmek icin : 2\n basiniz: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                sonuc = sayi / 100;
                System.out.println("girdiginiz " + sayi + " cm - metre cinsinden : " + sonuc + " dir");
                break;
            case 2:
                sonuc = sayi / 100000;
                System.out.println("girdiginiz " + sayi + " cm - kilometre cinsinden : " + sonuc + " dir");
                break;
            default:
                System.out.println("lutfen gecerli bir secim yapiniz");


        }
    }

}