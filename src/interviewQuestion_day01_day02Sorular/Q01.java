package interviewQuestion_day01_day02Sorular;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
 */
        Scanner scan =new Scanner(System.in);
        System.out.print("lutfen string giriniz : ");
        String str = scan.nextLine();
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int counter=0;
        for (int i=1; i<arr.length; i++){
            if (arr[i-1].equals(arr[i])){
                counter++;
            }else{
                System.out.println(arr[i-1]+ " sayisi "+ (counter+1));
                counter = 0;
            }

            if (i==arr.length-1){
                System.out.println(arr[i]+ " sayisi "+ (counter+1));
            }
        }

    }
}
