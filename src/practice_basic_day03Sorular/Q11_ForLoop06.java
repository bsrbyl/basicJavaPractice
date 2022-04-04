package practice_basic_day03Sorular;

import java.util.Scanner;

public class Q11_ForLoop06 {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen satir   sayisini giriniz : ");
        int satir= scanner.nextInt();
        System.out.print("lutfen sutun   sayisini giriniz : ");
        int sutun= scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {

                System.out.print("* " );


            }
            System.out.println("");
        }


    }

}
