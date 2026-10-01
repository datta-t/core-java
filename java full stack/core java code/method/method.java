public class method{
    //static method
    static void welcome(){
        System.out.println("welcome to java");
    }
    //instance method or normal method
     void demo(){
            System.out.println("hello");
           } 

    int add(int a, int b){  // a and b argument
        return a+b;
    }
    

         
    public static void main(String[] args){
           welcome();     // this is static method so we can call directly without create object
           method obj= new method();
           obj.demo();
           System.out.println(obj.add(10,20)); //here 10,20 are parameter
          
    }
}
