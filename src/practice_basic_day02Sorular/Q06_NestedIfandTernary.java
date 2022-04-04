package practice_basic_day02Sorular;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {
        int sayi=5;
        if (sayi<0 ||sayi>9){
            System.out.println("Gecersiz");
        }else{
            switch (sayi){
                case 0: System.out.println("sifir");
                break;
                case 1: System.out.println("bir");
                    break;
                case 2: System.out.println("iki");
                    break;
                case 3: System.out.println("uc");
                    break;
                case 4: System.out.println("dort");
                    break;
                case 5: System.out.println("bes");
                    break;
                case 6: System.out.println("alti");
                    break;
                case 7: System.out.println("yedi");
                    break;
                case 8: System.out.println("sekiz");
                    break;
                case 9: System.out.println("dokuz");
                    break;

            }

        }

        //Ternary ile
        int n = 4;

        String result2 = n==9? "nine" :n==8? "eight"
                :n==7? "seven" :n==6? "six"
                :n==5? "five"  :n==4? "four"
                :n==3? "three" :n==2? "two"
                :n==1? "one" :n==0? "zero" :"Invalid";

        System.out.println(result2);

    }
}
