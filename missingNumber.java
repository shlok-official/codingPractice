class missingNumber{



 public int missingNumber1(int[] nums) {
     //Arrays
        int sum=0;
        for(int n:nums)
        sum +=n;
        
        int nn =nums.length;
        int nnn= (nn/2)*(nums[0]+nums[nn-1]);
        
        return nnn-sum;
        //return sum;
        
    }

   public static void main(String strings[]){
        int arr[]={0,1,3};
        missingNumber mn = new missingNumber();
        System.out.print(mn.missingNumber1(arr));




    }
}