import java.util.ArrayList;


class Main {  
  public static void main(String[] args) {    
    Student student1 = new Student();    
    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");
    student1.print();

    Student student2 = new Student();
    student2.setName("John Mayer");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");
    student2.print();

    
       
  }
}


class Student {  
  String name;  
  double gpa;  
  String major;

  

  String getName() {    
    return name;  
  }  
  double getGPA() {    
    return gpa;  
  }  
  String getMajor() {    
    return major;  
  }  
  void setName(String theName) {    
    name = theName;  
  }  void setGPA(double theGPA) {    
    gpa = theGPA;  
  }  
  void setMajor(String theMajor) {    
    major = theMajor; 
  }
  void print(){
    System.out.println("The students name is " + name);
    System.out.println("The students GPA is " + gpa);
    System.out.println("The students Major is " + major);
  }
  
}
