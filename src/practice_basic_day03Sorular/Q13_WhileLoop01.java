package practice_basic_day03Sorular;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {
        int input =7548;
        int rakam=0;
        int rakamlarToplami=0;

        while(input>0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
        System.out.println("rakamlar toplami: "+ rakamlarToplami);
    }



}