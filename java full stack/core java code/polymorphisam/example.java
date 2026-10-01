public class example{
  /// same class minimum 2 methhod haviing same name     
// number parameter are different
    // void display(int a){

    // }
    // void display(int a ,int b){

    // }
//========================================================================================================================
// change data type
    void display(int a){

    }
    void display(double a){

    }  
 //==================================================================================================================   
//sequence of para must be change
void display(int a , String name){

}
void display(String name ,int a){
      System.out.println("name :  "+name +"age : "+a);
}
      // we can also overloaD MAIN method 
    public static void main (String[] args){
         example obj= new example();
          obj.display("datta",10);
          int[] numbers={1,2,3,4};
          main(numbers);
          int num=10;
          main(num);
      }
    public static void main (int[] arg){
         System.out.println("this is main method with int array argument");
       
    }  
    public static void main (int arg){
         System.out.println("this is main method with int argument");
       
    }  
}
