package practice_basic_day04Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim
        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen isminizi giriniz :");

        // 2. adim
        String isim=scan.nextLine().replaceAll(" ","");
        // 3. adim
        List<String> veriTabanindakiKullanicilar = new ArrayList<>();
        veriTabanindakiKullanicilar.add("Ayse");
        veriTabanindakiKullanicilar.add("Ahmet");
        veriTabanindakiKullanicilar.add("Hasan");
        veriTabanindakiKullanicilar.add("Ali");
        veriTabanindakiKullanicilar.add("Mehmet");
        veriTabanindakiKullanicilar.add("Derya");
        boolean kullaniciIsmiVarMi=veriTabanindakiKullanicilar.contains(isim);

        // 4. adim
        if (kullaniciIsmiVarMi==false){
            System.out.println("kullanici isminiz : "+isim);

        }else{
            Random rand=new Random();
            int rastgeleSayi= rand.nextInt(100);
            isim=isim+rastgeleSayi;
            System.out.println("bu isim kullanilmis. Yeni ismi kullanabilirsiniz: "+isim);
        }





    }
}
