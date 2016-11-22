/*
Given a digit string excluded 01, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons)
1->{}
2->{a,b,c}
3->{d,e,f}
4->{g,h,i}
5->{j,k,l}
6->{m,n,o}
7->{p,q,r,s}
8->{t,u,v}
9->{w,x,y,z}
0->{}

Given "23"
Return ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]

*/
import java.util.*;

class phoneNumber{


 public ArrayList<String> letterCombinations(String digits) {
     char[] c = digits.toCharArray();
    
     ArrayList<String> al=new ArrayList<String>();
     HashMap<Character,char[]> hm = new HashMap<Character,char[]>();
     hm.put('1',new char[]{});
     hm.put('2',new char[]{ 'a', 'b', 'c' });
     hm.put('3',new char[]{ 'd', 'e', 'f' });
     hm.put('4',new char[]{ 'g', 'h', 'i' });
     hm.put('5',new char[]{ 'j', 'k', 'l' });
     hm.put('6',new char[]{ 'm', 'n', 'o' });
     hm.put('7',new char[]{ 'p', 'q', 'r', 's' });
     hm.put('8',new char[]{ 't', 'u', 'v'});
     hm.put('9',new char[]{ 'w', 'x', 'y', 'z' });
     hm.put('0',new char[]{});
     StringBuilder sb = new StringBuilder();
        permute(digits, hm, al, sb, 0);
        return al;


 }
  private void permute(String digits, HashMap<Character, char[]> hm, ArrayList<String> al, StringBuilder sb, int pos){
        if(sb.length() == digits.length()){
            al.add(sb.toString());
            return;
        }

        for(char c : hm.get(digits.charAt(pos))){
            sb.append(c);
            permute(digits, hm, al, sb, pos + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

public static void main(String args[]){
    phoneNumber p = new phoneNumber();

System.out.println(p.letterCombinations("235"));



    }
}



//----------------------------------------------------------------------------
   /*void printString(String s){
       if(s.length()==1)
       System.exit(0);
       System.out.println(s);
       printString(s.substring(1,s.length()-1));
   }


public static void main(String args[]){
phoneNumber p = new phoneNumber();
String s ="ABCDEFGHI";
p.printString(s);

char[] c = s.toCharArray();
// for(Character cc:c)
// System.out.println(cc);
int n = c.length;
//swap(c);
for (int k =0; k<n;k++){
    
char temp1 = c[0];
    c[0]=c[k];
    c[k]=temp1;

for (int i =1,j=n-1;i<n;i++,j--){
    char temp = c[i];
    c[i]=c[j];
    c[j]=temp;
    System.out.println(c);
    //swap(c);
    }
}




    }
}*/