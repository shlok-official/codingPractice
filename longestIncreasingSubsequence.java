import java.util.*;

class longestIncreasingSubsequence{
//j...i
public void increasingSub(int arr[]){
int T[] = new int[arr.length];
Arrays.fill(T, 1);
for(int i=1;i<arr.length;i++){
    for(int j=0;j<i;j++){
        if(arr[i]>arr[j] ){
             if(T[j] + 1 > T[i]){
            T[i] =1+ T[j];
             }
        }
        



        }
    }Arrays.sort(T);
        System.out.println(T[6]);
}

    public static void main(String args[]){
longestIncreasingSubsequence lis = new longestIncreasingSubsequence();

        int arr[]={3,4,-1,0,6,2,3};
        lis.increasingSub(arr);



    }
}