package practice_basic_day02Sorular;

import java.util.Scanner;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finalNotu='b';
        String result="";

       result = (finalNotu=='A')?"notunuz : 'A'  ->  \"Gayet Basarili\" " :

               (finalNotu=='B') ? " notunuz:'B'  ->  \"Basarili\"":
                       (finalNotu== 'C') ? "'C'  ->   \"Ha gayret\"" : " Digerleri..";

        System.out.println("result = " + result);

    }
}
