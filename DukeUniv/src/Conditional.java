
public class Conditional {
    public static int f (int x, int y) {
        if (x < y) {
            System.out.println("x < y");
            return y + x;
        }
        else {
            System.out.println("x >= y");
            if (x > 8) {
                return y + 7;
            }
        }
        return x - 2;
    }
    public static int g () {
        int a = f(3, 4);
        int b = f(a, 5);
        return b;
    }

    public static void  main(String[]args ) {
        Conditional obj = new Conditional ();
        int b = obj.g();
        System.out.print(b);
    }
}