class isPalin{

   public boolean palinOrNot(String str){
        int i = str.length();
        if (i<=1)
        return true;

        if(str.charAt(0)==str.charAt(i-1)){
        return palinOrNot(str.substring(1,i-2));
        //System.out.print("True") ;
            
        }

        
        return false;
        //System.out.print("False") ;



    }


    public static void main(String args[]){
        isPalin p = new isPalin();
        String str = "abcdedcsba";
        System.out.print(p.palinOrNot(str));
    }
}