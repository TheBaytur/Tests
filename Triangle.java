public class Triangle {

    public static void main(String[] args) {
        print(isTriangleRight(3,4,5));
        print(isTriangleRight(5,6,10));
        print(isTriangleRight(3,3,1));
    }

    public static boolean isTriangleRight(int a, int b, int c) {
        return a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a;
    }

    public static void print(boolean b) {
        System.out.println(b);

    }
}
