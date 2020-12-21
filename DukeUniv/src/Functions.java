public class Functions {
    int myFunction(int x, int y) {
        int z = 2 * x - y;
        return z * x;
    }
    int f(int n) {
        return 3 + myFunction(n, n + 1);
    }
    int g() {
        int a;
        a = myFunction(3, 7);
        int b = f(a * a);
        return b;
    }
    public static void main(String[] args)
    {
        Functions p= new Functions();
        System.out.println("value of myFunction is :  "+p.myFunction(2,3));
        System.out.println("\nvalue of f is : "+p.f(3));
        System.out.println("\nvalue of g is : "+p.g());

        // System.out.println(p.g()); // get the value of g() only
    }

}
