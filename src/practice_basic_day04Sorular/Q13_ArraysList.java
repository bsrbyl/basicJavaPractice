package practice_basic_day04Sorular;

import java.util.*;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */


    int arr[]={1,2,3,4,5,6,7,8};
    int n=2;
    Arrays.sort(arr);
        for (int i = arr.length-n ; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

}
