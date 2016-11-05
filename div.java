
import java.util.*;
class div{
    public static void main(String args[]){

Scanner in = new Scanner(System.in);
System.out.print("Please enter a number for checking power of 4");
int n = in.nextInt();
if(n==0)
System.out.print("Number is NOT power of 4");
while(n!=1){
if(n%4 != 0){
    System.out.println("Number is NOT power of 4");
    break;
}
n=n/4;


    }
    
     System.out.println("Number is power of 4");

}
    }
