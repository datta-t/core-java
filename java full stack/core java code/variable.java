
class student{
    int age=24;            //instance variable
    String name="datta";    // instance varible
    static String college= "sppu"; // static varible


    //int roll;
    //roll= 12;   //not valid

    int roll ;  
    student(){   // this is no argument consructor is use to initialize value of insatnce variable after
        roll=12;
    }
}



public class variable {
    public static void main(String[] args){
        student obj= new student();
        System.out.println(obj.age); // int age =24 is initialized when object is createad
        System.out.println(student.college);
    }
}
