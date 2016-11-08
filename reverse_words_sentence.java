import java.util.Stack;
class reverse_words_sentence{

public static void main(String args[]){

String str ="hello how are you";
String str1[]= str.split(" ");
//String a="";
//Using array list
ArrayList<String> inner = new ArrayList<String>();
for( String s: str1)
inner.add(s);

Collections.reverse(inner);
System.out.print(inner);


/*
//using Stack
Stack<String> s= new Stack<String>();
for( String s1: str1)
s.push(s1);

while(!s.empty())
System.out.print(s.pop());
*/


/*
//Using for loop
for ( int i=0;i<str1.length/2;i++){
a = str1[i];
str1[i] = str1[str1.length-1-i];
str1[str1.length-1-i] = a;
//System.out.println(str1[i]);
}
for ( int i=0;i<str1.length;i++){
System.out.println(str1[i]+" ");
}*/


}



}