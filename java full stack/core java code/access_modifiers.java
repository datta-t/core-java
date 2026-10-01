// public acess

 class Student {
          public void show(){
            System.out.println("hello boss");
          }
}
// another class access it
public class access_modifiers{
    public static void main(String[] args){
        Student s= new Student();
        s.show();
    }
}
