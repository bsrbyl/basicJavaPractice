package practice_basic_day02Sorular;

import java.util.Scanner;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String 1 :");
        String str1=scanner.nextLine();
        System.out.print("String 2 :");
        String str2=scanner.nextLine();
        System.out.println("Stringlerin 1. method ile birlesimi : " + str1 + " "+ str2);
        System.out.println("Stringlerin 2. method ile birlesimi : " + str1.concat(" "+str2));


        String str1ilksiz = str1.substring(1);
        String str2ilksiz = str2.substring(1);
        System.out.println("Stringlerin ilk harfsiz halleri : "+ str1ilksiz+" "+str2ilksiz);

        String a="parlak";
        System.out.println(a.substring(1));




    }
}
