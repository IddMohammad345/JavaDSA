import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] num={3,4,6,8,1,2,9};

        for (int i=0;i<num.length-1;i++){
            int minIndex=i;
            for (int j = i+1; j < num.length; j++) {
                if (num[minIndex]>num[j]){
                    minIndex=j;
                }
            }
            int temp=num[minIndex];
            num[minIndex]=num[i];
            num[i]=temp;
        }
        for (int i:num)
            System.out.print(i+" ");
        System.out.println();
        Arrays.stream(num).forEach(System.out::print);
    }
}
