//print the nth Fibonacci number entered by the user
/*
class fib{
static int fibn(int n){
    if(n<=1)
        return 1;
    else
        return fibn(n-1)+fibn(n-2);    
   }
public static void main(String args[]){
   System.out.print(fibn(10) + " ");
}
} */


//print the nth even Fibonacci number
/*
class fib{
static int fibn(int n){
     if (n < 1)
       return n;
    if (n == 1) 
       return 2;
 
    // calculation of Fn = 4*(Fn-1) + Fn-2
    return ((4*fibn(n-1)) + fibn(n-2)); 
   }
public static void main(String args[]){
   System.out.print(fibn(4) + " ");
}
}
*/
//Fibonacci Series using Dynamic Programming


class fib{
static int fibn(int n){
   int f[] = new int[n+1];
    int i;
  /* 0th and 1st number of the series are 0 and 1*/
  f[0] = 0;
  f[1] = 1;

     for (i = 2; i <= n; i++)
  {
      /* Add the previous 2 numbers in the series
         and store it */
      f[i] = f[i-1] + f[i-2];
  }
 
  return f[n];
}
public static void main(String args[]){
   System.out.print(fibn(10) + " ");
}
}