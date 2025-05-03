
import java.util.Arrays;

public class TwoWayMerging {
    //Write a program to merge two arrays and output should be sorted
    public static void main(String[] args) {
       int[] a= {2,3,4,8,5};
        int[] b= {6,3,5,6,9,7,1};

       // Arrays.sort(a);
       // Arrays.sort(b);

        twoWayMerge(a,b);

    }

    public static void twoWayMerge(int[] a,int[] b){
        int[] c=new int[a.length+b.length];  //{2,3,4,6,3}
        int i=0,                           //i for a array
                j=0,                       //j for b array
                k=0;                       //k for c array
        while (i < a.length && j<b.length) {  //3<5 && 1<7
            if (a[i] > b[j]) {             //8>3
                c[k] = b[j];              //c[3]=6
                j++;                      //j=1
                k++;                      //k=4
            } else {
                c[k] = a[i];             //c[2]=4
                i++;                       //i=3
                k++;                        //k=3
            }
        }
        while (j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }
        while (i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }

        Arrays.stream(c).sorted().forEach(e->System.out.print(e+" "));
    }
}
