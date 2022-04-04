package practice_basic_day03Sorular;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {
        int input=7;

        int sayac=0;
        int i=1;
        while(i<=input){
            if (i%2!=0){
                System.out.print(i);
                sayac++;
            }
            i++;
            System.out.print("  ");

        }

    }

}
