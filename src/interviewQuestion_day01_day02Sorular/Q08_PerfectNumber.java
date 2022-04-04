package interviewQuestion_day01_day02Sorular;

import java.util.Scanner;

public class Q08_PerfectNumber {
/* Perfect Number (Mukemmel sayi)
  Kullanici tarafindan bir sayiya kadar olan sayilarin,
  mukemmel olup olmadigini bulan method yaziniz.
  Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
  kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
  ORNEK: (6, 28, 496, 8128)
  INPUT      : 6
  OUTPUT     :  1,2,3
*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int sayi=scan.nextInt();

        mukemmelSayi(sayi);

    }

    private static void mukemmelSayi(int sayi) {
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        if (toplam==sayi){
            System.out.println(sayi+" sayısı mükemmel sayıdır.");
        }

    }
}
