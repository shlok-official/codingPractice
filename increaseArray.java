import java.util.*;
class increaseArray{



    public static void main(String args[]){

int arr[]= new int[10];
for(int i=0;i<arr.length;i++){
    arr[i]=5;
}
arr[4]=8;
for (Integer a : arr)
if(a==8)
System.out.println(ArrayUtils.indexOf(a));
    }
}