 
import java.util.Scanner;
import java.util.*;
class prime{
  public static boolean prime(int i){
        for (int a=2;a<i;a++){
                if(i%a==0){
                return false;}
        }       
        return true;
}
public static void main(String args[]){
        
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int[] arr= new int[n];
for(int i = 2; i < n; ++i) {
             if (prime(i))
                 System.out.println(i);
                } 
                // for(int t=0;t<n;t++){        
                //         System.out.print(arr[t]);   }

         }
}