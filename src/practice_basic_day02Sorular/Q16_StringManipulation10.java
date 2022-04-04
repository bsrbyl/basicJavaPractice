package practice_basic_day02Sorular;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {
    String cumle="   Java ogrenmek123 Cok guzel@      ";

        System.out.println(cumle.trim().replaceAll("\\d","").replace("C","c")
                .replace('@',' '));
        System.out.println(cumle.replaceAll("\\d","").replace("C","c")
                .replace('@',' '));

    }
}
