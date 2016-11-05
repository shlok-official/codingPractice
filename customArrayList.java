import java.util.*;


class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}  
//------------------------------------------------------
class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  
//------------------------------------------------------
public class customArrayList{  
 public static void main(String args[]){  
  //Creating user-defined class objects  
  Student s1=new Student(101,"shlok",23);  
  Student s2=new Student(102,"shreyas",21);  
  Student s3=new Student(103,"deepansh",25);  
      
  ArrayList<Student> al=new ArrayList<Student>();
  al.add(s1);
  al.add(s2);  
  al.add(s3);  
    Collections.sort(al,new NameComparator());  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
      //System.out.println(itr.next());  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
 }  
}