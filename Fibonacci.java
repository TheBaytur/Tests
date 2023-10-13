public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci(10);

    }

    public static void Fibonacci(int max){
        int item0 = 1;
        int item1 = 1;
        for (int i = 0; i < max; i++){
            if (i == 0 || i == 1) {
                System.out.println(1);
            } else {
                System.out.println(item0 + item1);
                int item10ld = item1;
                item1 = item0 + item1;
                item0 = item10ld;
            }
        }
    }
}
