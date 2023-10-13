public class Fibonacci {

    public static void main(String[] args) { 
        Fibonacci(10);

    }

    public static void Fibonacci(int max){
        int item0 = 1;
        int item1 = 1;
        for (int i = 2; i < max; i++){
            System.out.println(item0 + item1);
            int item10ld = item1;
            item1 = item0 + item1;
            item0 = item10ld;
            }
        }
}

//Shorter method starts with 2
