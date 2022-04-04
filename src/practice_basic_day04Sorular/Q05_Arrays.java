package practice_basic_day04Sorular;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 8 adet sayi giriniz");
        int arr []=new int[8];

        int sayac=0;

        for (int i = 0; i <8 ; i++) {
            System.out.println("Array icin"+(i+1)+"elemani giriniz");
            arr[i]=scan.nextInt();
            if (arr[i]%3==0){
                sayac++;}
        }
        System.out.print("3'e tam bolunen sayı adedi: "+sayac);


    }
}
