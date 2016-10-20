

public class bubblesort {
   public static void main(String[] args) {
      int arr[] = {10, 9, 8,7,6,5,4,3,2, 1};
        int temp;
        for (int i = 0; i < arr.length -1; i++) {// over all loop
            for (int j = 1; j < arr.length -i; j++) {

                //forward traverse

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }


            }
            for (int k = arr.length-1; k >= 1; k--) {
        //backward traverse
                if (arr[k - 1] > arr[k]) {
                    temp = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = temp;
                }


            }

        }

        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }




   }
   }