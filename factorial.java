class factorial{
static int fiba(int n){
        if(n<=1)
        return 1;
        else
        return n * fiba(n-1);
   }


public static void main(String args[]){
   System.out.println(fiba(4)+ " ");
}
}

