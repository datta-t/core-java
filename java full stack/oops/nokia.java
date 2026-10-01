class Mobile {
    int height;
    int width;
    String color;
    short camera;
    int battery;

    void calling() {
        System.out.println("voice calling");
        videocalling();
    }
    void videocalling (){
        System.out.println("video calling");
    }
}

public class nokia {
    public static void main(String[] args) {

        Mobile nokia = new Mobile();

        nokia.height = 12;
        nokia.width = 5;
        nokia.color = "red";
        nokia.camera = 16;
        nokia.battery = 400000;

        System.out.println(nokia.height);
        System.out.println(nokia.width);
        System.out.println(nokia.color);
        System.out.println(nokia.camera);
        System.out.println(nokia.battery);

        nokia.calling();
    }
}