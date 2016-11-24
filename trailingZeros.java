class trailingZeros{

public int trailingZeroes(int n) {
        int count = 0;
        while(n>0){
            count += n/5;
            n/=5;
        }
        return count;
    }

     public static void main(String strings[])
    {
        trailingZeros tz = new trailingZeros();
        int n =2000;
        System.out.print(tz.trailingZeroes(n));
    }
}