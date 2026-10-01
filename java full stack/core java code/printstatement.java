public class printstatement {
    public static void main(String[] args){
     


     // there are three statements in java to print the output on console
     //1. System.out.print()  // it prints without new line
     //2. System.out.println(); // it prints with new line
     //3. System.out.printf();  // it prints formatted output
/*
  System.out.print("hello ");
     System.out.println();
     System.out.println("datta tapare"); 

     System.out.printf("value of PI : %.2f " , 3.143);
     System.out.println();

     // example of printf() method
     String name = "datta";
     int age = 25;
     char grade= 'A';

     System.out.printf("my name is %s and my age is %d and my marks in grade is %c"  , name , age ,grade);
     System.out.printf("%n");
     
     // example of %n 
     System.out.printf("hello%njava");
     System.out.printf("%n");

     System.out.printf("my name : datta %n my age :25 %n city :pune");

    } */

   System.out.printf("hello ");
   System.out.println("Tapare");
   String name= "datta";
   int age= 25;
   int marks= 90;
   char grade ='A';
   System.out.printf("my name is %s %n my age is %d %n my marks is %d %n my grade is %c " ,name,age,marks,grade);

}
}