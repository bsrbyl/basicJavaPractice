package interviewQuestion_day01_day02Sorular;

import java.util.Arrays;
import java.util.Scanner;

public class Q09_DifferentBettweenArray {
    /*
Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

    public static void main(String[] args) {

        arrayOlustur();


    }

    private static void arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Array uzunlugu giriniz : ");
        int uzunluk= scan.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayyin "+(i+1)+" . elemanini giriniz : ");
            arr[i]= scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[uzunluk-1]+ " - "+ arr[0]+" = "+ (arr[uzunluk-1]-arr[0]));
    }
}
