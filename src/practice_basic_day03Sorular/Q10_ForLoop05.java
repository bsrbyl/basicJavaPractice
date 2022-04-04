package practice_basic_day03Sorular;

import java.util.Scanner;

public class Q10_ForLoop05 {
   /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.print("lutfen 1'den buyuk bir tamsayi giriniz : ");
       int sayi=scanner.nextInt();
        int  karelerToplami=0;


       for (int i =1 ; i <=sayi-1 ; i++) {
           int karesi=i*i;

           karelerToplami+=karesi;
       }

       System.out.println("girilen sayi : " + sayi + " kareler toplami : "+ karelerToplami);

   }





}
