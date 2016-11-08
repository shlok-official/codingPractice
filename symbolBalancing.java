import java.util.*;
/*
public class HashMapDemo {
   public static void main(String args[]) {
   // create hash map
   HashMap newmap = new HashMap();
      
   // populate hash map
   newmap.put(1, "tutorials");
   newmap.put(2, "point");
   newmap.put(3, "is best");
      
   // get keyset value from map
   Set keyset=newmap.keySet();
      
   // check key set values
   System.out.println("Key set values are: " + keyset);
   }    
}*/

class symbolBalancing{

public static boolean isValid(String s) {
HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
    Stack<Character> stack = new Stack<Character>();
    for(int i=0;i<s.length();i++){
      char curr = s.charAt(i);
   if (map.keySet().contains(curr)) {
			stack.push(curr);
		}else if (map.values().contains(curr)) {
            if (!stack.empty() && map.get(stack.peek()) == curr) {
				stack.pop();
        }else {
				return false;
			}
    
    
    }


}return stack.empty(); }

public static void main(String args[]){


    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = scan.nextLine();
    //System.out.println("you entered " + s);
    if(isValid(s)==true) 
    System.out.println("All good");
    else  
    System.out.println("bad data");


}


}