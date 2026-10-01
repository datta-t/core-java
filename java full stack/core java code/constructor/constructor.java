

public class constructor {
    int a;
    int b;  // these value are initilized during object creation but after call constuructor
    static int c;
    void display(){
        System.out.println("a = "+a +" b = "+b +" c= "+c);
    }
    constructor(){
        a=10;
        b=20;
        c=234;
        System.out.println("constructor called");
    }

    public static void main(String[] arg){
        constructor d1= new constructor(); // deafault const is called so d1 object is crearteds
        constructor d2= new constructor();
        constructor d3 = new constructor();
        
        d1.display();
    }
}
