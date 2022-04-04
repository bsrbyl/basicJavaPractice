package practice_basic_day02Sorular;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen  isim ve soyismizi girin : ");
        String isim= scanner.next();
        String soyisim= scanner.next();

        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden uzundur");
        }else if (isim.length()<soyisim.length()){
            System.out.println("soyisminiz isminiz den uzundur");
        }else{
            System.out.println("isminizle soyisiniz ayni uzunluktadir");
        }


    }

}
