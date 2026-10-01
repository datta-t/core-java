public class typecasting {
    public static void main(String[] args){
        
        // type casting is a process of converting one data type into another data type
        // there are two types of type casting
        //1. implicit type casting (widening)
        //2. explicit type casting (narrowing)

        //1. implicit type casting (widening)
        int a= 10;
        double d= a; // here int is converted into double
        System.out.println("value of d: "+d);

        //2. explicit type casting (narrowing)
        double d1= 10.5;
        int a1= (int)d1; // here double is converted into int
        System.out.println("value of a1: "+a1);?
    }
}
