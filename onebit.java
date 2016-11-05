// class onebit
// {
//     public static void main(String args[]){
// int n = 147,count=0;
// while(n>0){
//      n =n/2;
//     System.out.print(n%2  + "\t");
//     // if(n%2==1)
//     // count++;
// }
//         //System.out.print(count +1 + "\t");
//     }
// }

import java.util.*;
public class onebit {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int n,count=0;
        n = d.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n > 0)
        {
           int r = n%2;
           if(r==1)
           count++;
        //    sb.append(r);
            n = n/2;
        }
       // System.out.println(sb.reverse());    
       System.out.println(count);    
    }
}