package interviewQuestions8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarlanan eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);

        int tekrarliElemanSayisi=0;
        Set<Integer> uniqelemanlar=new HashSet<>();
        List<Integer> tekrarliElemanlar = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            boolean ekliMi=uniqelemanlar.add(numbers.get(i));
            if (!ekliMi){
                tekrarliElemanSayisi++;
                tekrarliElemanlar.add(numbers.get(i));
            }
        }
        System.out.println("tekrarliElemanSayisi = " + tekrarliElemanSayisi);
        System.out.println("tekrarliElemanlar = " + tekrarliElemanlar);
    }

}
