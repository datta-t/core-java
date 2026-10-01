class example {
    int id;
    String name;
   static String company_name;

    //static block
    static {
        System.out.println("static block executed");
        System.out.println(company_name= "newgen pvt.ltd");
    }

    //instance block
    {
        System.out.println("instance clock executed");
        System.out.println("object is created");
        System.out.println("id : "+id+ "name :"+name);
    }

    //constructor
    example(int id, String name){
        System.out.println("constructor is excuted");
        this.id=id;
        this.name = name;
        System.out.println("id : "+id + " name :"+name);
    }


    public static void main(String[] args){
        example e1= new example(1, "datta");
        example e2 = new example(2, "ram");
    }
}

// public class example {
//     public static void main(String[] args){
//         employee e1= new employee(1, "datta");
//     }
// }
