package practice_basic_day01sorular;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen harf notunuzu hesaplamamiz icin notunuzu giriniz");
        int not = scanner.nextInt();

        if (not<0 && not>100){
            System.out.println("lutfen gecerli bir not giriniz");
        }else if (not>=90 ){
            System.out.println("harf notunuz : A -TEBRIKLER ");
        }else if (not>=80 ){
            System.out.println("harf notunuz : B -COK IYI");
        }else if (not>=70 ){
            System.out.println("harf notunuz : C  -IYI");
        }else if (not>=60 ){
            System.out.println("harf notunuz : D -BIRAZ DAHA CALISMALISIN");
        }else {
            System.out.println("harf notunuz : F -BIR DAHA DENERSIN TEKRAR IYIDIR");
        }


    }



}
