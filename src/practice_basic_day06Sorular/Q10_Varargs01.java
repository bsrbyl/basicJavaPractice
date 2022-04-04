package practice_basic_day06Sorular;

import java.util.Scanner;

public class Q10_Varargs01 {
static int toplam=0;
    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments

        Scanner scan = new Scanner(System.in);
        System.out.println("istediginiz kadar sayi giriniz : \n sayilari toplamak icin 0'a basiniz");

        int sayi=1;
        while(sayi!=0){
            sayi= scan.nextInt();
           // sayiToplama(sayi);
        }
        System.out.println("toplam : "+toplam);
    }

private static void sayiToplama(int...sayi){//varargs oldugunu anliyoruz
       toplam=0;
    for (int each:sayi
         ) {
        toplam+=each;
    }
    System.out.println("toplam : "+toplam);
}
}
