package practice_basic_day01sorular;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen adinizi  memleket,su anki konum, yas ve boyunuzu giriniz ");
        System.out.print("isminiz : ");
        String isim=scanner.nextLine();
         System.out.print("memleket : ");
         String memleket=scanner.nextLine();
        System.out.print("yasadiginiz yer : ");
        String konum =scanner.nextLine();
        System.out.print("yasiniz : ");
        byte yas=scanner.nextByte();
        System.out.print("boyunuz : ");
        short boy=scanner.nextShort();
        System.out.print("yasadiginiz " +konum + "seviyor musunuz true/false : ");
        boolean seviyorMu=scanner.nextBoolean();

        System.out.println("***************");
        System.out.println("isminiz : " +isim);
        System.out.println("memleket : " +memleket);
        System.out.println("konum : " +konum);
        System.out.println("yasiniz : " +yas);
        System.out.println("boyunuz : " +boy);
        System.out.println("seviyorMu = " + seviyorMu);



    }




}
