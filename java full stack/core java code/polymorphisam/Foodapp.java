public class Foodapp {
    void orderFood(String name){
        System.out.println("ordered :"+name);
    }
    void orderFood(String name, int quantity){
        System.out.println("ordered :"+name);
        System.out.println("quantity :"+quantity);
    }
    void orderFood(String name, int quantity, String address){
        System.out.println("ordered :"+name);
        System.out.println("quantity :"+quantity);
        System.out.println("address :"+address);
    }

    public static void main(String[] args){
        Foodapp order=new Foodapp();
        order.orderFood("pizza");
        order.orderFood("burger" ,2);
        order.orderFood("coldrinks",3,"vtp house");
    }
}
