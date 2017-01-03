class wordBreak{
boolean stringContains(String word){
String dictionary[]={"hey","i","how","are","you","am","doing","fine"};
for (int i =0; i<dictionary.length;i++){
    if(dictionary[i] == word) return true;
    }return false;
}

boolean stringBreak(String str){
    if(str.length()==0) return true;
    for(int i=1;i< str.length();i++){
    if(stringContains(str.substring(0,i))   && stringBreak(str.substring(i,str.length()-i)))  return true;
    }
return false;
}
    public static void main(String args[]){

        String str = "ihoware";
        wordBreak wb = new wordBreak();
        System.out.println(wb.stringBreak(str));
    }
}