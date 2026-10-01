public class operators {             //Airthmetic opeartor
                                     // unary operator
                          
    public static void main(String[] args) {
         // opeartors are used for performing operations on variables and values
    //1. Arithmetic operators
        // int a = 10;
        // int b = 5;
        // System.out.println("Addition: " + (a + b));
        // System.out.println("Subtraction: " + (a - b));
        // System.out.println("Multiplication: " + (a * b));
        // System.out.println("Division: " + (a / b));                      // int/int=int
                                                                            // float/int=float
                                                                            // int/float=float

        // System.out.println("Modulus: " + (a % b));  // get remainder

        //2. unary operators  ----> require single operand
             // there are two type of unary opeartors
                  //1.prefix
                           //pre-increment and pre-decrement
    //               int a=10;
    //    System.out.println(++a);   // pre-increment
    //    System.out.println(a);
    //    System.out.println(--a);   // pre-decrement

                  //2.postfix
                           //post-increment and post-decrement
         int b=10;
        System.out.println(b++);  //post - increment
        System.out.println(b);
        System.out.println(b--);  //post - decrement
         System.out.println(b);



    }
}