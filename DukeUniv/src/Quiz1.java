public class Quiz1 {
    int f(int x) {
        return x * 2 - 1;
        //     3 * 2 - 1 = 5
        //     4 * 2 - 1 = 7
    }

    int h() {
        int a = 3; // a = 3
        int b = f(a) + f(4); // b = f(3) + f(4)
        return b; // b = 5 + 7 = 12
    }

    public static void main(String[] args) {
        Quiz1 obj = new Quiz1 ();
        int h = obj.h();
        System.out.print(h);
    }
}
