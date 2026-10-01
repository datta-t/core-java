//parameterized constructor

class student{
    int age;
    String name;
    
    // no argument constructor
    student(){
        age=20;
        name="John";
    }
     
    // parameterized constructor
    student(int a, String b){
        age=a;
        name=b;
    }
    void display(){
        System.out.println("student name : "+name +"student age : "+age);
    }
    
}

public class type_const3 {
    public static void main (String[] args){
        student s1= new student(24,"datta");// parameterized constructor is called and object is created
        s1.display();
        System.out.println("name : "+s1.name +" age :" +s1.age);
        student s2= new student(25,"ram"); // parameterized constructor is called
        s2.display();

        student s3= new student(); // no argument constructor is called
        s3.display();
        
    }
}
