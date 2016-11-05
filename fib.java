class fib{
static int fibn(int n){
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    else
        return fibn(n-1)+fibn(n-2);
        
   }


public static void main(String args[]){
    
   
   System.out.print(fibn(10) + " ");
}
}

