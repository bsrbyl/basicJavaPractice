package practice_basic_day03Sorular;

import java.util.Scanner;

public class Q12_MetCreationForLoop {

		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        public static void main(String[] args) {
            String str="busra";
             terstenYazdir(str);
        }

    private static String terstenYazdir(String str) {
       String terstenStr="";
        for (int i =str.length()-1 ; i >=0;  i--) {

            System.out.print(terstenStr=str.substring(i,i+1));
        }



        return terstenStr;
    }

}
