package interviewQuestions6;

import java.util.Scanner;

public class Q02 {
    /*
  AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
  Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
  "abcdefghijklmnopqrstuvwxyz"; 26 harf
  "zyxwvutsrqponmlkjihgfedcba";
 */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("sifrelenecek harfi giriniz : ");
        String ifade = scan.nextLine().toLowerCase();
        for (int i = 0; i <ifade.length(); i++) {
          int index='z'-ifade.charAt(i);
            System.out.print((char)(('a')+index));
        }

        System.out.println();
        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
        System.out.print("sifrelenecek harfi giriniz : ");
        String str3 = scan.nextLine().toLowerCase();

        for (int i = 0; i < str3.length(); i++) {
            for (int j = 0; j <26 ; j++) {
              if (str3.charAt(i) == str1.charAt(j)) {
                  System.out.print(str2.charAt(j));
              }
            }
        }
    }
}
