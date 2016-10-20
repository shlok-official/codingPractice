   import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;


        public class InputArray {
            public static void main(String[] args) {
   
   
   System.out.print("enter the size of array");
                Scanner in = new Scanner(System.in);
                int size = in.nextInt();
                int[] A = new int[size];
                System.out.print("enter the elements");
               for(int i=0;i<A.length;i++){
                   A[i]= in.nextInt();
               }
                System.out.print("the array is ");
                for(int i=0;i<A.length;i++){
                    System.out.print(A[i]+"\t");
                }



            }
        }