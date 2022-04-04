package practice_basic_day01sorular;


import java.util.Scanner;

public class Q12_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("lutfen is unvaninizi girin : ");
            String jobTitle=scanner.next().toLowerCase();

            if (jobTitle.equals("qa")){
                System.out.println("unvaniniz : Quality Analyst");
            }else if (jobTitle.equals("dev")){
                System.out.println("unvaniniz :  Developer");
            }else if (jobTitle.equals("ba")){
                System.out.println("unvaniniz : Business Analyst");
            }else if (jobTitle.equals("pm")){
                System.out.println("unvaniniz :Project Manager");
            }else{
                System.out.println("lutfen gecerli bir unvan giriniz");
            }

            //2.YONTEM:

            switch(jobTitle){
                case "qa":
                    System.out.println("unvaniniz : Quality Analyst");
                 break;
                case "dev":
                    System.out.println("unvaniniz :  Developer");
                 break;
                case "ba":
                    System.out.println("unvaniniz : Business Analyst");
                  break;
                case "pm":
                    System.out.println("unvaniniz :Project Manager");
                  break;
                default:  System.out.println("lutfen gecerli bir unvan giriniz");
                  break;

            }



        }

}
