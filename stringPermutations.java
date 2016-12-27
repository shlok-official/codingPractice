import java.util.*;
class stringPermutations{

void permute(char[] c,int n,boolean[] visited,char[] ch,int level){
//Arrays.sort(c);
if(level > n-1){
    System.out.println(ch);
    return;
}

for(int i=0;i<n;i++){
    if(!visited[i]){
        ch[level++] = c[i];
        visited[i] = true;
        permute(c,n,visited,ch,level);
    visited[i] = false;
    level--;
        }   
    }
}
    public static void main(String args[]){
    stringPermutations sp = new stringPermutations();
    String str="ABC";
    int n = str.length();
    char[] ch = new char[n];
    boolean visited[] = new boolean[n];
    sp.permute(str.toCharArray(),n,visited,ch,0);
    }
}