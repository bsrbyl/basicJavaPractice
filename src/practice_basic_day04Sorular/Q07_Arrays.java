package practice_basic_day04Sorular;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        
        int minnum=Integer.MAX_VALUE;
        int arr[][]={{1,2,3}, {2,3,1} , {5,-5,5} , {2,1,3}};
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j <arr[i].length ; j++) {
              if (arr[i][j]<minnum){
                minnum = arr[i][j];
              }
            }
        }
        System.out.println("Arrayin icindeki en kucuk sayi : "+minnum);
    }
}
