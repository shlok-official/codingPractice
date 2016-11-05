import java.util.*;
class sum3{

    ArrayList<ArrayList<Integer>> s3um(int[] A, int sum) {
    Arrays.sort(A);
    System.out.println(A);

    }



public static void main(String args[]){
        sum3 triplet = new sum3();
        int[] A = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        //int arr_size = A.length;
 
        sum3.s3um(A, sum);



}

}



// public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
//     Arrays.sort(num);
  
//     HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
//     ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
  
//     for (int i = 0; i < num.length; i++) {
//         for (int j = i + 1; j < num.length; j++) {
//             int k = j + 1;
//             int l = num.length - 1;
  
//             while (k < l) {
//                 int sum = num[i] + num[j] + num[k] + num[l];
  
//                 if (sum > target) {
//                     l--;
//                 } else if (sum < target) {
//                     k++;
//                 } else if (sum == target) {
//                     ArrayList<Integer> temp = new ArrayList<Integer>();
//                     temp.add(num[i]);
//                     temp.add(num[j]);
//                     temp.add(num[k]);
//                     temp.add(num[l]);
  
//                     if (!hashSet.contains(temp)) {
//                         hashSet.add(temp);
//                         result.add(temp);
//                     }
  
//                     k++;
//                     l--;
//                 }
//             }
//         }
//     }
  
//     return result;


