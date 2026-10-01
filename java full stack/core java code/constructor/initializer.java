// Object किंवा class तयार होताना variables ला सुरुवातीची value देण्यासाठी initializer वापरतो
//Java मध्ये Initializer म्हणजे एखाद्या variable ला initial value देण्याची process किंवा code block.

// there are three type
//1.Variable Initializer
//2.Instance Initializer Block
//3.Static Initializer Block

class student{
    int age;
    String name;
    int batch_no ;
                                        //Variable declaration मध्ये value माहित असेल → Direct Initializati
    String college= "sppu";                                //variable initializer or direct initialization

  //प्रत्येक object ला वेगळी value द्यायची असेल → Constructor use kara
    student(int ag, String nam){
          this.age= ag;
          this.name=nam;
          System.out.println("constructor exectued");
    }

    //Instance Initializers Bolck
    //Object तयार होताना common code execute करायचा असेल → Instance Initializer Block
    {
             batch_no=12;
             System.out.println("instance block executed");
    }
    

    //Class साठी एकदाच setup करायचा असेल → Static Initializer Block
    // static Initializers Block
     static int college_code;
    static {
        college_code=2341;
        System.out.println("static block executed");

    }
}

public  class initializer{
    public static void main(String[] args){
        System.out.println("first object ");
        student s1= new student(24,"name");
        System.out.println("second object ");
        student s2 = new student(12,"ram");
        System.out.println("third object ");
        student s3 =new student(24, "sham");
    }
}
