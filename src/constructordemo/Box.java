package constructordemo;

public class Box {
    int length;
    int width;
    int height;

     Box(){
         System.out.println("Constructor called: Initializing box dimensions by non parameterized constructor");
            length = 10;
            width = 5;
            height = 8;
     }

    Box(int l, int w, int h){
        System.out.println("Constructor called: Initializing box dimensions by parameterized constructor");
        length = l;
        width = w;
        height = h;
    }

    public static void main(String[] args) {
        Box box1 = new Box();

//        box1.length = 10;
//        box1.width = 5;
//        box1.height = 8;



        System.out.println("Box 1 Length: " + box1.length);
        System.out.println("Box 1 Width: " + box1.width);
        System.out.println("Box 1 Height: " + box1.height);

        Box box2 = new Box(15, 10, 12);
        System.out.println("Box 2 Length: " + box2.length);
        System.out.println("Box 2 Width: " + box2.width);
        System.out.println("Box 2 Height: " + box2.height);

    }
}
