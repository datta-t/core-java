
// object class is the super class of all the classes in java. it is present in java.lang package. it is the root class of java class hierarchy. every class has object class as a super class. if we do not extend any class then by default object class is extended. it is the parent class of all the classes in java. it has some methods which are used by all the classes in java. it is present in java.lang package.
public class object_class {
    //methods of object class
    //1.hashCode()--> give hashcode of object
    //2.getClass() --> represent source of object
    //3. toString() --> represent object into String format
    //4. equals() --> comapre 2 object on the basis of values
    //5.clone() --> copy object
    //6.finalize() -->destroy unreferenced object from application
    //7.wait() -->put thread object into non-runnable state until notify() or notifyall() method invoked
    //8. wait(long) --> put thread object into non-runnable state until notify() or notifyall() method invoked before mentioned time
    //9. notify() --> free thread object from non-runnable state
    //10. notifyall() --> free  all thread object fron non runnable state  

    
    public static void main(String[] args){
        object_class o1= new object_class();
        System.out.println(o1.hashCode());
        System.out.println(o1.getClass());
        System.out.println(o1.toString());
        
    }
}
