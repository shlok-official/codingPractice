/**
 * Created by ShlokDixit on 18/09/16.
 */

import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c;
        char[] charArray = s.toCharArray();
//c =charArray[0];
for(int j =0 ;j<charArray.length;j++) {
    c =charArray[j];
    for (int i = j+1; i < charArray.length; i++) {
        if (c == charArray[i]) {

            System.out.print("not pangram");
            System.exit(0);
        }
    }
}
        System.out.print(" pangram");
    }
}


/*
 public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
    
        String ss= s.replaceAll("[^a-zA-Z]+", " ").replaceAll("\\s+","").toLowerCase();
        String arr[]= ss.split("");
        HashSet<String> pangram = new HashSet<>();

        for(int i =0;i<arr.length;i++){
            pangram.add(arr[i]);
        }
if(pangram.size()==26)
   System.out.print("pangram");
        else
    System.out.print("not pangram");


*/
