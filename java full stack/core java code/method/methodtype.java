

public class methodtype {

    //1.no parameter no return value
    // void showmenu(){
    //     System.out.println("1. pizaa");
    //     System.out.println("2.burger");
    //     System.out.println("3.cold");
    // }

    //2.with argument no retutrn value
    // void printbill(int product_quantity, int price){
    //        System.out.println("my total bill :"+product_quantity*price);
    // }

    // no argument with return value
    // int balance;
    // int getbalnce(){
    //     return balance;
    // }

    //with argument with return value
    int add (int a,int b){
        return a+b;
    }





    public static void main (String [] args){
        methodtype customer= new methodtype();
       // customer.showmenu();
       //customer.printbill(2,100);
      // customer.balance=10000;
       //System.out.println(customer.getbalnce());
      System.out.println(customer.add(10,30));
  
    }
}
