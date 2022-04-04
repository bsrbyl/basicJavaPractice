package practice_basic_day03Sorular;

import java.util.Scanner;

public class Q15_DoWhileLoop01 {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
    public static void main(String[] args) {
        char karakter=' ';

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("lutfen bir karakter giriniz : \nBitirmek icin : x 'e basiniz");
             karakter =scanner.next().charAt(0);
             if (karakter!='x') {
                 System.out.println("program calisiyor...");
             }

        }while (karakter!='x');
        System.out.println("Program bitti");

    }

}
