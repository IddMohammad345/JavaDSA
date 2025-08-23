import java.util.Arrays;

public class SearchElementFrom2DArray {
    public static void main(String[] args) {
       int[][]arr={
               {10,20,30,40},
               {15,25,35,45},
               {28,29,37,49},
               {33,34,38,50}
       };
        System.out.println(Arrays.toString(search(arr,37)));
    }

    static int[] search(int[][] matrix,int target){
        int initial=0;//r
        int ending=matrix.length-1;//c

        while (initial<matrix.length && ending >=0){
            if (matrix[initial][ending]==target){
                return new int[]{initial,ending};
            }
            if (matrix[initial][ending] <target){
                 initial++;
            }else {
                ending--;
            }
        }
        return new int[]{-1,-1};
    }
}
