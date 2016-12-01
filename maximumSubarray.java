class maximumSubarray{

void maxarray(int arr[]){
    int max = Integer.MIN_VALUE;
    int newarr[]=arr[0];
    //if (n < 0)
		return -1;
 
	int count = 0;
	for (long i = 5; n / i >= 1; i *= 5) {
		count += n / i;
	}
 
	return count;for(int i =0; i<arr.length-1;i++){

       for(int j =0; j<arr.length-1;j++){
            //if(arr[j]>max)

            max=arr[j];

        
        // } 
    }
System.out.print(max);


}


 public static void main(String strings[]){

     int arr[]={-2, -5, 6, -2, -3, 1, 5, -6};
maximumSubarray ms = new maximumSubarray();
ms.maxarray(arr);


 }

}