

public class student {
    //no para no return
    static void showStudent(){
         System.out.println("student: Datta");
    }
    //with para no return value
    static void showmark(int marks){
        System.out.println("student marks :"+marks);
    }
    //no para with return value
    static int getmarks(){
        return 80;

    }
    //with argument with retutrn value
    static int totalmarks(int m1, int m2){
        return m1+m2;
    }

    public static void main(String[] args){
        showStudent();
        showmark(67);
        System.out.println(getmarks());
        int total= totalmarks(80,40);
        System.out.println("total marks :"+ total);
    }
}
