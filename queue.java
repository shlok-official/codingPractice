public class queue {
   private int maxSize;
   private long[] queueArray;
   private int top;
   public queue(int s) {
      maxSize = s;
      queueArray = new long[maxSize];
      top = -1;
   }
   public void push(long j) {
      queueArray[++top] = j;
   }
   public long pop() {
      return queueArray[top--];
   }
   public long peek() {
      return queueArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
      public static void main(String[] args) {
      queue queue1 = new queue(10); 
      queue1.push(10);
      queue1.push(20);
      queue1.push(30);
      queue1.push(40);
      queue1.push(50);
      while (!queue1.isEmpty()) {
         long value = queue1.pop();
         System.out.print(value +"\t");
      }
      System.out.println("");
   }
}