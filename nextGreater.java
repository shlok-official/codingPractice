//Find next greater number with same set of digits
//http://www.geeksforgeeks.org/find-next-greater-number-set-digits/
import java.util.Scanner;
import java.util.*;
class nextGreater{
 //public static 
public static void swap(int c,int d){
            int temp = c;
            c=d;
            d=temp;
        }


    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer a = n;
		char[] num = a.toString().toCharArray();
        int length= num.length;
		System.out.print(num);
        int i=0;

        for ( i =length-1;i>0;i--){
            if(num[i-1]<num[i]){
                swap(num[i],num[length-1]);
                break;
            }
            if(i==0)
            System.out.println("Not possible");
        }
        System.out.println(num);
           // Arrays.sort(num,num[i+1],num[length-1]);


    }
}


//http://www.geeksforgeeks.org/next-greater-element/#disqus_thread