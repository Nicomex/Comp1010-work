import main.java.Rectangle;

public class helloworld {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello world");
        }
        Rectangle r = new Rectangle(10, 20);
        Rectangle s = new Rectangle(5, 12);
//        System.out.println(r.length);
//        System.out.println(r.breath);
        System.out.println(r.area());
//        System.out.println(r.isSquare());
//        System.out.println("Done");
        boolean status = r.biggerThan(s);
        System.out.print(status);
    }
}
