import java.util.Scanner;

public class bouncyBubbleSort {

   
    public static void main(String[] args) {
      int [] bubbleSortedArray;
      System.out.println("How many items do you want?");
      Scanner scan = new Scanner (System.in);
      int numberOfItems = scan.nextInt();
      int j = 1;

      int [] test = readInput(numberOfItems);
      for(int i = 0; i < test.length; i++){
          System.out.println("you entered: "+ test[i]);
      } 
      
      
      bubbleSortedArray = bubblesort(test);
        for(int i = 0; i < test.length; i++){
             
          System.out.println("New item number: "+j+" is: "+ bubbleSortedArray[i]);
          j++;
      }
    }
        public static int[] bubblesort(int []items){
        
        int temp;
        for (int i = 0; i < items.length -1; i++) {
            for (int j = 1; j < items.length -i; j++) {

                if (items[j - 1] > items[j]) {
                    temp = items[j - 1];
                    items[j - 1] = items[j];
                    items[j] = temp;
                }


            }
            for (int k = items.length-1; k >= 1; k--) {

                if (items[k - 1] > items[k]) {
                    temp = items[k - 1];
                    items[k - 1] = items[k];
                    items[k] = temp;
                }


            }

        }

        return items;
 }
    public static int[] readInput(int numberOfInputs){
        int [] inputArray = new int[numberOfInputs];
        
        Scanner scan = new Scanner(System.in);
        int i;
        int j = 1;
        for( i = 0; i < numberOfInputs ; i++){
            System.out.println("please enter item number: "+ j );
            inputArray[i] = scan.nextInt();
            
            j++;
        }
        return inputArray;
    }
}