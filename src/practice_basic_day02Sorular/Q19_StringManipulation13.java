package practice_basic_day02Sorular;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir 4 harfli string giriniz : ");
        String str=scan.next();

        if (str.length()==4){
            System.out.println("girdiginiz kelimenin tersten yazimi : "+ str.substring(str.length()-1)
                    +str.substring(2,3)
                    +str.substring(1,2)
                    +str.substring(0,1)

            );
        }else{
            System.out.println("yanlis giris yanptiniz.lutfen 4 harfli bir kelime giriniz");
        }


    }
}
