class Main {  
  public static void main(String[] args) {    
    Student student1 = new Student();    
    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");

    System.out.println("student1's name is " + student1.getName() + " and their GPAis " + student1.getGPA() + " and their major is " + student1.getMajor());
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
  }
}