package practice_basic_day03Sorular;

import java.util.Scanner;

public class Q01_MethodCreation01 {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.print("yapacaginiz dort islemi * + - / olarak seciniz : ");
        char islem=scan.next().charAt(0);
        System.out.println("birinci sayi : ");
        double num1=scan.nextDouble();
        System.out.println("ikinci sayi : ");
        double num2=scan.nextDouble();

        hesapMakinesi(islem,num1,num2);



    }

    private static void hesapMakinesi(char islem, double num1, double num2) {


        if (islem=='+'||islem=='-'||islem=='*'||islem=='/'){
            switch(islem) {

                case '+':
                    System.out.println(num1+ " + " + num2+ " = "+ (num1+num2));
                    break;
                case '-':
                    System.out.println(num1+ " - " + num2+ " = "+ (num1-num2));
                    break;
                case '*':
                    System.out.println(num1+ " * " + num2+ " = "+ (num1*num2));
                    break;
                case '/':
                    System.out.println(num1+ " / " + num2+ " = "+ (num1/num2));
                    break;
               //default:
               //    System.out.println("lutfen gecerli bir islem seciniz");


            }
            }else{
            System.out.println("lutfen gecerli bir islem seciniz");
        }


    }


}