
import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int arr[] = {4, 61, 52, 9, 8, 92, 78, 65};
        int arr1[] = {14, 6, 2, 91, 38, 72, 44};
        int total[]= new int[arr.length + arr1.length];

        System.arraycopy(arr, 0, total, 0, arr.length);
        System.arraycopy(arr1, 0, total, arr.length, arr1.length);
Arrays.sort(total);

       for(int i=0;i<total.length;i++){
           System.out.println(total[i]);
       }
    }
}