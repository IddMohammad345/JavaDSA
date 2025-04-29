public class BinarySearch {
    public static void main(String[] args) {
         int[] num={5,7,9,11,13};
         int target=13;
         int result=binarySearch(num,target);
         if (result!=-1){
             System.out.println("Element found at index : "+result);
         }else {
             System.out.println("Element not found...");
         }
    }
    public  static int binarySearch(int[] num,int target){
        int left=0;
        int right=num.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (num[mid] == target){
                 return mid;
            }else if (num[mid]<target){
                left=mid+1;
            }else
                right=mid-1;
        }
        return -1;
    }
}
