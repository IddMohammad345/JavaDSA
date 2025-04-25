import java.util.Arrays;

public class BubbleSortDescending {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,4,4,3,3,5,44,34,70,98,6,32,56};

        for (int j = 0; j < arr.length-1 ; j++) {
            boolean isSorted=true;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted=false;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
            }
            if (isSorted){
                break;
            }
        }

        Arrays.stream(arr).forEach(i->System.out.print(i+" , "));
    /*    for (int i:arr){
            System.out.print(arr[i]);
        }*/
    }
}
