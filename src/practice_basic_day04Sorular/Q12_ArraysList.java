package practice_basic_day04Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("olusturmak istediginiz listenin uzunlugunu giriniz : ");
        int listUzunluk = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("girdiginiz list uzunlugu kadar eleman ekleyiniz ...");

        for (int i = 0; i <listUzunluk ; i++) {
            list.add(scanner.nextInt());
        }
        tekrarliEleman(list);

    }

    private static void tekrarliEleman(List<Integer> list) {
        List<Integer>tekrarliList = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i)==list.get(j) && !tekrarliList.contains(list.get(i))) {
                    tekrarliList.add(list.get(i));
                }
            }
        }
        System.out.println("tekrarli listenin elemanlari : "+ tekrarliList);
    }
}
