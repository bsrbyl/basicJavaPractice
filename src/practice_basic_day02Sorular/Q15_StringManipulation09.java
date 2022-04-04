package practice_basic_day02Sorular;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen string girin : ");
        String str= scanner.next();

        if (str.length()%2==1 && str.length()>=3){
            System.out.println(str.substring(str.length()/2,str.length()/2+1));
        }else{
            System.out.println("girdiginiz kelimenin karakter sayisi cift");
        }



    }
}