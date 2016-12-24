import java.io.*;
import java.util.*;
import java.lang.Character;
class matchingPair{



public static void main(String args[]){
String str = "YVvyGSAJjJjjaWwsg";
//String str;
//  Scanner sc = new Scanner(System.in);
//  String str = sc.nextLine();

if (!Character.isUpperCase(str.charAt(0))||str.length()==0)
System.out.println( -1);

int num =0;
 //String lower1 = str.toLowerCase();
//char[] arr = str.toCharArray();
//if(lower1.length()<=1) System.out.println("-1");
Stack<Character> stack = new Stack<Character>();
//Deque<Character> stack = new ArrayDeque<Character>();

for(int i =0;i< str.length();i++){
    //if(i>1 && stack.peek() == null) continue;
if(!stack.empty() && stack.peek() == Character.toUpperCase(str.charAt(i)) ) {
stack.pop();
num = i;

}
else stack.push(str.charAt(i));


}
// for(Character c : stack)
// System.out.println(c);
// System.out.println(stack.size());
if(stack.isEmpty()){
    System.out.println(str.length()-1);
    }
else System.out.println(num);




    }
}