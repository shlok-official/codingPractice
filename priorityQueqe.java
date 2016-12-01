import java.util.Comparator;
import java.util.PriorityQueue;

class priorityQueqe{

    public class StringLengthComparator implements Comparator<String>{
    public int compare(String x, String y)
    {
      if (x.length() < y.length())
        {
            return -1;
        }
        if (x.length() > y.length())
        {
            return 1;
        }
        return 0;
    }


    }

public static void main(String args[]){
Comparator<String> comparator = new StringLengthComparator();
PriorityQueue<String> queue =  new PriorityQueue<String>(10, comparator);
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }
    }


}


