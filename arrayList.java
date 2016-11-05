import java.util.*;

class arrayList{
    public static void main(String args[]){ 

 ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
         ArrayList<Integer> inner = new ArrayList<Integer>();        

    inner.add(100);     
    inner.add(200);

    outer.add(inner);
    outer.add(inner);
    outer.get(0).add(300);
    //Arrays.toString(outer.toArray());
    System.out.println(outer);
    }
}