

public class type_const {
    // 1.default constructor :- java complier provode by automatically if we do not provide any constructor in class
    int age;
    String name;

    
    
    
    public static void main(String [] args){
       // 1. default constructor is called and object is created
        type_const t1= new type_const(); // default constructor is called and object is created // default value of int is 0 and String is null
        System.out.println("age = "+t1.age +" name = "+t1.name);

         
    }
}
