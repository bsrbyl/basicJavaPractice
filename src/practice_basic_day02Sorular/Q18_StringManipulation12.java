package practice_basic_day02Sorular;

import java.util.Scanner;

public class  Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str=scan.nextLine();


        if ( (str.isEmpty()==true)){
            System.out.println("bos bir string girdiniz");
        } else if (str.indexOf(" ")==-1) {
            System.out.println("girdiginiz kelimede bosluk karakteri yok");

        }else {
            System.out.println("girdiginiz kelimede bosluk var");
        }

    }

}