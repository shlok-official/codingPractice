//max element in a array
public class MaxElementInArray {
    public static void main(String[] args) {
        int arr[]={4,6,5,9,8,92,78,65}, max;
        max=arr[0];
        for(int i=1;i<arr.length;i++){
            if( arr[i]>max)
                max=arr[i];
                }
         
    }
}
//Insertion Sort
public class InsertionSort {
   public static void main(String[] args) {
        int arr[] = {4, 6, 52, 9, 8, 92, 78, 65}, max;
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i > 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}
//Linear Search
public class practice {
    public static void main(String[] args) {
        int arr[]={4,6,5,9,8,92,78,65}, find=7;
        for( int i =0 ; i< arr.length; i++){
            if(arr[i]== find){
            System.out.println("found at " + (i+1));
            System.exit(0);}
        }
  System.out.println("not found");
    }
}

 //Binary Search
/**
 * Created by ShlokDixit on 22/09/16.
 */
public class practice {
    public static void main(String[] args) {
        int arr[] = {4, 6, 8, 28,31, 78, 95},find=28;
        int result = binarysearch(arr,0,arr.length,find);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
//System.out.println(result);

    }

  public static int  binarysearch(int arr[],int start,int end,int find) {


      if (end > start) {
          int mid = (start + end) / 2;

          if (find == arr[mid])
              return mid;
          else if (mid > find)
              binarysearch(arr, 1, mid - 1, find);
          else
                      binarysearch(arr, mid + 1, end, find);


      }
      return -1;

  }}

//Max SubArray????
public class MaxSubArray {
   public static void main(String[] args) {
   int arr[]={3,4,-1,-9,8,7,-2},total=0;
   //for (int j = 1; j < arr.length; j++) {
   //int temp=0;
   while(arr[j]>=0){
    total+=arr[j];
    temp=total;
    j++;
    }
    
