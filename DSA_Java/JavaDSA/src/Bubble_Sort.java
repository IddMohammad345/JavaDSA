import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        int[] arr={4,5,63,2,60,45,23,9,44,20,98,11,3};
        for (int j=0;j<arr.length-1;j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        //printing using normal core java
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }

        System.out.println("\n=====================================================");
        Arrays.stream(arr)
                .forEach(i->System.out.print(i+" , "));
    }
}