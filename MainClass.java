public class MainClass {

public static void main(String[] args) throws Exception {
String str = "abdc";
StringBuffer strBuf = new StringBuffer(str);
permute(strBuf, 0, str.length()-1);
}

private static void permute(StringBuffer str, int l, int r) {
// TODO Auto-generated method stub
int i;
if (l == r)
System.out.println(str);
else
{
for (i = l; i <= r; i++)
{
swap(str,l,i);
permute(str, l+1, r);
swap(str,l,i); //backtrack
}
}

}

private static void swap(StringBuffer str, int pos1, int pos2){
char t1 = str.charAt(pos1);
str.setCharAt(pos1, str.charAt(pos2));
str.setCharAt(pos2, t1);
} 
}