import java.util.Scanner;  // import scanner class
public class console_input {
      public static void main(String[] args){
          Scanner sc= new Scanner(System.in); // create object of scanner class
                                              //System.in means keyboard input
        //  System.out.println("enter the first number");
        //  int num1 = sc.nextInt();
        //   System.out.println("enter the second number");
        //  int num2 = sc.nextInt();
        //  int sum= num1+num2;
        //  System.out.printf("the value of sum is %d",sum);

         System.out.println("student inforamtion");
         System.out.println("enter the name ");
         String name= sc.next();
        sc.nextLine();
         System.out.printf("my name is %s %n",name);
         System.out.println("enter the college name");
         String college = sc.nextLine();
         
         System.out.println("my college name is : " + college);
         System.out.println("enter your bood group");
         char blood = sc.next().charAt(0);
         sc.nextLine();
         System.out.println("my boold group is " + blood);






    

        // System.out.print("Enter your full name: ");
        // String name = sc.nextLine();

        // System.out.println("Your name is: " + name);
    


      } 
}