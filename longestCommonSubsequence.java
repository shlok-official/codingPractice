import java.util.*;
import java.util.Arrays;
class longestCommonSubsequence{

    

public  void commonStr(char[] str1, char[] str2){
    // char[] char1 = str1.toCharArray();
    // char[] char2 = str2.toCharArray();
    int temp[][]= new int [str1.length +1][str2.length+1];
    int max=0;
    for(int i=1; i < temp.length; i++){
            for(int j=1; j < temp[i].length; j++){
                if(str1[i-1] == str2[j-1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                    System.out.println(str1[i-1]);
                }
                else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j] > max){
                    max = temp[i][j];
                }


            }
    }

System.out.println( max);

}

      public static void main(String args[]){
         longestCommonSubsequence lcs = new longestCommonSubsequence();
String str1 ="ABCDGH";
String str2="AEDFHR";
lcs.commonStr(str1.toCharArray(),str2.toCharArray());



      }
}