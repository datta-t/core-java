// taking data from user  at running time using scanner class
import java.util.Scanner; // import scanner class from java.util pacakage
public class user_input{
    public static void main(String[] args){
            // create object of Scanner class
            Scanner sc = new Scanner(System.in); // scanner is class that help to take input from user and system.in= keyboard input
            System.out.println("enter your age");
            int age= sc.nextInt(); //read integer
            System.out.println("enter your name");
            String name =sc.nextLine();  // read string

    }
}


    