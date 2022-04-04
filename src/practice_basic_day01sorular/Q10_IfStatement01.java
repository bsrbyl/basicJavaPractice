package practice_basic_day01sorular;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen Y veya  N giriniz : " );
        char karakter = scanner.next().toUpperCase().charAt(0);

        if (karakter == 'Y'){
            System.out.println("YES");
        }else if (karakter== 'N'){
            System.out.println("NO");

        }else{
            System.out.println("yanlis giris yaptiniz tekrar deneyiniz");
        }


    }

}
