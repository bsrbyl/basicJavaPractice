package practice_basic_day04Sorular;

import java.util.Arrays;
import java.util.Scanner;

public class  Q10_Arrays {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */

    Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir cumle giriniz : ");
        String cumle= scan.nextLine();
        String yeniCumle=cumle.replaceAll("\\s","");
        System.out.println(yeniCumle.length());
        String karakterler[]=yeniCumle.split("");
        System.out.println("cumledeki bosluklar haric character sayisi : " + karakterler.length);


    }
}
