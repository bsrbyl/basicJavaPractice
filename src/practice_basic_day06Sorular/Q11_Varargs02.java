package practice_basic_day06Sorular;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {
        double sayi=5;
        double sayi1=4.5;
        double sayi2=8.5;
        carpma(sayi,sayi1,sayi2);

    }

    private static double carpma(double... sayi) {
        int carpim =0;
        for (double each :sayi
             ) {
            carpim*=each;
        }

     return carpim;
    }


}
