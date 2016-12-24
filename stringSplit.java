import java.util.*;
class stringSplit{


public static void main(String args[]){   
String str = "VOD,Vodafone,10@GOOG,Google,15@MSFT,Microsoft,12:VOD,Vodafone,16,2@GOOG,Google,10,5@MSFT,Microsoft,25,6";
String[] bits = str.split(":",2);

  String firstOne = bits[0];
  //System.out.println(firstOne);
  String[] strArray1 = firstOne.split("@|,");
  //for(String aa : strArray1) System.out.println(aa);
  List<shares> s1 = new ArrayList<shares>();
for(int i =0;i<strArray1.length;i=i+3){
 s1.add(new shares(strArray1[i],strArray1[i+1],strArray1[i+2]));
}
for(int i=0; i<s1.size();i++){
s1.get(i).display();
}



  //-----------
  String lastOne = bits[1];
  String[] strArray2 = lastOne.split("@|,");
  List<shares> s2 = new ArrayList<shares>();
  for(int i =0;i<strArray2.length;i=i+4){
 s2.add(new shares(strArray2[i],strArray2[i+1],strArray2[i+2]));
}
for(int i=0; i<s2.size();i++){
s2.get(i).display();
}




  //---------------------------------------------
// List<shares> s2 = new ArrayList<shares>();

// for(int i =0;i<str1.length/3;i=i+3){

//  s2.add(new shares(str1[i],str1[i+1],str1[i+2]));

// }
for(int i=0; i<s2.size();i++){
//s.get(i).display();
System.out.println(Integer.parseInt(s1.get(i).shareValue) * Integer.parseInt`(s2.get(i).shareValue));
//System.out.println(s1.get(i).shareValue);
}



    }
    static class shares{
    private String codeName;
    private String name;
    private String shareValue;

    shares(String codeName,String name, String shareValue ){
    this.codeName = codeName;
    this.name = name;
    this.shareValue = shareValue;

    }
    void display(){
        System.out.println(name);
    }

}
}