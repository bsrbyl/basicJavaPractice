package interviewQuestions6;

public class Q04 {
    public static void main(String[] args) {
        /*
There is a lonely monkey in the island
He needs to eat 4 bananas every day
there are just 165 bananas in that island
Create following variables and find how many days
monkey can survive.
Use do while loop, increment and decrement and if statements
int numberOfBananas =165, survivalDays = 1;
boolean monkeyAlive = true;
*/
        int numberOfBananas =165;
        int survivalDays = 0;
        boolean monkeyAlive = true;

        do {
            System.out.println("maymunlar gunde 4 muz yer");
            numberOfBananas-=4;
            survivalDays++;
            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("bugun "+survivalDays + " . gun muz kalmadi, maymun sizlere omur");
            }else System.out.println("bugun "+survivalDays + " . gun maymun hala bizimle");
        }while (monkeyAlive);
        System.out.println( " toplam maymunun yasadigi gun sayisi : "+survivalDays+1);


    }
}
