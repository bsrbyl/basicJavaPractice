package practice_basic_day02Sorular;

import java.util.Scanner;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("bir string girin : ");
        String str= scanner.next();
        System.out.println(str.contains("xyz"));
    }
}
