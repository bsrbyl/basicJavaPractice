package practice_basic_day01sorular;

import java.util.Scanner;

public class Q07_Converting {
    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */
    public static void main(String[] args) {
        int gallon=1;
        double litre=gallon * 3.785;
        String result0=gallon +"  gallon degeri " + litre+ " litredir";
        System.out.println(result0);
        int gallons=1000;
        double liters = gallons * 3.785;  //
        String result1 = gallons +" gallon degeri " + liters + " litredir";
        System.out.println(result1);
        //2.soru
        int L = 100;
        double G = L / 3.785;  //  100/3.785
        String result2 =  L +" litre degeri "+ G +" gallona esittir";
        System.out.println( result2 );

        //3.soru

        Scanner scan =new Scanner(System.in);
        System.out.println("fahrenayt degeri giriniz : ");

        int f=scan.nextInt();
        System.out.println("santigrad derceniz : "+(f-32)*5/9);





    }


}
