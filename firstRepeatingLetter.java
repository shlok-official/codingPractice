import java.io.*;
import java.util.*;
class firstRepeatingLetter{

//Shlok Dixit @ 03.30PM
void checkLetter(String str){
int arr[] = new int[26];
for(int i=0;i<str.length();i++){
arr[str.charAt(i)-'a']++;
}
for(int i=0;i<str.length();i++){
if(arr[str.charAt(i)-'a']>1){
System.out.println(str.charAt(i));
break;
}
}
}



public static void main(String args[]){
String str ="abcba";
firstRepeatingLetter flr = new firstRepeatingLetter();
flr.checkLetter(str);

    }
}