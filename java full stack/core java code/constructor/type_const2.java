// 2. no argument constructor
class student {
    int age;
    String name;
    int id;                // instance variable but i do not assign initial value in no argument constructor, then what is value in id variable
                 // default value of int is 0, so id variable will have default value 0, but we can not say default constructor is called because we have provided no argument constructor in class student, so no argument constructor is called and object is created

    void display(){
        System.out.println("age = "+age +" name = "+name +" id : "+id);
    }
    student() { // no argument constructor
        age = 20;
        name = "John";
        System.out.println("no argument constructor called");
    }
}
   public class type_const2 {
    public static void main(String[] args){
        student s= new student(); //no argument constuctor call honar 
        System.out.println("age : "+s.age + " name "+s.name +" id :"+s.id);
        s.display();

       
        
    }
}
