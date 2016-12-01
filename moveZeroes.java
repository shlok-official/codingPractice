 class moveZeroes{
public static void moveZeroes(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]==0){
            for(int j=i;j<arr.length-1;j++){
                arr[j]=arr[j+1];
           
            } arr[arr.length-1]=0;
        }
    }
}

     public static void main(String args[]){

         int arr[]={1,2,3,0,0,5,0,1};
         moveZeroes(arr);
         for(int a: arr)
         System.out.print(a);


     }
 }

 /*
  public class Solution{
    	public void moveZeroes(int[] nums){
    		int index=0;
    		for (int i=0;i<nums.length;i++){
    			if (nums[i]!=0) nums[index++]=nums[i];
    		}
    		while(index<nums.length){
    			nums[index++]=0;
    		}
    	}
    
    }*/